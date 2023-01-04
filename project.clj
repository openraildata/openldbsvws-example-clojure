(defproject openldbws_example_clojure "1.0.0"
  :description "Example code to use National Rail's OpenLDBWS in Clojure with Apache CXF."
  :url ""
  :license {:name "Apache License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.taoensso/timbre "6.0.4"]
                 [jakarta.xml.bind/jakarta.xml.bind-api "2.3.2"]
                 [org.glassfish.jaxb/jaxb-runtime "2.3.2"]
                 [com.sun.xml.ws/jaxws-rt "2.3.3"]
                 [com.sun.xml.ws/rt "2.3.3"]
                 [javax.xml.ws/jaxws-api "2.3.1"]
                 [org.apache.cxf/cxf-rt-frontend-jaxws "4.0.0"]
                 [org.apache.cxf/cxf-rt-transports-http "4.0.0"]]
  :main ^:skip-aot openldbws-example-clojure.core
  :target-path "target/%s"
  :java-source-paths ["src/soap/generated"]
  :plugins [[lein-wsimport "1.0.0"]]
  :wsimport {:wsdl-list ["https://lite.realtime.nationalrail.co.uk/OpenLDBWS/wsdl.aspx?ver=2021-11-01"
                         "https://lite.realtime.nationalrail.co.uk/OpenLDBSVWS/wsdl.aspx?ver=2021-11-01"]
             :quiet-output true
             :java-output-directory "src/soap/generated"
             :extra-options ["-extension" "-XadditionalHeaders"]}
  :profiles {:uberjar {:aot :all}})


package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.ArrayOfCoaches;


/**
 * Formation data at a calling point.
 * 
 * <p>Java class for FormationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormationData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceLoading">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="loadingCategory" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types>LoadingCategory">
 *                           &lt;attGroup ref="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}LoadingAttrs"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="loadingPercentage" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes>LoadingValue">
 *                           &lt;attGroup ref="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}LoadingAttrs"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="coaches" type="{http://thalesgroup.com/RTTI/2017-10-01/ldbsv/types}ArrayOfCoaches" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceType" />
 *       &lt;attribute name="sourceInstance" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}SourceInstanceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationData", propOrder = {
    "serviceLoading",
    "coaches"
})
@XmlSeeAlso({
    LocFormationData.class
})
public class FormationData {

    @XmlElement(required = true)
    protected FormationData.ServiceLoading serviceLoading;
    protected ArrayOfCoaches coaches;
    @XmlAttribute(name = "source")
    protected String source;
    @XmlAttribute(name = "sourceInstance")
    protected String sourceInstance;

    /**
     * Gets the value of the serviceLoading property.
     * 
     * @return
     *     possible object is
     *     {@link FormationData.ServiceLoading }
     *     
     */
    public FormationData.ServiceLoading getServiceLoading() {
        return serviceLoading;
    }

    /**
     * Sets the value of the serviceLoading property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormationData.ServiceLoading }
     *     
     */
    public void setServiceLoading(FormationData.ServiceLoading value) {
        this.serviceLoading = value;
    }

    /**
     * Gets the value of the coaches property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoaches }
     *     
     */
    public ArrayOfCoaches getCoaches() {
        return coaches;
    }

    /**
     * Sets the value of the coaches property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoaches }
     *     
     */
    public void setCoaches(ArrayOfCoaches value) {
        this.coaches = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the sourceInstance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceInstance() {
        return sourceInstance;
    }

    /**
     * Sets the value of the sourceInstance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceInstance(String value) {
        this.sourceInstance = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="loadingCategory" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types>LoadingCategory">
     *                 &lt;attGroup ref="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}LoadingAttrs"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="loadingPercentage" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes>LoadingValue">
     *                 &lt;attGroup ref="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}LoadingAttrs"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loadingCategory",
        "loadingPercentage"
    })
    public static class ServiceLoading {

        protected FormationData.ServiceLoading.LoadingCategory loadingCategory;
        protected FormationData.ServiceLoading.LoadingPercentage loadingPercentage;

        /**
         * Gets the value of the loadingCategory property.
         * 
         * @return
         *     possible object is
         *     {@link FormationData.ServiceLoading.LoadingCategory }
         *     
         */
        public FormationData.ServiceLoading.LoadingCategory getLoadingCategory() {
            return loadingCategory;
        }

        /**
         * Sets the value of the loadingCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormationData.ServiceLoading.LoadingCategory }
         *     
         */
        public void setLoadingCategory(FormationData.ServiceLoading.LoadingCategory value) {
            this.loadingCategory = value;
        }

        /**
         * Gets the value of the loadingPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link FormationData.ServiceLoading.LoadingPercentage }
         *     
         */
        public FormationData.ServiceLoading.LoadingPercentage getLoadingPercentage() {
            return loadingPercentage;
        }

        /**
         * Sets the value of the loadingPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormationData.ServiceLoading.LoadingPercentage }
         *     
         */
        public void setLoadingPercentage(FormationData.ServiceLoading.LoadingPercentage value) {
            this.loadingPercentage = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types>LoadingCategory">
         *       &lt;attGroup ref="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}LoadingAttrs"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LoadingCategory {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "type")
            protected LoadingValueType type;
            @XmlAttribute(name = "src")
            protected String src;
            @XmlAttribute(name = "srcInst")
            protected String srcInst;

            /**
             * A category code for a level of Train Loading. Valid category codes can be obtained from the reference data endpoint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link LoadingValueType }
             *     
             */
            public LoadingValueType getType() {
                if (type == null) {
                    return LoadingValueType.TYPICAL;
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link LoadingValueType }
             *     
             */
            public void setType(LoadingValueType value) {
                this.type = value;
            }

            /**
             * Gets the value of the src property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrc(String value) {
                this.src = value;
            }

            /**
             * Gets the value of the srcInst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrcInst() {
                return srcInst;
            }

            /**
             * Sets the value of the srcInst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrcInst(String value) {
                this.srcInst = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2017-02-02/ldbsv/commontypes>LoadingValue">
         *       &lt;attGroup ref="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}LoadingAttrs"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LoadingPercentage {

            @XmlValue
            protected long value;
            @XmlAttribute(name = "type")
            protected LoadingValueType type;
            @XmlAttribute(name = "src")
            protected String src;
            @XmlAttribute(name = "srcInst")
            protected String srcInst;

            /**
             * A value representing the loading of a train coach as a percentage (0-100%).
             * 
             */
            public long getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(long value) {
                this.value = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link LoadingValueType }
             *     
             */
            public LoadingValueType getType() {
                if (type == null) {
                    return LoadingValueType.TYPICAL;
                } else {
                    return type;
                }
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link LoadingValueType }
             *     
             */
            public void setType(LoadingValueType value) {
                this.type = value;
            }

            /**
             * Gets the value of the src property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrc() {
                return src;
            }

            /**
             * Sets the value of the src property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrc(String value) {
                this.src = value;
            }

            /**
             * Gets the value of the srcInst property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSrcInst() {
                return srcInst;
            }

            /**
             * Sets the value of the srcInst property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSrcInst(String value) {
                this.srcInst = value;
            }

        }

    }

}

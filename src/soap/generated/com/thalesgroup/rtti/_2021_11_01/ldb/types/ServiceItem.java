
package com.thalesgroup.rtti._2021_11_01.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * An individual service's summary details for display on a basic departure board.
 * 
 * <p>Java class for ServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}ServiceItem">
 *       &lt;sequence>
 *         &lt;element name="formation" type="{http://thalesgroup.com/RTTI/2021-11-01/ldb/types}FormationData" minOccurs="0"/>
 *         &lt;element name="futureCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="futureDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="diversion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="divertedVia" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *                   &lt;element name="between">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="start">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
 *                                     &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="end">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
 *                                     &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rerouteDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="uncertainty" type="{http://thalesgroup.com/RTTI/2021-11-01/ldb/types}UncertaintyType" minOccurs="0"/>
 *         &lt;element name="affectedBy" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="16"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItem", propOrder = {
    "formation",
    "futureCancellation",
    "futureDelay",
    "diversion",
    "uncertainty",
    "affectedBy"
})
@XmlSeeAlso({
    ServiceItemWithCallingPoints.class
})
public class ServiceItem
    extends com.thalesgroup.rtti._2016_02_16.ldb.types.ServiceItem
{

    protected FormationData formation;
    @XmlElement(defaultValue = "false")
    protected Boolean futureCancellation;
    @XmlElement(defaultValue = "false")
    protected Boolean futureDelay;
    protected ServiceItem.Diversion diversion;
    protected UncertaintyType uncertainty;
    protected String affectedBy;

    /**
     * Gets the value of the formation property.
     * 
     * @return
     *     possible object is
     *     {@link FormationData }
     *     
     */
    public FormationData getFormation() {
        return formation;
    }

    /**
     * Sets the value of the formation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormationData }
     *     
     */
    public void setFormation(FormationData value) {
        this.formation = value;
    }

    /**
     * Gets the value of the futureCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFutureCancellation() {
        return futureCancellation;
    }

    /**
     * Sets the value of the futureCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFutureCancellation(Boolean value) {
        this.futureCancellation = value;
    }

    /**
     * Gets the value of the futureDelay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFutureDelay() {
        return futureDelay;
    }

    /**
     * Sets the value of the futureDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFutureDelay(Boolean value) {
        this.futureDelay = value;
    }

    /**
     * Gets the value of the diversion property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceItem.Diversion }
     *     
     */
    public ServiceItem.Diversion getDiversion() {
        return diversion;
    }

    /**
     * Sets the value of the diversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceItem.Diversion }
     *     
     */
    public void setDiversion(ServiceItem.Diversion value) {
        this.diversion = value;
    }

    /**
     * Gets the value of the uncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link UncertaintyType }
     *     
     */
    public UncertaintyType getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertaintyType }
     *     
     */
    public void setUncertainty(UncertaintyType value) {
        this.uncertainty = value;
    }

    /**
     * Gets the value of the affectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedBy() {
        return affectedBy;
    }

    /**
     * Sets the value of the affectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedBy(String value) {
        this.affectedBy = value;
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
     *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="divertedVia" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
     *         &lt;element name="between">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="start">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
     *                           &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="end">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
     *                           &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rerouteDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        "reason",
        "divertedVia",
        "between",
        "rerouteDelay"
    })
    public static class Diversion {

        protected String reason;
        @XmlElement(required = true)
        protected String divertedVia;
        @XmlElement(required = true)
        protected ServiceItem.Diversion.Between between;
        @XmlElement(defaultValue = "0")
        protected Integer rerouteDelay;

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReason(String value) {
            this.reason = value;
        }

        /**
         * Gets the value of the divertedVia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDivertedVia() {
            return divertedVia;
        }

        /**
         * Sets the value of the divertedVia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDivertedVia(String value) {
            this.divertedVia = value;
        }

        /**
         * Gets the value of the between property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceItem.Diversion.Between }
         *     
         */
        public ServiceItem.Diversion.Between getBetween() {
            return between;
        }

        /**
         * Sets the value of the between property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceItem.Diversion.Between }
         *     
         */
        public void setBetween(ServiceItem.Diversion.Between value) {
            this.between = value;
        }

        /**
         * Gets the value of the rerouteDelay property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRerouteDelay() {
            return rerouteDelay;
        }

        /**
         * Sets the value of the rerouteDelay property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRerouteDelay(Integer value) {
            this.rerouteDelay = value;
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
         *         &lt;element name="start">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
         *                 &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="end">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
         *                 &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
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
            "start",
            "end"
        })
        public static class Between {

            @XmlElement(required = true)
            protected ServiceItem.Diversion.Between.Start start;
            @XmlElement(required = true)
            protected ServiceItem.Diversion.Between.End end;

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceItem.Diversion.Between.Start }
             *     
             */
            public ServiceItem.Diversion.Between.Start getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceItem.Diversion.Between.Start }
             *     
             */
            public void setStart(ServiceItem.Diversion.Between.Start value) {
                this.start = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceItem.Diversion.Between.End }
             *     
             */
            public ServiceItem.Diversion.Between.End getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceItem.Diversion.Between.End }
             *     
             */
            public void setEnd(ServiceItem.Diversion.Between.End value) {
                this.end = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
             *       &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
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
            public static class End {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "crs")
                protected String crs;

                /**
                 * The display name of a Station location
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
                 * Gets the value of the crs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCrs() {
                    return crs;
                }

                /**
                 * Sets the value of the crs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCrs(String value) {
                    this.crs = value;
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
             *     &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
             *       &lt;attribute name="crs" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}CRSType" />
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
            public static class Start {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "crs")
                protected String crs;

                /**
                 * The display name of a Station location
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
                 * Gets the value of the crs property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCrs() {
                    return crs;
                }

                /**
                 * Sets the value of the crs property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCrs(String value) {
                    this.crs = value;
                }

            }

        }

    }

}


package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ReasonCodeWithLocation;


/**
 * An individual service's summary details for display on a departure board.
 * 
 * <p>Java class for BaseServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}BaseServiceItem">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="category" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}TrainCategoryCode" minOccurs="0"/>
 *         &lt;element name="activities" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ActivityCodes" minOccurs="0"/>
 *         &lt;element name="length" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}TrainLength" minOccurs="0"/>
 *         &lt;element name="isReverseFormation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="detachFront" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="futureDelay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="futureCancellation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="diversion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *                   &lt;element name="divertedVia">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
 *                           &lt;attribute name="tiploc" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="between">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="start" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
 *                             &lt;element name="end" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
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
 *         &lt;element name="uncertainty" type="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}UncertaintyType" minOccurs="0"/>
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
@XmlType(name = "BaseServiceItem", propOrder = {
    "cancelReason",
    "delayReason",
    "category",
    "activities",
    "length",
    "isReverseFormation",
    "detachFront",
    "futureDelay",
    "futureCancellation",
    "diversion",
    "uncertainty",
    "affectedBy"
})
@XmlSeeAlso({
    BaseServiceItemWithEndPoints.class
})
public class BaseServiceItem
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.BaseServiceItem
{

    protected ReasonCodeWithLocation cancelReason;
    protected ReasonCodeWithLocation delayReason;
    protected String category;
    @XmlElement(defaultValue = "")
    protected String activities;
    @XmlElement(defaultValue = "0")
    protected Integer length;
    @XmlElement(defaultValue = "false")
    protected Boolean isReverseFormation;
    @XmlElement(defaultValue = "false")
    protected Boolean detachFront;
    @XmlElement(defaultValue = "false")
    protected Boolean futureDelay;
    @XmlElement(defaultValue = "false")
    protected Boolean futureCancellation;
    protected BaseServiceItem.Diversion diversion;
    protected UncertaintyType uncertainty;
    protected String affectedBy;

    /**
     * Gets the value of the cancelReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public ReasonCodeWithLocation getCancelReason() {
        return cancelReason;
    }

    /**
     * Sets the value of the cancelReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public void setCancelReason(ReasonCodeWithLocation value) {
        this.cancelReason = value;
    }

    /**
     * Gets the value of the delayReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public ReasonCodeWithLocation getDelayReason() {
        return delayReason;
    }

    /**
     * Sets the value of the delayReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public void setDelayReason(ReasonCodeWithLocation value) {
        this.delayReason = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivities(String value) {
        this.activities = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Gets the value of the isReverseFormation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsReverseFormation() {
        return isReverseFormation;
    }

    /**
     * Sets the value of the isReverseFormation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsReverseFormation(Boolean value) {
        this.isReverseFormation = value;
    }

    /**
     * Gets the value of the detachFront property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetachFront() {
        return detachFront;
    }

    /**
     * Sets the value of the detachFront property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetachFront(Boolean value) {
        this.detachFront = value;
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
     * Gets the value of the diversion property.
     * 
     * @return
     *     possible object is
     *     {@link BaseServiceItem.Diversion }
     *     
     */
    public BaseServiceItem.Diversion getDiversion() {
        return diversion;
    }

    /**
     * Sets the value of the diversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseServiceItem.Diversion }
     *     
     */
    public void setDiversion(BaseServiceItem.Diversion value) {
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
     *         &lt;element name="reason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
     *         &lt;element name="divertedVia">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
     *                 &lt;attribute name="tiploc" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="between">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="start" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
     *                   &lt;element name="end" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
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

        protected ReasonCodeWithLocation reason;
        @XmlElement(required = true)
        protected BaseServiceItem.Diversion.DivertedVia divertedVia;
        @XmlElement(required = true)
        protected BaseServiceItem.Diversion.Between between;
        @XmlElement(defaultValue = "0")
        protected Integer rerouteDelay;

        /**
         * Gets the value of the reason property.
         * 
         * @return
         *     possible object is
         *     {@link ReasonCodeWithLocation }
         *     
         */
        public ReasonCodeWithLocation getReason() {
            return reason;
        }

        /**
         * Sets the value of the reason property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReasonCodeWithLocation }
         *     
         */
        public void setReason(ReasonCodeWithLocation value) {
            this.reason = value;
        }

        /**
         * Gets the value of the divertedVia property.
         * 
         * @return
         *     possible object is
         *     {@link BaseServiceItem.Diversion.DivertedVia }
         *     
         */
        public BaseServiceItem.Diversion.DivertedVia getDivertedVia() {
            return divertedVia;
        }

        /**
         * Sets the value of the divertedVia property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseServiceItem.Diversion.DivertedVia }
         *     
         */
        public void setDivertedVia(BaseServiceItem.Diversion.DivertedVia value) {
            this.divertedVia = value;
        }

        /**
         * Gets the value of the between property.
         * 
         * @return
         *     possible object is
         *     {@link BaseServiceItem.Diversion.Between }
         *     
         */
        public BaseServiceItem.Diversion.Between getBetween() {
            return between;
        }

        /**
         * Sets the value of the between property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaseServiceItem.Diversion.Between }
         *     
         */
        public void setBetween(BaseServiceItem.Diversion.Between value) {
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
         *         &lt;element name="start" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
         *         &lt;element name="end" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}LocationNameType"/>
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
            protected String start;
            @XmlElement(required = true)
            protected String end;

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
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
         *       &lt;attribute name="tiploc" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" />
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
        public static class DivertedVia {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "tiploc", required = true)
            protected String tiploc;

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
             * Gets the value of the tiploc property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTiploc() {
                return tiploc;
            }

            /**
             * Sets the value of the tiploc property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTiploc(String value) {
                this.tiploc = value;
            }

        }

    }

}

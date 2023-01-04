
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
 * A structure containing details of an individual service.
 * 
 * <p>Java class for BaseServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}BaseServiceDetails">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="category" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}TrainCategoryCode" minOccurs="0"/>
 *         &lt;element name="isReverseFormation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="divertedVia" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes>LocationNameType">
 *                 &lt;attribute name="tiploc" use="required" type="{http://thalesgroup.com/RTTI/2007-10-10/ldb/commontypes}TiplocType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="diversionReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceDetails", propOrder = {
    "cancelReason",
    "delayReason",
    "category",
    "isReverseFormation",
    "divertedVia",
    "diversionReason"
})
@XmlSeeAlso({
    ServiceDetails.class
})
public class BaseServiceDetails
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.BaseServiceDetails
{

    protected ReasonCodeWithLocation cancelReason;
    protected ReasonCodeWithLocation delayReason;
    protected String category;
    @XmlElement(defaultValue = "false")
    protected Boolean isReverseFormation;
    protected BaseServiceDetails.DivertedVia divertedVia;
    protected ReasonCodeWithLocation diversionReason;

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
     * Gets the value of the divertedVia property.
     * 
     * @return
     *     possible object is
     *     {@link BaseServiceDetails.DivertedVia }
     *     
     */
    public BaseServiceDetails.DivertedVia getDivertedVia() {
        return divertedVia;
    }

    /**
     * Sets the value of the divertedVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseServiceDetails.DivertedVia }
     *     
     */
    public void setDivertedVia(BaseServiceDetails.DivertedVia value) {
        this.divertedVia = value;
    }

    /**
     * Gets the value of the diversionReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public ReasonCodeWithLocation getDiversionReason() {
        return diversionReason;
    }

    /**
     * Sets the value of the diversionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonCodeWithLocation }
     *     
     */
    public void setDiversionReason(ReasonCodeWithLocation value) {
        this.diversionReason = value;
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


package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ReasonCodeWithLocation;


/**
 * An individual location in a service.
 * 
 * <p>Java class for ServiceLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ServiceLocation">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="affectedByDiversion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rerouteDelay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlType(name = "ServiceLocation", propOrder = {
    "cancelReason",
    "delayReason",
    "affectedByDiversion",
    "rerouteDelay",
    "uncertainty",
    "affectedBy"
})
public class ServiceLocation
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.ServiceLocation
{

    protected ReasonCodeWithLocation cancelReason;
    protected ReasonCodeWithLocation delayReason;
    @XmlElement(defaultValue = "false")
    protected Boolean affectedByDiversion;
    @XmlElement(defaultValue = "0")
    protected Integer rerouteDelay;
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
     * Gets the value of the affectedByDiversion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAffectedByDiversion() {
        return affectedByDiversion;
    }

    /**
     * Sets the value of the affectedByDiversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAffectedByDiversion(Boolean value) {
        this.affectedByDiversion = value;
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

}

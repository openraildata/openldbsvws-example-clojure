
package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ReasonCodeWithLocation;


/**
 * Indication that there is some uncertainty that a service at a location will run as currently expected. Services may be marked as uncertain when there is a risk of delay or cancellation, but before any firm information is known.
 * 
 * <p>Java class for UncertaintyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UncertaintyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv/types}UncertaintyStatus" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UncertaintyType", propOrder = {
    "reason"
})
public class UncertaintyType {

    protected ReasonCodeWithLocation reason;
    @XmlAttribute(name = "status", required = true)
    protected UncertaintyStatus status;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link UncertaintyStatus }
     *     
     */
    public UncertaintyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link UncertaintyStatus }
     *     
     */
    public void setStatus(UncertaintyStatus value) {
        this.status = value;
    }

}

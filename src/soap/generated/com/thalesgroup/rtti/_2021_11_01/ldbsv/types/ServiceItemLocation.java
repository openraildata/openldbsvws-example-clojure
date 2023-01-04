
package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_11_27.ldbsv.commontypes.ReasonCodeWithLocation;


/**
 * A previous/subsequent location of a service attached to a ServiceItem.
 * 
 * <p>Java class for ServiceItemLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItemLocation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2016-02-16/ldbsv/types}ServiceItemLocation">
 *       &lt;sequence>
 *         &lt;element name="cancelReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *         &lt;element name="delayReason" type="{http://thalesgroup.com/RTTI/2015-11-27/ldbsv/commontypes}ReasonCodeWithLocation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemLocation", propOrder = {
    "cancelReason",
    "delayReason"
})
public class ServiceItemLocation
    extends com.thalesgroup.rtti._2016_02_16.ldbsv.types.ServiceItemLocation
{

    protected ReasonCodeWithLocation cancelReason;
    protected ReasonCodeWithLocation delayReason;

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

}

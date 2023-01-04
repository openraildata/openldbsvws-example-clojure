
package com.thalesgroup.rtti._2021_11_01.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure containing base details of an individual service obtained from a departure board.
 * 
 * <p>Java class for BaseServiceDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2017-10-01/ldb/types}BaseServiceDetails">
 *       &lt;sequence>
 *         &lt;element name="divertedVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diversionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "divertedVia",
    "diversionReason"
})
@XmlSeeAlso({
    ServiceDetails.class
})
public class BaseServiceDetails
    extends com.thalesgroup.rtti._2017_10_01.ldb.types.BaseServiceDetails
{

    protected String divertedVia;
    protected String diversionReason;

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
     * Gets the value of the diversionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiversionReason() {
        return diversionReason;
    }

    /**
     * Sets the value of the diversionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiversionReason(String value) {
        this.diversionReason = value;
    }

}

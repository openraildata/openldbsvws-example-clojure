
package com.thalesgroup.rtti._2021_11_01.ldbsv_ref;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2021_11_01.ldbsv_ref.types.LoadingCategoryRefData;


/**
 * <p>Java class for GetLoadingCategoryListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLoadingCategoryListResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetLoadingCategoryListResult" type="{http://thalesgroup.com/RTTI/2021-11-01/ldbsv_ref/types}LoadingCategoryRefData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLoadingCategoryListResponseType", propOrder = {
    "getLoadingCategoryListResult"
})
public class GetLoadingCategoryListResponseType {

    @XmlElement(name = "GetLoadingCategoryListResult", required = true)
    protected LoadingCategoryRefData getLoadingCategoryListResult;

    /**
     * Gets the value of the getLoadingCategoryListResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingCategoryRefData }
     *     
     */
    public LoadingCategoryRefData getGetLoadingCategoryListResult() {
        return getLoadingCategoryListResult;
    }

    /**
     * Sets the value of the getLoadingCategoryListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingCategoryRefData }
     *     
     */
    public void setGetLoadingCategoryListResult(LoadingCategoryRefData value) {
        this.getLoadingCategoryListResult = value;
    }

}

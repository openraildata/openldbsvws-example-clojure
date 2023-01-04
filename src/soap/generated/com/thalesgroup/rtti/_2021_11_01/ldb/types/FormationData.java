
package com.thalesgroup.rtti._2021_11_01.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2017_10_01.ldb.types.ArrayOfCoaches;


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
 *         &lt;element name="loadingCategory" type="{http://thalesgroup.com/RTTI/2021-11-01/ldb/types}LoadingCategory" minOccurs="0"/>
 *         &lt;element name="coaches" type="{http://thalesgroup.com/RTTI/2017-10-01/ldb/types}ArrayOfCoaches" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormationData", propOrder = {
    "loadingCategory",
    "coaches"
})
public class FormationData {

    protected LoadingCategory loadingCategory;
    protected ArrayOfCoaches coaches;

    /**
     * Gets the value of the loadingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link LoadingCategory }
     *     
     */
    public LoadingCategory getLoadingCategory() {
        return loadingCategory;
    }

    /**
     * Sets the value of the loadingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoadingCategory }
     *     
     */
    public void setLoadingCategory(LoadingCategory value) {
        this.loadingCategory = value;
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

}

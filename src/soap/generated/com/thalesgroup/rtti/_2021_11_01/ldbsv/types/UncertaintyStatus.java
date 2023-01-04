
package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UncertaintyStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UncertaintyStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Delay"/>
 *     &lt;enumeration value="Cancellation"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UncertaintyStatus")
@XmlEnum
public enum UncertaintyStatus {

    @XmlEnumValue("Delay")
    DELAY("Delay"),
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    UncertaintyStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UncertaintyStatus fromValue(String v) {
        for (UncertaintyStatus c: UncertaintyStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

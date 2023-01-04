
package com.thalesgroup.rtti._2021_11_01.ldbsv.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoadingValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoadingValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Typical"/>
 *     &lt;enumeration value="Expected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LoadingValueType")
@XmlEnum
public enum LoadingValueType {

    @XmlEnumValue("Typical")
    TYPICAL("Typical"),
    @XmlEnumValue("Expected")
    EXPECTED("Expected");
    private final String value;

    LoadingValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoadingValueType fromValue(String v) {
        for (LoadingValueType c: LoadingValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

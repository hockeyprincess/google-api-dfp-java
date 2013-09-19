/**
 * RichMediaStudioChildAssetPropertyType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201211;

public class RichMediaStudioChildAssetPropertyType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RichMediaStudioChildAssetPropertyType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FLASH = "FLASH";
    public static final java.lang.String _VIDEO = "VIDEO";
    public static final java.lang.String _IMAGE = "IMAGE";
    public static final java.lang.String _DATA = "DATA";
    public static final RichMediaStudioChildAssetPropertyType FLASH = new RichMediaStudioChildAssetPropertyType(_FLASH);
    public static final RichMediaStudioChildAssetPropertyType VIDEO = new RichMediaStudioChildAssetPropertyType(_VIDEO);
    public static final RichMediaStudioChildAssetPropertyType IMAGE = new RichMediaStudioChildAssetPropertyType(_IMAGE);
    public static final RichMediaStudioChildAssetPropertyType DATA = new RichMediaStudioChildAssetPropertyType(_DATA);
    public java.lang.String getValue() { return _value_;}
    public static RichMediaStudioChildAssetPropertyType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RichMediaStudioChildAssetPropertyType enumeration = (RichMediaStudioChildAssetPropertyType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RichMediaStudioChildAssetPropertyType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RichMediaStudioChildAssetPropertyType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201211", "RichMediaStudioChildAssetProperty.Type"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
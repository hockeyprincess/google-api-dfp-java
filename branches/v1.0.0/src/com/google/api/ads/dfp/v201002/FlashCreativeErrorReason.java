/**
 * FlashCreativeErrorReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public class FlashCreativeErrorReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlashCreativeErrorReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FLASH_NAME_EMPTY_BUT_FLASH_BYTE_ARRAY_NOT = "FLASH_NAME_EMPTY_BUT_FLASH_BYTE_ARRAY_NOT";
    public static final java.lang.String _FALLBACK_IMAGE_NAME_EMPTY_BUT_FALLBACK_IMAGE_BYTE_ARRAY_NOT = "FALLBACK_IMAGE_NAME_EMPTY_BUT_FALLBACK_IMAGE_BYTE_ARRAY_NOT";
    public static final FlashCreativeErrorReason FLASH_NAME_EMPTY_BUT_FLASH_BYTE_ARRAY_NOT = new FlashCreativeErrorReason(_FLASH_NAME_EMPTY_BUT_FLASH_BYTE_ARRAY_NOT);
    public static final FlashCreativeErrorReason FALLBACK_IMAGE_NAME_EMPTY_BUT_FALLBACK_IMAGE_BYTE_ARRAY_NOT = new FlashCreativeErrorReason(_FALLBACK_IMAGE_NAME_EMPTY_BUT_FALLBACK_IMAGE_BYTE_ARRAY_NOT);
    public java.lang.String getValue() { return _value_;}
    public static FlashCreativeErrorReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlashCreativeErrorReason enumeration = (FlashCreativeErrorReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlashCreativeErrorReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlashCreativeErrorReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201002", "FlashCreativeError.Reason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
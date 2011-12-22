/**
 * CustomTargetingValueAction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201107;


/**
 * Represents the actions that can be performed on {@link CustomTargetingValue}
 * objects.
 */
public abstract class CustomTargetingValueAction  implements java.io.Serializable {
    /* Indicates that this instance is a subtype of CustomTargetingValueAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead. */
    private java.lang.String customTargetingValueActionType;

    public CustomTargetingValueAction() {
    }

    public CustomTargetingValueAction(
           java.lang.String customTargetingValueActionType) {
           this.customTargetingValueActionType = customTargetingValueActionType;
    }


    /**
     * Gets the customTargetingValueActionType value for this CustomTargetingValueAction.
     * 
     * @return customTargetingValueActionType   * Indicates that this instance is a subtype of CustomTargetingValueAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public java.lang.String getCustomTargetingValueActionType() {
        return customTargetingValueActionType;
    }


    /**
     * Sets the customTargetingValueActionType value for this CustomTargetingValueAction.
     * 
     * @param customTargetingValueActionType   * Indicates that this instance is a subtype of CustomTargetingValueAction.
     * Although this field is returned in the response, it is ignored on
     * input
     *                 and cannot be selected. Specify xsi:type instead.
     */
    public void setCustomTargetingValueActionType(java.lang.String customTargetingValueActionType) {
        this.customTargetingValueActionType = customTargetingValueActionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomTargetingValueAction)) return false;
        CustomTargetingValueAction other = (CustomTargetingValueAction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customTargetingValueActionType==null && other.getCustomTargetingValueActionType()==null) || 
             (this.customTargetingValueActionType!=null &&
              this.customTargetingValueActionType.equals(other.getCustomTargetingValueActionType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomTargetingValueActionType() != null) {
            _hashCode += getCustomTargetingValueActionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomTargetingValueAction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "CustomTargetingValueAction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customTargetingValueActionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201107", "CustomTargetingValueAction.Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
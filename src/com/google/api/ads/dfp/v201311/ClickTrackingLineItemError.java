/**
 * ClickTrackingLineItemError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Click tracking is a special line item type with a number of unique
 * errors as
 *             described below.
 */
public class ClickTrackingLineItemError  extends com.google.api.ads.dfp.v201311.ApiError  implements java.io.Serializable {
    /* The error reason represented by an enum. */
    private com.google.api.ads.dfp.v201311.ClickTrackingLineItemErrorReason reason;

    public ClickTrackingLineItemError() {
    }

    public ClickTrackingLineItemError(
           java.lang.String fieldPath,
           java.lang.String trigger,
           java.lang.String errorString,
           java.lang.String apiErrorType,
           com.google.api.ads.dfp.v201311.ClickTrackingLineItemErrorReason reason) {
        super(
            fieldPath,
            trigger,
            errorString,
            apiErrorType);
        this.reason = reason;
    }


    /**
     * Gets the reason value for this ClickTrackingLineItemError.
     * 
     * @return reason   * The error reason represented by an enum.
     */
    public com.google.api.ads.dfp.v201311.ClickTrackingLineItemErrorReason getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this ClickTrackingLineItemError.
     * 
     * @param reason   * The error reason represented by an enum.
     */
    public void setReason(com.google.api.ads.dfp.v201311.ClickTrackingLineItemErrorReason reason) {
        this.reason = reason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClickTrackingLineItemError)) return false;
        ClickTrackingLineItemError other = (ClickTrackingLineItemError) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClickTrackingLineItemError.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ClickTrackingLineItemError"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "ClickTrackingLineItemError.Reason"));
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

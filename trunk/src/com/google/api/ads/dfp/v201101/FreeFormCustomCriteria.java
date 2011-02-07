/**
 * FreeFormCustomCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201101;


/**
 * A {@link FreeFormCustomCriteria} object is used to perform custom
 * criteria
 *             targeting on custom targeting keys of type
 *             {@link CustomTargetingKey.Type#FREEFORM}.
 */
public class FreeFormCustomCriteria  extends com.google.api.ads.dfp.v201101.CustomCriteria  implements java.io.Serializable {
    /* The {@link CustomTargetingValue} objects to target the custom
     * targeting key
     *                     with id {@link CustomCriteria#keyId}. Either
     *                     {@link CustomTargetingValue#id} or {@link CustomTargetingValue#name}
     * can be
     *                     supplied. Supplying just {@code CustomTargetingValue#name}
     * will have the
     *                     side-effect of creating a new {@code CustomTargetingValue}.
     * This attribute
     *                     is required. */
    private com.google.api.ads.dfp.v201101.CustomTargetingValue[] values;

    public FreeFormCustomCriteria() {
    }

    public FreeFormCustomCriteria(
           java.lang.String customCriteriaNodeType,
           java.lang.Long keyId,
           com.google.api.ads.dfp.v201101.CustomCriteriaComparisonOperator operator,
           com.google.api.ads.dfp.v201101.CustomTargetingValue[] values) {
        super(
            customCriteriaNodeType,
            keyId,
            operator);
        this.values = values;
    }


    /**
     * Gets the values value for this FreeFormCustomCriteria.
     * 
     * @return values   * The {@link CustomTargetingValue} objects to target the custom
     * targeting key
     *                     with id {@link CustomCriteria#keyId}. Either
     *                     {@link CustomTargetingValue#id} or {@link CustomTargetingValue#name}
     * can be
     *                     supplied. Supplying just {@code CustomTargetingValue#name}
     * will have the
     *                     side-effect of creating a new {@code CustomTargetingValue}.
     * This attribute
     *                     is required.
     */
    public com.google.api.ads.dfp.v201101.CustomTargetingValue[] getValues() {
        return values;
    }


    /**
     * Sets the values value for this FreeFormCustomCriteria.
     * 
     * @param values   * The {@link CustomTargetingValue} objects to target the custom
     * targeting key
     *                     with id {@link CustomCriteria#keyId}. Either
     *                     {@link CustomTargetingValue#id} or {@link CustomTargetingValue#name}
     * can be
     *                     supplied. Supplying just {@code CustomTargetingValue#name}
     * will have the
     *                     side-effect of creating a new {@code CustomTargetingValue}.
     * This attribute
     *                     is required.
     */
    public void setValues(com.google.api.ads.dfp.v201101.CustomTargetingValue[] values) {
        this.values = values;
    }

    public com.google.api.ads.dfp.v201101.CustomTargetingValue getValues(int i) {
        return this.values[i];
    }

    public void setValues(int i, com.google.api.ads.dfp.v201101.CustomTargetingValue _value) {
        this.values[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreeFormCustomCriteria)) return false;
        FreeFormCustomCriteria other = (FreeFormCustomCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.values==null && other.getValues()==null) || 
             (this.values!=null &&
              java.util.Arrays.equals(this.values, other.getValues())));
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
        if (getValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreeFormCustomCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "FreeFormCustomCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("values");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "values"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201101", "CustomTargetingValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

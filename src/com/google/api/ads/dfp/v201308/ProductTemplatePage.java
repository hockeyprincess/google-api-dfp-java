/**
 * ProductTemplatePage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201308;


/**
 * Captures a page of {@link ProductTemplate} objects.
 */
public class ProductTemplatePage  implements java.io.Serializable {
    /* The size of the total result set to which this page belongs. */
    private java.lang.Integer totalResultSetSize;

    /* The absolute index in the total result set on which this page
     * begins. */
    private java.lang.Integer startIndex;

    /* The collection of {@link ProductTemplate} contained within
     * this page. */
    private com.google.api.ads.dfp.v201308.ProductTemplate[] results;

    public ProductTemplatePage() {
    }

    public ProductTemplatePage(
           java.lang.Integer totalResultSetSize,
           java.lang.Integer startIndex,
           com.google.api.ads.dfp.v201308.ProductTemplate[] results) {
           this.totalResultSetSize = totalResultSetSize;
           this.startIndex = startIndex;
           this.results = results;
    }


    /**
     * Gets the totalResultSetSize value for this ProductTemplatePage.
     * 
     * @return totalResultSetSize   * The size of the total result set to which this page belongs.
     */
    public java.lang.Integer getTotalResultSetSize() {
        return totalResultSetSize;
    }


    /**
     * Sets the totalResultSetSize value for this ProductTemplatePage.
     * 
     * @param totalResultSetSize   * The size of the total result set to which this page belongs.
     */
    public void setTotalResultSetSize(java.lang.Integer totalResultSetSize) {
        this.totalResultSetSize = totalResultSetSize;
    }


    /**
     * Gets the startIndex value for this ProductTemplatePage.
     * 
     * @return startIndex   * The absolute index in the total result set on which this page
     * begins.
     */
    public java.lang.Integer getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this ProductTemplatePage.
     * 
     * @param startIndex   * The absolute index in the total result set on which this page
     * begins.
     */
    public void setStartIndex(java.lang.Integer startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the results value for this ProductTemplatePage.
     * 
     * @return results   * The collection of {@link ProductTemplate} contained within
     * this page.
     */
    public com.google.api.ads.dfp.v201308.ProductTemplate[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this ProductTemplatePage.
     * 
     * @param results   * The collection of {@link ProductTemplate} contained within
     * this page.
     */
    public void setResults(com.google.api.ads.dfp.v201308.ProductTemplate[] results) {
        this.results = results;
    }

    public com.google.api.ads.dfp.v201308.ProductTemplate getResults(int i) {
        return this.results[i];
    }

    public void setResults(int i, com.google.api.ads.dfp.v201308.ProductTemplate _value) {
        this.results[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductTemplatePage)) return false;
        ProductTemplatePage other = (ProductTemplatePage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.totalResultSetSize==null && other.getTotalResultSetSize()==null) || 
             (this.totalResultSetSize!=null &&
              this.totalResultSetSize.equals(other.getTotalResultSetSize()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults())));
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
        if (getTotalResultSetSize() != null) {
            _hashCode += getTotalResultSetSize().hashCode();
        }
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getResults() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResults());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResults(), i);
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
        new org.apache.axis.description.TypeDesc(ProductTemplatePage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ProductTemplatePage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "totalResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "startIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201308", "ProductTemplate"));
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

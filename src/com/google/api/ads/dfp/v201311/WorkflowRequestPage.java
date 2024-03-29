/**
 * WorkflowRequestPage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201311;


/**
 * Captures a page of {@link WorkflowRequest} objects.
 */
public class WorkflowRequestPage  implements java.io.Serializable {
    /* The collection of workflow requests contained within this page. */
    private com.google.api.ads.dfp.v201311.WorkflowRequest[] results;

    /* The absolute index in the total result set on which this page
     * begins. */
    private java.lang.Integer startIndex;

    /* The size of the total result set to which this page belongs. */
    private java.lang.Integer totalResultSetSize;

    public WorkflowRequestPage() {
    }

    public WorkflowRequestPage(
           com.google.api.ads.dfp.v201311.WorkflowRequest[] results,
           java.lang.Integer startIndex,
           java.lang.Integer totalResultSetSize) {
           this.results = results;
           this.startIndex = startIndex;
           this.totalResultSetSize = totalResultSetSize;
    }


    /**
     * Gets the results value for this WorkflowRequestPage.
     * 
     * @return results   * The collection of workflow requests contained within this page.
     */
    public com.google.api.ads.dfp.v201311.WorkflowRequest[] getResults() {
        return results;
    }


    /**
     * Sets the results value for this WorkflowRequestPage.
     * 
     * @param results   * The collection of workflow requests contained within this page.
     */
    public void setResults(com.google.api.ads.dfp.v201311.WorkflowRequest[] results) {
        this.results = results;
    }

    public com.google.api.ads.dfp.v201311.WorkflowRequest getResults(int i) {
        return this.results[i];
    }

    public void setResults(int i, com.google.api.ads.dfp.v201311.WorkflowRequest _value) {
        this.results[i] = _value;
    }


    /**
     * Gets the startIndex value for this WorkflowRequestPage.
     * 
     * @return startIndex   * The absolute index in the total result set on which this page
     * begins.
     */
    public java.lang.Integer getStartIndex() {
        return startIndex;
    }


    /**
     * Sets the startIndex value for this WorkflowRequestPage.
     * 
     * @param startIndex   * The absolute index in the total result set on which this page
     * begins.
     */
    public void setStartIndex(java.lang.Integer startIndex) {
        this.startIndex = startIndex;
    }


    /**
     * Gets the totalResultSetSize value for this WorkflowRequestPage.
     * 
     * @return totalResultSetSize   * The size of the total result set to which this page belongs.
     */
    public java.lang.Integer getTotalResultSetSize() {
        return totalResultSetSize;
    }


    /**
     * Sets the totalResultSetSize value for this WorkflowRequestPage.
     * 
     * @param totalResultSetSize   * The size of the total result set to which this page belongs.
     */
    public void setTotalResultSetSize(java.lang.Integer totalResultSetSize) {
        this.totalResultSetSize = totalResultSetSize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WorkflowRequestPage)) return false;
        WorkflowRequestPage other = (WorkflowRequestPage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.results==null && other.getResults()==null) || 
             (this.results!=null &&
              java.util.Arrays.equals(this.results, other.getResults()))) &&
            ((this.startIndex==null && other.getStartIndex()==null) || 
             (this.startIndex!=null &&
              this.startIndex.equals(other.getStartIndex()))) &&
            ((this.totalResultSetSize==null && other.getTotalResultSetSize()==null) || 
             (this.totalResultSetSize!=null &&
              this.totalResultSetSize.equals(other.getTotalResultSetSize())));
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
        if (getStartIndex() != null) {
            _hashCode += getStartIndex().hashCode();
        }
        if (getTotalResultSetSize() != null) {
            _hashCode += getTotalResultSetSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WorkflowRequestPage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowRequestPage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("results");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "results"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "WorkflowRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "startIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalResultSetSize");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201311", "totalResultSetSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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

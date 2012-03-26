/**
 * SuggestedAdUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201203;


/**
 * A {@code SuggestedAdUnit} represents a suggestion for a new ad
 * unit, based on an ad tag that has
 *             been served at least ten times in the past week, but which
 * does not correspond to a defined ad
 *             unit.  This class is read-only.
 */
public class SuggestedAdUnit  implements java.io.Serializable {
    /* The unique ID of the {@code SuggestedAdUnit}. This value is
     * the complete path to the
     *                 SuggestedAdUnit; path elements are separated by '/'
     * characters.  This field is read-only. */
    private java.lang.String id;

    /* Returns the number of times the ad tag corresponding to this
     * suggested ad unit has been served
     *                 in the previous week.  (Suggested ad units are only
     * created when they have been served at least
     *                 ten times in that period.)  This field is read-only. */
    private java.lang.Long numRequests;

    /* The path to the suggested ad unit.  Each path element is a
     * separate ad unit code in the
     *                 returned list.  This field is read-only. */
    private java.lang.String[] path;

    /* The {@code target} attribute of the underlying ad tag, as defined
     * in {@link AdUnit}.  This
     *                 field is read-only. */
    private com.google.api.ads.dfp.v201203.AdUnitTargetWindow targetWindow;

    /* The target platform for the browser that clicked the underlying
     * ad tag.  This field is
     *                 read-only. */
    private com.google.api.ads.dfp.v201203.TargetPlatform targetPlatform;

    /* The target sizes associated with this {@code SuggestedAdUnit}.
     * This field is read-only. */
    private com.google.api.ads.dfp.v201203.AdUnitSize[] suggestedAdUnitSizes;

    public SuggestedAdUnit() {
    }

    public SuggestedAdUnit(
           java.lang.String id,
           java.lang.Long numRequests,
           java.lang.String[] path,
           com.google.api.ads.dfp.v201203.AdUnitTargetWindow targetWindow,
           com.google.api.ads.dfp.v201203.TargetPlatform targetPlatform,
           com.google.api.ads.dfp.v201203.AdUnitSize[] suggestedAdUnitSizes) {
           this.id = id;
           this.numRequests = numRequests;
           this.path = path;
           this.targetWindow = targetWindow;
           this.targetPlatform = targetPlatform;
           this.suggestedAdUnitSizes = suggestedAdUnitSizes;
    }


    /**
     * Gets the id value for this SuggestedAdUnit.
     * 
     * @return id   * The unique ID of the {@code SuggestedAdUnit}. This value is
     * the complete path to the
     *                 SuggestedAdUnit; path elements are separated by '/'
     * characters.  This field is read-only.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this SuggestedAdUnit.
     * 
     * @param id   * The unique ID of the {@code SuggestedAdUnit}. This value is
     * the complete path to the
     *                 SuggestedAdUnit; path elements are separated by '/'
     * characters.  This field is read-only.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the numRequests value for this SuggestedAdUnit.
     * 
     * @return numRequests   * Returns the number of times the ad tag corresponding to this
     * suggested ad unit has been served
     *                 in the previous week.  (Suggested ad units are only
     * created when they have been served at least
     *                 ten times in that period.)  This field is read-only.
     */
    public java.lang.Long getNumRequests() {
        return numRequests;
    }


    /**
     * Sets the numRequests value for this SuggestedAdUnit.
     * 
     * @param numRequests   * Returns the number of times the ad tag corresponding to this
     * suggested ad unit has been served
     *                 in the previous week.  (Suggested ad units are only
     * created when they have been served at least
     *                 ten times in that period.)  This field is read-only.
     */
    public void setNumRequests(java.lang.Long numRequests) {
        this.numRequests = numRequests;
    }


    /**
     * Gets the path value for this SuggestedAdUnit.
     * 
     * @return path   * The path to the suggested ad unit.  Each path element is a
     * separate ad unit code in the
     *                 returned list.  This field is read-only.
     */
    public java.lang.String[] getPath() {
        return path;
    }


    /**
     * Sets the path value for this SuggestedAdUnit.
     * 
     * @param path   * The path to the suggested ad unit.  Each path element is a
     * separate ad unit code in the
     *                 returned list.  This field is read-only.
     */
    public void setPath(java.lang.String[] path) {
        this.path = path;
    }

    public java.lang.String getPath(int i) {
        return this.path[i];
    }

    public void setPath(int i, java.lang.String _value) {
        this.path[i] = _value;
    }


    /**
     * Gets the targetWindow value for this SuggestedAdUnit.
     * 
     * @return targetWindow   * The {@code target} attribute of the underlying ad tag, as defined
     * in {@link AdUnit}.  This
     *                 field is read-only.
     */
    public com.google.api.ads.dfp.v201203.AdUnitTargetWindow getTargetWindow() {
        return targetWindow;
    }


    /**
     * Sets the targetWindow value for this SuggestedAdUnit.
     * 
     * @param targetWindow   * The {@code target} attribute of the underlying ad tag, as defined
     * in {@link AdUnit}.  This
     *                 field is read-only.
     */
    public void setTargetWindow(com.google.api.ads.dfp.v201203.AdUnitTargetWindow targetWindow) {
        this.targetWindow = targetWindow;
    }


    /**
     * Gets the targetPlatform value for this SuggestedAdUnit.
     * 
     * @return targetPlatform   * The target platform for the browser that clicked the underlying
     * ad tag.  This field is
     *                 read-only.
     */
    public com.google.api.ads.dfp.v201203.TargetPlatform getTargetPlatform() {
        return targetPlatform;
    }


    /**
     * Sets the targetPlatform value for this SuggestedAdUnit.
     * 
     * @param targetPlatform   * The target platform for the browser that clicked the underlying
     * ad tag.  This field is
     *                 read-only.
     */
    public void setTargetPlatform(com.google.api.ads.dfp.v201203.TargetPlatform targetPlatform) {
        this.targetPlatform = targetPlatform;
    }


    /**
     * Gets the suggestedAdUnitSizes value for this SuggestedAdUnit.
     * 
     * @return suggestedAdUnitSizes   * The target sizes associated with this {@code SuggestedAdUnit}.
     * This field is read-only.
     */
    public com.google.api.ads.dfp.v201203.AdUnitSize[] getSuggestedAdUnitSizes() {
        return suggestedAdUnitSizes;
    }


    /**
     * Sets the suggestedAdUnitSizes value for this SuggestedAdUnit.
     * 
     * @param suggestedAdUnitSizes   * The target sizes associated with this {@code SuggestedAdUnit}.
     * This field is read-only.
     */
    public void setSuggestedAdUnitSizes(com.google.api.ads.dfp.v201203.AdUnitSize[] suggestedAdUnitSizes) {
        this.suggestedAdUnitSizes = suggestedAdUnitSizes;
    }

    public com.google.api.ads.dfp.v201203.AdUnitSize getSuggestedAdUnitSizes(int i) {
        return this.suggestedAdUnitSizes[i];
    }

    public void setSuggestedAdUnitSizes(int i, com.google.api.ads.dfp.v201203.AdUnitSize _value) {
        this.suggestedAdUnitSizes[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SuggestedAdUnit)) return false;
        SuggestedAdUnit other = (SuggestedAdUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.numRequests==null && other.getNumRequests()==null) || 
             (this.numRequests!=null &&
              this.numRequests.equals(other.getNumRequests()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              java.util.Arrays.equals(this.path, other.getPath()))) &&
            ((this.targetWindow==null && other.getTargetWindow()==null) || 
             (this.targetWindow!=null &&
              this.targetWindow.equals(other.getTargetWindow()))) &&
            ((this.targetPlatform==null && other.getTargetPlatform()==null) || 
             (this.targetPlatform!=null &&
              this.targetPlatform.equals(other.getTargetPlatform()))) &&
            ((this.suggestedAdUnitSizes==null && other.getSuggestedAdUnitSizes()==null) || 
             (this.suggestedAdUnitSizes!=null &&
              java.util.Arrays.equals(this.suggestedAdUnitSizes, other.getSuggestedAdUnitSizes())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNumRequests() != null) {
            _hashCode += getNumRequests().hashCode();
        }
        if (getPath() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPath());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPath(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTargetWindow() != null) {
            _hashCode += getTargetWindow().hashCode();
        }
        if (getTargetPlatform() != null) {
            _hashCode += getTargetPlatform().hashCode();
        }
        if (getSuggestedAdUnitSizes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSuggestedAdUnitSizes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSuggestedAdUnitSizes(), i);
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
        new org.apache.axis.description.TypeDesc(SuggestedAdUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "SuggestedAdUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRequests");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "numRequests"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "targetWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "AdUnit.TargetWindow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "targetPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "TargetPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suggestedAdUnitSizes");
        elemField.setXmlName(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "suggestedAdUnitSizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://www.google.com/apis/ads/publisher/v201203", "AdUnitSize"));
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
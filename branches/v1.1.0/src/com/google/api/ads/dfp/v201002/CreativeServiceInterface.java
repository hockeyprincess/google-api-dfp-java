/**
 * CreativeServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.v201002;

public interface CreativeServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@link Creative}.
     *         
     *         The following fields are required along with the required
     * fields of the
     *         sub-class:
     *         <ul>
     *         <li>{@link Creative#advertiserId}</li>
     *         <li>{@link Creative#name}</li>
     *         <li>{@link Creative#size}</li>
     *         </ul>
     *         
     *         
     * @param creative the creative to create
     *         
     * @return the new creative with its ID set
     */
    public com.google.api.ads.dfp.v201002.Creative createCreative(com.google.api.ads.dfp.v201002.Creative creative) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Creates new {@link Creative} objects.
     *         
     *         
     * @param creatives the creatives to create
     *         
     * @return the created creatives with their IDs filled in
     */
    public com.google.api.ads.dfp.v201002.Creative[] createCreatives(com.google.api.ads.dfp.v201002.Creative[] creatives) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Returns the {@link Creative} uniquely identified by the given
     * ID.
     *         
     *         
     * @param creativeId the ID of the creative, which must already exist
     * 
     * @return the {@code Creative} uniquely identified by the given ID
     */
    public com.google.api.ads.dfp.v201002.Creative getCreative(java.lang.Long creativeId) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Gets a {@link CreativePage} of {@link Creative} objects that
     * satisfy the
     *         given {@link Filter}. The following fields are supported for
     * filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link Creative#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code name}</td>
     *         <td>{@link Creative#name}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code width}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         
     *         <tr>
     *         <td>{@code height}</td>
     *         <td>{@link Creative#size}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filter a Publisher Query Language filter which specifies the
     * filtering criteria over creatives
     *         
     * @return the creatives that match the given filter
     */
    public com.google.api.ads.dfp.v201002.CreativePage getCreativesByFilter(com.google.api.ads.dfp.v201002.Filter filter) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link Creative}.
     *         
     *         
     * @param creative the creative to update
     *         
     * @return the updated creative
     */
    public com.google.api.ads.dfp.v201002.Creative updateCreative(com.google.api.ads.dfp.v201002.Creative creative) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;

    /**
     * Updates the specified {@link Creative} objects.
     *         
     *         
     * @param creatives the creatives to update
     *         
     * @return the updated creatives
     */
    public com.google.api.ads.dfp.v201002.Creative[] updateCreatives(com.google.api.ads.dfp.v201002.Creative[] creatives) throws java.rmi.RemoteException, com.google.api.ads.dfp.v201002.ApiException;
}
// Copyright 2010 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.dfp.lib;

import org.apache.axis.client.Stub;

import java.lang.reflect.InvocationTargetException;

import javax.xml.rpc.ServiceException;

/**
 * For each active version of the DoubleClick For Publishers API, there should exist
 * a sub-class which implements the abstract class.
 *
 * @author api.arogal@gmail.com (Adam Rogal)
 */
public abstract class DfpVersion {
  /**
   * The {@code DfpVersion} for v201002.
   */
  public static final DfpVersion V201002 = new DfpVersionV201002();

  protected final String version;
  protected final String namespace;
  protected final String packagePrefix;
  protected final String sandboxUrl;
  protected final String prodUrl;

  /**
   * @param version the version name i.e. v201002
   * @param namespace the namespace
   * @param packagePrefix the package prefix such that the package
   *                      {@code packagPrefix + "." + version} contains all
   *                      code for that version
   * @param sandboxUrl the sandbox URL
   * @param prodUrl the production URL
   */
  protected DfpVersion(String version, String namespace, String packagePrefix,
      String sandboxUrl, String prodUrl) {
    this.version = version;
    this.namespace = namespace;
    this.packagePrefix = packagePrefix;
    this.sandboxUrl = sandboxUrl;
    this.prodUrl = prodUrl;
  }

  /**
   * @return the version
   */
  public String getVersion() {
    return version;
  }

  /**
   * @return the namespace
   */
  public String getNamespace() {
    return namespace;
  }

  /**
   * @return the packagePrefix
   */
  public String getPackagePrefix() {
    return packagePrefix;
  }

  /**
   * @return the sandboxUrl
   */
  public String getSandboxUrl() {
    return sandboxUrl;
  }

  /**
   * @return the prodUrl
   */
  public String getProductionUrl() {
    return prodUrl;
  }

  @Override
  public String toString() {
    return this.version;
  }

  /**
   * Sets the headers for the service designated by {@code stub}.
   *
   * @param stub the stub which headers need populating
   * @param user the user to populate the stub headers with
   * @throws ServiceException thrown if headers could not be set
   */
  public abstract void setHeaders(Stub stub, DfpUser user) throws ServiceException;

  /**
   * The v201002 version class.
   */
  private static class DfpVersionV201002 extends DfpVersion {
    protected DfpVersionV201002() {
      super("v201002", "https://www.google.com/apis/ads/publisher/v201002",
          "com.google.api.ads.dfp.", "https://sandbox.google.com", "https://www.google.com");
    }

    /**
     * See {@link
     * DfpVersion#setHeaders(Stub, DfpUser)}.
     */
    @Override
    public void setHeaders(Stub stub, DfpUser user) throws ServiceException {
      try {
        if (user.getRegisteredAuthToken() == null) {
          user.setAuthToken(new AuthToken(user.getEmail(), user.getPassword()).getAuthToken());
        }

        stub.setHeader(namespace, "RequestHeader",
            Class.forName(packagePrefix + this.toString() + "." + "SoapRequestHeader")
                .getConstructor(String.class, String.class, String.class, String.class)
                .newInstance(user.getRegisteredAuthToken(), user.getNetworkCode(), user.getClientLibraryIdentifier(), null));
      } catch (IllegalStateException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (AuthTokenException e) {
        throw new ServiceException("Could not get ClientLogin token for user.", e);
      } catch (InstantiationException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalAccessException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (ClassNotFoundException e) {
        throw new ServiceException("Could not create service class. Check classpath.", e);
      } catch (IllegalArgumentException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (SecurityException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (InvocationTargetException e) {
        throw new ServiceException(e.getMessage(), e);
      } catch (NoSuchMethodException e) {
        throw new ServiceException("Could not create service class. "
            + "Check that the correct version of AXIS is being used.", e);
      }
    }
 }
}
/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful ListAttachedRolePolicies
 * request.
 * </p>
 */
public class ListAttachedRolePoliciesResult implements Serializable, Cloneable {

    /**
     * A list of the attached policies.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<AttachedPolicy> attachedPolicies;

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     */
    private Boolean isTruncated;

    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     */
    private String marker;

    /**
     * A list of the attached policies.
     *
     * @return A list of the attached policies.
     */
    public java.util.List<AttachedPolicy> getAttachedPolicies() {
        if (attachedPolicies == null) {
              attachedPolicies = new com.amazonaws.internal.ListWithAutoConstructFlag<AttachedPolicy>();
              attachedPolicies.setAutoConstruct(true);
        }
        return attachedPolicies;
    }
    
    /**
     * A list of the attached policies.
     *
     * @param attachedPolicies A list of the attached policies.
     */
    public void setAttachedPolicies(java.util.Collection<AttachedPolicy> attachedPolicies) {
        if (attachedPolicies == null) {
            this.attachedPolicies = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<AttachedPolicy> attachedPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttachedPolicy>(attachedPolicies.size());
        attachedPoliciesCopy.addAll(attachedPolicies);
        this.attachedPolicies = attachedPoliciesCopy;
    }
    
    /**
     * A list of the attached policies.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAttachedPolicies(java.util.Collection)} or {@link
     * #withAttachedPolicies(java.util.Collection)} if you want to override
     * the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachedPolicies A list of the attached policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAttachedRolePoliciesResult withAttachedPolicies(AttachedPolicy... attachedPolicies) {
        if (getAttachedPolicies() == null) setAttachedPolicies(new java.util.ArrayList<AttachedPolicy>(attachedPolicies.length));
        for (AttachedPolicy value : attachedPolicies) {
            getAttachedPolicies().add(value);
        }
        return this;
    }
    
    /**
     * A list of the attached policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachedPolicies A list of the attached policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAttachedRolePoliciesResult withAttachedPolicies(java.util.Collection<AttachedPolicy> attachedPolicies) {
        if (attachedPolicies == null) {
            this.attachedPolicies = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<AttachedPolicy> attachedPoliciesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<AttachedPolicy>(attachedPolicies.size());
            attachedPoliciesCopy.addAll(attachedPolicies);
            this.attachedPolicies = attachedPoliciesCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAttachedRolePoliciesResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more items to return. If your
     * results were truncated, you can make a subsequent pagination request
     * using the <code>Marker</code> request parameter to retrieve more
     * items.
     *
     * @return A flag that indicates whether there are more items to return. If your
     *         results were truncated, you can make a subsequent pagination request
     *         using the <code>Marker</code> request parameter to retrieve more
     *         items.
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * When <code>IsTruncated</code> is <code>true</code>, this element is
     * present and contains the value to use for the <code>Marker</code>
     * parameter in a subsequent pagination request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 320<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param marker When <code>IsTruncated</code> is <code>true</code>, this element is
     *         present and contains the value to use for the <code>Marker</code>
     *         parameter in a subsequent pagination request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListAttachedRolePoliciesResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAttachedPolicies() != null) sb.append("AttachedPolicies: " + getAttachedPolicies() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachedPolicies() == null) ? 0 : getAttachedPolicies().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListAttachedRolePoliciesResult == false) return false;
        ListAttachedRolePoliciesResult other = (ListAttachedRolePoliciesResult)obj;
        
        if (other.getAttachedPolicies() == null ^ this.getAttachedPolicies() == null) return false;
        if (other.getAttachedPolicies() != null && other.getAttachedPolicies().equals(this.getAttachedPolicies()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListAttachedRolePoliciesResult clone() {
        try {
            return (ListAttachedRolePoliciesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    
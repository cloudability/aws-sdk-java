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
package com.amazonaws.services.route53.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.XMLWriter;

/**
 * Disassociate V P C From Hosted Zone Request Marshaller
 */
public class DisassociateVPCFromHostedZoneRequestMarshaller implements Marshaller<Request<DisassociateVPCFromHostedZoneRequest>, DisassociateVPCFromHostedZoneRequest> {

    private static final String RESOURCE_PATH_TEMPLATE;
    private static final Map<String, String> STATIC_QUERY_PARAMS;
    private static final Map<String, String> DYNAMIC_QUERY_PARAMS;
    static {
        String path = "/2013-04-01/hostedzone/{Id}/disassociatevpc";
        Map<String, String> staticMap = new HashMap<String, String>();
        Map<String, String> dynamicMap = new HashMap<String, String>();

        int index = path.indexOf("?");
        if (index != -1) {
            String queryString = path.substring(index + 1);
            path = path.substring(0, index);

            for (String s : queryString.split("[;&]")) {
                index = s.indexOf("=");
                if (index != -1) {
                    String name = s.substring(0, index);
                    String value = s.substring(index + 1);

                    if (value.startsWith("{") && value.endsWith("}")) {
                        dynamicMap.put(value.substring(1, value.length() - 1), name);
                    } else {
                        staticMap.put(name, value);
                    }
                }
            }
        }

        RESOURCE_PATH_TEMPLATE = path;
        STATIC_QUERY_PARAMS = Collections.unmodifiableMap(staticMap);
        DYNAMIC_QUERY_PARAMS = Collections.unmodifiableMap(dynamicMap);
    }

    public Request<DisassociateVPCFromHostedZoneRequest> marshall(DisassociateVPCFromHostedZoneRequest disassociateVPCFromHostedZoneRequest) {

        if (disassociateVPCFromHostedZoneRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DisassociateVPCFromHostedZoneRequest> request = new DefaultRequest<DisassociateVPCFromHostedZoneRequest>(disassociateVPCFromHostedZoneRequest, "AmazonRoute53");
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = RESOURCE_PATH_TEMPLATE;
        
        if (DYNAMIC_QUERY_PARAMS.containsKey("Id")) {
            String name = DYNAMIC_QUERY_PARAMS.get("Id");
            String value = (disassociateVPCFromHostedZoneRequest.getHostedZoneId() == null) ? null : StringUtils.fromString(disassociateVPCFromHostedZoneRequest.getHostedZoneId());

            if (!(value == null || value.isEmpty())) {
                request.addParameter(name, value);
            }
        } else {
            uriResourcePath = uriResourcePath.replace("{Id}", (disassociateVPCFromHostedZoneRequest.getHostedZoneId() == null) ? "" : StringUtils.fromString(disassociateVPCFromHostedZoneRequest.getHostedZoneId())); 
        }

        request.setResourcePath(uriResourcePath.replaceAll("//", "/"));

        for (Map.Entry<String, String> entry : STATIC_QUERY_PARAMS.entrySet()) {
            request.addParameter(entry.getKey(), entry.getValue());
        }

            StringWriter stringWriter = new StringWriter();
            XMLWriter xmlWriter = new XMLWriter(stringWriter, "https://route53.amazonaws.com/doc/2013-04-01/");

            xmlWriter.startElement("DisassociateVPCFromHostedZoneRequest");
                    if (disassociateVPCFromHostedZoneRequest != null) {
            VPC vPCVPC = disassociateVPCFromHostedZoneRequest.getVPC();
            if (vPCVPC != null) {
                xmlWriter.startElement("VPC");
                if (vPCVPC.getVPCRegion() != null) {
                    xmlWriter.startElement("VPCRegion").value(vPCVPC.getVPCRegion()).endElement();
                }
                if (vPCVPC.getVPCId() != null) {
                    xmlWriter.startElement("VPCId").value(vPCVPC.getVPCId()).endElement();
                }
                xmlWriter.endElement();
            }
        }
        if (disassociateVPCFromHostedZoneRequest.getComment() != null) {
            xmlWriter.startElement("Comment").value(disassociateVPCFromHostedZoneRequest.getComment()).endElement();
        }

            xmlWriter.endElement();

            try {
                request.setContent(new StringInputStream(stringWriter.getBuffer().toString()));
                request.addHeader("Content-Length", Integer.toString(stringWriter.getBuffer().toString().getBytes(UTF8).length));
                request.addHeader("Content-Type", "application/xml");
            } catch (UnsupportedEncodingException e) {
                throw new AmazonClientException("Unable to marshall request to XML", e);
            }

        return request;
    }
}

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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createApp(CreateAppRequest) CreateApp operation}.
 * <p>
 * Creates an app for a specified stack. For more information, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html"> Creating Apps </a>
 * .
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have a Manage permissions level for the stack, or an attached policy
 * that explicitly grants permissions. For more information on user
 * permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createApp(CreateAppRequest)
 */
public class CreateAppRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The stack ID.
     */
    private String stackId;

    /**
     * The app's short name.
     */
    private String shortname;

    /**
     * The app name.
     */
    private String name;

    /**
     * A description of the app.
     */
    private String description;

    /**
     * The app's data source.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> dataSources;

    /**
     * The app type. Each supported type is associated with a particular
     * layer. For example, PHP applications are associated with a PHP layer.
     * AWS OpsWorks deploys an application to those instances that are
     * members of the corresponding layer. If your app isn't one of the
     * standard types, or you prefer to implement your own Deploy recipes,
     * specify <code>other</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws-flow-ruby, java, rails, php, nodejs, static, other
     */
    private String type;

    /**
     * A <code>Source</code> object that specifies the app repository.
     */
    private Source appSource;

    /**
     * The app virtual host settings, with multiple domains separated by
     * commas. For example: <code>'www.example.com, example.com'</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> domains;

    /**
     * Whether to enable SSL for the app.
     */
    private Boolean enableSsl;

    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     */
    private SslConfiguration sslConfiguration;

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     */
    private java.util.Map<String,String> attributes;

    /**
     * An array of <code>EnvironmentVariable</code> objects that specify
     * environment variables to be associated with the app. After you deploy
     * the app, these variables are defined on the associated app server
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     * Environment Variables</a>. <p> There is no specific limit on the
     * number of environment variables. However, the size of the associated
     * data structure - which includes the variables' names, values, and
     * protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     * should accommodate most if not all use cases. Exceeding it will cause
     * an exception with the message, "Environment: is too large (maximum is
     * 10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     * If you have specified one or more environment variables, you cannot
     * modify the stack's Chef version.</note>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable> environment;

    /**
     * The stack ID.
     *
     * @return The stack ID.
     */
    public String getStackId() {
        return stackId;
    }
    
    /**
     * The stack ID.
     *
     * @param stackId The stack ID.
     */
    public void setStackId(String stackId) {
        this.stackId = stackId;
    }
    
    /**
     * The stack ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stackId The stack ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }

    /**
     * The app's short name.
     *
     * @return The app's short name.
     */
    public String getShortname() {
        return shortname;
    }
    
    /**
     * The app's short name.
     *
     * @param shortname The app's short name.
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
    
    /**
     * The app's short name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param shortname The app's short name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withShortname(String shortname) {
        this.shortname = shortname;
        return this;
    }

    /**
     * The app name.
     *
     * @return The app name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The app name.
     *
     * @param name The app name.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The app name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The app name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * A description of the app.
     *
     * @return A description of the app.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description of the app.
     *
     * @param description A description of the app.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description of the app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description of the app.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The app's data source.
     *
     * @return The app's data source.
     */
    public java.util.List<DataSource> getDataSources() {
        if (dataSources == null) {
              dataSources = new com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>();
              dataSources.setAutoConstruct(true);
        }
        return dataSources;
    }
    
    /**
     * The app's data source.
     *
     * @param dataSources The app's data source.
     */
    public void setDataSources(java.util.Collection<DataSource> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> dataSourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>(dataSources.size());
        dataSourcesCopy.addAll(dataSources);
        this.dataSources = dataSourcesCopy;
    }
    
    /**
     * The app's data source.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDataSources(java.util.Collection)} or {@link
     * #withDataSources(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataSources The app's data source.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withDataSources(DataSource... dataSources) {
        if (getDataSources() == null) setDataSources(new java.util.ArrayList<DataSource>(dataSources.length));
        for (DataSource value : dataSources) {
            getDataSources().add(value);
        }
        return this;
    }
    
    /**
     * The app's data source.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dataSources The app's data source.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withDataSources(java.util.Collection<DataSource> dataSources) {
        if (dataSources == null) {
            this.dataSources = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> dataSourcesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>(dataSources.size());
            dataSourcesCopy.addAll(dataSources);
            this.dataSources = dataSourcesCopy;
        }

        return this;
    }

    /**
     * The app type. Each supported type is associated with a particular
     * layer. For example, PHP applications are associated with a PHP layer.
     * AWS OpsWorks deploys an application to those instances that are
     * members of the corresponding layer. If your app isn't one of the
     * standard types, or you prefer to implement your own Deploy recipes,
     * specify <code>other</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws-flow-ruby, java, rails, php, nodejs, static, other
     *
     * @return The app type. Each supported type is associated with a particular
     *         layer. For example, PHP applications are associated with a PHP layer.
     *         AWS OpsWorks deploys an application to those instances that are
     *         members of the corresponding layer. If your app isn't one of the
     *         standard types, or you prefer to implement your own Deploy recipes,
     *         specify <code>other</code>.
     *
     * @see AppType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The app type. Each supported type is associated with a particular
     * layer. For example, PHP applications are associated with a PHP layer.
     * AWS OpsWorks deploys an application to those instances that are
     * members of the corresponding layer. If your app isn't one of the
     * standard types, or you prefer to implement your own Deploy recipes,
     * specify <code>other</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws-flow-ruby, java, rails, php, nodejs, static, other
     *
     * @param type The app type. Each supported type is associated with a particular
     *         layer. For example, PHP applications are associated with a PHP layer.
     *         AWS OpsWorks deploys an application to those instances that are
     *         members of the corresponding layer. If your app isn't one of the
     *         standard types, or you prefer to implement your own Deploy recipes,
     *         specify <code>other</code>.
     *
     * @see AppType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The app type. Each supported type is associated with a particular
     * layer. For example, PHP applications are associated with a PHP layer.
     * AWS OpsWorks deploys an application to those instances that are
     * members of the corresponding layer. If your app isn't one of the
     * standard types, or you prefer to implement your own Deploy recipes,
     * specify <code>other</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws-flow-ruby, java, rails, php, nodejs, static, other
     *
     * @param type The app type. Each supported type is associated with a particular
     *         layer. For example, PHP applications are associated with a PHP layer.
     *         AWS OpsWorks deploys an application to those instances that are
     *         members of the corresponding layer. If your app isn't one of the
     *         standard types, or you prefer to implement your own Deploy recipes,
     *         specify <code>other</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AppType
     */
    public CreateAppRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The app type. Each supported type is associated with a particular
     * layer. For example, PHP applications are associated with a PHP layer.
     * AWS OpsWorks deploys an application to those instances that are
     * members of the corresponding layer. If your app isn't one of the
     * standard types, or you prefer to implement your own Deploy recipes,
     * specify <code>other</code>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws-flow-ruby, java, rails, php, nodejs, static, other
     *
     * @param type The app type. Each supported type is associated with a particular
     *         layer. For example, PHP applications are associated with a PHP layer.
     *         AWS OpsWorks deploys an application to those instances that are
     *         members of the corresponding layer. If your app isn't one of the
     *         standard types, or you prefer to implement your own Deploy recipes,
     *         specify <code>other</code>.
     *
     * @see AppType
     */
    public void setType(AppType type) {
        this.type = type.toString();
    }
    
    /**
     * The app type. Each supported type is associated with a particular
     * layer. For example, PHP applications are associated with a PHP layer.
     * AWS OpsWorks deploys an application to those instances that are
     * members of the corresponding layer. If your app isn't one of the
     * standard types, or you prefer to implement your own Deploy recipes,
     * specify <code>other</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>aws-flow-ruby, java, rails, php, nodejs, static, other
     *
     * @param type The app type. Each supported type is associated with a particular
     *         layer. For example, PHP applications are associated with a PHP layer.
     *         AWS OpsWorks deploys an application to those instances that are
     *         members of the corresponding layer. If your app isn't one of the
     *         standard types, or you prefer to implement your own Deploy recipes,
     *         specify <code>other</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see AppType
     */
    public CreateAppRequest withType(AppType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * A <code>Source</code> object that specifies the app repository.
     *
     * @return A <code>Source</code> object that specifies the app repository.
     */
    public Source getAppSource() {
        return appSource;
    }
    
    /**
     * A <code>Source</code> object that specifies the app repository.
     *
     * @param appSource A <code>Source</code> object that specifies the app repository.
     */
    public void setAppSource(Source appSource) {
        this.appSource = appSource;
    }
    
    /**
     * A <code>Source</code> object that specifies the app repository.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param appSource A <code>Source</code> object that specifies the app repository.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withAppSource(Source appSource) {
        this.appSource = appSource;
        return this;
    }

    /**
     * The app virtual host settings, with multiple domains separated by
     * commas. For example: <code>'www.example.com, example.com'</code>
     *
     * @return The app virtual host settings, with multiple domains separated by
     *         commas. For example: <code>'www.example.com, example.com'</code>
     */
    public java.util.List<String> getDomains() {
        if (domains == null) {
              domains = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              domains.setAutoConstruct(true);
        }
        return domains;
    }
    
    /**
     * The app virtual host settings, with multiple domains separated by
     * commas. For example: <code>'www.example.com, example.com'</code>
     *
     * @param domains The app virtual host settings, with multiple domains separated by
     *         commas. For example: <code>'www.example.com, example.com'</code>
     */
    public void setDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> domainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domains.size());
        domainsCopy.addAll(domains);
        this.domains = domainsCopy;
    }
    
    /**
     * The app virtual host settings, with multiple domains separated by
     * commas. For example: <code>'www.example.com, example.com'</code>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDomains(java.util.Collection)} or {@link
     * #withDomains(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domains The app virtual host settings, with multiple domains separated by
     *         commas. For example: <code>'www.example.com, example.com'</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withDomains(String... domains) {
        if (getDomains() == null) setDomains(new java.util.ArrayList<String>(domains.length));
        for (String value : domains) {
            getDomains().add(value);
        }
        return this;
    }
    
    /**
     * The app virtual host settings, with multiple domains separated by
     * commas. For example: <code>'www.example.com, example.com'</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domains The app virtual host settings, with multiple domains separated by
     *         commas. For example: <code>'www.example.com, example.com'</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withDomains(java.util.Collection<String> domains) {
        if (domains == null) {
            this.domains = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> domainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domains.size());
            domainsCopy.addAll(domains);
            this.domains = domainsCopy;
        }

        return this;
    }

    /**
     * Whether to enable SSL for the app.
     *
     * @return Whether to enable SSL for the app.
     */
    public Boolean isEnableSsl() {
        return enableSsl;
    }
    
    /**
     * Whether to enable SSL for the app.
     *
     * @param enableSsl Whether to enable SSL for the app.
     */
    public void setEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
    }
    
    /**
     * Whether to enable SSL for the app.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param enableSsl Whether to enable SSL for the app.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withEnableSsl(Boolean enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Whether to enable SSL for the app.
     *
     * @return Whether to enable SSL for the app.
     */
    public Boolean getEnableSsl() {
        return enableSsl;
    }

    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     *
     * @return An <code>SslConfiguration</code> object with the SSL configuration.
     */
    public SslConfiguration getSslConfiguration() {
        return sslConfiguration;
    }
    
    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     *
     * @param sslConfiguration An <code>SslConfiguration</code> object with the SSL configuration.
     */
    public void setSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
    }
    
    /**
     * An <code>SslConfiguration</code> object with the SSL configuration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sslConfiguration An <code>SslConfiguration</code> object with the SSL configuration.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withSslConfiguration(SslConfiguration sslConfiguration) {
        this.sslConfiguration = sslConfiguration;
        return this;
    }

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     *
     * @return One or more user-defined key/value pairs to be added to the stack
     *         attributes.
     */
    public java.util.Map<String,String> getAttributes() {
        
        if (attributes == null) {
            attributes = new java.util.HashMap<String,String>();
        }
        return attributes;
    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes.
     */
    public void setAttributes(java.util.Map<String,String> attributes) {
        this.attributes = attributes;
    }
    
    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attributes One or more user-defined key/value pairs to be added to the stack
     *         attributes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withAttributes(java.util.Map<String,String> attributes) {
        setAttributes(attributes);
        return this;
    }

    /**
     * One or more user-defined key/value pairs to be added to the stack
     * attributes.
     * <p>
     * The method adds a new key-value pair into Attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into Attributes.
     * @param value The corresponding value of the entry to be added into Attributes.
     */
  public CreateAppRequest addAttributesEntry(String key, String value) {
    if (null == this.attributes) {
      this.attributes = new java.util.HashMap<String,String>();
    }
    if (this.attributes.containsKey(key))
      throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
    this.attributes.put(key, value);
    return this;
  }

  /**
   * Removes all the entries added into Attributes.
   * <p>
   * Returns a reference to this object so that method calls can be chained together.
   */
  public CreateAppRequest clearAttributesEntries() {
    this.attributes = null;
    return this;
  }
  
    /**
     * An array of <code>EnvironmentVariable</code> objects that specify
     * environment variables to be associated with the app. After you deploy
     * the app, these variables are defined on the associated app server
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     * Environment Variables</a>. <p> There is no specific limit on the
     * number of environment variables. However, the size of the associated
     * data structure - which includes the variables' names, values, and
     * protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     * should accommodate most if not all use cases. Exceeding it will cause
     * an exception with the message, "Environment: is too large (maximum is
     * 10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     * If you have specified one or more environment variables, you cannot
     * modify the stack's Chef version.</note>
     *
     * @return An array of <code>EnvironmentVariable</code> objects that specify
     *         environment variables to be associated with the app. After you deploy
     *         the app, these variables are defined on the associated app server
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     *         Environment Variables</a>. <p> There is no specific limit on the
     *         number of environment variables. However, the size of the associated
     *         data structure - which includes the variables' names, values, and
     *         protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     *         should accommodate most if not all use cases. Exceeding it will cause
     *         an exception with the message, "Environment: is too large (maximum is
     *         10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     *         If you have specified one or more environment variables, you cannot
     *         modify the stack's Chef version.</note>
     */
    public java.util.List<EnvironmentVariable> getEnvironment() {
        if (environment == null) {
              environment = new com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable>();
              environment.setAutoConstruct(true);
        }
        return environment;
    }
    
    /**
     * An array of <code>EnvironmentVariable</code> objects that specify
     * environment variables to be associated with the app. After you deploy
     * the app, these variables are defined on the associated app server
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     * Environment Variables</a>. <p> There is no specific limit on the
     * number of environment variables. However, the size of the associated
     * data structure - which includes the variables' names, values, and
     * protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     * should accommodate most if not all use cases. Exceeding it will cause
     * an exception with the message, "Environment: is too large (maximum is
     * 10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     * If you have specified one or more environment variables, you cannot
     * modify the stack's Chef version.</note>
     *
     * @param environment An array of <code>EnvironmentVariable</code> objects that specify
     *         environment variables to be associated with the app. After you deploy
     *         the app, these variables are defined on the associated app server
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     *         Environment Variables</a>. <p> There is no specific limit on the
     *         number of environment variables. However, the size of the associated
     *         data structure - which includes the variables' names, values, and
     *         protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     *         should accommodate most if not all use cases. Exceeding it will cause
     *         an exception with the message, "Environment: is too large (maximum is
     *         10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     *         If you have specified one or more environment variables, you cannot
     *         modify the stack's Chef version.</note>
     */
    public void setEnvironment(java.util.Collection<EnvironmentVariable> environment) {
        if (environment == null) {
            this.environment = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable> environmentCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable>(environment.size());
        environmentCopy.addAll(environment);
        this.environment = environmentCopy;
    }
    
    /**
     * An array of <code>EnvironmentVariable</code> objects that specify
     * environment variables to be associated with the app. After you deploy
     * the app, these variables are defined on the associated app server
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     * Environment Variables</a>. <p> There is no specific limit on the
     * number of environment variables. However, the size of the associated
     * data structure - which includes the variables' names, values, and
     * protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     * should accommodate most if not all use cases. Exceeding it will cause
     * an exception with the message, "Environment: is too large (maximum is
     * 10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     * If you have specified one or more environment variables, you cannot
     * modify the stack's Chef version.</note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEnvironment(java.util.Collection)} or {@link
     * #withEnvironment(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environment An array of <code>EnvironmentVariable</code> objects that specify
     *         environment variables to be associated with the app. After you deploy
     *         the app, these variables are defined on the associated app server
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     *         Environment Variables</a>. <p> There is no specific limit on the
     *         number of environment variables. However, the size of the associated
     *         data structure - which includes the variables' names, values, and
     *         protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     *         should accommodate most if not all use cases. Exceeding it will cause
     *         an exception with the message, "Environment: is too large (maximum is
     *         10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     *         If you have specified one or more environment variables, you cannot
     *         modify the stack's Chef version.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withEnvironment(EnvironmentVariable... environment) {
        if (getEnvironment() == null) setEnvironment(new java.util.ArrayList<EnvironmentVariable>(environment.length));
        for (EnvironmentVariable value : environment) {
            getEnvironment().add(value);
        }
        return this;
    }
    
    /**
     * An array of <code>EnvironmentVariable</code> objects that specify
     * environment variables to be associated with the app. After you deploy
     * the app, these variables are defined on the associated app server
     * instance. For more information, see <a
     * href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     * Environment Variables</a>. <p> There is no specific limit on the
     * number of environment variables. However, the size of the associated
     * data structure - which includes the variables' names, values, and
     * protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     * should accommodate most if not all use cases. Exceeding it will cause
     * an exception with the message, "Environment: is too large (maximum is
     * 10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     * If you have specified one or more environment variables, you cannot
     * modify the stack's Chef version.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param environment An array of <code>EnvironmentVariable</code> objects that specify
     *         environment variables to be associated with the app. After you deploy
     *         the app, these variables are defined on the associated app server
     *         instance. For more information, see <a
     *         href="http://docs.aws.amazon.com/opsworks/latest/userguide/workingapps-creating.html#workingapps-creating-environment">
     *         Environment Variables</a>. <p> There is no specific limit on the
     *         number of environment variables. However, the size of the associated
     *         data structure - which includes the variables' names, values, and
     *         protected flag values - cannot exceed 10 KB (10240 Bytes). This limit
     *         should accommodate most if not all use cases. Exceeding it will cause
     *         an exception with the message, "Environment: is too large (maximum is
     *         10KB)." <note>This parameter is supported only by Chef 11.10 stacks.
     *         If you have specified one or more environment variables, you cannot
     *         modify the stack's Chef version.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateAppRequest withEnvironment(java.util.Collection<EnvironmentVariable> environment) {
        if (environment == null) {
            this.environment = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable> environmentCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<EnvironmentVariable>(environment.size());
            environmentCopy.addAll(environment);
            this.environment = environmentCopy;
        }

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
        if (getStackId() != null) sb.append("StackId: " + getStackId() + ",");
        if (getShortname() != null) sb.append("Shortname: " + getShortname() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDataSources() != null) sb.append("DataSources: " + getDataSources() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getAppSource() != null) sb.append("AppSource: " + getAppSource() + ",");
        if (getDomains() != null) sb.append("Domains: " + getDomains() + ",");
        if (isEnableSsl() != null) sb.append("EnableSsl: " + isEnableSsl() + ",");
        if (getSslConfiguration() != null) sb.append("SslConfiguration: " + getSslConfiguration() + ",");
        if (getAttributes() != null) sb.append("Attributes: " + getAttributes() + ",");
        if (getEnvironment() != null) sb.append("Environment: " + getEnvironment() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode()); 
        hashCode = prime * hashCode + ((getShortname() == null) ? 0 : getShortname().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDataSources() == null) ? 0 : getDataSources().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getAppSource() == null) ? 0 : getAppSource().hashCode()); 
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode()); 
        hashCode = prime * hashCode + ((isEnableSsl() == null) ? 0 : isEnableSsl().hashCode()); 
        hashCode = prime * hashCode + ((getSslConfiguration() == null) ? 0 : getSslConfiguration().hashCode()); 
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode()); 
        hashCode = prime * hashCode + ((getEnvironment() == null) ? 0 : getEnvironment().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateAppRequest == false) return false;
        CreateAppRequest other = (CreateAppRequest)obj;
        
        if (other.getStackId() == null ^ this.getStackId() == null) return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false) return false; 
        if (other.getShortname() == null ^ this.getShortname() == null) return false;
        if (other.getShortname() != null && other.getShortname().equals(this.getShortname()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDataSources() == null ^ this.getDataSources() == null) return false;
        if (other.getDataSources() != null && other.getDataSources().equals(this.getDataSources()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getAppSource() == null ^ this.getAppSource() == null) return false;
        if (other.getAppSource() != null && other.getAppSource().equals(this.getAppSource()) == false) return false; 
        if (other.getDomains() == null ^ this.getDomains() == null) return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false) return false; 
        if (other.isEnableSsl() == null ^ this.isEnableSsl() == null) return false;
        if (other.isEnableSsl() != null && other.isEnableSsl().equals(this.isEnableSsl()) == false) return false; 
        if (other.getSslConfiguration() == null ^ this.getSslConfiguration() == null) return false;
        if (other.getSslConfiguration() != null && other.getSslConfiguration().equals(this.getSslConfiguration()) == false) return false; 
        if (other.getAttributes() == null ^ this.getAttributes() == null) return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false) return false; 
        if (other.getEnvironment() == null ^ this.getEnvironment() == null) return false;
        if (other.getEnvironment() != null && other.getEnvironment().equals(this.getEnvironment()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateAppRequest clone() {
        
            return (CreateAppRequest) super.clone();
    }

}
    
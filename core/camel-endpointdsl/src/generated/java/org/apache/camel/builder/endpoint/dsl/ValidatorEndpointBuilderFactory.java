/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Validate the payload using XML Schema and JAXP Validation.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ValidatorEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Validator component.
     */
    public interface ValidatorEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedValidatorEndpointBuilder advanced() {
            return (AdvancedValidatorEndpointBuilder) this;
        }
        /**
         * Whether to fail if no body exists.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ValidatorEndpointBuilder failOnNullBody(boolean failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no body exists.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ValidatorEndpointBuilder failOnNullBody(String failOnNullBody) {
            doSetProperty("failOnNullBody", failOnNullBody);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ValidatorEndpointBuilder failOnNullHeader(
                boolean failOnNullHeader) {
            doSetProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * Whether to fail if no header exists when validating against a header.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default ValidatorEndpointBuilder failOnNullHeader(
                String failOnNullHeader) {
            doSetProperty("failOnNullHeader", failOnNullHeader);
            return this;
        }
        /**
         * To validate against a header instead of the message body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ValidatorEndpointBuilder headerName(String headerName) {
            doSetProperty("headerName", headerName);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ValidatorEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default ValidatorEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Validator component.
     */
    public interface AdvancedValidatorEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ValidatorEndpointBuilder basic() {
            return (ValidatorEndpointBuilder) this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * 
         * The option is a:
         * <code>org.apache.camel.support.processor.validation.ValidatorErrorHandler</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder errorHandler(
                Object errorHandler) {
            doSetProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom
         * org.apache.camel.processor.validation.ValidatorErrorHandler. The
         * default error handler captures the errors and throws an exception.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.support.processor.validation.ValidatorErrorHandler</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder errorHandler(
                String errorHandler) {
            doSetProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * To use a custom LSResourceResolver. Do not use together with
         * resourceResolverFactory.
         * 
         * The option is a: <code>org.w3c.dom.ls.LSResourceResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder resourceResolver(
                Object resourceResolver) {
            doSetProperty("resourceResolver", resourceResolver);
            return this;
        }
        /**
         * To use a custom LSResourceResolver. Do not use together with
         * resourceResolverFactory.
         * 
         * The option will be converted to a
         * <code>org.w3c.dom.ls.LSResourceResolver</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder resourceResolver(
                String resourceResolver) {
            doSetProperty("resourceResolver", resourceResolver);
            return this;
        }
        /**
         * To use a custom LSResourceResolver which depends on a dynamic
         * endpoint resource URI. The default resource resolver factory resturns
         * a resource resolver which can read files from the class path and file
         * system. Do not use together with resourceResolver.
         * 
         * The option is a:
         * <code>org.apache.camel.component.validator.ValidatorResourceResolverFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder resourceResolverFactory(
                Object resourceResolverFactory) {
            doSetProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * To use a custom LSResourceResolver which depends on a dynamic
         * endpoint resource URI. The default resource resolver factory resturns
         * a resource resolver which can read files from the class path and file
         * system. Do not use together with resourceResolver.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.validator.ValidatorResourceResolverFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder resourceResolverFactory(
                String resourceResolverFactory) {
            doSetProperty("resourceResolverFactory", resourceResolverFactory);
            return this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory.
         * 
         * The option is a: <code>javax.xml.validation.SchemaFactory</code>
         * type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder schemaFactory(
                Object schemaFactory) {
            doSetProperty("schemaFactory", schemaFactory);
            return this;
        }
        /**
         * To use a custom javax.xml.validation.SchemaFactory.
         * 
         * The option will be converted to a
         * <code>javax.xml.validation.SchemaFactory</code> type.
         * 
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder schemaFactory(
                String schemaFactory) {
            doSetProperty("schemaFactory", schemaFactory);
            return this;
        }
        /**
         * Configures the W3C XML Schema Namespace URI.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: http://www.w3.org/2001/XMLSchema
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder schemaLanguage(
                String schemaLanguage) {
            doSetProperty("schemaLanguage", schemaLanguage);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder useSharedSchema(
                boolean useSharedSchema) {
            doSetProperty("useSharedSchema", useSharedSchema);
            return this;
        }
        /**
         * Whether the Schema instance should be shared or not. This option is
         * introduced to work around a JDK 1.6.x bug. Xerces should not have
         * this issue.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default AdvancedValidatorEndpointBuilder useSharedSchema(
                String useSharedSchema) {
            doSetProperty("useSharedSchema", useSharedSchema);
            return this;
        }
    }

    public interface ValidatorBuilders {
        /**
         * Validator (camel-validator)
         * Validate the payload using XML Schema and JAXP Validation.
         * 
         * Category: core,validation
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-validator
         * 
         * Syntax: <code>validator:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * URL to a local resource on the classpath, or a reference to lookup a
         * bean in the Registry, or a full URL to a remote resource or resource
         * on the file system which contains the XSD to validate against.
         * 
         * @param path resourceUri
         * @return the dsl builder
         */
        default ValidatorEndpointBuilder validator(String path) {
            return ValidatorEndpointBuilderFactory.endpointBuilder("validator", path);
        }
        /**
         * Validator (camel-validator)
         * Validate the payload using XML Schema and JAXP Validation.
         * 
         * Category: core,validation
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-validator
         * 
         * Syntax: <code>validator:resourceUri</code>
         * 
         * Path parameter: resourceUri (required)
         * URL to a local resource on the classpath, or a reference to lookup a
         * bean in the Registry, or a full URL to a remote resource or resource
         * on the file system which contains the XSD to validate against.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path resourceUri
         * @return the dsl builder
         */
        default ValidatorEndpointBuilder validator(
                String componentName,
                String path) {
            return ValidatorEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static ValidatorEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class ValidatorEndpointBuilderImpl extends AbstractEndpointBuilder implements ValidatorEndpointBuilder, AdvancedValidatorEndpointBuilder {
            public ValidatorEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new ValidatorEndpointBuilderImpl(path);
    }
}
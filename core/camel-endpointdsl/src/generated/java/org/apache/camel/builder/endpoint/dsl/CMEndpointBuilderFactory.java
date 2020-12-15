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
 * Send SMS messages via CM SMS Gateway.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface CMEndpointBuilderFactory {


    /**
     * Builder for endpoint for the CM SMS Gateway component.
     */
    public interface CMEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCMEndpointBuilder advanced() {
            return (AdvancedCMEndpointBuilder) this;
        }
        /**
         * This is the sender name. The maximum length is 11 characters.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CMEndpointBuilder defaultFrom(String defaultFrom) {
            doSetProperty("defaultFrom", defaultFrom);
            return this;
        }
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 8
         * Group: producer
         */
        default CMEndpointBuilder defaultMaxNumberOfParts(
                int defaultMaxNumberOfParts) {
            doSetProperty("defaultMaxNumberOfParts", defaultMaxNumberOfParts);
            return this;
        }
        /**
         * If it is a multipart message forces the max number. Message can be
         * truncated. Technically the gateway will first check if a message is
         * larger than 160 characters, if so, the message will be cut into
         * multiple 153 characters parts limited by these parameters.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 8
         * Group: producer
         */
        default CMEndpointBuilder defaultMaxNumberOfParts(
                String defaultMaxNumberOfParts) {
            doSetProperty("defaultMaxNumberOfParts", defaultMaxNumberOfParts);
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
        default CMEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default CMEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The unique token to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default CMEndpointBuilder productToken(String productToken) {
            doSetProperty("productToken", productToken);
            return this;
        }
        /**
         * Whether to test the connection to the SMS Gateway on startup.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CMEndpointBuilder testConnectionOnStartup(
                boolean testConnectionOnStartup) {
            doSetProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
        /**
         * Whether to test the connection to the SMS Gateway on startup.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CMEndpointBuilder testConnectionOnStartup(
                String testConnectionOnStartup) {
            doSetProperty("testConnectionOnStartup", testConnectionOnStartup);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the CM SMS Gateway component.
     */
    public interface AdvancedCMEndpointBuilder
            extends
                EndpointProducerBuilder {
        default CMEndpointBuilder basic() {
            return (CMEndpointBuilder) this;
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
        default AdvancedCMEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedCMEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface CMBuilders {
        /**
         * CM SMS Gateway (camel-cm-sms)
         * Send SMS messages via CM SMS Gateway.
         * 
         * Category: mobile
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-cm-sms
         * 
         * Syntax: <code>cm-sms:host</code>
         * 
         * Path parameter: host (required)
         * SMS Provider HOST with scheme
         * 
         * @param path host
         * @return the dsl builder
         */
        default CMEndpointBuilder cmSms(String path) {
            return CMEndpointBuilderFactory.endpointBuilder("cm-sms", path);
        }
        /**
         * CM SMS Gateway (camel-cm-sms)
         * Send SMS messages via CM SMS Gateway.
         * 
         * Category: mobile
         * Since: 2.18
         * Maven coordinates: org.apache.camel:camel-cm-sms
         * 
         * Syntax: <code>cm-sms:host</code>
         * 
         * Path parameter: host (required)
         * SMS Provider HOST with scheme
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path host
         * @return the dsl builder
         */
        default CMEndpointBuilder cmSms(String componentName, String path) {
            return CMEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static CMEndpointBuilder endpointBuilder(String componentName, String path) {
        class CMEndpointBuilderImpl extends AbstractEndpointBuilder implements CMEndpointBuilder, AdvancedCMEndpointBuilder {
            public CMEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new CMEndpointBuilderImpl(path);
    }
}
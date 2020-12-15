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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.mq.MQComponent;

/**
 * Manage AWS MQ instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsMqComponentBuilderFactory {

    /**
     * AWS MQ (camel-aws-mq)
     * Manage AWS MQ instances.
     * 
     * Category: cloud,messaging
     * Since: 2.21
     * Maven coordinates: org.apache.camel:camel-aws-mq
     * 
     * @return the dsl builder
     */
    static AwsMqComponentBuilder awsMq() {
        return new AwsMqComponentBuilderImpl();
    }

    /**
     * Builder for the AWS MQ component.
     */
    interface AwsMqComponentBuilder extends ComponentBuilder<MQComponent> {
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param autoDiscoverClient the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * To use a existing configured AmazonMQClient as client.
         * 
         * The option is a:
         * &lt;code&gt;com.amazonaws.services.mq.AmazonMQ&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonMqClient the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder amazonMqClient(
                com.amazonaws.services.mq.AmazonMQ amazonMqClient) {
            doSetProperty("amazonMqClient", amazonMqClient);
            return this;
        }
        /**
         * The Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws.mq.MQConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder configuration(
                org.apache.camel.component.aws.mq.MQConfiguration configuration) {
            doSetProperty("configuration", configuration);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform. It can be
         * listBrokers,createBroker,deleteBroker.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws.mq.MQOperations&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder operation(
                org.apache.camel.component.aws.mq.MQOperations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the MQ client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the MQ client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the MQ client.
         * 
         * The option is a: &lt;code&gt;com.amazonaws.Protocol&lt;/code&gt;
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which MQ client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default AwsMqComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class AwsMqComponentBuilderImpl
            extends
                AbstractComponentBuilder<MQComponent>
            implements
                AwsMqComponentBuilder {
        @Override
        protected MQComponent buildConcreteComponent() {
            return new MQComponent();
        }
        private org.apache.camel.component.aws.mq.MQConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.mq.MQComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.mq.MQConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "autoDiscoverClient": getOrCreateConfiguration((MQComponent) component).setAutoDiscoverClient((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((MQComponent) component).setAccessKey((java.lang.String) value); return true;
            case "amazonMqClient": getOrCreateConfiguration((MQComponent) component).setAmazonMqClient((com.amazonaws.services.mq.AmazonMQ) value); return true;
            case "configuration": ((MQComponent) component).setConfiguration((org.apache.camel.component.aws.mq.MQConfiguration) value); return true;
            case "lazyStartProducer": ((MQComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((MQComponent) component).setOperation((org.apache.camel.component.aws.mq.MQOperations) value); return true;
            case "proxyHost": getOrCreateConfiguration((MQComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((MQComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((MQComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": getOrCreateConfiguration((MQComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((MQComponent) component).setSecretKey((java.lang.String) value); return true;
            case "autowiredEnabled": ((MQComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}
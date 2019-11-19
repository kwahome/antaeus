package io.pleo.antaeus.core.infrastructure.messaging.activemq.connection

import io.pleo.antaeus.core.infrastructure.messaging.activemq.config.BrokerConfig
import javax.jms.ConnectionFactory
import org.apache.activemq.ActiveMQConnectionFactory

/**
 * ActiveMQ connection factory
 */
object ConnectionFactory {

    /**
     * Returns a [ConnectionFactory] object
     */
    fun getConnectionFactory(): ConnectionFactory {
        return ActiveMQConnectionFactory(
                BrokerConfig.BROKER_USERNAME,
                BrokerConfig.BROKER_PASSWORD,
                BrokerConfig.BROKER_URL
        )
    }
}

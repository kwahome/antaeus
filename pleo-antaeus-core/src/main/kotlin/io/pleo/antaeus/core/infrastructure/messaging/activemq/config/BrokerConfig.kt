package io.pleo.antaeus.core.infrastructure.messaging.activemq.config

/**
 * Environment driven ActiveMQ broker configuration.
 */
object BrokerConfig {
    val BROKER_URL: String = System.getenv("BROKER_URL")!!
    val BROKER_USERNAME: String = System.getenv("BROKER_USERNAME")!!
    val BROKER_PASSWORD: String = System.getenv("BROKER_PASSWORD")!!
}

package io.pleo.antaeus.app.config

/**
 * Environment driven application configuration
 */
object AppConfiguration {
    // Database
    val DATABASE_URL: String = System.getenv("DATABASE_URL") ?: "jdbc:sqlite:/tmp/data.db"
    val DATABASE_USER: String = System.getenv("DATABASE_USERNAME") ?: ""
    val DATABASE_PASSWORD: String = System.getenv("DATABASE_PASSWORD") ?: ""
    val DATABASE_DRIVER: String = System.getenv("DATABASE_DRIVER") ?: "org.sqlite.JDBC"

    // Task Schedule
    val DEFAULT_TASK_DELAY_CRON: String = System.getenv("DEFAULT_TASK_DELAY_CRON") ?: "0 0 0 1 * ?"

    // Billing Scheduler
    val BILLING_SCHEDULING_JOB_CRON: String = System.getenv("BILLING_SCHEDULING_JOB_CRON") ?: "1 * * * * ?"
    val INVOICE_BILLING_QUEUE: String = System.getenv("INVOICE_BILLING_QUEUE")!!

    // Invoice billing workers
    val BILLING_WORKER_CONCURRENCY: Int = System.getenv("BILLING_WORKER_CONCURRENCY")?.toInt() ?: 1
}

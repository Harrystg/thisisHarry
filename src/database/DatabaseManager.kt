package com.maaxgr.database

import org.ktorm.database.Database

class DatabaseManager {

    // config
    private val hostname = "localhost"
    private val databaseName = "users"
    private val username = "root"
    private val password = "qazxsw123"
//    private val password = System.getenv("KTOR_TODOLIST_DB_PW")

    // database
    private val ktormDatabase: Database

    init {
        val jdbcUrl = "jdbc:mysql://$hostname:3306/$databaseName?user=$username&password=$password&useSSL=false"
        ktormDatabase = Database.connect(jdbcUrl)
    }

}
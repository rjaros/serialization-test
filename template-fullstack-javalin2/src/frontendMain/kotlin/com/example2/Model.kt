package com.example2

import com.example1.DataService

object Model {

    private val pingService = PingService()

    suspend fun ping(message: String): DataService {
        return pingService.ping(DataService(4))
    }

}

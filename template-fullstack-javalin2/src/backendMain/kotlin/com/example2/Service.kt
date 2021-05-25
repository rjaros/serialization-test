package com.example2

import com.example1.DataService

actual class PingService : IPingService {
    override suspend fun ping(message: DataService): DataService {
        return message
    }
}

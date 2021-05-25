package com.example2

import com.example1.DataService
import io.kvision.annotations.KVService

@KVService
interface IPingService {
    suspend fun ping(message: DataService): DataService
}

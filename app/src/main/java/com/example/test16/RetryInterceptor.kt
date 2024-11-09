package com.example.test16

import okhttp3.Interceptor
import okhttp3.Response
import java.net.SocketTimeoutException

class RetryInterceptor(val retryAttempts: Int) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        for (i in 1..retryAttempts) {
            try {
                return chain.proceed(chain.request())
            } catch (e: SocketTimeoutException) {
                e.printStackTrace()
            }
        }
      throw RuntimeException("failed to compile the request")
    }
}
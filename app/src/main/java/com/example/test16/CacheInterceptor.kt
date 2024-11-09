//package com.example.test16
//
//import okhttp3.Interceptor
//import okhttp3.Response
//
//class CacheInterceptor : Interceptor {
//    override fun intercept(chain: Interceptor.Chain): Response {
//        val originalResponse: Response = chain.proceed(chain.request())
//        return if (Utils.isNetworkAvailable(applicationContext))
//        {
//            val maxAge = 60
//            originalResponse.newBuilder()
//                .addHeader("Cache-control", "public, max-age = $maxAge")
//                .build()
//        } else {
//            val maxStale = 60 * 60 * 24 * 28 // 4 weeks
//            originalResponse.newBuilder()
//                .addHeader("Cache-control", "public, only-if-cache max-age = $maxStale")
//                .build()
//        }
//    }
//}
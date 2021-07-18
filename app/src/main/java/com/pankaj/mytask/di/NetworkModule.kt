package com.pankaj.mytask.di

import com.pankaj.mytask.BuildConfig
import com.pankaj.mytask.data.remote.api.MyTaskApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Provides
    fun providesBaseUrl() = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient {
        return if (BuildConfig.DEBUG) {
            val httpLoggingInterceptor = HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
            OkHttpClient().newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .build()
        } else {
            OkHttpClient().newBuilder().build()
        }
    }

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient, baseUrl : String) : Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun providesApiService(retrofit: Retrofit) : MyTaskApiService {
        return retrofit.create(MyTaskApiService::class.java)
    }
}
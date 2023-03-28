package com.example.peopleapi_jpc.di

import com.example.peopleapi_jpc.data.remote.PeopleApi
import com.example.peopleapi_jpc.util.Constant.Companion.BASE_URL
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    @Singleton
    @Provides
    fun providerRetrofit(): Retrofit{
        return  Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    @Singleton
    @Provides
    fun providesPeopleApi(retrofit: Retrofit): PeopleApi{
        return retrofit.create(PeopleApi::class.java)
    }
}
package com.example.shoppingcart.di

import com.example.shoppingcart.data.repository.CartRepositoryImpl
import com.example.shoppingcart.domain.repository.CartRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideCartRepository(): CartRepository = CartRepositoryImpl()
}
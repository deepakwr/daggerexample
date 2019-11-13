package com.deepak.daggerexample.dagger

import com.deepak.daggerexample.car.Driver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class DriverModule (var driverName:String){

    @Provides
    @Singleton
    fun provideDriver():Driver{
        return Driver(driverName)
    }
}
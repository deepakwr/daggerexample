package com.deepak.daggerexample.dagger

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component (modules = arrayOf(DriverModule::class))
interface AppComponent {


    //factory method
//    fun getActivityComponent(dieselEngineModule: DieselEngineModule):ActivityComponent    //      --Examples--

//    fun getActivityComponentBuilder():ActivityComponent.Builder

    fun getActivityComponentFactory():ActivityComponent.Factory


    @Component.Factory
    interface Factory{

        fun create(driverModule: DriverModule): AppComponent

    }
}
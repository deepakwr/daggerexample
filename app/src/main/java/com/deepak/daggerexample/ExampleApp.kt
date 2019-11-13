package com.deepak.daggerexample

import android.app.Application
import com.deepak.daggerexample.dagger.AppComponent
import com.deepak.daggerexample.dagger.DaggerAppComponent
import com.deepak.daggerexample.dagger.DriverModule

class ExampleApp : Application() {


//    private lateinit var carComponent: ActivityComponent    //      --Examples--

    private lateinit var appComponent:AppComponent

    override fun onCreate() {
        super.onCreate()


//        carComponent = ActivityComponent.builder()    //      --Examples--
//            .horsePower(125)
//            .engineCapacity(1500)
//            .build()

//        appComponent = DaggerAppComponent.create()

        appComponent = DaggerAppComponent.factory().create(DriverModule(("Deepak")))
    }

//    fun getCarComponent():ActivityComponent{    //      --Examples--
//        return carComponent
//    }


    fun getAppComponent():AppComponent{
        return appComponent
    }
}
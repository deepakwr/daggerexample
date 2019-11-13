package com.deepak.daggerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.deepak.daggerexample.car.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car1: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val carComponent = DaggerCarComponent.create()    //      --Examples--
//        carComponent.inject(this)

//        val carComponent = DaggerCarComponent.builder()    //      --Examples--
//            .dieselEngineModule(DieselEngineModule(100))
//            .build()
//        carComponent.inject(this)

//        val carComponent = DaggerCarComponent.builder()    //      --Examples--
//            .horsePower(150)
//            .engineCapacity(1400)
//            .build()
//        carComponent.inject(this)


//        (application as ExampleApp).getCarComponent().inject(this)    //      --Examples--


//        var activityComponent = DaggerActivityComponent.builder()    //      --Examples--
//            .horsePower(320)
//            .engineCapacity(2400)
//            .appComponent((application as ExampleApp).getAppComponent())    //      --Examples--
//            .build()
//        activityComponent.inject(this)

//        var activityComponent = (application as ExampleApp).getAppComponent().getActivityComponent(DieselEngineModule(555))    //      --Examples--
//        activityComponent.inject(this)

//        var activityComponent = (application as ExampleApp).getAppComponent().getActivityComponentBuilder()    //      --Examples--
//            .engineCapacity(150)
//            .horsePower(300)
//            .build()
//
//        activityComponent.inject(this)


        var activityComponent = (application as ExampleApp).getAppComponent().getActivityComponentFactory().create(300,450)
        activityComponent.inject(this)


        car1.drive()

        car2.drive()
    }

    companion object{
        val TAG = "DaggerExample"
    }
}

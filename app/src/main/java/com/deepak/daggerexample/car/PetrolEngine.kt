package com.deepak.daggerexample.car

import android.util.Log
import com.deepak.daggerexample.MainActivity
import javax.inject.Inject
import javax.inject.Named

class PetrolEngine: Engine {

    private var horsePower:Int = 0
    private var engineCapacity:Int = 0

    @Inject
    constructor(@Named("horse power") horsePower:Int,@Named("engine capacity") engineCapacity:Int){
        this.horsePower = horsePower
        this.engineCapacity = engineCapacity
    }

    override fun start() {
        Log.d(MainActivity.TAG,"Petrol Engine started.\n HorsePower:" + this.horsePower + " \nEngine Capacity:" +this.engineCapacity)
    }
}
package com.deepak.daggerexample.car

import android.util.Log
import com.deepak.daggerexample.MainActivity
import javax.inject.Inject

class DieselEngine: Engine {

    private var horsePower:Int = 0


    @Inject
    constructor(horsePower:Int){
        this.horsePower = horsePower
    }

    override fun start() {
        Log.d(MainActivity.TAG,"Diesel Engine started. HorsePower:"+this.horsePower)
    }
}
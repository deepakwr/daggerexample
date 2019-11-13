package com.deepak.daggerexample.dagger

import com.deepak.daggerexample.car.DieselEngine
import com.deepak.daggerexample.car.Engine
import dagger.Module
import dagger.Provides

@Module
class DieselEngineModule {

    private var horsePower:Int

    constructor(horsePower: Int){
        this.horsePower = horsePower
    }


    @Provides
    fun provideHorsePower():Int{
        return horsePower
    }

    @Provides
    fun provideEngine(engine: DieselEngine): Engine{
        return engine
    }



//    @Provides
//    fun provideEngine(engine: PetrolEngine):Engine{    //      --Examples--
//        return engine;
//    }
}
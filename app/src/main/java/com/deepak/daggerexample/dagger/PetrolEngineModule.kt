package com.deepak.daggerexample.dagger

import com.deepak.daggerexample.car.Engine
import com.deepak.daggerexample.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {


    @Binds
    abstract fun bindEngine(engine: PetrolEngine): Engine



//    @Provides
//    fun provideEngine(engine: PetrolEngine):Engine{    //      --Examples--
//        return engine;
//    }
}
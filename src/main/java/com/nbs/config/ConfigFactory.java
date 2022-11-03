package com.nbs.config;

// returns instance of FrameworkConfig

public final class ConfigFactory { // nobody can extend

    private ConfigFactory(){}; // nobody can create object

    public static FrameworkConfig getConfig(){
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}

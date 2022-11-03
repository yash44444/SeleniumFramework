package com.nbs.config;

import org.aeonbits.owner.Config;

// mapping for property file

@Config.Sources(value="file:${user.dir}/src/test/resources/config/config.properties")
public interface FrameworkConfig extends Config {

    String username();
    String password();
    String url();
    long timeout();
    String browser();

}

package com.util;

import org.omg.CORBA.portable.InputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicReference;

public class ConfigManager {
    private static final Properties conf = new Properties();
    static {
        InputStream in = (InputStream) ConfigManager.class.getClassLoader().getResourceAsStream("config.properties");

        try {
            conf.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

    }

}

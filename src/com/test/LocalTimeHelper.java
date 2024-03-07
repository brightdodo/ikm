package com.test;

import java.time.LocalTime;
import java.util.ResourceBundle;

public interface LocalTimeHelper {
    default LocalTime construct(int hour, int min, int sec){
        return LocalTime.of(hour, min, sec);
    }
}

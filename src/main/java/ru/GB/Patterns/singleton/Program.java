package ru.GB.Patterns.singleton;

import ru.GB.Patterns.singleton.Settings;

public class Program {
    public static void main(String[] args) {

//        Settings settings1 = new Settings();
//        Settings settings2 = new Settings();

        Settings settings3 = Settings.getInstance();
        Settings settings4 = Settings.getInstance();

    }
}

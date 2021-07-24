package com.vaibhavmojidra.puredependencyinjectionusingfieldjava;

import android.util.Log;

public class SmartPhone {
    public Battery battery;
    public MemoryCard memoryCard;
    public SimCard simCard;

    void startRecording(){
        battery.getPower();
        memoryCard.getSpace();
        simCard.getConnected();
        Log.i("MyInfo","Recording call...");
    }

}

package com.vaibhavmojidra.puredependencyinjectionusingfieldjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SimCard simCard=new SimCard();
        simCard.serviceProvider=new ServiceProvider();
        SmartPhone smartPhone=new SmartPhone();
        smartPhone.battery=new Battery();
        smartPhone.memoryCard=new MemoryCard();
        smartPhone.simCard=simCard; //Injecting Dependency via methods
        smartPhone.startRecording();
    }
}
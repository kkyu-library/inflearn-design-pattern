package com.example._02_structural_patterns._07_bridge.java._01_before;

import com.example._02_structural_patterns._07_bridge.java._02_after.Skin;

public interface Champion extends Skin {

    void move();

    void skillQ();

    void skillW();

    void skillE();

    void skillR();
}

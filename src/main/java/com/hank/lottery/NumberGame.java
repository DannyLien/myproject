package com.hank.lottery;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> number = new HashSet<>();
    int numberCount = 0;

    public abstract void generate();

    public boolean validate() {
        return number.size() == numberCount ? true : false;
    }

}

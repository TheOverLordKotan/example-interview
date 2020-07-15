package org.adarchitecture.example.interview.service.impl;

import org.adarchitecture.example.interview.service.Printer;
import org.springframework.stereotype.Service;

@Service
public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}

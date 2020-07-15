package org.adarchitecture.example.interview.service.impl;

import org.adarchitecture.example.interview.service.BusinessValidator;
import org.adarchitecture.example.interview.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class LengthValidator implements BusinessValidator {

    private String firtsWord;
    private String secondWord;
    @Autowired
    private Printer printer;

	public LengthValidator() {
		super();
	}
    public LengthValidator(String firtsWord, String secondWord, Printer printer) {
        this.firtsWord = firtsWord;
        this.secondWord = secondWord;
        this.printer = printer;
    }

    @Override
    public boolean validateCase() {
    	printer.printValue("===========LengthValidator validateCase ===========");
        printer.printValue(String.valueOf("FirtsWord: "+" - "+ firtsWord));
        printer.printValue(String.valueOf("SecondWord: "+" - "+ secondWord));
	    // length of first string  
	    int len1 = firtsWord.trim().length();  
	    // length of second string  
	    int len2 = secondWord.trim().length();  
	    printer.printValue("==========="+len1 +" == "+len2+" ===========");
	    if (len1 != len2 && len1>0 && len2>0)  
	        return false;
		return true;  
    }

}

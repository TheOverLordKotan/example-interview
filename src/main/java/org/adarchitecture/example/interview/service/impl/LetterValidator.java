package org.adarchitecture.example.interview.service.impl;

import java.util.Arrays;

import org.adarchitecture.example.interview.service.BusinessValidator;
import org.adarchitecture.example.interview.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class LetterValidator implements BusinessValidator {

    private String firtsWord;
    private String secondWord;
    @Autowired
    private Printer printer;
	public LetterValidator() {
		super();
	}
    public LetterValidator(String firtsWord, String secondWord, Printer printer) {
        this.firtsWord = firtsWord;
        this.secondWord = secondWord;
        this.printer = printer;
    }

    @Override
    public boolean validateCase() {
    	printer.printValue("===========LetterValidator validateCase ===========");
        printer.printValue(String.valueOf("FirtsWord: "+" - "+ firtsWord));
        printer.printValue(String.valueOf("SecondWord: "+" - "+ secondWord));
        char[] chars1 = firtsWord.toCharArray();
        char[] chars2 = secondWord.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        printer.printValue("===========Arrays.equals("+String.valueOf(chars1) +" , "+String.valueOf(chars2)+") ===========");
        if(!Arrays.equals(chars1,chars2)) 
        	return false;
        
		return true; 
    }


}

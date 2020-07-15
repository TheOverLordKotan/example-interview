package org.adarchitecture.example.interview.unit;

import static org.junit.Assert.assertEquals;

import org.adarchitecture.example.interview.WordApplication;
import org.adarchitecture.example.interview.service.impl.ConsolePrinter;
import org.adarchitecture.example.interview.service.impl.LengthValidator;
import org.adarchitecture.example.interview.service.impl.LetterValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("dev")
@ContextConfiguration(classes = {WordApplication.class}, loader = AnnotationConfigContextLoader.class)
public class FlowTestRunner {
	@Autowired
	LengthValidator lengthValidator;
	@Autowired
	LetterValidator letterValidator;
	@Autowired
	ConsolePrinter printer;
	
    @Test
    public void stage0() {
        printer.printValue("===========Example ===========");
        
        String str1 = "army";
		String str2 = "mary";
		lengthValidator.setFirtsWord(str1);
		lengthValidator.setSecondWord(str2);
        boolean isValid = lengthValidator.validateCase();
        printer.printValue("....."+ isValid);
        if (isValid) {
            letterValidator.setFirtsWord(str1);
            letterValidator.setSecondWord(str2);
            isValid = letterValidator.validateCase();  
            printer.printValue("....."+ isValid);
		}
        assertEquals(isValid,true);
    }
    @Test
    public void stage1() {
        printer.printValue("===========Example ===========");
        
        String str1 = "Army";
		String str2 = "mary";
		lengthValidator.setFirtsWord(str1);
		lengthValidator.setSecondWord(str2);
        boolean isValid = lengthValidator.validateCase();
        printer.printValue("....."+ isValid);
        if (isValid) {
            letterValidator.setFirtsWord(str1);
            letterValidator.setSecondWord(str2);
            isValid = letterValidator.validateCase();  
            printer.printValue("....."+ isValid);
		}
        assertEquals(isValid,false);
    }
    @Test
    public void stage2() {
        printer.printValue("===========Example ===========");
        
        String str1 = "Mary";
		String str2 = "lary";
		lengthValidator.setFirtsWord(str1);
		lengthValidator.setSecondWord(str2);
        boolean isValid = lengthValidator.validateCase();
        printer.printValue("....."+ isValid);
        if (isValid) {
            letterValidator.setFirtsWord(str1);
            letterValidator.setSecondWord(str2);
            isValid = letterValidator.validateCase();  
            printer.printValue("....."+ isValid);
		}
        assertEquals(isValid,false);
    }
    @Test
    public void stage3() {
        printer.printValue("===========Example ===========");
        
        String str1 = "test";
		String str2 = "lary";
		lengthValidator.setFirtsWord(str1);
		lengthValidator.setSecondWord(str2);
        boolean isValid = lengthValidator.validateCase();
        printer.printValue("....."+ isValid);
        if (isValid) {
            letterValidator.setFirtsWord(str1);
            letterValidator.setSecondWord(str2);
            isValid = letterValidator.validateCase();  
            printer.printValue("....."+ isValid);
		}
        assertEquals(isValid,false);
    }
    @Test
    public void stage4() {
        printer.printValue("===========Example ===========");
        
        String str1 = "testtest";
		String str2 = "mary";
		lengthValidator.setFirtsWord(str1);
		lengthValidator.setSecondWord(str2);
        boolean isValid = lengthValidator.validateCase();
        printer.printValue("....."+ isValid);
        if (isValid) {
            letterValidator.setFirtsWord(str1);
            letterValidator.setSecondWord(str2);
            isValid = letterValidator.validateCase();  
            printer.printValue("....."+ isValid);
		}
        assertEquals(isValid,false);
    }
    
}

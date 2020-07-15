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
public class LenghtTest {
	@Autowired
	LengthValidator lengthValidator;
	@Autowired
	LetterValidator letterValidator;
	@Autowired
	ConsolePrinter printer;
	
    @Test
    public void lenghtValidator() {
        printer.printValue("===========Example ===========");
        
        String str1 = "army";
		String str2 = "mary";
		lengthValidator.setFirtsWord(str1);
		lengthValidator.setSecondWord(str2);
        boolean isValid = lengthValidator.validateCase();
        assertEquals(isValid,true);
    }
    
}

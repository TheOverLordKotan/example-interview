package org.adarchitecture.example.interview.controller;

import org.adarchitecture.example.interview.service.impl.ConsolePrinter;
import org.adarchitecture.example.interview.service.impl.LengthValidator;
import org.adarchitecture.example.interview.service.impl.LetterValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SRPController {

	@Autowired
	LengthValidator lengthValidator;
	@Autowired
	LetterValidator letterValidator;
	@Autowired
	ConsolePrinter printer;

	@GetMapping(value = "/validateWord/{fWord}/{sWord}")
	public ResponseEntity<Boolean> validateWord(@PathVariable(name = "fWord") String fWord, @PathVariable(name = "sWord") String sWord) {
		boolean isValid = false;
		printer.printValue("===========Example ===========");
		lengthValidator.setFirtsWord(fWord);
		lengthValidator.setSecondWord(sWord);
	    isValid = lengthValidator.validateCase();
		printer.printValue("....."+ isValid);
		if (isValid) {
			letterValidator.setFirtsWord(fWord);
			letterValidator.setSecondWord(sWord);
			isValid = letterValidator.validateCase();  
			printer.printValue("....."+ isValid);
		}
		if (isValid) {
			return new ResponseEntity<Boolean>(isValid, HttpStatus.OK);
		}else {
			return new ResponseEntity<Boolean>(isValid, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
}

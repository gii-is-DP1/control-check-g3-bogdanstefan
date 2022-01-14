package org.springframework.samples.petclinic.recoveryroom;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

@Component
public class RecoveryRoomTypeFormatter implements Formatter<RecoveryRoomType> {
	
	@Autowired  //TEST 7
	private RecoveryRoomService rrs;  //TEST 7

    @Override  
    public String print(RecoveryRoomType object, Locale locale) {
    	String nombre = object.getName();  //TEST 7
        return nombre;  //TEST 7
    }

    @Override
    public RecoveryRoomType parse(String text, Locale locale) throws ParseException {
    	RecoveryRoomType r = this.rrs.getRecoveryRoomType(text);  //TEST 7
    	if (r == null) {  //TEST 7
    		throw new ParseException(text, 0);  //TEST 7
    	} else {  //TEST 7
    		return r;  //TEST 7
    	}
    }
}
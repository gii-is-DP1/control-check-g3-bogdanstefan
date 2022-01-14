package org.springframework.samples.petclinic.recoveryroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //TEST 9
@RequestMapping("/recoveryRoom")
public class RecoveryRoomController {
	
	@Autowired
	private RecoveryRoomService recoveryRoomService;
    
}

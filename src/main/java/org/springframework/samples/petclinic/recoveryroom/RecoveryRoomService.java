package org.springframework.samples.petclinic.recoveryroom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class RecoveryRoomService {
	
	@Autowired  //TEST 5
	private RecoveryRoomRepository recoveryRoomRepository;  //TEST 5
	
    public List<RecoveryRoom> getAll() {  //TEST 5
    	List<RecoveryRoom> r = recoveryRoomRepository.findAll();  //TEST 5
        return r;  //TEST 5
    }

    public List<RecoveryRoomType> getAllRecoveryRoomTypes() {  //TEST 9
    	List<RecoveryRoomType> rrt = recoveryRoomRepository.findAllRecoveryRoomTypes();  //TEST 9
        return rrt;  //TEST 9
    }

    public RecoveryRoomType getRecoveryRoomType(String typeName) {  //TEST 6
    	RecoveryRoomType tipoHabitacion = recoveryRoomRepository.findRecoveryRoomType(typeName);  //TEST 6
        return tipoHabitacion;  //TEST 6
    }

    public List<RecoveryRoom> getRecoveryRoomsBiggerThan(double size) {
    	List<RecoveryRoom> r = this.recoveryRoomRepository.findBySizeMoreThan(size);  //TEST 8
        return r;  //TEST 8
    }

    public RecoveryRoom save(RecoveryRoom p) {
        return null;       
    }
}
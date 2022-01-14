package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  //TEST 2
@Table(name = "recovery_room_type")  //TEST 2
public class RecoveryRoomType extends NamedEntity {
    Integer id;
    
    @NotNull  //TEST 2
	@Size(min = 5, max = 50)  //TEST 2
    @Column(name = "name", unique = true)  //TEST 2
	String name;  //TEST 2
    
    @NotNull  //TEST 2
	@Min(value = 0)  //TEST 2
    double size;  //TEST 2
    
    @NotNull
    boolean secure;
}
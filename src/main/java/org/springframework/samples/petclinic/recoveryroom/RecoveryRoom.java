package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.samples.petclinic.model.NamedEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity  //TEST 1
public class RecoveryRoom  extends NamedEntity {
	
    Integer id;
    
    @NotNull  //TEST 1
	@Size(min = 3, max = 50)  //TEST 1
	String name;  //TEST 1
    
    @NotNull  //TEST 1
	@Min(value = 0)  //TEST 1
    double size;  //TEST 1
    
    @NotNull  //TEST 1
    boolean secure;
    
    @Transient
    RecoveryRoomType roomType;
    
    @ManyToOne  //TEST 4
	@NotNull  //TEST 4
	@JoinColumn(name = "recovery_room_type_id")  //TEST 4
	RecoveryRoomType recoveryRoomType;  //TEST 4
}
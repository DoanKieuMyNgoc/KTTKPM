package com.example.spring_data_crud.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Embeddable
@EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
public class ChungNhanPK implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nhanVien;
	private int mayBay;
		
}

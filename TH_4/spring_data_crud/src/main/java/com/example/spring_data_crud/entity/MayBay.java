package com.example.spring_data_crud.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "maybay")
public class MayBay implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MaMB")
	private int maMB;
	@Column(name = "Loai")
	private String loai;
	@Column(name = "TamBay")
	private int tamBay;
	
	@OneToMany(mappedBy = "mayBay")
	private List<ChungNhan> chungNhans;

	public int getMaMB() {
		return maMB;
	}

	public void setMaMB(int maMB) {
		this.maMB = maMB;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public int getTamBay() {
		return tamBay;
	}

	public void setTamBay(int tamBay) {
		this.tamBay = tamBay;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "MayBay [maMB=" + maMB + ", loai=" + loai + ", tamBay=" + tamBay + "]";
	}


	
}

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
@Table(name = "nhanvien")
public class NhanVien implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MaNV")
	private String maNV;
	
	@Column(name = "Ten")
	private String ten;
	
	@Column(name = "Luong")
	private int luong;
	
	@OneToMany(mappedBy = "nhanVien")
	private List<ChungNhan> chungNhans;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", ten=" + ten + ", luong=" + luong + "]";
	}


	

}

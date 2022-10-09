package com.example.spring_data_crud.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.example.spring_data_crud.entity.NhanVien;

public interface NhanVienService {
	public List<NhanVien> findByLuongNhoHon10000();
	public int sumLuong();
	public List<NhanVien> findBymaMB747();
	public List<String> findMaByNVLaiBoeingVaAirbus();
	public List<String> findTenByNVLaiBoeing();
	public List<String> findMaNVChiLaiDuoc3LoaiMayBay();
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();
	public List<NhanVien> findNVKhongPhaiPhiCong();
	public List<String> findNVMaxLuong();
	public int tongSoLuongPhaiTra();
	List<NhanVien> findNhanVienByLuong(@Param("luong") int luong);
	
}

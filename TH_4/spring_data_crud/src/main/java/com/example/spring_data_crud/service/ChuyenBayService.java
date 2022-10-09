package com.example.spring_data_crud.service;

import java.util.List;

import com.example.spring_data_crud.entity.ChuyenBay;

public interface ChuyenBayService {
	public List<ChuyenBay> findByGaDen();
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000();
	public List<ChuyenBay> findBySGtoBMT();
	public int sumCBFromSG();
	public List<ChuyenBay> findCBByMBAirbusA320();
	public List<ChuyenBay> findDBFromAtoBAndToA();
	public List<Object[]> countChuyenBayKhoiHanh();
	public List<Object[]> tongChiPhiPhaiTra();
	public List<ChuyenBay> findCBKHTruoc12h();
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h();
	public List<ChuyenBay> findCBDuocLaiBoiBoeing();}

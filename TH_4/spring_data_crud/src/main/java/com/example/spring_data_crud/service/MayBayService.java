package com.example.spring_data_crud.service;

import java.util.List;

public interface MayBayService {
	public List<String> findByTamBayLonHon10000();
	public int sumMayBayBoeing();
	public List<String> findMaByNameNguyen();
	public List<String> findLoaiByCBVN280();
	public List<Object[]> findMaLoaiVaTongPhiCong();
}

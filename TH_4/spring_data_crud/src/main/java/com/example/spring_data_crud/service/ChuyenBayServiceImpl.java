package com.example.spring_data_crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring_data_crud.entity.ChuyenBay;
import com.example.spring_data_crud.respository.ChuyenBayRespository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService{
	@Autowired
	private ChuyenBayRespository chuyenBayRespository;


	@Override
	public List<ChuyenBay> findByGaDen() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findByGaDen();
	}

	@Override
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findByDoDaiDBNhoHon10000VaLoHon8000();
	}

	@Override
	public List<ChuyenBay> findBySGtoBMT() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findBySGtoBMT();
	}

	@Override
	public int sumCBFromSG() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.sumCBFromSG();
	}

	@Override
	public List<ChuyenBay> findCBByMBAirbusA320() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ChuyenBay> findDBFromAtoBAndToA() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findDBFromAtoBAndToA();
	}

	@Override
	public List<Object[]> countChuyenBayKhoiHanh() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.countChuyenBayKhoiHanh();
	}

	@Override
	public List<Object[]> tongChiPhiPhaiTra() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.tongChiPhiPhaiTra();
	}

	@Override
	public List<ChuyenBay> findCBKHTruoc12h() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findCBKHTruoc12h();
	}

	@Override
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.countDiaDiemKhoiHanhTruoc12h();
	}

	@Override
	public List<ChuyenBay> findCBDuocLaiBoiBoeing() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findCBDuocLaiBoiBoeing();
	}
	
	
	

}

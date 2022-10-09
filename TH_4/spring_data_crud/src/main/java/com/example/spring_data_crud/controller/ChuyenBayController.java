package com.example.spring_data_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_data_crud.entity.ChuyenBay;
import com.example.spring_data_crud.service.ChuyenBayService;

@RestController
@RequestMapping("/chuyenbay")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayService chuyenBayService;
	
//	1. Cho biết các chuyến bay đi Đà Lạt (DAD).
	@GetMapping("/findByGaDen")
    public List<ChuyenBay> findByGaDen() {
    	return chuyenBayService.findByGaDen();
    	
    }
//	4. Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km
	@GetMapping("/findByDoDaiDBNhoHon10000VaLoHon8000")
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000() {
    	return chuyenBayService.findByDoDaiDBNhoHon10000VaLoHon8000();
    	
    }
//	5. Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@GetMapping("/findBySGtoBMT")
	public List<ChuyenBay> findBySGtoBMT() {
    	return chuyenBayService.findBySGtoBMT();
    	
    }
//	6. Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@GetMapping("/sumCBFromSG")
	public int sumCBFromSG() {
    	return chuyenBayService.sumCBFromSG();
    	
    }
//	14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320
	
	@GetMapping("/findCBByMBAirbusA320")
    public List<ChuyenBay> findCBByMBAirbusA320() {
    	return chuyenBayService.findCBByMBAirbusA320();
    	
    }
//	17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các
//	đường bay nào có thể đáp ứng yêu cầu này.
	@GetMapping("/findDBFromAtoBAndToA")
    public List<ChuyenBay> findDBFromAtoBAndToA() {
    	return chuyenBayService.findDBFromAtoBAndToA();
    	
    }
//	18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga 
//	đó.
	@GetMapping("/countChuyenBayKhoiHanh")
    public List<Object[]> countChuyenBayKhoiHanh() {
    	return chuyenBayService.countChuyenBayKhoiHanh();
    	
    }
//	19. Với mỗi ga có chuyến bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các 
//	chuyến bay khởi hành từ ga đó.
	@GetMapping("/tongChiPhiPhaiTra")
    public List<Object[]> tongChiPhiPhaiTra() {
    	return chuyenBayService.tongChiPhiPhaiTra();
    	
    }
//	20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
	@GetMapping("/findCBKHTruoc12h")
    public List<ChuyenBay> findCBKHTruoc12h() {
    	return chuyenBayService.findCBKHTruoc12h();
    	
    }
//	21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
	@GetMapping("/countDiaDiemKhoiHanhTruoc12h")
    public List<Object[]> countDiaDiemKhoiHanhTruoc12h() {
    	return chuyenBayService.countDiaDiemKhoiHanhTruoc12h();
    	
    }
//	28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing
	@GetMapping("/findCBDuocLaiBoiBoeing")
    public List<ChuyenBay> findCBDuocLaiBoiBoeing() {
    	return chuyenBayService.findCBDuocLaiBoiBoeing();
    	
    }
}

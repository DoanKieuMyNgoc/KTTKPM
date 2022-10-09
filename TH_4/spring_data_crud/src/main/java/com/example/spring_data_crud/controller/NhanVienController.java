package com.example.spring_data_crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_data_crud.entity.NhanVien;
import com.example.spring_data_crud.service.NhanVienService;

@RestController
@RequestMapping("/nhanvien")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;

//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
    @GetMapping("/findByLuongNhoHon10000")
    public List<NhanVien> findByLuongNhoHon10000() {
    	return nhanVienService.findByLuongNhoHon10000();
    	
    }
//	8. Cho biết tổng số lương phải trả cho các nhân viên.
    @GetMapping("/sumLuong")
    public int sumLuong() {
    	return nhanVienService.sumLuong();
    }
//	10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
    @GetMapping("/findBymaMB747")
    public List<NhanVien> findBymaMB747() {
    	return nhanVienService.findBymaMB747();
    }
//	12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
    @GetMapping("/findMaByNVLaiBoeingVaAirbus")
    public List<String> findMaByNVLaiBoeingVaAirbus() {
    	return nhanVienService.findMaByNVLaiBoeingVaAirbus();
    }
//	15. Cho biết tên của các phi công lái máy bay Boein
    @GetMapping("/findTenByNVLaiBoeing")
    public List<String> findTenByNVLaiBoeing() {
    	return nhanVienService.findTenByNVLaiBoeing();
    }
//	22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
    @GetMapping("/findMaNVChiLaiDuoc3LoaiMayBay")
    public List<String> findMaNVChiLaiDuoc3LoaiMayBay() {
    	return nhanVienService.findMaNVChiLaiDuoc3LoaiMayBay();
    }
//	23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn 
//	nhất của các loại máy bay mà phi công đó có thể lái.
    @GetMapping("/findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay")
    public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay() {
    	return nhanVienService.findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
    }
//	24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
    @GetMapping("/findMaNVAndCountLoaiMayBayCoTheLai")
    public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai() {
    	return nhanVienService.findMaNVAndCountLoaiMayBayCoTheLai();
    }
//	25. Tìm các nhân viên không phải là phi công.
    @GetMapping("/findNVKhongPhaiPhiCong")
    public List<NhanVien> findNVKhongPhaiPhiCong() {
    	return nhanVienService.findNVKhongPhaiPhiCong();
    }
//	26. Cho biết mã số của các nhân viên có lương cao nhất.
    @GetMapping("/findNVMaxLuong")
    public List<String> findNVMaxLuong() {
    	return nhanVienService.findNVMaxLuong();
    }
//	27. Cho biết tổng số lương phải trả cho các phi công
    @GetMapping("/tongSoLuongPhaiTra")
    public int tongSoLuongPhaiTra() {
    	return nhanVienService.tongSoLuongPhaiTra();
    }
    @GetMapping("/{luong}")
    public List<NhanVien> findNhanVienByLuong(@PathVariable int luong) {
        return nhanVienService.findNhanVienByLuong(luong);
    }
}

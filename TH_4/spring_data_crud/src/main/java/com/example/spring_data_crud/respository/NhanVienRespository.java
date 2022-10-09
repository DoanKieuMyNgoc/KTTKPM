package com.example.spring_data_crud.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.spring_data_crud.entity.NhanVien;

@Repository
public interface NhanVienRespository extends JpaRepository<NhanVien, String> {
//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@Query(value = "select * from nhanvien where luong<10000", nativeQuery = true)
	public List<NhanVien> findByLuongNhoHon10000();

//	8. Cho biết tổng số lương phải trả cho các nhân viên.
	@Query(value = "select SUM(Luong) from public.nhanvien", nativeQuery = true)
	public int sumLuong();

//	10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@Query(value = "SELECT        nhanvien.manv, nhanvien.ten, nhanvien.luong\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "where chungnhan.mamb=747", nativeQuery = true)
	public List<NhanVien> findBymaMB747();

//	12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@Query(value = "SELECT        nhanvien.manv\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "where (loai like '%Boeing%' or loai like '%Airbus%')\r\n" + "group by nhanvien.manv", nativeQuery = true)
	public List<String> findMaByNVLaiBoeingVaAirbus();

//	15. Cho biết tên của các phi công lái máy bay Boein
	@Query(value = "SELECT        nhanvien.ten\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "where loai like '%Boeing%'\r\n" + "group by nhanvien.ten", nativeQuery = true)
	public List<String> findTenByNVLaiBoeing();

//	22. Cho biết mã số của các phi công chỉ lái được 3 loại máy bay
	@Query(value = "SELECT        nhanvien.manv\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n" + "group by  nhanvien.MaNV\r\n"
			+ "having COUNT(maybay.mamb)=3", nativeQuery = true)
	public List<String> findMaNVChiLaiDuoc3LoaiMayBay();

//	23. Với mỗi phi công có thể lái nhiều hơn 3 loại máy bay, cho biết mã số phi công và tầm bay lớn 
//	nhất của các loại máy bay mà phi công đó có thể lái.
	@Query(value = "SELECT        nhanvien.manv, MAX(maybay.tam_bay) as TamBayLonNhat\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n" + "group by  nhanvien.manv\r\n"
			+ "HAVING COUNT(maybay.mamb)>3", nativeQuery = true)
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();

//	24. Với mỗi phi công cho biết mã số phi công và tổng số loại máy bay mà phi công đó có thể lái.
	@Query(value = "SELECT        nhanvien.manv, COUNT(maybay.loai) as TongLoaiSoMayBay\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "group by nhanvien.manv", nativeQuery = true)
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();

//	25. Tìm các nhân viên không phải là phi công.
	@Query(value = "select * from nhanvien\r\n" + "where manv not in (select manv from chungnhan)", nativeQuery = true)
	public List<NhanVien> findNVKhongPhaiPhiCong();

//	26. Cho biết mã số của các nhân viên có lương cao nhất.
	@Query(value = "select manv from nhanvien where luong=(select max(luong) from nhanvien)", nativeQuery = true)
	public List<String> findNVMaxLuong();

//	27. Cho biết tổng số lương phải trả cho các phi công
	@Query(value = "SELECT       sum(luong) as TongSoLuong\r\n" + "FROM            nhanvien\r\n"
			+ "where manv  in (select manv from chungnhan)", nativeQuery = true)
	public int tongSoLuongPhaiTra();

	@Query(value = "select * from NhanVien where luong < :luong", nativeQuery = true)
	List<NhanVien> findNhanVienByLuong(@Param("luong") int luong);
}

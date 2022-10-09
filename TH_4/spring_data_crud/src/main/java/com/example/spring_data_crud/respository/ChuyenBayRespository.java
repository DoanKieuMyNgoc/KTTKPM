package com.example.spring_data_crud.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spring_data_crud.entity.ChuyenBay;

@Repository
public interface ChuyenBayRespository extends JpaRepository<ChuyenBay, String> {
//	1.Cho biết các chuyến bay đi Đà Lạt (DAD)
	@Query(value = "select * from chuyenbay where ga_den='DAD'", nativeQuery = true)
	public List<ChuyenBay> findByGaDen();

//  4.Cho biết các chuyến bay có độ dài đường bay nhỏ hơn 10.000km và lớn hơn 8.000km.
	@Query(value = "select * from chuyenbay where do_dai < 10000 and do_dai > 8000", nativeQuery = true)
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000();

//  5.Cho biết các chuyến bay xuất phát từ Sài Gòn (SGN) đi Ban Mê Thuộc (BMV).
	@Query(value = "select * from chuyenbay where ga_di = 'SGN' and ga_den = 'BMV'", nativeQuery = true)
	public List<ChuyenBay> findBySGtoBMT();

//	6.Có bao nhiêu chuyến bay xuất phát từ Sài Gòn (SGN).
	@Query(value = "select count(*) from chuyenbay where ga_di = 'SGN'", nativeQuery = true)
	public int sumCBFromSG();

//	14. Cho biết các chuyến bay có thể ñược thực hiện bởi máy bay Airbus A320
	@Query(value = "SELECT * from chuyenbay where do_dai < ( select tam_bay from maybay where Loai =N'Airbus A320')", nativeQuery = true)
	public List<ChuyenBay> findCBByMBAirbusA320();

//	17. Giả sử một hành khách muốn đi thẳng từ ga A đến ga B rồi quay trở về ga A. Cho biết các
//	đường bay nào có thể đáp ứng yêu cầu này.
	@Query(value = "select * from chuyenbay where ga_di in"
			+ "(select ga_den from chuyenbay) and ga_den in (select ga_di from chuyenbay)", nativeQuery = true)
	public List<ChuyenBay> findDBFromAtoBAndToA();

//	18. Với mỗi ga có chuyến bay xuất phát từ đó cho biết có bao nhiêu chuyến bay khởi hành từ ga 
//	đó.
	@Query(value = "select ga_di, count(*) as SoChuyenBay from chuyenbay\r\n" + "group by ga_di", nativeQuery = true)
	public List<Object[]> countChuyenBayKhoiHanh();

//	19. Với mỗi ga có chuyến bay xuất phát từ đó cho biết tổng chi phí phải trả cho phi công lái các 
//	chuyến bay khởi hành từ ga đó.
	@Query(value = "select ga_di, sum(chi_phi) as Tongchiphi from chuyenbay\r\n" + "group by ga_di", nativeQuery = true)
	public List<Object[]> tongChiPhiPhaiTra();

//	20. Cho biết danh sách các chuyến bay có thể khởi hành trước 12:00
	@Query(value = "select * from chuyenbay where gio_di<'12:00:00'", nativeQuery = true)
	public List<ChuyenBay> findCBKHTruoc12h();

//	21. Với mỗi địa điểm xuất phát cho biết có bao nhiêu chuyến bay có thể khởi hành trước 12:00.
	@Query(value = "select ga_di, count(*) as so_luong from chuyenbay where gio_di<'12:00:00'\r\n"
			+ "group by ga_di", nativeQuery = true)
	public List<Object[]> countDiaDiemKhoiHanhTruoc12h();

//	28. Tìm các chuyến bay có thể được thực hiện bởi tất cả các loại máy bay Boeing
	@Query(value = "\r\n" + "SELECT        macb, ga_di, ga_den,do_dai, gio_di, gio_den, chi_phi\r\n"
			+ "FROM            chuyenbay\r\n" + "group by macb, ga_di, ga_den,do_dai, gio_di, gio_den, chi_phi\r\n"
			+ "having do_dai<= all(select tam_bay from maybay where loai like '%Boeing%')", nativeQuery = true)
	public List<ChuyenBay> findCBDuocLaiBoiBoeing();

}

package com.example.spring_data_crud.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spring_data_crud.entity.MayBay;
@Repository
public interface MayBayRespository extends JpaRepository<MayBay, Integer> {
//	2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
	@Query(value = "select loai from maybay where tam_bay>10000", nativeQuery = true)
	public List<String> findByTamBayLonHon10000();

//	7. Có bao nhiêu loại máy báy Boeing.
	@Query(value = "select count(*) from maybay where loai like '%Boeing%'", nativeQuery = true)
	public int sumMayBayBoeing();

//	11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
	@Query(value = "SELECT        maybay.mamb\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "where nhanvien.ten like '%Nguyen%'\r\n" + "group by maybay.mamb", nativeQuery = true)
	public List<String> findMaByNameNguyen();

//	13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
	@Query(value = "select loai from maybay where tam_bay < (select do_dai from chuyenbay where macb = 'VN280')", nativeQuery = true)
	public List<String> findLoaiByCBVN280();

//	16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
	@Query(value = "SELECT        maybay.mamb, maybay.loai, maybay.tam_bay, COUNT(distinct nhanvien.manv) AS SoLuongPhiCong\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "group by maybay.mamb, maybay.loai,maybay.tam_bay", nativeQuery = true)
	public List<Object[]> findMaLoaiVaTongPhiCong();
}

package com.example.spring_data_crud.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.spring_data_crud.entity.ChungNhan;
import com.example.spring_data_crud.entity.ChungNhanPK;

@Repository
public interface ChungNhanRespository extends JpaRepository<ChungNhan, ChungNhanPK> {
//	9. Cho biết mã số của các phi công lái máy báy Boeing
	@Query(value = "SELECT        nhanvien.MaNV\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.mamb = maybay.mamb INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.manv = nhanvien.manv\r\n"
			+ "where  loai like '%Boeing%'\r\n" + "group by nhanvien.manv", nativeQuery = true)
	public List<String> findByBoeing();

}

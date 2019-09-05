package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tws.entity.Cainiao;

public class CainiaoMapper {
	 List<Cainiao> selectAll();
	    void insert(@Param("cainiao") Cainiao cainiao);

}

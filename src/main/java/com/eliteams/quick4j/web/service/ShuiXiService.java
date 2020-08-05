package com.eliteams.quick4j.web.service;

import com.eliteams.quick4j.core.generic.GenericService;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.model.ShuiXi;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface ShuiXiService extends GenericService<ShuiXi, Integer> {

    ArrayList<ShuiXi> getRiverName(Map map);


    ShuiXi getRiverMessage(Map map);




    int insert(ShuiXi record);

    int insertselective(ShuiXi record);

    int update(ShuiXi record);

    int deleteByPrimaryKey(Integer id);

    ShuiXi selectById(Integer id);


    ShuiXi  selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShuiXi record);

    List<ShuiXi> searchByPage(String pageNow, Map map);

    Page getSearchPage(String pageNow, Map map);

    List<ShuiXi> selectForMap(Map map);



    Model selectShuiXiByPage(String pageNow, Model model);



}

package com.eliteams.quick4j.web.service.impl;

import com.eliteams.quick4j.core.generic.GenericDao;
import com.eliteams.quick4j.core.generic.GenericServiceImpl;
import com.eliteams.quick4j.core.page.Page;
import com.eliteams.quick4j.web.dao.ShuiXiMapper;
import com.eliteams.quick4j.web.model.ShuiXi;
import com.eliteams.quick4j.web.service.ShuiXiService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShuiXiServiceImpl extends GenericServiceImpl<ShuiXi, Integer> implements ShuiXiService {

    @Resource
    private ShuiXiMapper shuixiMapper;

    @Override
    public GenericDao<ShuiXi, Integer> getDao() {
        return null;
    }

    @Override
    public ArrayList<ShuiXi> getRiverName(Map map) {
        return shuixiMapper.getRiverName(map);
    }

    @Override
    public ShuiXi getRiverMessage(Map map) {

        return shuixiMapper.getRiverMessage(map);
    }




    @Override
    public int insert(ShuiXi model){
        return shuixiMapper.insertSelective(model);
    }

    @Override
    public int insertselective(ShuiXi record) {
        return shuixiMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return shuixiMapper.deleteByPrimaryKey(id);
    }


    @Override
    public ShuiXi selectByPrimaryKey(Integer id) {
        return shuixiMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShuiXi record) {
        return shuixiMapper.updateByPrimaryKeySelective(record);
    }



    @Override
    public Page getSearchPage(String pageNow, Map map) {

            Page page = null;
            int totalCount = (int)shuixiMapper.getSearchCount(map);
            if (pageNow != null) {
                page = new Page(totalCount, Integer.parseInt(pageNow));
            } else {
                page = new Page(totalCount, 1);
            }
            return page;

    }

    @Override
    public List<ShuiXi> selectForMap(Map map) {
        return shuixiMapper.selectForMap(map);
    }

    @Override
    public Model selectShuiXiByPage(String pageNow, Model model) {
        Page page = null;


        List<ShuiXi> shuiXi = new ArrayList<ShuiXi>();

        int totalCount = (int)shuixiMapper.getShuiXiCount();

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            shuiXi =shuixiMapper.selectShuiXiByPage(page.getStartPos(),page.getPageSize());
        } else {
            page = new Page(totalCount, 1);
            shuiXi =shuixiMapper.selectShuiXiByPage(page.getStartPos(),page.getPageSize());
        }
        model.addAttribute("list",shuiXi);
        model.addAttribute("page",page);
        return model;
    }

    @Override
    public List<ShuiXi> searchByPage(String pageNow, Map map) {
        Page page = null;
        List<ShuiXi> shuiXi = new ArrayList<ShuiXi>();
        int totalCount = (int)shuixiMapper.getSearchCount(map);

        if (pageNow != null) {
            page = new Page(totalCount, Integer.parseInt(pageNow));
            shuiXi = shuixiMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);
        } else {
            page = new Page(totalCount, 1);
            shuiXi = shuixiMapper.searchByPage(page.getStartPos(), page.getPageSize(),map);
        }
        return shuiXi;
    }

}

package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.model.CaseHistory;
import com.jundeli.sslz.order.model.CaseHistoryWithBLOBs;

public interface CaseHistoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(CaseHistoryWithBLOBs record);

    int insertSelective(CaseHistoryWithBLOBs record);

    CaseHistoryWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CaseHistoryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CaseHistoryWithBLOBs record);

    int updateByPrimaryKey(CaseHistory record);
}
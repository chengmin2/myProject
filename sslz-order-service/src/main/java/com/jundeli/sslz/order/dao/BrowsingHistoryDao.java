package com.jundeli.sslz.order.dao;

import com.jundeli.sslz.order.model.BrowsingHistory;

public interface BrowsingHistoryDao {
    int deleteByPrimaryKey(Long id);

    int insert(BrowsingHistory record);

    int insertSelective(BrowsingHistory record);

    BrowsingHistory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BrowsingHistory record);

    int updateByPrimaryKey(BrowsingHistory record);
}
/*
 * File Name：OralServiceImpl.java
 *
 * Copyrighe：copyright@2016 www.ggkbigdata.com. All Rights Reserved
 *
 * Create Time: 2016年9月20日 下午4:32:45
 */
package com.ggkbigdata.ioss.dbsource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ggkbigdata.ioss.dbsource.mapper.DataSynchronismMapper;
import com.ggkbigdata.ioss.dbsource.model.TicketMainInfo;
import com.ggkbigdata.ioss.dbsource.service.DataSynchronismService;

/**
 *
 * @author lcc (lincc@ggkbigdata.com)
 * @version 1.0, 2016年9月20日 下午4:32:45
 */
@Service
public class DataSynchronismServiceImpl implements DataSynchronismService {
    
    @Autowired
    private DataSynchronismMapper mapper;
    @Override
    public List<TicketMainInfo> getTicketMainInfoFromOral(String date, long start, long end) {
        return mapper.getTicketMainInfoFromOral(date, start, end);
    }
    @Override
    public long getDateEventCount(String date) {
        return mapper.getDateEventCount(date);
    }
}


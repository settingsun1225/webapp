package com.home.liuyi.webapp.domain.mapper;

import com.home.liuyi.webapp.domain.HelloDo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by liuyi on 17/3/2.
 */
public interface HelloMapper {
    HelloDo selectById(@Param(value = "id")int id);
}

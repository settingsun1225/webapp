package com.github.settingsun.webapp.domain.mapper;

import com.github.settingsun.webapp.domain.HelloDo;
import org.apache.ibatis.annotations.Param;

/**
 * Created by settingsun1225 on 17/3/2.
 */
public interface HelloMapper {
    HelloDo selectById(@Param(value = "id")int id);
}

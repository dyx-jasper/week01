package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Hero;

public interface HeroMapper {
	public List<Hero> queryAll(Map<String,Object> map);

}

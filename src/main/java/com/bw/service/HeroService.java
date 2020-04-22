package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Hero;

public interface HeroService {
	public List<Hero> queryAll(Map<String,Object> map);
}

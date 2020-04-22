package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Hero;
import com.bw.mapper.HeroMapper;
@Service
public class HeroServiceImpl implements HeroService {
	@Resource
	private HeroMapper hMapper;
	@Override
	public List<Hero> queryAll(Map<String, Object> map) {
		
		return hMapper.queryAll(map);
	}

}

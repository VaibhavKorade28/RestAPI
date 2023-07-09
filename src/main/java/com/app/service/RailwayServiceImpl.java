package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.RailwayReqDto;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.repository.RailwayRepository;
@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {
    @Autowired
    private ModelMapper mapper;
    @Autowired
    private RailwayRepository railRepo;
	@Override
	public Railway addNewRailway(RailwayReqDto newRail) {
		Railway railway=mapper.map(newRail, Railway.class);
		return railRepo.save(railway);
	}
	@Override
	public String deleteRailway(Long railId) {
		// TODO Auto-generated method stub
		if(railRepo.existsById(railId))
		{
			railRepo.deleteById(railId);
			return "railway with railId"+railId+"deleted";
		}
		return "failed to delete the record";
	}
	@Override
	public List<Railway> getByRailCategory(Category category) {
		// TODO Auto-generated method stub
		return railRepo.findByCategory(category);
	}

}

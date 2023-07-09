package com.app.service;

import java.util.List;

import com.app.dto.RailwayReqDto;
import com.app.entities.Category;
import com.app.entities.Railway;


public interface RailwayService {

	Railway addNewRailway(RailwayReqDto newRail);

	String deleteRailway(Long railId);

	List<Railway> getByRailCategory(Category category);

}

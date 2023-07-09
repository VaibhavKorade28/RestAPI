package com.app.contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.RailwayReqDto;
import com.app.entities.Category;
import com.app.service.RailwayService;


@RestController
@RequestMapping("/railways")
public class RailwayController {
   public RailwayController() {
	System.out.println("in ctor of"+getClass());
}
   @Autowired
   private RailwayService railService;
   @PostMapping
   public ResponseEntity<?> addRailway(@RequestBody @Valid RailwayReqDto newRail)
   
   {
	   System.out.println(newRail);
	   return ResponseEntity.status(HttpStatus.CREATED).body(railService.addNewRailway(newRail));
   }
   @DeleteMapping("/{railId}")
   
	   public ApiResponse deleteARailway(@PathVariable Long railId)
	   {
	       System.out.println(railId);
		   return new ApiResponse(railService.deleteRailway(railId));
	   }
   @GetMapping
   public ResponseEntity<?> getByCategory(@RequestParam Category  category)
   {
	   return ResponseEntity.status(HttpStatus.OK).body(railService.getByRailCategory(category));
   }
 
   
}

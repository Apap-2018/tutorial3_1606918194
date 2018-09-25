package com.apap.tutorial3.service;

import java.util.List;
import com.apap.tutorial3.model.CarModel;


/**
 * 
 * @author Kenny
 * Car Service
 *
 */

public interface CarService {
	void addCar(CarModel car);
	
	List<CarModel> getCarList();
	
	CarModel getCarDetail(String id);
	
	CarModel updateCarDetail(String id, Integer amount);
	
	CarModel deleteCarDetail(String id);
}
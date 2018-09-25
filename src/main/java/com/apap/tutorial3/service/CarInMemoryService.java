package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;
import com.apap.tutorial3.model.CarModel;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Kenny
 * CarInMemoryService
 * 
 */

@Service
public class CarInMemoryService implements CarService {
	private List<CarModel> archiveCar;
	
	public CarInMemoryService() {
		archiveCar = new ArrayList<>();
	}
	
	@Override
	public void addCar(CarModel car) {
		archiveCar.add(car);
	}
	
	@Override
	public List<CarModel> getCarList() {
		return archiveCar;
	}

	@Override
	public CarModel getCarDetail(String id) {
		CarModel chosenCar = null;
		
		for (int i = 0; i < archiveCar.size(); i++) {
			if (archiveCar.get(i).getId().equalsIgnoreCase(id)) {
				chosenCar = archiveCar.get(i);
				return chosenCar;
			}
		}
		
		return chosenCar;
	}
	
	@Override
	public CarModel updateCarDetail(String id, Integer amount) {
		CarModel chosenCar = null;
		
		for (int i = 0; i < archiveCar.size(); i++) {
			if (archiveCar.get(i).getId().equalsIgnoreCase(id)) {
				archiveCar.get(i).setAmount(amount);;
			}
		}
		
		return chosenCar;
	}
	
	@Override
	public CarModel deleteCarDetail(String id) {
		archiveCar.removeIf(car -> car.getId().equals(id));
		
		return null;
	}
}
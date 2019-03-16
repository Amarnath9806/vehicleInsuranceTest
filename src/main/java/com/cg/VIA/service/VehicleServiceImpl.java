package com.cg.VIA.service;

import com.cg.VIA.dao.VehicleDao;
import com.cg.VIA.dao.VehicleDaoImpl;
import com.cg.VIA.dto.Vehicle;

public  class VehicleServiceImpl implements VehicleService{

	VehicleDao d=new VehicleDaoImpl();

	public Vehicle insuranceValidityCheck(int vechileNo) {
		// TODO Auto-generated method stub
		return d.insuranceValidityCheck(vechileNo);
	}

	public Vehicle vehicleInsuranceRegistration(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return d.vehicleInsuranceRegistration(vehicle);
	}

	
}

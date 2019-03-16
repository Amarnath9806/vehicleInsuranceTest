package com.cg.VIA.dao;

import com.cg.VIA.dto.Vehicle;

public interface VehicleDao {
	Vehicle vehicleInsuranceRegistration(Vehicle vehicle);
Vehicle	insuranceValidityCheck(int vechileNo);
}

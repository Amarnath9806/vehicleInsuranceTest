package com.cg.VIA.service;

import com.cg.VIA.dto.Vehicle;

public interface VehicleService {
	Vehicle vehicleInsuranceRegistration(Vehicle vehicle);
Vehicle	insuranceValidityCheck(int vechileNo);
}

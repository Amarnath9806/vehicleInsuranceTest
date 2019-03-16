package com.cg.VIA.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.cg.VIA.dto.Vehicle;
import com.cg.VIA.utility.ExistException;
import com.cg.VIA.utility.VechileException;

public class VehicleDaoImpl implements VehicleDao{
	static int count=100;
HashMap<Integer, Vehicle> vehicleEntry ;
	public VehicleDaoImpl() {
		
		vehicleEntry =new HashMap<Integer, Vehicle>();
		
	
	}

	public Vehicle insuranceValidityCheck(int vechileNo) {
		// TODO Auto-generated method stub
		Vehicle a=null;
		if(vehicleEntry.containsKey(vechileNo)) {
			a=vehicleEntry.get(vechileNo);
		//	System.out.println(a.getInsurancePeriod());
		}
		else {
			try {
				throw new VechileException();
			} catch (VechileException e) {
				// TODO Auto-generated catch block
			
			}
		}
		
		
		return a;
		
		
	}

	public Vehicle vehicleInsuranceRegistration(Vehicle vehicle) {
		// TODO Auto-generated method stub
		int i=count;
if(vehicleEntry.containsKey(vehicle.getVehicleNo())) {
try {
	throw new ExistException();
} catch (ExistException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
}else {
	
		vehicleEntry.put(vehicle.getVehicleNo(), new Vehicle(vehicle.getVehicleType(),vehicle.getInsurancePeriod(),vehicle.getMobileNo()));
	
		count++;
		
}
		
		
		return vehicle;
	}

}


















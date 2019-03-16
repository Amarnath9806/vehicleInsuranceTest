package com.cg.VIA.UI;

import java.util.Scanner;

import com.cg.VIA.dto.Vehicle;
import com.cg.VIA.service.VehicleService;
import com.cg.VIA.service.VehicleServiceImpl;

public class MainUI {

	public static void main(String[] args) {
		
		VehicleService v= new VehicleServiceImpl();
	Vehicle vehicle=new Vehicle();
	Scanner sc=new Scanner(System.in);
	while(true) {
System.out.println("Menu");
System.out.println("1)Vehicle Insurance Registration");
System.out.println("2)Insurance Validity Check");
System.out.println("3)Exit");
int n =sc.nextInt();

	switch(n) {
	case 1: 
		System.out.println("Enter VehicleNo");
		int vehicleNo=sc.nextInt();
		vehicle.setVehicleNo(vehicleNo);
		System.out.println("Enter vehicle type");
		int vehicleType=sc.nextInt();
		vehicle.setVehicleType(vehicleType);
		System.out.println("Insurance Period");
		int insurancePeriod=sc.nextInt();
		vehicle.setInsurancePeriod(insurancePeriod);
		System.out.println("Enter aadharNo");
		long aadharNo=sc.nextLong();
		
		vehicle.setAadharNo(aadharNo);
		System.out.println("Enter mobile no");
		long mobileNo=sc.nextLong();
		vehicle.setMobileNo(mobileNo);
		vehicle=v.vehicleInsuranceRegistration(vehicle);
	    System.out.println("your vechile is succesfully registred vechile number is" +vehicle.getVehicleNo());
	    

	case 2: 
		System.out.println("Enter vechile no");
		int vehicleNo1=sc.nextInt();
		vehicle =v.insuranceValidityCheck(vehicleNo1);
		System.out.println("Vechile insurance period is "+vehicle.getInsurancePeriod()+ " year");
		break;
	case 3: System.out.println("thank you");
	System.exit(0);
	}
}

	}

}

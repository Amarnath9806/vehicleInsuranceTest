package com.cg.VIA.dto;

public class Vehicle {

	private  int vehicleNo;
	private int vehicleType;
	private int insurancePeriod;
	private long aadharNo;
	private long mobileNo;
	
		public Vehicle() {
			
		}
	
	public Vehicle(int vehicleType2, int insurancePeriod2, long mobileNo2) {
		// TODO Auto-generated constructor stub
		this.vehicleType=vehicleType2;
		this.insurancePeriod=insurancePeriod2;
		this.mobileNo=mobileNo2;
		
	}
	public int getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(int vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	public int getInsurancePeriod() {
		return insurancePeriod;
	}
	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
}

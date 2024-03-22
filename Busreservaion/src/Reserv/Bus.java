package Reserv;

public class Bus {
	private int BusNo;
	private boolean Ac;
	private int Capacity;
	
	Bus(int no,boolean ac,int cap){
		this.BusNo=no;
		this.Ac=ac;
		this.Capacity=cap;	
	}
	public int getBusNo() {
		return BusNo;
	}
	public void setBusNo(int no) {
		BusNo=no;
	}
	public boolean getAc() {
		return Ac;
	}
	public void setIsAc(boolean ac) {
		Ac=ac;
	}
	public int getCapacity() {
		return Capacity;
	}
	public void setCapacity(int cap) {
		Capacity=cap;
	}
	public void displayBusInfo(){
		System.out.println("Bus No:	" + BusNo + "	Ac: " + Ac + "	Total Capacity:" + Capacity);
	}
	
	
	
	
	
}
     
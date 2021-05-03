public class MedicineDetails extends Object {
	
	private String medicineName;
	private double medicinePrice;
	
	//Default constructor
	public MedicineDetails() {
		medicineName = "Not available";
		medicinePrice = 0.0;
	}
	
	//Normal constructor
	public MedicineDetails(String medName, double price) {
		medicineName = medName;
		medicinePrice= price;
	}
	
	//Copy constructor
	public MedicineDetails(MedicineDetails obj) {
		medicineName = obj.medicineName;
		medicinePrice = obj.medicinePrice;
	}

	//Setter
	public void setMedicineDetails(String n, double p) {
		medicineName = n;
		medicinePrice = p;
	}
	
	//Another setter
	public void setMedicineName(String n) {
		medicineName = n;
	}
	
	public void setMedicinePrice(double p) {
		medicinePrice = p;
	}

	//Getter
	public String getMedicineName() {
		return medicineName;
	}
	
	public double getMedicinePrice() {
		return medicinePrice;
	}
	
	//toString
	public String toString() {
		return ("\nMedicine name: " + medicineName + "\nPrice (RM): " + medicinePrice );
	}
 	
}

import javax.swing.JOptionPane;
public class MainApplicationForMedicine {

	public static void main(String[] args) {
		
		MedicineDetails md;
		
		//Asking the number of input from user
		int input;
		String input1 = JOptionPane.showInputDialog(null, "Enter number of input: ");
		input = Integer.parseInt(input1);
		ArrayList medDetails = new ArrayList(input);
		
		String[] medName = new String[input];
		double[] price = new double[input];
		
		for (int i = 0; i < input; i++) {
			
			medName[i] = JOptionPane.showInputDialog(null, "Medicine name: ");
			String medPrice = JOptionPane.showInputDialog(null, "Price (RM): ");
			price[i] = Double.parseDouble(medPrice);
			
			//Inserting the medicine details into the MedicineDetails class
			md = new MedicineDetails(medName[i], price[i]);
			
			//Adding the number of input and medicine details into ArrayList class
			medDetails.add(i, md);
		}

		//Printing all of the inserted medicine details
		JOptionPane.showMessageDialog(null, "Medicine Details: \n" + medDetails.print());
		
		//Removing the item at the index 1
		medDetails.removeAt(1);
		
		//Display the updated medicine details
		JOptionPane.showMessageDialog(null, "Updated Details: \n" + medDetails.print());
		
		//Using bubble sort to sort the medicine name alphabetically
		for (int i = 0; i < input-1; i++) {
			for (int j = 0; j < input-i-1; j++) {
				if (medName[j].compareTo(medName[j+1]) > 0) {
					
					//Swap the medicine name
					String n = medName[j];
					medName[j] = medName[j+1];
					medName[j+1] = n;
					
					//Swap the medicine's price 
					double p = price[j];
					price[j] = price[j+1];
					price[j+1] = p;
				}
			}
		}
		
		System.out.println("Name\t\tPrice(RM)");
		for (int i = 0; i < input; i++) {
			System.out.println(medName[i] + "\t\t" + price[i]);
			
		}

		//Binary search algorithm to search a particular object
		String search = JOptionPane.showInputDialog(null, "Search the medicine name: ");
		int result = binarySearch(medName, search);
			
		if (result == -1)
			JOptionPane.showMessageDialog(null, "Element not present");
		else
			JOptionPane.showMessageDialog(null, "Element found at " + "index " + result);
		
}

	//Binary search for string
	// Returns index of x if it is present in medName[],
    // else return -1
	private static int binarySearch(String[] medName, String mName) {
	
		int l = 0, r = medName.length - 1;
	
		while (l <= r) {
		
			int m = l - (r-1)/2;
		
			int result = mName.compareTo(medName[m]);
		
			//Check if mName is present at mid
			if(result == 0)
				return m;
		
			//If mName greater, ignore left half
			if (result > 0)
				l = m + 1;
		
			//If mName is smaller, ignore right half
			else 
				r = m - 1;
		}
		return -1;
	}
}

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab_2 {

	public static void main(String[] args) {
		// Objects and variables
		Scanner input = new Scanner(System.in);
		int a = 0;
		int inpId = 0;
		//arrays
		int id[] = {1010, 2020, 3030, 4040, 5050, 6060, 7070, 8080, 9090, 1111};
		String name[] = {"Emily", "Mary", "Joe", "Barry", "Alto", "Scott", "Lisa", "Michael", "Sean", "Jeremy"};
		double gpa[] = {4.99, 3.8, 4.0, 3.5, 1.8, 3.7, 3.9, 2.0, .5, 3.99};
		//program
		System.out.println("Jeremy Smith -- Final Project");
		do{
		String IdInput = JOptionPane.showInputDialog("ID? (input 0 to exit)");
		inpId = Integer.parseInt(IdInput);
		String error = String.format("ERROR! ID: %d, not found", inpId);
		//loop
		if(inpId == id[0] || inpId == id[1] || inpId == id[2] || inpId == id[3] || inpId == id[4] || inpId == id[5] || inpId == id[6] || inpId == id[7] || inpId == id[8] || inpId == id[9]){
				for(a = 0; inpId != id[a]; a++);
			JOptionPane.showMessageDialog(null, "Name: "+name[a]);
			JOptionPane.showMessageDialog(null, "GPA: "+gpa[a]);
			}else
			JOptionPane.showMessageDialog(null, error);//error message
		}while(inpId != 0);	//exit condition
	}
}

/**
 * 
 */
package switches;

import javax.swing.JOptionPane;

/**
 * @author CC113884
 *
 */
public class StudentScannerSwitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
int studentNumber;
		String studentString;
		
		studentString = (String)JOptionPane.showInputDialog(null, "Please scan the student ID >>>>>", "Enter user ID #",
	JOptionPane.QUESTION_MESSAGE, null, null,"");
		studentNumber = Integer.parseInt(studentString);
		
		if(studentNumber >= 100000 || studentNumber <= 4000000)
			
			switch (studentNumber)
			{
			case 274896:
				JOptionPane.showMessageDialog(null, "Andrew McKenzie");
				break;
			case 274885:
				JOptionPane.showMessageDialog(null, "Charles Carlstrom");
				break;
			case 316282:
				JOptionPane.showMessageDialog(null, "Ress Alzahrani");
				break;
			case 274884:
				JOptionPane.showMessageDialog(null, "Tatyana Vaughn");
				break;
			case 133778:
				JOptionPane.showMessageDialog(null, "Nick Hasson");
				break;
			case 131457:
				JOptionPane.showMessageDialog(null, "Kassie Remley");
				break;
			case 137412:
				JOptionPane.showMessageDialog(null, "Sebastian Frick");
				break;
			case 131147:
				JOptionPane.showMessageDialog(null, "Zach Dorris");
				break;
			case 274887:
				JOptionPane.showMessageDialog(null, "Chase Kress");
				break;
			case 133225: 
			}
	}

}

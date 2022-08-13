package localdate;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;

public class TimeRespone {
 public static void main(String[] args) {
	 {
		 LocalDateTime time1 , time2;
		 int seconds1, seconds2, difference;
		 time1 = LocalDateTime.now();
		 seconds1 = time1.getSecond();
		 //make a difficult choice
		 JOptionPane.showConfirmDialog(null,"Is stealing ever justify?");
		 time2 = LocalDateTime.now();
		 seconds2 = time2.getSecond();
		 difference = seconds2 - seconds1;
		 JOptionPane.showMessageDialog(null,"End seconds: "+ seconds2 + "\nStart seconds: " + seconds1 + "\nIt took " + difference + " seconds for your answer");
	 }
}
}

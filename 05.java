import java.util.*;

class Students{
	private String name;
	private int exam1;
	private int exam3;
	private int exam2;
	
	boolean validateMarks(int marks) {
		if(marks<=100 && marks>=0){
			return true;
			}
		else{
			return false;
			throw new Exception("Erroer");
		}
	}
	
	Students(String name,int exam1,int exam2,int exam3) throws Exception{
			if(validateMarks(exam1) && validateMarks(exam2) && validateMarks(exam3)){
				this.name = name;
				this.exam1 = exam1;
				this.exam2 = exam2;
				this.exam3 = exam3;
			} else{
				System.out.println("Settings the marks values to 0");
				throw new Exception("Exam scores must be between 0 and 100.");
			}				
	}
	
	public static void setScores(int e1,int e2,int e3){
		
	}
	
	public String getName(){
		return name;
	}
	
	public int getScoreE1(){
		return exam1;
	}
	
	public int getScoreE2(){
		return exam2;
	}
	
	public int getScoreE3(){
		return exam3;
	}
	
	public int getAvarage(){
		int avg = (exam1 + exam2 + exam3)/3;
		return avg;
	}
	
	Students(){
		
	}


}

class LabSheet{
	public static void main(String[] args){
		
		try{
			Students St = new Students("naveen",75,110,-40);
			
			
			System.out.println("Student Name is: " + St.getName());
			System.out.println("Score For Exam 1 is: " + St.getScoreE1());
			System.out.println("Score For Exam 2 is: " + St.getScoreE2());
			System.out.println("Score For Exam 3 is: " + St.getScoreE3());
			System.out.println("Student Average is: " + St.getAvarage());
			
			Students St2 = new Students("jhon",99,88,75);
			
			System.out.println("Student Name is: " + St2.getName());
			System.out.println("Score For Exam 1 is: " + St2.getScoreE1());
			System.out.println("Score For Exam 2 is: " + St2.getScoreE2());
			System.out.println("Score For Exam 3 is: " + St2.getScoreE3());
			System.out.println("Student Average is: " + St2.getAvarage());
		} catch (Exception e){

			System.out.println("Exception is: " + e.getMessage());
		}


	}
}
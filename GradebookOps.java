public class GradebookOps
{
	public static int findStudent(String studentName, String[] allStudentNames, boolean alphabetical)
	{
		for(int i=0;i<allStudentNames.length; i++){
			if (allStudentNames[i].equalsIgnoreCase(studentName))
				return i;
		}
		return -1;
	}

	public static double computeGrade(int studentIndex, int[][] scoreTable, int[] itemPointValues) 
	{
	
	int studentPoints = 0;
		for (int j = 0; j < scoreTable[studentIndex].length; j++) { // to sum student's earned points
			studentPoints += scoreTable[studentIndex][j]; }
	
	int possiblePoints = 0;
		for (int i = 0; i < itemPointValues.length; i++) { // to sum the itemPointValues array, possible points
			possiblePoints += itemPointValues[i]; }
	
	double grade = (double)studentPoints/possiblePoints; 
	return grade;
	}

	public static double[] computeAllGrades(int[][] scoreTable, int[] itemPointValues) {
		
		double[] grades = new double[scoreTable.length];
		int sumStudentPoints = 0;
		int sumTotalPoints = 0;
		
		for (int i = 0; i < scoreTable.length; i++) {
			for (int j = 0; j < scoreTable[i].length; j++) {
				if (scoreTable[i][j] >= 0) {
				sumStudentPoints += scoreTable[i][j];
				sumTotalPoints +=  itemPointValues[j]; 
				}
			}
			grades[i] = (double)sumStudentPoints/sumTotalPoints*100;
			sumStudentPoints = 0;
			sumTotalPoints = 0;
		}	
	return grades;
	}

	public static double computeClassAverage(int item, int[][] scoreTable) { 
		
		double average;
		int sumStudentPoints = 0;
		int studentCount = 0;
		
		for (int i = 0; i < scoreTable.length ; i++) {
			if (scoreTable[i][item] >= 0) {
			sumStudentPoints += scoreTable[i][item]; 
			studentCount++; }
		}
		
		average = (double)sumStudentPoints/studentCount; 
		return average;
		}	
}
	

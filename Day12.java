class Student extends Person{
	private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
        this.testScores = testScores;
    }



    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate() {
        int totalOfGrades = 0;
        int average = 0;
        String grade = "";

        for(int i = 0; i < testScores.length; i++) {
            totalOfGrades += testScores[i];
        }

        average = totalOfGrades / testScores.length;

        if (average >= 90 && average <= 100)
            grade = "O";
        else if (average >= 80 && average < 90)
            grade = "E";
        else if (average >=70 && average < 80)
            grade = "A";
        else if (average >= 55 && average < 70)
            grade = "P";
        else if (average >= 40 && average < 55)
            grade = "D";
        else
            grade = "T";

        return(grade);
    }

}

class Lesson2 {
    public static void main(String[] args) {
        int numberOfStudents = 6;
        numberOfStudents = registerStudent(numberOfStudents);
        System.out.println(numberOfStudents);
        /*
        * Define a new variable to track the number of code bugs. Start it at 100.
        * Define a new method called "debug". Debug should take in the current number of bugs.
        * Debug should reduce that number by 1 and return the new number of bugs.
        * Execute debug once, giving the number of code bugs as the input. 
        * Print the output.
        */

        int numberOfCodeBugs = 100;
        numberOfCodeBugs = debug(numberOfCodeBugs);
        System.out.println(numberOfCodeBugs);
    }

    static int registerStudent(int currentNumberOfStudents) {
        return currentNumberOfStudents + 1;
    }

    static int debug(int currentNumberOfBugs) {
        return currentNumberOfBugs - 1;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Student {
    public String name;
    public int id;
    public ArrayList grades;

    public Student(String name, int id, ArrayList grades) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList(grades);
    }

    // returns the student's id
    public long getId(){


    }

    // returns the student's name
    public String getName(){


    }

    // adds the given grade to the grades list
    public void addGrade(int grade){


    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){


    }

    // returns the average of the students grades
    public double getGradeAverage(){


    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Student {

    int mathsMarks;
    int scienceMarks;
    int hindiMarks;

    public Student(int mathsMarks, int scienceMarks, int hindiMarks) {
        this.mathsMarks = mathsMarks;
        this.scienceMarks = scienceMarks;
        this.hindiMarks = hindiMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public String toString() {
        return "Maths: " + mathsMarks + ", Science: " + scienceMarks + ", Hindi: " + hindiMarks;
    }
}


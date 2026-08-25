package use_case.EnrollStudent;

public class EnrollStudentOutputData {
    private final String studentName;
    private final boolean useCaseFailed;

    public EnrollStudentOutputData(String studentName, boolean useCaseFailed) {
        this.studentName = studentName;
        this.useCaseFailed = useCaseFailed;
    }

    public String getStudentName() {
        return studentName;
    }

    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }
}

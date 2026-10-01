package entity;

// The static import makes this entity depend on an outer-layer Presenter.
import static interface_adapter.EnrollStudent.EnrollStudentPresenter.formatStudentName;

public class Student {
    private final String studentId;
    private final String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        // The unqualified call still depends on the Presenter that owns the method.
        this.name = formatStudentName(name);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }
}

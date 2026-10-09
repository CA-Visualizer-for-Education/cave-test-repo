package use_case.EnrollStudent;

import entity.Student;

public class EnrollStudentInteractor implements EnrollStudentInputBoundary {
    private final EnrollStudentDataAccessInterface studentDataAccessObject;
    private final EnrollStudentOutputBoundary studentPresenter;

    public EnrollStudentInteractor(EnrollStudentDataAccessInterface studentDataAccessObject,
                                   EnrollStudentOutputBoundary studentPresenter) {
        this.studentDataAccessObject = studentDataAccessObject;
        this.studentPresenter = studentPresenter;
    }

    @Override
    public void execute(EnrollStudentInputData inputData) {
        if (!studentDataAccessObject.existsByStudentId(inputData.getStudentId())) {
            studentPresenter.prepareFailView("No student with that id exists.");
            return;
        }

        Student student = new Student(inputData.getStudentId(),
                studentDataAccessObject.getStudentName(inputData.getStudentId()));
        studentDataAccessObject.saveEnrolment(student.getStudentId(), inputData.getCourseCode());

        EnrollStudentOutputData outputData = new EnrollStudentOutputData(student.getName(), false);
        studentPresenter.prepareSuccessView(outputData);
    }
}

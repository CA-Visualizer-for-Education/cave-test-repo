package interface_adapter.EnrollStudent;

/*(IBI) Given that we are not allowed interfaces, we must import the interactors as opposed to the interface.
This is not a big deal for a single interactor as is the case in this project, but consider the following:
if you had written 100 enroll student interactors how many lines would you need to import all of them?

Without using interfaces, the answer to that question would be 100, an import per interactor. Unless you are a glutton for
punishment or love writting import statements, I don't think I need to convinve you that importing the interface super class 
of all interactors once is a far better way of doing things.*/
import use_case.EnrollStudent.EnrollStudentInteractor;

import use_case.EnrollStudent.EnrollStudentInputData;

public class EnrollStudentController {
    /*(IBI) Attribute should be of type EnrollStudentInputBoundary under clean architecture. Without interfaces,
    we would either have to write a matching controller for every single interactor (imagine typing out 100
    classes that look relatively the same) or loosen up our type checking standards. Both of these offer less
    optimal outcomes than simply following clean architecture and leveraging interfaces!*/
    private final EnrollStudentInteractor enrollStudentInteractor;

    public EnrollStudentController(EnrollStudentInteractor enrollStudentInteractor) {
        this.enrollStudentInteractor = enrollStudentInteractor;
    }

    public void enroll(String studentId, String courseCode) {
        EnrollStudentInputData inputData = new EnrollStudentInputData(studentId, courseCode);
        enrollStudentInteractor.execute(inputData);
    }
}

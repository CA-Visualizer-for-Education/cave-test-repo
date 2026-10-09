package use_case.EnrollStudent;

import entity.Student;

/*(DAI) We need to instantiate a data access object  to get the information we
need from student entities. Normally, we would have a data access interface in
this very package; however, interfaces are not allowed here! 

Thus, we are forced to import a specific data access object from the data access 
package. In doing so we have created a solid thread between the two classes. Are
we still able to fluidly switch between different data access objects?*/
import data_access.InMemoryStudentDataAccessObject;

/*(OBI) The same issue as above occure when we are forced to add this input without
an output boundary interface in this package.*/
import interface_adapter.EnrollStudentPresenter;


/*(IBI) This class should implement EnrollStudentInputBoundary, but alas interfaces no longer exist.
While this change does not have any immediate consequences within this file, pay attention to how the rest
of the system suffers for it*/
public class EnrollStudentInteractor {
    /*(DAI) The answer to the question above is no. Per the typing of the variable
    below, we have pidgeonholed ourselves into using a singular class for data acess.
     */
    private final InMemoryStudentDataAccessObject studentDataAccessObject;
    private final EnrollStudentPresenter studentPresenter;

    public EnrollStudentInteractor(InMemoryStudentDataAccessObject studentDataAccessObject,
                                   EnrollStudentPresenter studentPresenter) {
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

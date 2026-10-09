package app;

import data_access.InMemoryStudentDataAccessObject;
import interface_adapter.EnrollStudent.EnrollStudentController;
import interface_adapter.EnrollStudent.EnrollStudentPresenter;
import interface_adapter.EnrollStudent.EnrollStudentViewModel;
import use_case.EnrollStudent.EnrollStudentInputBoundary;
import use_case.EnrollStudent.EnrollStudentInteractor;
import view.EnrollStudentView;

public class Main {
    public static void main(String[] args) {
        InMemoryStudentDataAccessObject studentDataAccessObject = new InMemoryStudentDataAccessObject();
        EnrollStudentViewModel viewModel = new EnrollStudentViewModel();
        EnrollStudentPresenter presenter = new EnrollStudentPresenter(viewModel);
        EnrollStudentInputBoundary interactor =
                new EnrollStudentInteractor(studentDataAccessObject, presenter);
        EnrollStudentController controller = new EnrollStudentController(interactor);

        EnrollStudentView view = new EnrollStudentView(controller, viewModel);
        view.onEnrolButtonClicked("1000123456", "CSC207");
    }
}

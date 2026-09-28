package app;

/*(IBI) Where we create a new coupling between packages above, if we remove interfaces we actually use one 
less import. Furthermore, we will always need to import every single interactor regardless of if we do 
or do not have an interface, as we do below with the EnrollStudentInteractor. To conclude, removing interfaces
here can only be a good thing and there is no way things could possibly go wrong. Right?

Wrong. Without access to the a common interface, we lose a very powerful ability as seen below.
*/
//import use_case.EnrollStudent.EnrollStudentInputBoundary;
import use_case.EnrollStudent.EnrollStudentInteractor;

/*(DAI) The issue that arises from removing the import below is analagous to the one above.*/
//import use_case.EnrollStudent.EnrollStudentDataAccessInterface;
import data_access.InMemoryStudentDataAccessObject;


import interface_adapter.EnrollStudent.EnrollStudentController;
import interface_adapter.EnrollStudent.EnrollStudentPresenter;
import interface_adapter.EnrollStudent.EnrollStudentViewModel;
import view.EnrollStudentView;

public class Main {
    public static void main(String[] args) {
        /*(DAI) See below for why this change is harful.*/
        //EnrollStudentDataAccessInterface studentDataAccessObject = new InMemoryStudentDataAccessObject();
        InMemoryStudentDataAccessObject studentDataAccessObject = new InMemoryStudentDataAccessObject();
        EnrollStudentViewModel viewModel = new EnrollStudentViewModel();
        EnrollStudentPresenter presenter = new EnrollStudentPresenter(viewModel);
        
        /*(IBI) Because we do not have access to the interface, we cannot set the type of the variable below to that of the interface. 
        This then presents a significant issue when it come to how modular our code is. We must either lock the interactor to a single
        implementaion of the EnrollStudentInputBoundary interface and in doing so compromise the architecture or set the variable to 
        something like type Object and comprimise the type checking. Both solutions lead to worse outcomes than if we had simply
        followed Clean Architecture*/
        //EnrollStudentInputBoundary interactor =  (Old line for reference)
        EnrollStudentInteractor interactor= 
                new EnrollStudentInteractor(studentDataAccessObject, presenter);
        EnrollStudentController controller = new EnrollStudentController(interactor);

        EnrollStudentView view = new EnrollStudentView(controller, viewModel);
        view.onEnrolButtonClicked("1000123456", "CSC207");
    }
}

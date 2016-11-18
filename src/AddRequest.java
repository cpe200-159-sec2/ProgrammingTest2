public class AddRequest extends Request {
    private AddRequest() {
        IRequest request = createRequest(REQUEST_ADD,getStudentID(),getCourseID());
        new Registration().add(request);
    }
}


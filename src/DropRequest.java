public class DropRequest extends Request {
    private DropRequest() {
        IRequest request = createRequest(REQUEST_DROP,getStudentID(),getCourseID());
        new Registration().drop(request);
    }
}

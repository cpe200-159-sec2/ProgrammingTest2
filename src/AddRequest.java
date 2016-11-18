public class AddRequest extends Request {
    private AddRequest(String studentID, String courseID) {
        IRequest request = createRequest(REQUEST_ADD,studentID,courseID);
        new Registration().add(request);
    }
}


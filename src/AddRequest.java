public class AddRequest extends Request {
    private AddRequest(String courseID, String studentID) {
        createRequest(REQUEST_ADD, studentID, courseID);
    }
}


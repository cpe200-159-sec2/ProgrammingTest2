public class DropRequest extends Request {
    private DropRequest(String courseID, String studentID) {
        createRequest(REQUEST_DROP, studentID, courseID);
    }
}

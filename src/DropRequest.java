public class DropRequest extends Request {
    private DropRequest(String studentID, String courseID) {
        IRequest request = createRequest(REQUEST_DROP,studentID,courseID);
        new Registration().drop(request);
    }
}

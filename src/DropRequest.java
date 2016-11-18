public class DropRequest extends Request {
    public DropRequest(String studentID,String courseID) {
        createRequest(REQUEST_DROP,studentID,courseID);
    }
}

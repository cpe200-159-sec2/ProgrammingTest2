public class AddRequest extends Request {
    public  AddRequest(String studentID,String courseID) {
        createRequest(REQUEST_ADD,studentID,courseID);
    }
}


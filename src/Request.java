/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {
    private static int type;           // 1 is Add , 2 is Drop
    private static String studentID;
    private static String courseID;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        //Fill information
        Request request = new Request();
            request.type = type;
            request.setStudentID(studentID);
            request.setCourseID(courseID);
        //Check if there's nothing is empty then send information else return nothing
        if(request.studentID != null && request.getCourseID() != null){
            return request;
        }
        return null;
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return this.studentID;
    }

    @Override
    public String setStudentID(String studentID) {
        //Check if it's empty
        if(studentID == null){
            System.out.println("Empty studentID");
            return null;
        }else{
            String oldID = this.studentID;
            this.studentID = studentID;
            return oldID;
        }
    }

    @Override
    public String getCourseID() {
        return this.courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        //Check if it's empty
        if(courseID == null){
            throw new RuntimeException("Empty courseID.");
        }else{
            this.courseID = courseID;
        }
    }

    @Override
    public int getRequestType() {
        return this.type;
    }
}

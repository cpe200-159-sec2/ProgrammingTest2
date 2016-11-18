/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private static String studentID;
    private static String courseID;
    private static int type;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        Request.studentID = studentID;
        Request.courseID = courseID;
        Request.type = type;
        throw new RuntimeException("XXX");
    }

    protected Request()
    {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return studentID;
    }

    @Override
    public String setStudentID(String studentID) {
        if (null != studentID){
            this.studentID = studentID;
            return studentID;
        }
       throw new RuntimeException("XXX");
    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        if (null != courseID){
            this.courseID = courseID;
        }
    }

    @Override
    public int getRequestType() {
        return type;
    }
}

/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private static String SID = "";
    private static String CID = "";
    protected static int TYPE;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        if (type == REQUEST_ADD || type == REQUEST_DROP){
            Request.TYPE = type;
            Request.SID = studentID;
            Request.CID = courseID;
        }else{
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    protected Request() {
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return this.SID;
    }

    @Override
    public String setStudentID(String studentID) {
        String oldID;
        if (studentID == null) {
            return null;
        } else {
            oldID = this.SID;
            this.SID = studentID;
        }
        return oldID;
    }

    @Override
    public String getCourseID() {
        return this.CID;
    }

    @Override
    public void setCourseID(String courseID) {
        if (courseID == null){
            throw new RuntimeException();
        } else {
            this.CID = courseID;
        }
    }

    @Override
    public int getRequestType() {
        return TYPE;
    }
}

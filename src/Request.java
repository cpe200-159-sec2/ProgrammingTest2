/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {
    private  int type;
    private  String studentID,courseID;


    public static IRequest createRequest(int type, String studentID, String courseID) {
        IRequest x = new Request();
        x.setStudentID(studentID);
        x.setCourseID(courseID);
        x.setType(type);
       return x;

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
        if(studentID !=null) {
            this.studentID =studentID;
            return studentID;
        }
       throw new RuntimeException("studentID = null");

    }

    @Override
    public String getCourseID() {
        return courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        if(courseID != null){
            this.courseID = courseID;

            
        }
       else throw new RuntimeException("CourseID =  null");
    }

    @Override
    public int getRequestType() {
        return type;
    }

    @Override
    public int setType(int type) {
        if(type ==1 || type ==2)
            return type;
        else   throw new RuntimeException("Error type");
    }

}

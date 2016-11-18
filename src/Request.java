/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {

    private int type;           // 1 is Add , 2 is Drop
    private String studentID;
    private String courseID;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        IRequest request;
        if(type == REQUEST_ADD){

        }else if(type == REQUEST_DROP){

        }
        return null;
    }

    protected Request()
    {
        //protect to not create new request without static IRequest
        //if request is add -> shouldn't create drop.
        //if request is drop -> shouldn't create add.
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
            this.studentID = studentID;
            return studentID;
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

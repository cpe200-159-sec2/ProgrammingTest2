/**
 * Created by pruet on 18/11/2559.
 */
public class Request implements IRequest {
    private int type;           // 1 is Add , 2 is Drop
    private String studentID;
    private String courseID;

    public static IRequest createRequest(int type, String studentID, String courseID) {
        if(type == REQUEST_ADD){

        }else if(type == REQUEST_DROP){

        }
        return null;
    }

    protected Request()
    {
        //protect to not create new request without static IRequest
        throw new UnsupportedOperationException("Please override this method");
    }

    @Override
    public String getStudentID() {
        return this.studentID;
    }

    @Override
    public String setStudentID(String studentID) {
        String regex = "5+[0-9][0-9]{0,9}"; //ex 580610615
        if(studentID == null){
            return null;
        }else{
            if(studentID.matches(regex)){
                throw new RuntimeException("Please enter corrected studentID.");
            }else{
                this.studentID = studentID;
                return studentID;
            }
        }
    }

    @Override
    public String getCourseID() {
        return this.courseID;
    }

    @Override
    public void setCourseID(String courseID) {
        String regex = "[0-9]{3,6}";    //ex: 001201
        if(courseID == null){
            throw new RuntimeException("Empty courseID.");
        }else{
            if(courseID.matches(regex)){
                throw new RuntimeException("Please enter corrected courseID.");
            }else{
                this.courseID = courseID;
            }
        }
    }

    @Override
    public int getRequestType() {
        return this.type;
    }
}

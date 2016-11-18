import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList;

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        if(request.getRequestType()==IRequest.REQUEST_ADD){
            if(exists(request)==false){
                requestList.add(request);
            }else{
                throw new RuntimeException("SAME");
            }
        }else{
            throw new RuntimeException("Enter new type");
        }

    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if(request.getRequestType()==IRequest.REQUEST_DROP){
            if(exists(request)==true){
                requestList.remove(request);
            }else{
                throw new RuntimeException("Don't have this request");
            }

        }else{
            throw new RuntimeException("Enter new type");
        }

    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {

        return requestList.contains(request);
    }

    // Count all requests
    public int count() {
        return requestList.size();
    }

    // Count requests by request type
    public int countByType(int type) {
        int c=0;

        for(int i=0;i<requestList.size();i++){
            if(requestList.get(i).getRequestType()==type){
                c=c+1;
            }
        }

        return c;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        int c=0;
        for(int i=0;i<requestList.size();i++){
            if(requestList.get(i).getCourseID().equals(courseID)){
                c=c+1;
            }
        }
        return c;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        int c=0;
        for(int i=0;i<requestList.size();i++){
            if(requestList.get(i).getStudentID().equals(studentID)){
                c=c+1;
            }
        }
        return c;
    }
}

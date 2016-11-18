import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList = new ArrayList<>();

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        requestList.add(request);
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if(!exists(request))throw new RuntimeException("Invalid request");
        requestList.remove(request);
    }

    // Check whether the request is in repository.
    public boolean exists(IRequest request) {
        if(requestList.contains(request)) return true;
        else return false;
    }

    // Count all requests
    public int count() {
        return requestList.size();
    }

    // Count requests by request type
    public int countByType(int type) {
        int count  = 0;
        for(IRequest x: requestList){
            if(x.getRequestType() == type){
                count++;
            }
        }return  count;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        int count  = 0;
        for(IRequest x: requestList){
            if(x.getCourseID().equals(courseID)){
                count++;
            }
        }return  count;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        int count  = 0;
        for(IRequest x: requestList){
            if(x.getStudentID().equals(studentID)){
                count++;
            }
        }return  count;
    }
}

import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList;
    private static int counter;

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        if(exists(request)) {
            throw new RuntimeException("Request Existed!!");
        } else {
            requestList.add(request);
        }
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if(exists(request)){
            requestList.remove(request);
        } else {
            throw new RuntimeException("This Course Doesn't Existed!!");
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
        counter = 0;
        for(IRequest temp : requestList){
            if(temp.getRequestType() == type){
                counter++;
            }
        }
        return counter;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        counter = 0;
        for(IRequest temp : requestList){
            if(temp.getCourseID().equals(courseID)){
                counter++;
            }
        }
        return counter;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        counter = 0;
        for(IRequest temp : requestList){
            if(temp.getStudentID().equals(studentID)){
                counter++;
            }
        }
        return counter;
    }
}

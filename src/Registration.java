import java.util.ArrayList;

public class Registration {
    // Request repository
    private ArrayList<IRequest> requestList = new ArrayList<>();

    // Add new course, only request with non-exists studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void add(IRequest request) {
        if (!exists(request))
            //AddRequest

            requestList.add(request);
        throw new RuntimeException();
    }

    // Drop existing course, only request with existing studentID/courseID
    // is a valid request. Invalid request will cause an exception
    public void drop(IRequest request) {
        if (exists(request)){
            //DropRequest

            requestList.remove(request);
        } else throw new RuntimeException("Not found");
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
        int count = 0;
        for (IRequest i : requestList)
            if (i.getRequestType() == type) count++;

        return count;
    }

    // Count request by course ID
    public int countByCourseID(String courseID) {
        int count = 0;
        for (IRequest i : requestList)
            if (i.getCourseID().equals(courseID)) count++;

        return count;
    }

    // Count request by student ID
    public int countByStudentID(String studentID) {
        int count = 0;
        for (IRequest i : requestList)
            if (i.getStudentID().equals(studentID)) count++;

        return count;
    }
}

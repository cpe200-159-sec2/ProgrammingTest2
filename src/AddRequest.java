public class AddRequest extends Request {

    private AddRequest(String SID,String CID) {
        createRequest(REQUEST_ADD,SID,CID);
    }
}


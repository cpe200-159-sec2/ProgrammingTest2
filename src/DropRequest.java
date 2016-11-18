public class DropRequest extends Request {
    private DropRequest(String SID,String CID) {
        createRequest(REQUEST_DROP,SID,CID);
    }
}

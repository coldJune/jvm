package jit.tieredcom;

public class WriterService {
    public void service(){
        DBWriter dbWriter = new DBWriter();
        dbWriter.write();
    }
}

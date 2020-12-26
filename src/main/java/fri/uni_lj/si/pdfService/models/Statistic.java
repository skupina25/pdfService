package fri.uni_lj.si.pdfService.models;


import java.sql.Timestamp;

public class Statistic {

    private Long id;

    private Long userId;

    private Long numOfCompleted;

    private Long numOfInProgress;

    private Long numOfToDo;

    private Timestamp timestampCreated;


    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getNumOfCompleted() {
        return numOfCompleted;
    }

    public void setNumOfCompleted(Long numOfCompleted) {
        this.numOfCompleted = numOfCompleted;
    }

    public Long getNumOfInProgress() {
        return numOfInProgress;
    }

    public void setNumOfInProgress(Long numOfInProgress) {
        this.numOfInProgress = numOfInProgress;
    }

    public Long getNumOfToDo() {
        return numOfToDo;
    }

    public void setNumOfToDo(Long numOfToDo) {
        this.numOfToDo = numOfToDo;
    }

    public Timestamp getTimestampCreated() {
        return timestampCreated;
    }

    public void setTimestampCreated(Timestamp timestampCreated) {
        this.timestampCreated = timestampCreated;
    }
}
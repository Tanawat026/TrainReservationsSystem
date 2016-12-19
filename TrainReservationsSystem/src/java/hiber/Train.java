package hiber;
// Generated Dec 19, 2016 11:21:01 AM by Hibernate Tools 4.3.1



/**
 * Train generated by hbm2java
 */
public class Train  implements java.io.Serializable {


     private int trainTravelId;
     private Integer trainId;
     private String trainname;
     private String fromLocation;
     private String toLocation;
     private String departureTime;
     private String arrivalTime;
     private String duration;
     private Integer totalSeat;

    public Train() {
    }

	
    public Train(int trainTravelId) {
        this.trainTravelId = trainTravelId;
    }
    public Train(int trainTravelId, Integer trainId, String trainname, String fromLocation, String toLocation, String departureTime, String arrivalTime, String duration, Integer totalSeat) {
       this.trainTravelId = trainTravelId;
       this.trainId = trainId;
       this.trainname = trainname;
       this.fromLocation = fromLocation;
       this.toLocation = toLocation;
       this.departureTime = departureTime;
       this.arrivalTime = arrivalTime;
       this.duration = duration;
       this.totalSeat = totalSeat;
    }
   
    public int getTrainTravelId() {
        return this.trainTravelId;
    }
    
    public void setTrainTravelId(int trainTravelId) {
        this.trainTravelId = trainTravelId;
    }
    public Integer getTrainId() {
        return this.trainId;
    }
    
    public void setTrainId(Integer trainId) {
        this.trainId = trainId;
    }
    public String getTrainname() {
        return this.trainname;
    }
    
    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }
    public String getFromLocation() {
        return this.fromLocation;
    }
    
    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }
    public String getToLocation() {
        return this.toLocation;
    }
    
    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }
    public String getDepartureTime() {
        return this.departureTime;
    }
    
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
    public String getArrivalTime() {
        return this.arrivalTime;
    }
    
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public String getDuration() {
        return this.duration;
    }
    
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public Integer getTotalSeat() {
        return this.totalSeat;
    }
    
    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }




}



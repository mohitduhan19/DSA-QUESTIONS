public class UndergroundSystem {
  
  Map<Integer, CheckIn> custIdCheckIn = new HashMap();

  Map<String, Map<String, double[]>> stationCheckedOut = new HashMap();

  public UndergroundSystem() {
  }

  public void checkIn(int id, String stationName, int t) {
    custIdCheckIn.put(id, new CheckIn(stationName, t));
  }

  public void checkOut(int id, String stationName, int t) {
    CheckIn checkin = custIdCheckIn.remove(id);

    Map<String, double[]> toMap;
    if (!stationCheckedOut.containsKey(checkin.from)) {
      toMap = new HashMap();
      stationCheckedOut.put(checkin.from, toMap);
    } else
      toMap = stationCheckedOut.get(checkin.from);

    double[] nums;
    if (!toMap.containsKey(stationName)) {
      nums = new double[] { 0.0, 0.0};
      toMap.put(stationName,  nums);
    } else {
      nums = toMap.get(stationName);
    }

    nums[1] += t - checkin.time;
    nums[0] += 1.0;
  }

  public double getAverageTime(String startStation, String endStation) {
    Map<String, double[]> toMap = stationCheckedOut.get(startStation);
    double[] pair = toMap.get(endStation);
    return (double)pair[1]/pair[0];
  }
}

class CheckIn {
  String from;
  int time;

  CheckIn(String from, int time) {
    this.from = from;
    this.time = time;
  }
}


/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
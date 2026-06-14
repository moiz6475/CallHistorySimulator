public class call {

    private String name;
    private String number;
    private String callType;

    public call(String name, String number, String callType) {
        this.name = name;
        this.number = number;
        this.callType = callType;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getCallType() {
        return callType;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                " | Number: " + number +
                " | Type: " + callType;
    }
}
package JavaRecordExample;

public record Person(String name, int age) {

    public String greet(){
        return "Hey! "+name+" How are you ?";
    }
}

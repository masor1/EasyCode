package javap;

public class Test {
    public static void main(String[] args) {
        Repository repository = new Repository() {
            @Override
            public ResultJava getData() {
                return new ResultJava.Error("sck");
            }
        };

        ResultJava res = repository.getData();
        if (res instanceof ResultJava.Success) {
            System.out.println(((ResultJava.Success) res).getData());
        } else if (res instanceof ResultJava.Error){
            throw new IllegalArgumentException(((ResultJava.Error) res).getMessage());
        }
    }
}

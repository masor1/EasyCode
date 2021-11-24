package javap;

abstract public class ResultJava {

    public static class Success extends ResultJava {
        private final int data;
        public Success(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    public static class Error extends ResultJava {
        private final String message;
        public Error(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }
}

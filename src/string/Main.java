//package string;
//
//public class Main {
//    public static void main(String[] args) {
//        User[] users = {
//                new User("Igor", 19),
//                new User("Alexey", 23),
//                new User("Misha", 18),
//                new User("Dima", 25),
//        };
//
//        String json = " users =[ ";
//        StringBuilder stringBuilder = new StringBuilder(json);
//
//        for (User client : users) {
//            stringBuilder.append("{");
//            stringBuilder.append(client.getName());
//            stringBuilder.append(", ");
//            stringBuilder.append(client.getAge());
//            stringBuilder.append("}");
//        }
//        stringBuilder.append(" ]");
//        json = stringBuilder.toString();
//        System.out.println(json);
//    }
//}

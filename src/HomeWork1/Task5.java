package HomeWork1;

public class Task5 {

    public static class NamesIf implements ICommunicationPrinter {

        @Override
        public String welcom(String name) {
            if("Вася".equals(name)) {
                return "Привет!\nЯ тебя так долго ждал";
            } else {
                if("Анастасия".equals(name)) {
                    return "Я тебя так долго ждал";
                } else {
                    return "Добрый день, а вы кто?";
                }
            }
        }
    }

    public static class NamesIfElse implements ICommunicationPrinter{
        @Override
        public String welcom(String name) {
            if("Вася".equals(name)) {
                return "Привет!\nЯ тебя так долго ждал";
            } else if ("Анастасия".equals(name)) {
                return "Я тебя так долго ждал";
            } else {
                return "Добрый день, а вы кто?";
            }
        }
    }

    public static class NamesSwitch implements ICommunicationPrinter{
        @Override
        public String welcom(String name) {
            switch(name) {
                case "Вася":
                    return "Привет!\nЯ тебя так долго ждал";
                case "Анастасия":
                    return"Я тебя так долго ждал";
                default:
                    return"Добрый день, а вы кто?";
            }
        }
    }
}

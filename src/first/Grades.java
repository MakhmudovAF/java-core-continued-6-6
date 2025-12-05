package first;

public class Grades {

    private String capitalize(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }

    private String gradeToString(String grade) {
        switch (grade) {
            case "5": {
                return "Безупречно";
            }
            case "4": {
                return "Потрясающе";
            }
            case "3": {
                return "Восхитительно";
            }
            case "2": {
                return "Прекрасно";
            }
            default:
                return "Очаровательно";
        }
    }

    // grades - строка вида "имя,фамилия,предмет,оценка;имя,фамилия,предмет,оценка;"
    public void gradeBeautifier(String grades) {
        // реализуйте метод здесь
        String[] records = grades.split(";");
        for (String record : records) {
            String[] parts = record.split(",");
            StringBuilder sb = new StringBuilder();
            sb.append(capitalize(parts[0]))
                    .append(" ")
                    .append(capitalize(parts[1]))
                    .append(" ")
                    .append(parts[2].toLowerCase())
                    .append(" — ")
                    .append(gradeToString(parts[3]));

            System.out.println(sb.toString());
        }
    }
}
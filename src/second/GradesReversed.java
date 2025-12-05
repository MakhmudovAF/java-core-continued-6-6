package second;

public class GradesReversed {
    private String gradeStringToInt(String grade) {
        switch (grade) {
            case "Безупречно": {
                return "5";
            }
            case "Потрясающе": {
                return "4";
            }
            case "Восхитительно": {
                return "3";
            }
            case "Прекрасно": {
                return "2";
            }
            default:
                return "1";
        }
    }

    public String serializeGrades(String[] grades) {
        String[] records = new String[grades.length];
        for (int i = 0; i < grades.length; i++) {
            String[] parts = grades[i].split(" ");
            records[i] = String.join(",", parts[0].toLowerCase(), parts[1].toLowerCase(), parts[2], gradeStringToInt(parts[4]));
        }
        String result = String.join(";", records);
        return result;
    }

}
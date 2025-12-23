package C06EtcClass;

public class C02EnumMain {
    public static void main(String[] args) {
        // class grade 일반 문자열로 설계했을 경우 => data 종류에 대한 통제 불가능
//        Student s1 = new Student("hong1", "");
//        Student s2 = new Student("hong2", "");
//        Student s3 = new Student("hong3", "");
        // static final 변수로 설계 했을 경우
//        Student s1 = new Student("hong1", ClassGrade.c1);
//        Student s2 = new Student("hong2", ClassGrade.c2);
//        Student s3 = new Student("hong3", "3학년");
        // class grade Enum class로 설계했을 경우
        Student s1 = new Student("hong1", ClassGrade.FIRST_GRADE);
        Student s2 = new Student("hong2", ClassGrade.SECOND_GRADE);
        Student s3 = new Student("hong3", ClassGrade.THIRD_GRADE);
//        error
//        Student s3 = new Student("hong3", "THIRD_GRADE");

        System.out.println(s1);

    }
}

class Student{
    private String name;

    // enum class 를 썼으므로 더이상 String이 아니다
    private ClassGrade classGrade; // 학년 FIRST_GRADE, SECOND_GRADE, THIRD_GRADE

    public Student(String name, ClassGrade classGrade) {
        this.name = name;
        this.classGrade = classGrade;
    }

//    public Student(String name, String classGrade) {
//        this.name = name;
//        this.classGrade = classGrade;
//    }

    @Override
    public String toString() {
        return "name: " + name + ", class: " + classGrade.toString();
    }
}

//class ClassGrade {
//    static final String c1 = "FIRST_GRADE";
//    static final String c2 = "SECOND_GRADE";
//    static final String c3 = "THIRD_GRADE";
//}

enum ClassGrade {
    // enum class는 data의 종류를 하나의 enum 명 아래 묶는 것
    // static final 변수처럼 사용함
    FIRST_GRADE,
    SECOND_GRADE,
    THIRD_GRADE
}

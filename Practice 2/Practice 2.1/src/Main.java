public class Main {
    public static void main(String[] args){
        final Student firstStudent = new Student.StudentBuilder()
                .name("Ann")
                .surname("Petrova")
                .course(2)
                .group(457167)
                .specialty("math")
                .build();

        final Student secondStudent = new Student.StudentBuilder()
                .name("Bob")
                .surname("Jones")
                .course(3)
                .group(457156)
                .specialty("biology")
                .build();
    }
}

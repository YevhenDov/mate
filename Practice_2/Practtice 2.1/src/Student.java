public class Student {
    private final String name;
    private final String surname;
    private final int course;
    private final int group;
    private final String specialty;

    Student(final StudentBuilder studentBuilder){
        this.name = studentBuilder.getName();
        this.surname = studentBuilder.getSurname();
        this.course = studentBuilder.getCourse();
        this.group = studentBuilder.getGroup();
        this.specialty = studentBuilder.getSpecialty();
    }

    static class StudentBuilder{
        private String name;
        private String surname;
        private int course;
        private int group;
        private String specialty;

        public StudentBuilder name(final String name){
            this.name = name;
            return this;
        }

        public StudentBuilder surname(final String surname){
            this.surname = surname;
            return this;
        }

        public StudentBuilder course(final int course){
            this.course = course;
            return this;
        }

        public StudentBuilder group(final int group){
            this.group = group;
            return this;
        }

        public StudentBuilder specialty(final String specialty){
            this.specialty = specialty;
            return this;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public int getCourse() {
            return course;
        }

        public int getGroup() {
            return group;
        }

        public String getSpecialty() {
            return specialty;
        }

        public Student build(){
            return new Student(this);
        }
    }
}

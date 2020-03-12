public class Runner {

    public static void main(String[] args) {
        School Berkeley = new School ("Berkeley High");

        Section Math = new Section ("Math");
        Section Biology = new Section ("Biology");
        Section compSi = new Section ("Computer Science");

        Teacher albinson = new Teacher ("Albinson","Computer Science");
        Teacher goodrich = new Teacher ("Goodrich","Math");
        Teacher harm = new Teacher ("Harm", "Biology");


        Berkeley.addSections(Math);
        Berkeley.addSections(Biology);
        Berkeley.addSections(compSi);

        System.out.println(Berkeley.toString());

        //Teacher
        albinson.addSections(compSi);
        compSi.setTeacher(albinson);
        System.out.println(albinson.toString());

        harm.addSections(Biology);
        Biology.setTeacher(harm);
        System.out.println(harm.toString());

        goodrich.addSections(Math);
        Math.setTeacher(goodrich);
        System.out.println(goodrich.toString());

        //students
        Student lucas = new Student("Lucas", 11);
        lucas.addSections(Math);
        Math.addStudents(lucas);

        lucas.addSections(Biology);
        Biology.addStudents(lucas);

        lucas.addSections(compSi);
        compSi.addStudents(lucas);

        System.out.println(lucas.toString());

        Student diego = new Student("Diego", 11);
        diego.addSections(Math);
        Math.addStudents(diego);

        diego.addSections(Biology);
        Biology.addStudents(diego);

        diego.addSections(compSi);
        compSi.addStudents(diego);

        System.out.println(diego.toString());

        Student logang = new Student("Logang", 7);
        logang.addSections(Math);
        Math.addStudents(logang);

        logang.addSections(Biology);
        Biology.addStudents(logang);

        logang.addSections(compSi);
        compSi.addStudents(logang);

        System.out.println(logang.toString());

        Student sorooch = new Student("Sorooch", 11);
        sorooch.addSections(Math);
        Math.addStudents(sorooch);

        sorooch.addSections(Biology);
        Biology.addStudents(sorooch);

        sorooch.addSections(compSi);
        compSi.addStudents(sorooch);

        System.out.println(sorooch.toString());

        Student emmeeet = new Student("Emmeeet", 11);
        emmeeet.addSections(Math);
        Math.addStudents(emmeeet);

        emmeeet.addSections(Biology);
        Biology.addStudents(emmeeet);

        emmeeet.addSections(compSi);
        compSi.addStudents(emmeeet);

        System.out.println(emmeeet.toString());

        Student andrew = new Student("Andrew", 13);
        andrew.addSections(Math);
        Math.addStudents(andrew);

        andrew.addSections(Biology);
        Biology.addStudents(andrew);

        andrew.addSections(compSi);
        compSi.addStudents(andrew);

        System.out.println(andrew.toString());


        System.out.println(Math.toString());
        System.out.println(Biology.toString());
        System.out.println(compSi.toString());

    }
}
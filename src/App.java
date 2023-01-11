public class App {
    public static void main(String[] args) throws Exception {

        Teacher marcos = new Teacher();
        marcos.setName("Marcos");
        marcos.setAge(32);
        marcos.setCPF("123.321.987-10");
        marcos.setGender("M");

        Discipline math = new Discipline();
        math.setName("Cálculo I");
        math.setLevel(4);
        math.setVacancies(20);
        math.setTeacher(marcos);

        System.out.println("Disciplina: " + math.getName());
        System.out.println("Professor: " + marcos.getName());
        System.out.println("Nível: " + math.getLevel());
        System.out.println("Vagas: " + math.getVacancies());
    }
}

public class Discipline {
  private String name;
  private int level;
  private int vacancies;
  private Teacher teacher = new Teacher();

  String getName() {
    return this.name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getLevel() {
    return this.level;
  }

  void setLevel(int level) {
    this.level = level;
  }

  int getVacancies() {
    return this.vacancies;
  }

  void setVacancies(int vacancies) {
    this.vacancies = vacancies;
  }

  Teacher getTeacher() {
    return this.teacher;
  }

  void setTeacher(Teacher teacher) {
    this.teacher = teacher;
  }
}

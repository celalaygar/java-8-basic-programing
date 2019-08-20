package Project6.BuilderPattern_1;

public class Person {
    private String identityNumber;
    private String name;
    private String surname;
    private String city;
    private Integer age;
    private Integer gender;

    public Person(String identityNumber, String name, String surname, Integer age, Integer gender) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public static class Builder {
        private String identityNumber;
        private String name;
        private String surname;
        private String city;
        private Integer age;
        private Integer gender;

        public Builder(){}

        public Builder(String identityNumber, String name){
            this.identityNumber = identityNumber;
            this.name = name;
        }

        public Builder(String identityNumber, String name, String surname){
            this.identityNumber = identityNumber;
            this.name = name;
            this.surname = surname;
        }
        
        public Builder identityNumber(String identityNumber) {
            this.identityNumber = identityNumber;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }
        
        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(identityNumber, name, surname, age, gender);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "identityNumber='" + identityNumber + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

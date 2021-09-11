public class Human {
        char gender;//'F' or 'M'
        String firstName, lastName;
        int identificationNumber;
        int yearBirth, monthBirth, dayBirth;

        Human partner;

        public void speak(String words){
            System.out.println(words);
        }
        public void setId(int id){
            identificationNumber = id;
        }
        public int getId(){
            return identificationNumber;

        }
        public String getFullName(){
            return this.firstName + " " + this.lastName;

        }

    }


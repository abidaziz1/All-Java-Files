class hello{
    public static void main(String[] args){
        String name = "Abid Aziz";
        String country = "Bangladesh";
        String company = "Meta";
        int age = 21;
        double gpa = 3.8;
        char percentSign = '%'; // Uncommented and will be used in the formatted string

        // Correcting the order of placeholders and the corresponding arguments
        String formattedString = String.format(
            "My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %.2f. I have attended 100%c of my university classes.",
            name, country, age, company, gpa, percentSign
        );

        System.out.println(formattedString);
    }
}


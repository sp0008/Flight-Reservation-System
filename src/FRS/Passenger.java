package FRS;

public class Passenger {
    private String user;
    private String pwd;
    private Address address;
    private Contact contact;
    private boolean login = false;
    private int idCounter = 1;
    private int id;

    public int getPassengrCount() {
        return idCounter;
    }

    Passenger(String user, String pwd, Address address, Contact contact, int id) {
        this.user = user;
        this.pwd = pwd;
        this.address = address;
        this.contact = contact;
        this.id = idCounter++;
    }


    private static class Contact{
        public String name;
        private long phone;
        private String email;

        Contact(String name, long phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;

        }


        public String getContact() {
            return "Name: " + name + "\nPhone: " + phone + "\nemail: " + email;
        }

        public void setContact(String name, long phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }


        private static class Address{
            private String street;
            private String city;
            private String state;

            Address(String street, String city, String state){
                this.street=street;
                this.city=city;
                this.state=state;
            }

        public String getAddress (){
                return "Street: "+street+"\nCity: "+city+"\nState: "+state;
        }

        public void addAddress (String street, String city, String state){
        this.street=street;
        this.city=city;
        this.state=state;
        }
    }
}
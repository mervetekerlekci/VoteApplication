package org.example;

public class Voter {
    private int id;
    private String city;
    private String party;
    private int age;
    private String occupation;

    public Voter(int id, String city, String party) {
        this.id = id;
        this.city = city;
        this.party = party;
    }

    public Voter(int id, String city, String party, int age, String occupation) {
        this.id = id;
        this.city = city;
        this.party = party;
        this.age = age;
        this.occupation = occupation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Voter{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", party='" + party + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}

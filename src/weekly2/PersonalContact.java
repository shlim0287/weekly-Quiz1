package weekly2;

public class PersonalContact extends Contact{
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "이름: " + getName() + ", 전화번호: " + getPhoneNumber() + ", 관계: " + relationship;
    }
}

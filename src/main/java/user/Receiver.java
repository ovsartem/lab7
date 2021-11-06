package user;


import lombok.Getter;
import lombok.Setter;


@Setter @Getter
public class Receiver implements User{
    private String status;
    private int id = generateId.generateID();
    @Override
    public void update(String status) {
        this.status = status;
    }
}
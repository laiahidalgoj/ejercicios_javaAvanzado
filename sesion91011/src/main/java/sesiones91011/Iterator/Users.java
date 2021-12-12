package sesiones91011.Iterator;

import java.util.ArrayList;

public class Users implements UserIterator {

    private ArrayList<User> users = new ArrayList<>();
    private int position = 0;

    public void create(User user){
        users.add(user);
    }


    @Override
    public User next(){
        User user = users.get(position);
        position += 1;
        return user;
    }

    @Override
    public boolean hasMore(){
        return position < users.size();
    }

    @Override
    public void reset(){
        position = 0;
    }

}

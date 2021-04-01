import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.IntStream;


public class CustomQueue<T> {
    private ArrayList<T> queue;

    public CustomQueue() {
        queue = new ArrayList<>();
    }


    public int add(T userId){

        final boolean userIdAlreadyExists = userIdAlreadyExists(userId);

        if (userIdAlreadyExists){

            throw new IllegalArgumentException("User ID already exists");
        }

        queue.add(userId);
        return queue.size()-1;
    }




    public boolean removeByUser(T userId){
        return queue.remove(userId);
    }


    public T removeByPosition(int userId){
        return queue.remove(userId);
    }

    public boolean move(int fromPosition, int toPosition){

        if (toPosition > queue.size()-1){

            throw  new IllegalArgumentException("The specified toPosition is invalid");
        }

        T user =  removeByPosition(fromPosition);

        if( user == null){

            throw  new IllegalArgumentException("No user found at the specified fromPosition");

        }

        queue.add(toPosition, user);

        return  true;

    }

    public boolean swap(int position1, int position2){

        int maxPosition = Math.max(position1, position2);

        if(queue.size() < maxPosition -1){

            throw new IllegalArgumentException( maxPosition + " is greater than the size of the queue size");
        }

        T tempElementInPosition1= queue.get(position1);

        queue.set(position1, queue.get(position2));
        queue.set(position2, tempElementInPosition1);

        return true;
    }


    public CustomQueue<T> reverse(){
        Collections.reverse(queue);

        return this;
    }

    public boolean userIdAlreadyExists(T userId){
        return queue.contains(userId);
    }

    public void print(){
        IntStream.range(0, queue.size())
                .forEach(index ->
                        System.out.println( index + " : "  + queue.get(index) )
                );
    }

//    private T getUserByPosition(int position){
//        return queue.get(position);
//    }


}

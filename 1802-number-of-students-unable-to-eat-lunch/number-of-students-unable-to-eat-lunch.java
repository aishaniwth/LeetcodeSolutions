class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
    Queue<Integer> q = new LinkedList<>();
    for( int i = 0 ; i<students.length;i++){
        q.offer(students[i]);
    }  

int count =0 ;
int i  =0 ;
while(!q.isEmpty() && count<=q.size()){
    if(q.peek()==sandwiches[i]){
        count = 0 ; 
        i++;
        q.poll();

    }

    else {
        count++;
        q.offer(q.peek());
        q.poll();

    }
}



        return q.size();
    }
}
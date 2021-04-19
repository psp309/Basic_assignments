package com.userdefined_exception;

public class ItemNotFound extends Exception{
//    public ItemNotFound(String s){
//        super(s);
//    }
    public String toString(){
       return "Item not found";
    }
}
class DemoItemNotFound{
    static void find(int a[],int item) throws ItemNotFound {
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(item==a[i])
                flag=true;
        }
        if(!flag){
           // throw new ItemNotFound("Item not found");
            throw new ItemNotFound();
        }else{
            System.out.println("Item found");
        }
    }
    public static void main(String[] args) {
        try {
            find(new int[]{23,34,12,56,},1);
        } catch (ItemNotFound itemNotFound) {
            System.out.println("Exception: " +itemNotFound);
        }
    }

}
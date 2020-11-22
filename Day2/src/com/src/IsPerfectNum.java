package com.src;

public class IsPerfectNum {
	public boolean isPerfectNum(int n){
        
        int temp = 0;
        for(int i=1;i<=n/2;i++){
            if(n%i == 0){
                temp += i;
            }
        }
        if(temp == n){
            System.out.println(n);
            return true;
        } 
        else {
            System.out.println(n);
            return false;
        }
    }
}

class Problem91 {
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int max=arr[0],cur=arr[0];
        for(int i=1;i<arr.length;i++){
            cur=Math.max(arr[i],cur+arr[i]);
            max=Math.max(max,cur);
        }
        System.out.println(max);
    }
}


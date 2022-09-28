package midterm;
class Task_5A {
    public static void main(String[] args) {
        int capacity =22;
        int val[] = new int[] { 4,6 ,7 ,9,10 };
        int sizes[] = new int[] { 3,5,7,8,9 };
        for(int i=0;i<val.length;i++) {
        }
        double size_value[]=new double[val.length];
        for(int i=0;i<val.length;i++) {
            size_value[i]=(double)val[i]/(double)sizes[i];
        }
        for(int i=0;i<val.length-1;i++) {
            for(int j=i+1;j<val.length;j++) {
                if(size_value[i]<size_value[j]) {
                    double temp=size_value[j];
                    size_value[j]=size_value[i];
                    size_value[i]=temp;
                    int tem=val[j];
                    val[j]=val[i];
                    val[i]=tem;
                    int tem2=sizes[j];
                    sizes[j]=sizes[i];
                    sizes[i]=tem2;
                }
            }
        }
        int k=0;
        double sum=0;
        System.out.println();
        while(capacity>0) {
            if(sizes[k]<capacity) {
                sum+= val[k];
                capacity=capacity-sizes[k];
            }
            else {
                double x=capacity*val[k];
                double x2=sizes[k];
                double x3=x/x2;
                sum=sum+x3;
                capacity=0;
            }
            k++;
        }
        System.out.println("Final sum is="+sum);
    }
}
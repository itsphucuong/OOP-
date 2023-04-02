public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        //sinh vien code tai day
        int sum=0;
        for (int i = 0; i< a.length; i++){
            if (a[i] < 0){
                sum = sum + a[i];
            }
        }
        return sum;
    }

    public static String uppercaseFirstVowels(String str){
        //sinh vien code tai day
        String kq = new String();
        String[] tach = str.split("\\s"); //tach boi dau cach
        for(int i = 0; i < tach.length; i++){
            if((tach[i].charAt(0) == 'e')|| (tach[i].charAt(0) == 'u' )||( tach[i].charAt(0) == 'o' )||( tach[i].charAt(0) == 'a' )|| (tach[i].charAt(0) == 'i')){
                tach[i] = tach[i].substring(0,1).toUpperCase() + tach[i].substring(1);
            }
        kq = kq + " " + tach[i];
        }
        return kq; 
    }

    public static int findMinNegativeElement(int a[]){
        //sinh vien code tai day
        int firstMin = 1;
        for(int i = 0; i < a.length; i ++){
            if(a[i]<0){
                firstMin = a[i];
                break;
            }
        }
        if (firstMin == 1){
            return firstMin;
        }else{
            for(int i = 0; i < a.length; i ++){
                if (a[i] < firstMin){
                    firstMin = a[i];
                }
            }
            return firstMin;
        }
    }

	public static String getName(String str){
        //sinh vien code tai day
        String resultString = str.replace("Ho ten: ", "");
        return resultString;
    }

    public static int findFirstMod3Element(int[] a){
        //sinh vien code tai day
        int firstMod3 = -1; 
        for(int i = 0; i < a.length; i++){
            if(a[i] % 3 == 0){
                firstMod3 = i;
                break;
            }
        }
        return firstMod3;
    }

    public static int countString(String str, String k){
        //sinh vien code tai day
        int count = 0;
        String[] tach = str.split("\\s");
        for(int i = 0; i < tach.length; i++){
            if(tach[i].compareTo(k)==0){
                count +=1;
            } 
        }
        return count;
    }
}
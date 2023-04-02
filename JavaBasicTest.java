public class JavaBasicTest {
    
    public static void main(String[] args) {
                    // định dạng các ký tự màu
                    String red = "\u001B[31m";
                    String green = "\u001B[32m";
                    String yellow = "\u001B[33m";
                    String blue = "\u001B[34m";
                    String purple = "\u001B[35m";
                    String cyan = "\u001B[36m";
            
            
                    System.out.print(blue + "  __  __ _    _  ____ _____     _____ _____ ______ __  __      ____   ____  _____     _ \n");
                    System.out.print(purple + "|  \\/  | |  | |/ __ \\_   _|   |  __ \\_   _|  ____|  \\/  |    / __ \\ / __ \\|  __ \\   | |\n");
                    System.out.print(cyan + "| \\  / | |  | | |  | || |     | |  | || | | |__  | \\  / |   | |  | | |  | | |__) |  | |\n");
                    System.out.print(red + "| |\\/| | |  | | |  | || |     | |  | || | |  __| | |\\/| |   | |  | | |  | |  ___/   | |\n");
                    System.out.print(yellow + "| |  | | |__| | |__| || |_    | |__| || |_| |____| |  | |   | |__| | |__| | |       |_|\n");
                    System.out.println(green + "|_|  |_|\\____/ \\____/_____|   |_____/_____|______|_|  |_|    \\____/ \\____/|_|       (_)" +blue+" - Phu Cuong chuc cau ! ");
                    
            //Thong bao
            System.out.println(yellow+"\n__________________TESTCASE CAU1 _ THI GK OOP _ JAVA__________________\n");
        
        testSumNegativeElements();
        testUppercaseFirstVowels();
        testFindMinNegativeElement();
        testGetName();
        testFindFirstMod3Element();
        testCountString();
    }
    
    public static void testSumNegativeElements() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        int[] arr1 = {1, -2, 3, 4, -2, 1, -9};
        int[] arr2 = {1, 2, 3, 0, 5, 6};
        int[] arr3 = {-1, -2, -3, -4, -5};
        assert JavaBasic.sumNegativeElements(arr1) == -13 : red+"Test case 1 failed";
        assert JavaBasic.sumNegativeElements(arr2) == 0 : red+"Test case 2 failed";
        assert JavaBasic.sumNegativeElements(arr3) == -15 : red+"Test case 3 failed";
        
        System.out.println(green+"# Test case for sumNegativeElements passed");
    }
    
    public static void testUppercaseFirstVowels() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String str1 = "this is a test string";
        String str2 = "another example";
        String str3 = "all vowels";
        
        assert JavaBasic.uppercaseFirstVowels(str1).equals("ThIs Is A tEst strIng") : red+"Test case 1 failed";
        assert JavaBasic.uppercaseFirstVowels(str2).equals("AnOther ExAmple") : red+"Test case 2 failed";
        assert JavaBasic.uppercaseFirstVowels(str3).equals("All Vowels") : red+"Test case 3 failed";
        
        System.out.println(green +"# Test case for uppercaseFirstVowels passed");
    }
    
    public static void testFindMinNegativeElement() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        int[] arr1 = {1, -2, 3, 4, -2, 1, -9};
        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int[] arr3 = {-1, -2, -3, -4, -5};
        
        assert JavaBasic.findMinNegativeElement(arr1) == -2 : red + "Test case 1 failed";
        assert JavaBasic.findMinNegativeElement(arr2) == 1 : red + "Test case 2 failed";
        assert JavaBasic.findMinNegativeElement(arr3) == -5 : red + "Test case 3 failed";
        
        System.out.println(green + "# Test case for findMinNegativeElement passed");
    }
    
    public static void testGetName() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String str1 = "Ho ten: Nguyen Van A";
        String str2 = "Ho ten: Tran Thi B";
        String str3 = "Ho ten: Le Thi C";
        
        assert JavaBasic.getName(str1).equals("Nguyen Van A") : red + "Test case 1 failed";
        assert JavaBasic.getName(str2).equals("Tran Thi B") : red + "Test case 2 failed";
        assert JavaBasic.getName(str3).equals("Le Thi C") : red + "Test case 3 failed";
        
        System.out.println(green + "# Test case for getName passed");
    }
    
    public static void testFindFirstMod3Element() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 4, 5, 7};
        int[] arr3 = {0, 1, 2, 3};
        int[] arr4 = {1, 4, 2, 8, 7, 1, 6};
        
        int expected1 = 2;
        int expected2 = -1;
        int expected3 = 0;
        int expected4 = 8;
    
        int result1 = JavaBasic.findFirstMod3Element(arr1);
        int result2 = JavaBasic.findFirstMod3Element(arr2);
        int result3 = JavaBasic.findFirstMod3Element(arr3);
        int result4 = JavaBasic.findFirstMod3Element(arr4);
    
        if (result1 == expected1) {
            System.out.println(green + "# Test case 1 for findFirstMod3Element passed");
        } else {
            System.out.println(red +"# Test case 1 for findFirstMod3Element failed. Expected: " + expected1 + ", but got: " + result1);
        }
    
        if (result2 == expected2) {
            System.out.println(green + "# Test case 2 for findFirstMod3Element passed");
        } else {
            System.out.println(red +"# Test case 2 for findFirstMod3Element failed. Expected: " + expected2 + ", but got: " + result2);
        }
    
        if (result3 == expected3) {
            System.out.println(green + "# Test case 3 for findFirstMod3Element passed");
        } else {
            System.out.println(red +"# Test case 3 for findFirstMod3Element failed. Expected: " + expected3 + ", but got: " + result3);
        }
    
        if (result4 == expected4) {
            System.out.println(green + "# Test case 4 for findFirstMod3Element passed");
        } else {
            System.out.println(red+"# Test case 4 for findFirstMod3Element failed. Expected: " + expected4 + ", but got: " + result4);
        }
    }
    public static void testCountString() {
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String str1 = "This is is a test string";
        String k1 = "is";
        int expected1 = 2;
        int actual1 = JavaBasic.countString(str1, k1);
        if (actual1 == expected1) {
            System.out.println(green + "# Test case for countString passed");
        } else {
            System.out.println(red +"Test case for countString failed. Expected: " + expected1 + ", actual: " + actual1);
        }
    
        String str2 = "Hello world!";
        String k2 = "world!";
        int expected2 = 1;
        int actual2 = JavaBasic.countString(str2, k2);
        if (actual2 == expected2) {
            System.out.println(green + "# Test case for countString passed");
        } else {
            System.out.println(red +"Test case for countString failed. Expected: " + expected2 + ", actual: " + actual2);
        }
    
        String str3 = "This is a test string";
        String k3 = "test";
        int expected3 = 1;
        int actual3 = JavaBasic.countString(str3, k3);
        if (actual3 == expected3) {
            System.out.println(green + "# Test case for countString passed");
        } else {
            System.out.println(red +"Test case for countString failed. Expected: " + expected3 + ", actual: " + actual3);
        }
    }
}        
       

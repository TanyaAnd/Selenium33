import org.apache.log4j.Logger;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;
import static java.lang.StrictMath.sqrt;

public class Methods {
    /**
     *
     * @param x
     * @param y
     * @return
     */

    Logger log; // це зміння класу
    int c;
    static int b;

    public Methods() {
        log = Logger.getLogger(getClass());
    }

    public int sumTwoNumbers (int x, int y)
    {
        log.info("This method returns sum two numbers: ");
        int sum = x+y;
        return sum;
    }

    public int divideTwoNumbers (int x, int y)
    {
        int c;
        try
        {
           c = x/y;
           log.info("x divide y is equil " + c);
           return c;
        }
        catch (ArithmeticException ex)
        {
            log.error("Something bad 5 ");
            return -1;
        }
        catch (Exception ex)
        {
            log.error("Something bad 5 ");
            return -1;
        }
    }

    public int minNumbers(int x, int y)
    {
        if(x>y){
            return y;
        }
        else
            return x;
    }

    /**
     * Homework1 > 1 task: Написать метод возвращающий факториал заданного числа N
     */

    public int getFactorial(int x)
    {
        int k = 1;
        for(int i = 1; i <= x; i++){
            k = k * i;
        }
        return k;
    }

    /**
     * Homework1 > 2 task: написать статический метод double getDistance(x1, y1, x2, y2). Он должен вычислять расстояние
     * между точками. Посмотреть в учебнике геометрии или в интернете
     */

    public double getDistance(int x1, int y1, int x2, int y2)
    {
        double distanceFirstPoint = x2 - x1;
        double squareDistanceFirst = distanceFirstPoint * distanceFirstPoint;
        double distanceSecondPoint = y2 - y1;
        double squareDistanceSecond = distanceSecondPoint * distanceSecondPoint;
        double sumDistance = squareDistanceFirst + squareDistanceSecond;
        return Math.sqrt(sumDistance);
    }

    /**
     * Homework1 > 3 task: Написать буленовский метод принимающий на вход 3 переменных типа int которые обозначают
     * длину стороны для треугольника и возвращает правда или ложь (может ли существовать
     * треугольник с заданными сторонами) Вспоминаем свойство треугольника ни одна сторона не
     * должна быть длиннее суммы двух других
     */

    public boolean isTriangle(int a, int b, int c)
    {
        if ((a <= 0) || (b <= 0) || (c <= 0))
        {
            return false;
        }
        if((a + b) > c && (a + c) > b && (b + c) > a)
        {
            return true;
        }
        else
            return false;
    }

    /**
     * Homework1 > 4 task: Почитать про вложенный цикл и вывести треугольник из нулей на экран
     */

    public void getRectangularTriangle(int x)
    {
        for(int i = 1; i <= x; ++i)
        {
            for(int j = 1; j <= i; ++j){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Homework1 > 5 task: Задача для тех кто следить за фигурой))) Написать программу которая вычисляет индекс массы
     * тела
     */

    public double getBodyMassIndex (double a, double b)
    {
       return a/(b*b);
    }

    /**
     * Homework1 > 6 task: Составить алгоритм определяющий, есть ли среди цифр введенного трехзначного числа —
     * одинаковые. Число вводится с клавиатуры. Кто не нагуглит как вводить с клавиатуры можно
     * просто принимать int на вход и определять есть ли в нем одинаковые цифры. Использовать
     * изученные операторы. Метод буленовский возвращает правда или ложь.
     */

    public boolean isSameNumbers(int x)
    {
        int hundreds = x/100;
        int thirdNumber = x%10;
        int secondNumber = (x%100)/10;
        boolean isSame = false;
        try
        {
            if ((hundreds == thirdNumber) || (hundreds == secondNumber) || (thirdNumber == secondNumber))
            {
                log.info("Same number exists");
                isSame = true;
            } else log.info("Same number doesn't exist");
        }
        catch(Exception ex)
        {
            log.error("Something bad");
        }
            return isSame;
    }

    /**
     * Homework1 > 7 task: написать метод высчитывающий сколько литров нужно чтобы заполнить бассейн. Примает на
     * вход 3 величины: глубину, длину и ширину бассейна. Определить перед решением что принимает
     * на вход и что возвращает
     */

    public int fillThePool (int a, int b, int c)
    {
        int getVolume = a * b * c;
        return getVolume * 1000;
    }

    /**
     * Homework1 > 8 task: При поступлении в вуз абитуриенты, получившие 'двойку' на первом экзамене, ко второму не
     * допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
     * Подсчитать, сколько человек не допущено ко второму экзамену.
     */

    public int getLoosers(int[] array)
    {
        int l = array.length;
        int numberOfLoosers = 0;
        for(int i = 0; i < l; i++)
        {
            if(array[i] == 2)
            {
                numberOfLoosers +=1;
            }
        }
        return numberOfLoosers;
    }

    /**
     * Homework1 > 9 task: У вас есть доллары. Вы хотите обменять их на рубли. Есть информация о стоимости купли-
     * продажи в банках города. В городе N банков. Составьте программу, определяющую, какой банк
     * выбрать, чтобы выгодно обменять доллары на рубли
     */

    public double getExchangeRate(double[] mass)
    {
        int l = mass.length;
        double j = 0;
        for(int i = 0; i < l; i++)
        {
            if(mass[i] > j)
            {
                j = mass[i];
            }
        }
        return j;
    }

    /**
     * Homework1 > 10 task: Вывести на экран строку S указанное количество раз N
     */

    public void printHelloGuys (int n, String s)
    {
        for(int i = 1; i <= n; ++i)
        {
            System.out.print(s + " ");
            System.out.println("");
        }
    }

    /**
     * Homework1 > 11 task: Написать программу нахождения суммы большего и меньшего из 3-х чисел
     */

    public int sumOfMinAndMax (int a, int b, int c)
    {
        int minNum = Math.min(a, Math.min(b, c));
        int maxNum = Math.max(a, Math.max(b, c));
        return minNum + maxNum;
    }

    /**
     * Homework1 > 12 task: Вычислить площадь треугольника
     *
     *    public double areaOfEquilateralTriangle (int a, int h)
     *     {
     *         int triangleSide = a;
     *         int triangleHeight = h;
     *         int areaOfTriangle = a*h/2;
     *         return areaOfTriangle;
     *     }
     */

    public double triangle (int side1, int side2, int side3)
            // S = sqrt (P/2 (P/2 - side1) (P/2 - side2) (P/2 - side3))
    {
        double s;
        try
        {
            if (isTriangle(side1, side2, side3))
            {
                double p = side1 + side2 + side3;
                s = sqrt(p / 2 * (p / 2 - side1) * (p / 2 - side2) * (p / 2 - side3));
                log.info("Is triangle " + s);
            } else
            {
                s = -1;
                log.info("Is not triangle");
            }
        }
        catch (Exception ex)
        {
            s = -1;
            log.error("Something goes wrong");
        }
        return s;
    }

    public double triangle (int side1)
    {
        double s;
        if (isTriangle (side1, side1, side1))
        {
            double p = side1 + side1 + side1;
            s = sqrt (p/2 * (p/2 - side1)*(p/2 - side1)*(p/2 - side1));
        }
        else s = -1;
        return s;
    }

    /**
     * Homework1 > 13 task: Вычислить площадь правильного шестиугольника со стороной a, используя подпрограмму
     * вычисления площади треугольника
     */

     public double hexagon (int side1)
     {
         double s;
         try
         {
             s = triangle(side1) * 6;
             log.info("The hexagon square " + s);
         }
         catch (Exception ex)
         {
             s = -1;
             log.error("Something wrong");
         }
         return s;
     }

    /**
     * Homework1 > 14 task: Написать программу вычисления суммы факториалов всех нечетных чисел от 1 до 9
     */

    public int getSumFactorial()
    {
        int sum = 0;
        int fac = 0;
        for(int i = 1; i <= 9; i++){
            if (i%2 == 1) {
                fac = getFactorial(i);
                sum += fac;
            }
        }
        return sum;
    }

    /**
     * Homework1 > 15 task: Написать программу которая возвращает стоимость покупки с учетом дисконта
     * Если покупка совершена на сумму до 1000 грн то скидка не положена Если от 1001 грн до 2000
     * скидка 2% от 2001 до 5000 скидка 5% и свыше 5001 скидка 7%
     */

    public int returnDiscount(int x)
    {
        if(x <= 1000)
        {
            return x;
        } else if (x >= 1001 || x <= 2000)
        {
            return x - (x*2/100);
        } else if (x >= 2001 || x <= 5000)
        {
            return x - (x*5/100);
        } else if (x >= 5001)
        {
            return x - (x*7/100);
        } else
        {
            return x;
        }
    }

    /**
     * Приклад класа по заповненню масива
     */

    public int[] fillArray (int [] mass)
    {
        Random random = new Random();
        int lengthOfMass = mass.length;
        for(int i=0; i<lengthOfMass; i++)
        {
            System.out.println(mass[i]);
            mass[i] = random.nextInt(100);
            System.out.println(mass[i]);
            System.out.println();
        }
        return mass;
    }

    /**
     * Homework2 > 1 task: Дано два числа. Найти минимальное число из них
     */

    public int minNumber(int a, int b)
    {
        if(a > b)
        {
            return b;
        } else
        {
            return a;
        }
    }

    /**
     * Homework2 > 2 task: Дан целочисленный массив чисел. Найти сумму элементов, кратных данному числу K
     */

    public int sumOfElements (int[] array, int k)
    {
        int sum = 0;
        int lengthOfMass = array.length;
        for(int i = 0; i < lengthOfMass; i++)
        {
            if(array[i]%k == 0)
            {
                sum += array[i];
            }
        }
        return sum;
    }

    /**
     * Homework2 > 3 task: В целочисленном массиве есть нулевые элементы. Создать массив из номеров этих элементов
     */

    public List<Integer> getArrayFromIndex(int[] mass)
    {
        int l = mass.length;
        List arr = new ArrayList<Integer>();
        for(int i = 0; i < l; i++)
        {
            if(mass[i] == 0)
            {
                arr.add(i);
            }
        }
        return arr;
    }

    /**
     * Homework2 > 4 task: Дан целочисленный массив чисел (положительных и отрицательных). Выяснить, какое число
     * встречается раньше – положительное или отрицательное
     */

    public String getPositiveOrNegativeNumber(int[] mass)
    {
        int l = mass.length;
        String result = "";
        for(int i = 0; i < l; i++)
        {
            if(mass[i] > 0)
            {
                if (result.isEmpty()) {
                    result = "Positive number";
                }
            } else
            {
                if (result.isEmpty()) {
                    result = "Negative number";
                }
            }
        }
        return result;
    }

    /**
     * Homework2 > 5 task: Дан массив чисел. Выяснить, отсортирован ли он по возрастанию
     */

    public boolean isSorted (int[] arr)
    {
        int length = arr.length;
        boolean flag = true;
        for(int i = 1; i < length; i++)
        {
            if(arr[i-1]>arr[i]) //умова: якщо попередній елемент більший наступного
            {
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    /**
     * Homework2 > 6 task: Дан массив чисел. Создать массив из четных чисел этого массива. Если таких чисел нет, то вывести
     * сообщение об этом факте
     */

    public List<Integer> getArrayFromEvenNumbers(int[] mass)
    {
        int l = mass.length;
        List arr = new ArrayList<Integer>();
        for(int i = 0; i < l; i++)
        {
         if(mass[i] % 2 == 0 && mass[i] != 0)
         {
             arr.add(mass[i]);
         }
        }
        return arr;
    }

    /**
     * Homework2 > 7 task: Дан массив чисел. Заменить все его элементы, больше данного числа Z, этим числом. Подсчитать
     * количество замен
     */

    public int amountOfReplacement(int[] mass, int z)
    {
        int counter = 0;
        int l = mass.length;
        for(int i = 0; i < l; i++)
        {
            if(mass[i] > z)
            {
                mass[i] = z;
                counter += 1;
            }
        }
        return counter;
    }

    /**
     * Homework2 > 8 task: Дан массив чисел. Подсчитать, сколько в нем отрицательных, положительных и нулевых
     * элементов
     */

    public int[] getAmountOfPositiveAndNegativeAndZeroNumbers(int[] mass)
    {
        int[] arrCounter = new int[3];
        int l = mass.length;
        for(int i = 0; i < l; i++)
        {
            if(mass[i] < 0)
            {
                arrCounter[0]+=1;
            } else if(mass[i] > 0)
            {
                arrCounter[1]+=1;
            } else if(mass[i] == 0)
            {
                arrCounter[2]+=1;
            }
        }
        return arrCounter;

    }

    /**
     * Homework2 > 9 task: Дан массив чисел. Поменять местами наибольший и наименьший элементы
     */

    public int[] replaceMinNumberWithMax(int[] mass)
    {
        int maxIndex = 0;
        int minIndex = 0;

        int l = mass.length;
        for(int i = 0; i < l; i++)
        {
            if(mass[i] > mass[maxIndex])
            {
                maxIndex = i;
            } else if(mass[i] < mass[minIndex])
            {
                minIndex = i;
            }
        }
        int temp;
        if (maxIndex != minIndex)
        {
            temp = mass[minIndex];
            mass[minIndex] = mass[maxIndex];
            mass[maxIndex] = temp;
        }
        return mass;
    }

    /**
     * Homework2 > 10 task: Дан массив. Вывести на печать только те числа, для которых выполняется условие arr[i] ≤ i
     */

    public List<Integer> indexArray(int[] array)
    {
        List arr = new ArrayList<Integer>();
        int l = array.length;
        for(int i = 0; i < l; i++)
        {
            if(array[i] <= i)
            {
                arr.add(array[i]);
            }
        }
        return arr;
    }

    /**
     * Homework2 > 11 task: Дан массив чисел. Вывести те числа, у которых остаток от деления на число М равен L
     */

    public List<Integer> remainderArray(int[] array, int m, int l)
    {
        List arr = new ArrayList<Integer>();
        int len = array.length;
        for(int i = 0; i < len; i++)
        {
            if(array[i]%m == l)
            {
                arr.add(array[i]);
            }
        }
        return arr;
    }

    /**
     * Homework2 > 12 task: Дан массив чисел. Поменять местами соседние элементы (а[0] и а[1], а[2] и а[3], …)
     */

    public int[] replaceAdjacentNumber(int[] mass)
    {
        int t1 = 0;
        int t2 = 0;
        int l = mass.length;
        for(int i = 0; i < l; i+=2)
        {
            t2 = mass[i];
            t1 = mass[i+1];
            mass[i] = t1;
            mass[i+1] = t2;
        }
        return mass;
    }

    /**
     * Homework2 > 13 task: Дан массив чисел, среди которых имеется один нуль. Вывести на печать все числа,
     * включительно до нуля
     */

    public List<Integer> getAllNumbersBeforeZero(int[] mass)
    {
        List arr = new ArrayList<Integer>();
        int l = mass.length;
        for(int i = 0; i < l; i++)
        {
            if(mass[i] != 0)
            {
                arr.add(mass[i]);
            } else
            {
                i+=l;
            }
        }
        return arr;
    }

    /**
     * Homework2 > 14 task: Дан массив чисел. Найти mаx(а[0], а[2], ..., а[2к]) +min(а[1], а[3], …, а[2к-1])
     */

    public int sumOfMinAndMax (int[] array)
    {
        int minNumber = array[1];
        int maxNumber = array[0];
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++)
        {
            if(i % 2 == 0)
            {
                if(maxNumber < array[i])
                    maxNumber = array[i];
            } else
                {
                    if(minNumber < array[i])
                        minNumber = array[i];
                }
        }

        return minNumber + maxNumber;
    }

    /**
     * Homework2 > 15 task: Дан массив целых положительных чисел. Найти произведение только тех чисел, которые больше
     * заданного числа М. Если таких нет, то выдать сообщение об этом.
     */

    public long multiple(int[] array, int m)
    {
        long result = 1;
        boolean flag = false;
        int length  = array.length;
        for(int i = 0; i<length; i++)
        {
            if(array[i] > m)
            {
                result *= array[i];
                flag = true;
            }
        }
        if(flag)
        {
            return result;
        } else
        {
            return -1;
        }

    }

    /**
     * Homework2 > 16 task: Дан массив положительных и отрицательных чисел. Заменить нулями те числа,
     * величина которых по модулю больше максимального числа (|a[i]| &gt; max{ a[0], a[1], ..., a[n]})
     * @param mass
     * @return
     */

    public int[] zeroReplacement(int[] mass)
    {
        int length = mass.length;
        int maxValue = mass[0];
        System.out.println();
        for(int i = 1; i < length; i++)
        {
            if(maxValue < mass[i])
            {
                maxValue = mass[i];
            }
        }
        for(int i = 0; i < length; i++)
        {
            if(abs(mass[i]) > maxValue)
            {
                mass[i] = 0;
            }
            System.out.println(mass[i] + " ");
        }
        return mass;
    }

    /**
     * Homework2 > 17 task: Дан массив чисел с положительными и отрицательными элементы.
     * Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
     * Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше
     */

    public int biggerSumOfNumbers(int[] array)
    {
        List p1 = new ArrayList<Integer>();
        List p2 = new ArrayList<Integer>();
        int length  = array.length;
        for(int i = 0; i<length; i++)
        {
            if(array[i] > 0)
            {
                p1.add(array[i]);
            }
            else if(array[i] < 0)
            {
                p2.add(abs(array[i]));
            }
        }
        int r1 = getProduct(p1);
        int r2 = getProduct(p2);
        if(r2 > r1)
        {
            return r2;
        }
        else
        {
            return r1;

        }
    }

    public int getProduct(List<Integer> a)
    {
        int result = 0;
        for (int item : a)
        {
            if (result != 0)
            {
                result *= item;
            }
            else
            {
                result = item;
            }
        }
        return result;
    }

    /**
     * Homework2 > 18 task: Дан массив чисел. Среди них есть равные. 
     * Найти первый максимальный элемент массива и заменить его нулем
     */

    public int [] getFirstMax(int[] array)
    {
        int maxNum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (maxNum < array[i])
            {
                maxNum = array[i];
            }
        }

        for (int k = 0; k < array.length; k++)
        {
            if (array[k] == maxNum)
            {
                array[k] = 0;
                k+=array.length;
            }
        }
        return array;
    }

    /**
     * Homework2 > 19 task: Дан массив чисел. Образовать новый массив, элементами которого будут элементы исходного,
     * оканчивающиеся на цифру k
     */

    public int[] arrayWhichEndsOnNumber (int[] mass, int k)
    {
        int [] array1;
        int counter = 0;
        int j = 0;
        int lengthMass = mass.length;
        for(int i = 0; i < lengthMass; i++)
        {
            if(mass[i] % 10 == k || mass[i] == k)
            {
                counter += 1; // довжина
            }
        }
        array1 = new int[counter];
        for(int i = 0; i < lengthMass; i++)
        {
            if(mass[i] % 10 == k || mass[i] == k)
            {
                array1[j] = mass[i];
                System.out.print(array1[j] + " ");
                j++;

            }
        }
        return array1;
    }
}

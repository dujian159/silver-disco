public class Test8 {


        public static void main(String[] args)
        {
            long t1 = System.currentTimeMillis();
            int arr[] = {7, 2, 1, 3, 8, 5,1,3,5,4,7,9,11,16,3,45,78,95,24,14,18,7,15,34,6,48,65,15,27,27,334,1568,4668,17769,2456,249,349,128};
            sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            long t2 = System.currentTimeMillis();
            System.out.println(t2-t1);
        }

        private static void sort(int[] a)
        {
            for (int i = 0; i < a.length; i++)
            {
                int temp = a[i];
                int left = 0;
                int right = i - 1;
                int mid = 0;
                while (left <= right)
                {
                    mid = (left + right) / 2;
                    if (temp < a[mid])
                    {
                        right = mid - 1;
                    }
                    else
                    {
                        left = mid + 1;
                    }
                }
                for (int j = i - 1; j >= left; j--)
                {
                    a[j + 1] = a[j];
                }
                if (left != i)
                {
                    a[left] = temp;
                }
            }
        }



}

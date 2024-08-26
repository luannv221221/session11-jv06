package ra.stream;

import ra.lambda.Student;

import java.util.*;

public class StreamDemo {
    public static void main(String[] args) {
       List<Product> products = new ArrayList<>();
       products.add(new Product(1,"Áo sơ mi",100));
       products.add(new Product(4,"Áo sơ mi",100));
       products.add(new Product(2,"Áo sơ mi 2",50));
       products.add(new Product(3,"Áo sơ mi 3",150));

        //1 in ra danh sách sản phẩm có giá lớn hơn 100
        products.stream().filter(student->student.getPrice() >=100).forEach(
                System.out::println
        );

        // map
        products.stream().map(Product::getName).forEach(System.out::println);

        // sorted
        // sắp xếp sản phẩm giá tăng dần
        products.stream().sorted(Comparator.comparing(Product::getPrice)).forEach(System.out::println);

        // sắp xếp sản phẩm giá giảm dân
        products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()).forEach(System.out::println);

        // check xem trong danh sách sản phấm có sản phẩm nằm trong khoang gia tu 40 - 100 khong
        boolean check = products.stream().anyMatch(product -> product.getPrice() >=40 && product.getPrice() <=100);
        System.out.println("Co 40 - 100 khong  "+check);
        // tính tổng sản phẩm có giá = 100
        long total = products.stream().filter(product -> product.getPrice() == 100).count();
        System.out.println("Tông la "+total);
        // tìm sản phẩm có giá lớn nhất
        Product productMax = products.stream().max(Comparator.comparing(Product::getPrice)).get();
        System.out.println("SP "+productMax.toString());

        // Thống kê
        DoubleSummaryStatistics statistics = products.stream().mapToDouble(Product::getPrice).summaryStatistics();
        System.out.println("Giá cao nhât "+statistics.getMax());
        System.out.println("Giá thap nhât "+statistics.getMin());
        System.out.println("Gia TB "+statistics.getAverage());
        //  Tính tổng tiền của các sản phẩm
        double totalPrice = products.stream().map(Product::getPrice).reduce((double) 0, Double::sum);
        System.out.println("Tổng tiền của sản phẩm "+totalPrice);
    }
}

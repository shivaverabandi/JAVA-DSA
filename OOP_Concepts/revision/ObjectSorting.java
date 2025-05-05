package OOP_Concepts.revision;

import java.util.*;

class Article{
    Integer num;
    String title;

    public Article(Integer num, String title){
        this.num = num;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Article{" +
                "num=" + num +
                ", title='" + title + '\'' +
                '}';
    }
}

class CustomSort implements Comparator<Article> {

    public int compare(Article a1, Article a2) {
        // if equal 0,
        // if a1 less than a2 no change
        // if a1 greater than a2 swap.
        return Integer.compare(0,a1.title.compareTo(a2.title));
    }
}
public class ObjectSorting {
    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<Article>();

        Article a1 = new Article(1, "Z");
        Article a2 = new Article(2, "T");
        Article a3 = new Article(3, "c");
        boolean status = articles.addAll(Arrays.asList(a1, a2, a3));
        if(status){
            System.out.println("added");
        }
//
//        List<Integer> list = Arrays.asList(1,345,23,4,-3343);
//        Collections.sort(list);
//
////      CustomSort sortInfo = new CustomSort();
//        Collections.sort(articles, new CustomSort());
//        System.out.println(articles);
//
//        Collections.sort(articles, new Comparator<Article>(){
//            public int compare(Article a1, Article a2) {
//                return Integer.compare(0,a1.title.compareTo(a2.title));
//            }
//        } );
//
//        Collections.sort(articles, (a,b) -> Integer.compare(0,a.title.compareTo(b.title)));

//        articles.sort( ( a , b) -> a.title.compareTo(b.title));
//        System.out.println(articles);

//        articles.sort(Comparator.comparing(article -> article.title));
//        System.out.println(articles);


        //**************************** 2d array sorting ******************************


        int [][] arr ={ {2,5},
                        {1,0},
                        {3,1},
                        {6,2}
                      };

        Arrays.sort(arr, (a,b) -> Integer.compare(a[1],b[1]));

        for (int []a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
  Set和Collection基本相同，并且没有提供额外方法，可以认为Set就是Collection
  程序可以把多个对象放入Set里
  Set通常记不住元素的顺序（即认为Set无序）
  Set中不允许包含相同元素
 */
public class SetTest
{
    public static void main(String[] args){
        Set language = new HashSet();
        LanguageInit(language);
        LanguageClear(language);
        LanguageInit(language);
        LanguageInterator(language);

    }

    //使用Iterator遍历集合元素
    private static void LanguageInterator(Set language) {
        Iterator iterator = language.iterator();
        while(iterator.hasNext()){
            String str = (String)iterator.next();
            System.out.print(str+"\t");
            if (str == "c")
                iterator.remove();
        }
        System.out.println("\n"+language);
    }

    //books集合的初始化方法
    private static void LanguageInit(Set language) {
        language.add("java");
        language.add("c++");
        language.add("python");
        language.add("c");
        language.add("java");    //Set集合中会自动去掉相同元素
        System.out.println("集合初始化完毕，集合大小为："+language.size());
        System.out.println("集合元素为："+language);

    }

    //集合清理方法
    private static void LanguageClear(Set language){
        language.clear();
        System.out.println("集合清理完毕，现在集合的大小为："+language.size());
    }
}

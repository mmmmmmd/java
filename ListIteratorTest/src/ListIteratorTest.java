
/*
   与Set只提供了一个iterator()方法不同，List还额外提供了一个listIterator()方法，该方法返回一个ListIterator对象，
   ListIterator接口继承了Iterator接口，提供了专门操作List的方法。ListIterator接口在Iterator接口基础上增加了如下方法：
   1.boolean hasPrevious():返回迭代器关联的集合是否还有上一个元素
   2.Object previous():返回迭代器的上一个元素
   3.void add(Object o):在指定位置添加一个元素

   Iterator与ListIterator的不同：
   ListIterator可以向前遍历，而Iterator只能向后遍历
   ListIterator可以用add()方法添加元素，而Iterator只能用remove()方法删除元素
 */
public class ListIteratorTest {
}

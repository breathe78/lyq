package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class BiFunctionTest {
    public static void main(String[] args) {

        BiFunctionPerson p1 = new BiFunctionPerson("张三", 20);
        BiFunctionPerson p2 = new BiFunctionPerson("李四", 30);
        BiFunctionPerson p3 = new BiFunctionPerson("王五", 40);
        List<BiFunctionPerson> persons = Arrays.asList(p1, p2, p3);
        BiFunctionTest biFunctionTest = new BiFunctionTest();
        //通过姓名查找
        List<BiFunctionPerson> byName = biFunctionTest.getPersonByName("李四", persons);
        System.out.println(byName);
        //通过年龄查找
        List<BiFunctionPerson> byAge = biFunctionTest.getPersonByAge(30, persons);
        System.out.println(byAge);
        //自己定义查找40岁的人员
        List<BiFunctionPerson> people = biFunctionTest.getPerson(20, persons, (tempAge, tempPersons) -> tempPersons.stream().filter(temp -> temp.getAge() < tempAge).collect(Collectors.toList()));
        System.out.println(people);
    }

    //正常遍历通过姓名查找
    public List<BiFunctionPerson> getPersonByName(String name, List<BiFunctionPerson> persons) {
        return persons.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }

    //函数式接：口通过年龄查找
    public List<BiFunctionPerson> getPersonByAge(Integer age, List<BiFunctionPerson> persons) {
        BiFunction<Integer, List<BiFunctionPerson>, List<BiFunctionPerson>> biFunction = (tempAge, tempPersons) ->
                tempPersons.stream().filter(pserson -> pserson.getAge() < tempAge).collect(Collectors.toList());
        return biFunction.apply(age, persons);
    }

    //只有实现，调用者自己传入规则
    public List<BiFunctionPerson> getPerson(Integer age, List<BiFunctionPerson> persons, BiFunction<Integer, List<BiFunctionPerson>, List<BiFunctionPerson>> biFunction) {
        return biFunction.apply(age, persons);
    }
}

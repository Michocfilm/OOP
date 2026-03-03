import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Lab09_680449 {
    static List<Singer> singers = List.of(new Singer("Toon", Style.ROCK),
                                            new Singer("Palmy", Style.POP),
                                            new Singer("Byrd", Style.POP));

    static List<Singer> q0_deep_copy_Factory() {
        Supplier<List<Singer>> listFactory = ArrayList::new;
        List<Singer> list1 = listFactory.get();  
        // equiv to List<Singer> list1 = new ArrayList<>();
        for (Singer original : singers) {
            Singer newSinger = new Singer(original);
            list1.add(newSinger);
        }      
        return list1;
    }
    static void q1_name_starts_with(Predicate<Singer> pred) {
        System.out.println("--- Q1: Filter Name ---");
        for (Singer s : singers) {
            if (pred.test(s)) { 
                System.out.println(s);
            }
        }
    }
    static void q2_suffix_every_name_with_kmilt(Function<Singer, String> func) {
        System.out.println("--- Q2: Transform Name ---");
        for (Singer s : singers) {
            String result = func.apply(s); 
            System.out.println(result);
        }
    }
    static int q3_new_list_of_pop(Predicate<Singer> pred) {
        System.out.println("--- Q3: Create New List (POP) ---");
        
        Supplier<List<Singer>> factory = ArrayList::new;
        List<Singer> popList = factory.get(); 

        for (Singer s : singers) {
            if (pred.test(s)) {
                popList.add(new Singer(s)); 
            }
        }
        for (Singer s : popList) {
            System.out.println(s);
        }
        return popList.size();
    }
    static void q4_print_all_singers(Consumer<Singer> consumer) {
        System.out.println("--- Q4: Consumer Action ---");
        for (Singer s : singers) {
            consumer.accept(s);
        }
    }    
    static void q5_change_style_with_condition(Predicate<Singer> pred, Consumer<Singer> consumer) {
        System.out.println("--- Q5: Change Style (Conditional) ---");
        
        List<Singer> workingList = q0_deep_copy_Factory();

        for (Singer s : workingList) {
            if (pred.test(s)) {
                System.out.print("Changing: " + s.getName() + " -> ");
                consumer.accept(s); 
                System.out.println(s.getStyle());
            }
        }
    }
    public static void test_lambda() {
        // /Test Q1: Find singers whose names start with "P" (using Predicate)
        q1_name_starts_with( s -> s.getName().startsWith("P"));

        // Test Q2: Transform to a String: name + " KMILT" (using Function)
        q2_suffix_every_name_with_kmilt(s -> s.getName() + " KMITL");

        // Test Q3: Create a new list containing only singers with POP style (using Predicate)
        int popSingers_size = q3_new_list_of_pop(s -> s.getStyle() == Style.POP);
        System.out.println("Pop List size: " + popSingers_size);

        // Test Q4: Use a Consumer to print data with a custom format
        q4_print_all_singers(s -> System.out.println(s));

        // Test Q5: If the style is ROCK (Predicate), change it to POP (Consumer)
        q5_change_style_with_condition(
            s -> s.getStyle() == Style.ROCK,         // Predicate: Condition check
            s -> s.setStyle(Style.POP)  // Consumer: Action to perform
        ); 
    }
    static boolean wrap_method_ref1_start_with_P(Singer s) {
        return s.getName().startsWith("P");
    }
    static String wrap_method_ref2_append_kmitl(Singer s) { // Function
        return s.getName() + "KMITL";
    }
    static boolean wrap_method_ref3_pred_if_style_pop(Singer s) {
        return s.getStyle() == Style.POP;
    }
    // test arbitrary object method reference
    void wrap_method_ref5_setter_to_pop_style(Singer s) { // Consumer
        s.setStyle(Style.POP);
    }
    public static void test_method_reference() {
        q1_name_starts_with( Lab09_680449::wrap_method_ref1_start_with_P );

        q2_suffix_every_name_with_kmilt( Lab09_680449::wrap_method_ref2_append_kmitl);
        
        int popSingers_size = q3_new_list_of_pop( Lab09_680449::wrap_method_ref3_pred_if_style_pop);
        System.out.println("Pop List size: " + popSingers_size);

        q4_print_all_singers(System.out::println);

        // Q5: เปลี่ยน Rock เป็น Pop
        Lab09_680449 not_specific_obj =  new Lab09_680449(); 
        q5_change_style_with_condition(
            s -> s.getStyle() == Style.ROCK, // no context cannot reuse wrap_method_ref3_pred_if_style_pop()
            not_specific_obj::wrap_method_ref5_setter_to_pop_style    // Consumer ...use not_specific_obj for referring to non static method reference
        );        
    }
    public static void main(String[] args) {
        //test_lambda();
        test_method_reference();
    }
}
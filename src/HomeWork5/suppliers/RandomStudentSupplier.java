package HomeWork5.suppliers;

import HomeWork5.dto.Student;
import HomeWork5.utils.api.IRandom;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;

public class RandomStudentSupplier implements Supplier<Student> {

    private final IRandom rnd;
    private final AtomicInteger counter;

    public RandomStudentSupplier(AtomicInteger counter, IRandom random) {
        this.rnd = random;
        this.counter = counter;
    }

    @Override
    public Student get() {
        return  new Student(
                counter.getAndIncrement(),
                rnd.randString(3, 10, 0),
                rnd.randInt(7, 17),
                rnd.randDouble(0.0, 10.0),
                rnd.randBoolean()
        );
    }
}

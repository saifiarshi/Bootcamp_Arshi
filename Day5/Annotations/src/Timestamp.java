import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by saifia on 7/25/2017.
 */
@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.TYPE})
public @interface Timestamp {
    Day Day();

    Month Month();

    Year year();
}

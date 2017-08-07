/**
 * Created by saifia on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User u1 = new User(2, "arshi", 111, 2);


        try {
            MovieService.buy(u1, 299);
        } catch (RatingInvalidException e) {
            System.out.println(e.getMessage());
        } catch (AgeLessThan10Exception e) {
            System.out.println(e.getMessage());
        } catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        } catch (AgeLessThan20Exception e) {
            System.out.println(e.getMessage());
        } catch (PriceInvalidException e) {
            System.out.println(e.getMessage());
        }

    }
}

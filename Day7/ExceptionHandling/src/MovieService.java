/**
 * Created by saifia on 7/26/2017.
 */
public class MovieService {
    public static void buy(User user, double price) throws PriceInvalidException,RatingInvalidException,AgeLessThan10Exception,AgeInvalidException,AgeLessThan20Exception{
    if(user.getAge()<10){
        AgeLessThan10Exception a = new AgeLessThan10Exception("Age cant be less than 10");
        throw a;
    }
        if(user.getAge()<20){
            AgeLessThan20Exception a = new AgeLessThan20Exception("Age cant be less than 20");
            throw a;
        }
        if(user.getAge()<1){
            AgeInvalidException a = new AgeInvalidException("Age cant be less than 1");
            throw a;
        }
        if(price<0){
            PriceInvalidException a = new PriceInvalidException("Price cant be less than 0");
            throw a;
        }
        if(price<2000){
            PriceInvalidException a = new PriceInvalidException("Price cant be less than 2000");
            throw a;
        }
        if(user.getRating()<3){
            RatingInvalidException a = new RatingInvalidException("Rating cant be less than 3");
            throw a;
        }

    }
    public void watch(User user,double price) throws AgeLessThan10Exception, RatingInvalidException {
        if(user.getRating()<3){
            RatingInvalidException a = new RatingInvalidException("Rating cant be less than 3");
            throw a;
        }
        if(user.getAge()<10){
            AgeLessThan10Exception a = new AgeLessThan10Exception("Age cant be less than 10");
            throw a;
        }

    }
}

package assigmentse;
import java.util.ArrayList;
import java.util.Collection;

import assigmentse.CompositeKey;
import assigmentse.SimpleKey;

public class Helper
{
   public static <E extends SimpleKey> E search(Collection<E> collection, String key)
   {
      for(E e: collection)
      {
         if( e.getKey().equals(key) )
         {
            return e;
         }
      }
      return null;
   }


   public static <E extends CompositeKey> E search(Collection <E> collection,
   																			ArrayList<String> key)
   {
      for(E e: collection)
      {
         if( e.getKey().equals(key))
         {
            return e;
         }
      }
      return null;
   }

}
public class Record
{
   protected int id;
   protected String name;

   public Record(int id, String name)
   {
      this.id = id;
      this.name = name;
   }

   public int getId()
   {
      return this.id;
   }

   public String getName()
   {
      return this.name;
   }
}

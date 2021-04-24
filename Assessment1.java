/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
        System.out.println("Enter no of users");
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
  

        int numberOfUsers = sc.nextInt();
        
        for(int i=0; i< noOfUsers;i++) {
            System.out.println("Enter User Details for user "+(i+1));
            StringTokenizer str = new StringTokenizer(reader.readLine());
            A

        }
        

	}
}


class User
{
   String userId, name,email;
   long mobileNo;

   public User(String userId, String name, String email, long mobileNo) {
	this.userId = userId;
	this.name = name;
	this.email = email;
	this.mobileNo = mobileNo;
   }
}
class Transactions {
  HashMap<String, ArrayList<Record>> owes = new HashMap<String, ArrayList<Record>>();
  HashMap<String, ArrayList<Record>> toReturn = new HashMap<String, ArrayList<Record>>();
  ArrayList<User> users = new ArrayList<User>();
  HashSet<String> userIds = new HashSet<String>();
  
     
  public handleQueries(String query) {
     String[] queryItems = query.split(",");
     
     if(query[0].equals("EXPENSE")) {
       calculateExpense(queryItems);  
     } else if(query[0].equals("SHOW")) {
       showTransactions(queryItems);
     } else {
         throw new Exception("Query not found");
     }
  }
  public boolean insertUsers(User user) {
      if(userIds.contains(user.userId)) {
          System.out.println("User already exist");
          return false;
      } else {
          users.add(user);
          userId.add(user.userId);
      }
      
      return true;
  }
  public calculateExpense(String[] queryItems) {
      userIdOfPaid = queryItems[1];
      amountPaid = queryItems[2];
      noOfUsers = queryItems[3];
      String[] userIds = new String[noOfUsers];
      for(int i=1;i<=noOfUsers;i++) {
        userIds[i-1] = queryItems[3+i];
      } 

      boolean isEqual = (queryItems[3+userIds+1].equals("EQUALS")) ? true : false;
      if(isEqual) {
          calculateIsEqual(userIds, amountPaid, userIdOfPaid)

         else {

      }
      
      
  }
  public calculateIsEqual(String[] userIds, int amountPaid,int userIdOfPaid) {
    int amountToBePaid[] = new int[userIds.length];
    for(int i=0;i<userIds.length;i++) {
        amountToBePaid[i] = amountPaid/userIds.length; 
    }
    calculateOwes(userIds, amountToBePaid, userIdOfPaid);

  }
  public calculateExact((String[] userIds, int amountPaid[],int userIdOfPaid) {
        calculateOwes(userIds, amountToBePaid, userIdOfPaid);
      
  }


  public void calculateOwes(String[] userIds, int amountToBePaid[],int userIdOfPaid) {
 
        if(this.owes.contains(userIdOfPaid)) {
         ArrayList<Record> owesUserIds = owes.get(userIdOfPaid);
            for(int i=0; i < userIds.length; i++) {
                for(int j=0;j<owesUserIds.length;j++) {
                    if(userIds[i].equals(owesUserIds[j].userId ) && userIds[i] != userIdOfPaid) {
                        owesUserIds[j].amount += amountToBePaid[i];
                        break;
                    }
                }
                //if user doesn't exist
                owesUserIds.add(new Record(userIds[i], amountPaid/noOfUsers));
                
            }
        
        } else {

            ArrayList<Record> owesUserIds = new ArrayList<Record>();
            for(int i=0; i < userIds.length; i++) {
                    owesUserIds.add(new Record(userIds[i], amountPaid/noOfUsers));
            }
            this.owes.put(userIdOfPaid, owesUserIds);
                
        }

    }
    public calculateToReturn(String[] userIds, int amountToBePaid[],int userIdOfPaid) {
        for(int i=0;i<usersIds.length;i++) {
            if(userIds == userIdOfPaid) {
                continue;
            }
           
            if(this.toReturn.contains(userIds[i])) {
                ArrayList<Record> toReturnUserIds = this.toReturn.get(userIds[i]);
                for(int toReturnUserIdsCtr = 0; toReturnUserIdsCtr< toReturnUserIds.size(); toReturnUserIdsCtr++) {
                    if(toReturnUserIds.get(toReturnUserIdsCtr).equals(userIdOfPaid)) {
                        toReturnUserIds.get(toReturnUserIdsCtr).amount += amountPaid[i];
                        break;
                    }
                }   

            } else {

                ArrayList<Record> toReturnList = new ArrayList<Record>();
                this.toReturnList.add(new Record(userIdOfPaid, amountToBePaid[i]));
                
                this.toReturn.put(usersIds[i], toReturnList);
                
            }


        }

    }
  

  public showTransactions(String[] queryItems) {
      
  }
	
}

public class Record {
    public String userId;
    public int amount;
    public Record(String userId, int amount) {
        this.userId = userId;
        this.amount = amount;
    }
}

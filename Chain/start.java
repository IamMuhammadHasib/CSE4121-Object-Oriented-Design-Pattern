abstract class Operation
{
    private Operation nextOperation;
 
    public Operation(Operation nextOperation){
        this.nextOperation = nextOperation;
    };
     
    public void operation(Amount request){
        if(nextOperation != null)
            nextOperation.operation(request);
    };
}

class Amount
{
    private int amount;
 
    public Amount(int amount)
    {
        this.amount = amount;
    }
 
    public int getAmount()
    {
        return amount;
    }
 
}

class Manager extends Operation
{
    public Manager(Operation nextOperation){
        super(nextOperation);
         
    }
 
    public void operation(Amount request)
    {
        if (request.getAmount() < 0)
        {
            System.out.println("Manager : " + request.getAmount());
        }
        else
        {
            super.operation(request);
        }
    }
}

class Officer extends Operation
{
    public Officer(Operation nextOperation){
        super(nextOperation);
    }
 
    public void operation(Amount request)
    {
        if (request.getAmount() == 0)
        {
            System.out.println("Officer : " + request.getAmount());
        }
        else
        {
            super.operation(request);
        }
    }
}

class Cashier extends Operation
{
 
    public Cashier(Operation nextOperation){
        super(nextOperation);
    }
 
    public void operation(Amount request)
    {
        if (request.getAmount() > 0)
        {
            System.out.println("Cashier : " + request.getAmount());
        }
        else
        {
            super.operation(request);
        }
    }
}

class start{
    public static void main (String[] args)
    {
        Chain chain = new Chain();

        chain.operation(new Amount(90));
    }
}
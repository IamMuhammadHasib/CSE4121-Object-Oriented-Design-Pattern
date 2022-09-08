public class Chain{
    Operation chain;

    public Chain(){
        createChain();
    }

    private void createChain(){
        chain = new Manager(new Officer(new Cashier(null)));
    }
    
    public void operation(Amount request)
    {
        chain.operation(request);
    }
}

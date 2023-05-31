class node{
    public node prev;
    public node next;
    public final String url;
    public node(final String url){
        this.url = url ;
    }
}

class BrowserHistory {

    public BrowserHistory(String homepage) {
        curr = new node(homepage);
        
    }
    
    public void visit(String url) {
        curr.next = new node(url);
        curr.next.prev=curr;
        curr=curr.next;
    }
    
    public String back(int steps) {
        while(curr.prev!=null && steps-- > 0 ){
            curr = curr.prev;
        }
        return curr.url;
        
    }
    
    public String forward(int steps) {
        while(curr.next!=null && steps-- > 0){
            curr=curr.next;
        }
        return curr.url;
    }
    private node curr;
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

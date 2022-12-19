class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0 ; i<s.length() ; i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else if(ch==')'){
                boolean res=check(st,'(');
                if(res==false) {
                    return false;
                }
            }else if(ch==']'){
                boolean res=check(st,'[');
                if(res==false) {
                    return false;
                }
            }else if(ch=='}'){
                boolean res=check(st,'{');
                if(res==false) {
                    return false;
                }
            }
        }
        if(st.size()==0){
            return true;
        }else{
            return false;
        }
    }
    public boolean check(Stack<Character> st, char ch){
        if(st.size()==0){
            return false;
        }else if(st.peek()!=ch){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}
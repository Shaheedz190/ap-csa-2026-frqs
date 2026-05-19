public String getShortenedName(){
  String str= username;
  while(str.indexOf("-")>-1){
    int x=str.indexOf("-");
    str=str.substring(0,x-1)+str.substring(x+1);
  }
  return str;
}

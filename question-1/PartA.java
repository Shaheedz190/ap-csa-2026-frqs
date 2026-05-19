public Account(String requestedName){
  username=requestedName;
  int x=0;
  while (!isAvailable(requestedName)){
    x++;
    username=requestedName+x.toString();
  }
}

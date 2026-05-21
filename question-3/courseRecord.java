public int moreHistoryThanMath(){
  int count=0;
  for(int h=0;h<historyList.size();h++){
    for(int m=0;m<mathList.size();m++){
      if(historyList.get(h).getStudentID()==mathList.get(m).getStudentID()){
        if(historyList.get(h).getAbsences()>mathList.get(m).getAbsences()){
          count++;
        }
      }
    }
  }
  return count;
}

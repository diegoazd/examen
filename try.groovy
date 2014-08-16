class Period{
  Closure findPeriod = { int currentPeriod, String binaryString ->
    int maxPeriod = maxPeriod(binaryString.size())
    boolean flag = false

    while(currentPeriod <= maxPeriod){
      String head = binaryString.substring(0, currentPeriod)
      String tail = binaryString.substring(currentPeriod, binaryString.size() -1)
      int parts = parts(tail.size(), currentPeriod)
   
      for(int gap = 0; gap < parts; gap++){
        String aux = tail.substring(gap, gap + currentPeriod)
             
        if (head != aux){
          flag = false
          break
        } 
        flag = true 

      }
      if(flag){
        return currentPeriod
      }
      
      currentPeriod++
    
    }
    -1
  }
  
  int parts(int stringLength, int currentPeriod){
    stringLength / currentPeriod
  }
  
  int maxPeriod(int stringLength){
    stringLength / 2
  }
  
  int period(int number){
    String binaryString = Integer.toBinaryString(number)
    Closure obtainPeriod = findPeriod.curry(1)
  
    obtainPeriod(binaryString)    
  }
}

Period period = new Period()
int number1 = 955
int number2 = 102
int number3 = 7
int number4 = 127
int number5 = 60
println "the period is: ${period.period(number1)}"
println "the period is: ${period.period(number2)}"
println "the period is: ${period.period(number3)}"
println "the period is: ${period.period(number4)}"
println "the period is: ${period.period(number5)}"
class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake == true){
            return false;
        }else {
            return true;
        }
       
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake == true){
            return true;
        }else{
            return false;
        }
       
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
          if(archerIsAwake && prisonerIsAwake == true ){
              return false;
          }else if(archerIsAwake && prisonerIsAwake == false){
              return false;
          }else if(archerIsAwake == true){
              return false;
          }else if(prisonerIsAwake == false){
              return false;
          }else{
              return true;
          }
        }
       

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(knightIsAwake && archerIsAwake && prisonerIsAwake && petDogIsPresent == true){
            return false;
        }
        else if(knightIsAwake && archerIsAwake && petDogIsPresent == true){
            return false;
        }else if(knightIsAwake == true){
            if(petDogIsPresent == false){
                return false;
            }
        }else if(archerIsAwake == true){
            return false;
        }else if(knightIsAwake == false){
            if(archerIsAwake == false){
                if(prisonerIsAwake == false){
                    if(petDogIsPresent == false){
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}

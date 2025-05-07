package methods;

public class SpaceRocketLauncher {
    private int bigRocketCount;
    private int smallRocketCount;

    public void setBigRocketCount(int bigRocketCount){
        if(bigRocketCount < 0 || bigRocketCount > 100){
            System.out.println("Invalid big rocket count. Must be between 0 and 100.");
        }
    }

    public int getBigRocketCount(){
        return bigRocketCount;
    }

    public void setSmallRocketCount(int smallRocketCount){
        if(smallRocketCount < 0 || smallRocketCount > 100){
            System.out.println("Invalid small rocket count. Must be between 0 and 100.");

        }
    }

    public int getSmallRocketCount(){
        return smallRocketCount;
    }

    public void launchBigRocket(){
        if (bigRocketCount > 0){
            bigRocketCount--;
            System.out.println("Launch big rocket");
        }

    }
    public void launchSmallRocket(){
        if (smallRocketCount > 0){
            smallRocketCount--;
            System.out.println("Launch small rocket");
        }
    }

    public int getTotalPower(){
        int smallRocketTotal = smallRocketCount*50;
        int bigRocketTotal = bigRocketCount * 100;
        return smallRocketTotal + bigRocketTotal;
    }

}

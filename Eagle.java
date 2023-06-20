public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }
    
    public void setAltitude(int altitude) {
        this.altitude =  altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
   @Override
    public void takeOff() {
        System.out.println(this.getName() + " takes off in the sky.");
    }
    
    @Override
    public void land(){
		if(this.getAltitude()<2){
		System.out.println(this.getName() + " lands on the ground.");
		}
		else{
		System.out.println(this.getName() + " is too high, it can't land.");	
			}
	}	

		
	@Override
    public void descend(int alt){
		this.setAltitude(this.getAltitude() - alt);
    System.out.println(this.getName() + " flies downward, altitude: " + this.getAltitude());
		}
		
	@Override
    public void ascend(int alt){
		this.setAltitude(this.getAltitude() + alt);
    System.out.println(this.getName() + " flies upward, altitude: " + this.getAltitude());
		}
    	
 }

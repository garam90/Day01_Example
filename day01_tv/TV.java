package day01_tv;

public class TV {

	int channel;
	int volume;
	boolean power;
	
	public void channelUp(){
		channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void volumeUp(){
		volume++;
	}
	public void volumeDown(){
		volume--;
	}
	public void powerOn(){
		this.power = true;
	}
	public void powerOff(){
		this.power = false;
	}
	public void setChannel(int channel){
		this.channel = channel;
	}
	public int getChannel(){
		return channel;
	}
	public boolean isPower(){
		return power;
	}
	public int getVolume(){
		return volume;
	}
	
}

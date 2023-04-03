package oops;
interface TvRemote{
	public void tvremote();
}
interface SmartTvRemote extends TvRemote{
	public void Remote();
}
class TV implements SmartTvRemote{

	@Override
	public void Remote() {
		System.out.println("SmartTvRemote");
		
	}

	@Override
	public void tvremote() {
		System.out.println("TvRemote");
		
	}
	
}
public class Interpgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTvRemote ob=new TV();
		ob.Remote();
	ob.tvremote();
		
	}

}

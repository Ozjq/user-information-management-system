
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{
	RegistForm registForm;
	public MyListener(RegistForm registForm){
		this.registForm=registForm;
	}
	public MyListener(){
	}
	@Override
	public void actionPerformed(ActionEvent e){

		// getAllInfo
		System.out.println ("点击了按钮");
		System.out.println (registForm.getName ());
		System.out.println (registForm.getPwd ());
		System.out.println (registForm.getAge ());
		System.out.println (registForm.getBirthday ());
		System.out.println (registForm.getEmail ());
		System.out.println (registForm.getPhone ());
		System.out.println (registForm.getScore ());
		System.out.println (registForm.getAddress ());

	}
}

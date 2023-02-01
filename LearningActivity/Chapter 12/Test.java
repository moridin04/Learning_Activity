import javax.swing.JOptionPane;

public class Test
{
	public static void main(String[] args)
	{
		String password = JOptionPane.showInputDialog(null, "Enter your password", "Input",
				JOptionPane.QUESTION_MESSAGE);

		if (password.equals("AMU"))
		{
			JOptionPane.showMessageDialog(null, "PASSWORD ACCEPTED", "Message", JOptionPane.INFORMATION_MESSAGE);
		} else if (password.equals("amu"))
		{
			JOptionPane.showMessageDialog(null, "PASSWORD ACCEPTED", "Message", JOptionPane.INFORMATION_MESSAGE);
		} else
			JOptionPane.showMessageDialog(null, "INVALID PASSWORD", "Message", JOptionPane.ERROR_MESSAGE);

	}
}

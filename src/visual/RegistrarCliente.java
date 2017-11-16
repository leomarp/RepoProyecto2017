package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistrarCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtnombre;
	private JTextField txtapellido;
	private JTextField txtcedula;
	private JTextField txttelefono;
	private JTextField txtdireccion;
	private JTextField txtcorreo;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		try {
			RegistrarCliente dialog = new RegistrarCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public RegistrarCliente() {
		setTitle("Registrar cliente");
		setResizable(false);
		setBounds(100, 100, 338, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JPanel panel = new JPanel();
			panel.setBorder(new TitledBorder(null, "Informaci\u00F3n del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			contentPanel.add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel lblNombre = new JLabel("Nombre:");
			lblNombre.setBounds(10, 40, 46, 14);
			panel.add(lblNombre);
			{
				txtnombre = new JTextField();
				txtnombre.setBounds(66, 37, 86, 20);
				panel.add(txtnombre);
				txtnombre.setColumns(10);
			}
			{
				JLabel lblApellido = new JLabel("Apellido:");
				lblApellido.setBounds(162, 40, 46, 14);
				panel.add(lblApellido);
			}
			{
				txtapellido = new JTextField();
				txtapellido.setBounds(218, 37, 86, 20);
				panel.add(txtapellido);
				txtapellido.setColumns(10);
			}
			{
				JLabel lblCedula = new JLabel("Cedula:");
				lblCedula.setBounds(10, 98, 46, 14);
				panel.add(lblCedula);
			}
			
			JLabel lblNewLabel = new JLabel("Telefono:");
			lblNewLabel.setBounds(162, 98, 46, 14);
			panel.add(lblNewLabel);
			
			txtcedula = new JTextField();
			txtcedula.setBounds(66, 95, 86, 20);
			panel.add(txtcedula);
			txtcedula.setColumns(10);
			
			txttelefono = new JTextField();
			txttelefono.setBounds(218, 95, 86, 20);
			panel.add(txttelefono);
			txttelefono.setColumns(10);
			
			JLabel lblDireccion = new JLabel("Direccion:");
			lblDireccion.setBounds(10, 145, 63, 14);
			panel.add(lblDireccion);
			
			txtdireccion = new JTextField();
			txtdireccion.setBounds(66, 142, 238, 20);
			panel.add(txtdireccion);
			txtdireccion.setColumns(10);
			
			JLabel lblCorreoElectronico = new JLabel("Correo:");
			lblCorreoElectronico.setBounds(10, 185, 46, 14);
			panel.add(lblCorreoElectronico);
			
			txtcorreo = new JTextField();
			txtcorreo.setBounds(66, 182, 238, 20);
			panel.add(txtcorreo);
			txtcorreo.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Guardar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}

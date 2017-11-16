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
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;

public class RegistrarProducto extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtcodigo;
	private JTextField txtmodelo;
	private JTextField txtmarca;
	private JTextField txtNumeroSerie;
	private JTextField txtpreciocompra;
	private JTextField txtprecioventa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistrarProducto dialog = new RegistrarProducto();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistrarProducto() {
		setTitle("Registrar productos");
		setResizable(false);
		setBounds(100, 100, 450, 425);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Datos del Producto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 424, 341);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panelDiscoDuro = new JPanel();
		panelDiscoDuro.setBorder(new TitledBorder(null, "Caracteristicas del Disco Duro", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDiscoDuro.setBounds(10, 204, 404, 126);
		panel.add(panelDiscoDuro);
		panelDiscoDuro.setLayout(null);
		
		JLabel lblCapacidad_1 = new JLabel("Capacidad (Gb):");
		lblCapacidad_1.setBounds(10, 26, 91, 14);
		panelDiscoDuro.add(lblCapacidad_1);
		
		JComboBox cbxCapacidadDiscoDuro = new JComboBox();
		cbxCapacidadDiscoDuro.setBounds(97, 23, 91, 20);
		panelDiscoDuro.add(cbxCapacidadDiscoDuro);
		
		JLabel lblTipoDeConexion = new JLabel("Tipo de conexion:");
		lblTipoDeConexion.setBounds(10, 62, 91, 14);
		panelDiscoDuro.add(lblTipoDeConexion);
		
		JComboBox cbxTipoConexionDiscoDuro = new JComboBox();
		cbxTipoConexionDiscoDuro.setBounds(107, 59, 81, 20);
		panelDiscoDuro.add(cbxTipoConexionDiscoDuro);
		
		JLabel lblVelocidadrpm = new JLabel("Velocidad (RPM):");
		lblVelocidadrpm.setBounds(10, 101, 91, 14);
		panelDiscoDuro.add(lblVelocidadrpm);
		
		JComboBox cbxVelocidadDiscoDuro = new JComboBox();
		cbxVelocidadDiscoDuro.setBounds(97, 95, 91, 20);
		panelDiscoDuro.add(cbxVelocidadDiscoDuro);
		
		JPanel panelMemoriaRam = new JPanel();
		panelMemoriaRam.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Caracteristicas de la Memoria Ram", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMemoriaRam.setBounds(10, 204, 404, 126);
		panel.add(panelMemoriaRam);
		panelMemoriaRam.setLayout(null);
		
		JLabel lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(10, 25, 91, 14);
		panelMemoriaRam.add(lblCapacidad);
		
		JComboBox cbxCapacidadDeRam = new JComboBox();
		cbxCapacidadDeRam.setBounds(78, 22, 91, 20);
		panelMemoriaRam.add(cbxCapacidadDeRam);
		
		JLabel lblVelocidadmhz = new JLabel("Velocidad (MHZ):");
		lblVelocidadmhz.setBounds(10, 60, 91, 14);
		panelMemoriaRam.add(lblVelocidadmhz);
		
		JComboBox cbxVelocidadDeRam = new JComboBox();
		cbxVelocidadDeRam.setBounds(105, 57, 64, 20);
		panelMemoriaRam.add(cbxVelocidadDeRam);
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setBounds(10, 98, 82, 14);
		panelMemoriaRam.add(lblTipo);
		
		JComboBox cbxTipoDeRam = new JComboBox();
		cbxTipoDeRam.setBounds(42, 95, 91, 20);
		panelMemoriaRam.add(cbxTipoDeRam);
		
		JPanel panelMicroProcesador = new JPanel();
		panelMicroProcesador.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Caracteristicas del MicroProcesador", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelMicroProcesador.setBounds(10, 204, 404, 126);
		panel.add(panelMicroProcesador);
		panelMicroProcesador.setLayout(null);
		
		JLabel lblTipoDeSocket_1 = new JLabel("Tipo de Socket:");
		lblTipoDeSocket_1.setBounds(10, 34, 91, 14);
		panelMicroProcesador.add(lblTipoDeSocket_1);
		
		JComboBox cbxSocketProcesador = new JComboBox();
		cbxSocketProcesador.setBounds(89, 28, 116, 20);
		panelMicroProcesador.add(cbxSocketProcesador);
		
		JLabel lblVelocidad = new JLabel("Velocidad(GHZ):");
		lblVelocidad.setBounds(10, 79, 81, 14);
		panelMicroProcesador.add(lblVelocidad);
		
		JComboBox cbxVelocidadProcesador = new JComboBox();
		cbxVelocidadProcesador.setBounds(89, 73, 116, 20);
		panelMicroProcesador.add(cbxVelocidadProcesador);
		
		JPanel panelTarjetaMadre = new JPanel();
		panelTarjetaMadre.setBorder(new TitledBorder(null, "Caracteristicas de la Tarjeta Madre", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelTarjetaMadre.setBounds(10, 204, 404, 126);
		panel.add(panelTarjetaMadre);
		panelTarjetaMadre.setLayout(null);
		
		JLabel lblTipoDeConector = new JLabel("Tipo de conector:");
		lblTipoDeConector.setBounds(10, 26, 91, 14);
		panelTarjetaMadre.add(lblTipoDeConector);
		
		JComboBox cbxTipoConectorTarjetaMa = new JComboBox();
		cbxTipoConectorTarjetaMa.setBounds(102, 23, 91, 20);
		panelTarjetaMadre.add(cbxTipoConectorTarjetaMa);
		
		JLabel lblTipoDeRam = new JLabel("Tipo de Ram:");
		lblTipoDeRam.setBounds(10, 62, 82, 14);
		panelTarjetaMadre.add(lblTipoDeRam);
		
		JComboBox cbxTipoSoporteRam = new JComboBox();
		cbxTipoSoporteRam.setBounds(102, 59, 91, 20);
		panelTarjetaMadre.add(cbxTipoSoporteRam);
		
		JLabel lblTipoDeSocket = new JLabel("Tipo de Socket:");
		lblTipoDeSocket.setBounds(10, 101, 82, 14);
		panelTarjetaMadre.add(lblTipoDeSocket);
		
		JComboBox cbxTipoDeSocketMadre = new JComboBox();
		cbxTipoDeSocketMadre.setBounds(102, 95, 91, 20);
		panelTarjetaMadre.add(cbxTipoDeSocketMadre);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 30, 46, 14);
		panel.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(10, 66, 46, 14);
		panel.add(lblModelo);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 104, 46, 14);
		panel.add(lblCodigo);
		
		txtcodigo = new JTextField();
		txtcodigo.setBounds(53, 101, 86, 20);
		panel.add(txtcodigo);
		txtcodigo.setColumns(10);
		
		txtmodelo = new JTextField();
		txtmodelo.setBounds(53, 63, 86, 20);
		panel.add(txtmodelo);
		txtmodelo.setColumns(10);
		
		txtmarca = new JTextField();
		txtmarca.setBounds(53, 27, 86, 20);
		panel.add(txtmarca);
		txtmarca.setColumns(10);
		
		JLabel lblNumeroDeSerie = new JLabel("Numero de Serie:");
		lblNumeroDeSerie.setBounds(170, 30, 92, 14);
		panel.add(lblNumeroDeSerie);
		
		txtNumeroSerie = new JTextField();
		txtNumeroSerie.setBounds(261, 27, 153, 20);
		panel.add(txtNumeroSerie);
		txtNumeroSerie.setColumns(10);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(170, 66, 63, 14);
		panel.add(lblCantidad);
		
		JSpinner spnCantidad = new JSpinner();
		spnCantidad.setBounds(261, 63, 63, 20);
		panel.add(spnCantidad);
		
		JLabel lblPrecioDeCompra = new JLabel("Precio de Compra:");
		lblPrecioDeCompra.setBounds(170, 104, 92, 14);
		panel.add(lblPrecioDeCompra);
		
		txtpreciocompra = new JTextField();
		txtpreciocompra.setBounds(261, 101, 86, 20);
		panel.add(txtpreciocompra);
		txtpreciocompra.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Precio de Venta:");
		lblNewLabel.setBounds(170, 142, 86, 14);
		panel.add(lblNewLabel);
		
		txtprecioventa = new JTextField();
		txtprecioventa.setBounds(261, 139, 86, 20);
		panel.add(txtprecioventa);
		txtprecioventa.setColumns(10);
		
		JLabel lblTipoDeProducto = new JLabel("Tipo de Producto:");
		lblTipoDeProducto.setBounds(10, 142, 92, 14);
		panel.add(lblTipoDeProducto);
		
		JComboBox cbxTipoDeProducto = new JComboBox();
		cbxTipoDeProducto.setModel(new DefaultComboBoxModel(new String[] {"", "Tarjeta Madre", "Disco Duro", "Memoria Ram", "MicroProcesador"}));
		cbxTipoDeProducto.setBounds(10, 167, 129, 20);
		panel.add(cbxTipoDeProducto);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
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

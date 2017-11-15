package visual;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.jtattoo.plaf.JTattooUtilities;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private Dimension dim;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setResizable(false);
		setTitle("Soluciones El Final");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		dim = super.getToolkit().getScreenSize();
		super.setSize(dim.width-0, dim.height-40);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnClientes = new JMenu("Clientes");
		menuBar.add(mnClientes);
		
		JMenuItem mntmRegistrarCliente = new JMenuItem("Registrar Cliente");
		mntmRegistrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarCliente reg = new RegistrarCliente();
				reg.setModal(true);
				reg.setLocationRelativeTo(null);
				reg.setVisible(true);
			}
		});
		mnClientes.add(mntmRegistrarCliente);
		
		JMenuItem mntmListarClientes = new JMenuItem("Listar Clientes");
		mntmListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarCliente list = new ListarCliente();
				list.setModal(true);
				list.setLocationRelativeTo(null);
				list.setVisible(true);
			}
		});
		mnClientes.add(mntmListarClientes);
		
		JMenu mnProductos = new JMenu("Productos");
		menuBar.add(mnProductos);
		
		JMenuItem mntmRegistrarProductos = new JMenuItem("Registrar productos");
		mntmRegistrarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrarProducto reg = new RegistrarProducto();
				reg.setModal(true);
				reg.setLocationRelativeTo(null);
				reg.setVisible(true);
			}
		});
		mnProductos.add(mntmRegistrarProductos);
		
		JMenuItem mntmListarProductos = new JMenuItem("Listar productos");
		mntmListarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarProducto list = new ListarProducto();
				list.setModal(true);
				list.setLocationRelativeTo(null);
				list.setVisible(true);
							
			}
		});
		mnProductos.add(mntmListarProductos);
		
		JMenu mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		JMenuItem mntmCrearFactura = new JMenuItem("Crear factura");
		mntmCrearFactura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CrearFactura reg = new CrearFactura();
				reg.setModal(true);
				reg.setLocationRelativeTo(null);
				reg.setVisible(true);
			}
		});
		mnVentas.add(mntmCrearFactura);
		
		JMenuItem mntmListarFacturas = new JMenuItem("Listar Facturas");
		mntmListarFacturas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarFactura list = new ListarFactura();
				list.setModal(true);
				list.setLocationRelativeTo(null);
				list.setVisible(true);
			}
		});
		mnVentas.add(mntmListarFacturas);
		
		JMenu mnCombos = new JMenu("Combos");
		menuBar.add(mnCombos);
		
		JMenu mnInventario = new JMenu("Inventario");
		menuBar.add(mnInventario);
		
		JMenuItem mntmInventario = new JMenuItem("Inventario");
		mntmInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inventario invent = new Inventario();
				invent.setModal(true);
				invent.setLocationRelativeTo(null);
				invent.setVisible(true);
				
			}
		});
		mnInventario.add(mntmInventario);
		
		JMenuItem mntmOrdenesDeCompras = new JMenuItem("Ordenes de compras");
		mntmOrdenesDeCompras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OrdenesCompra ordenCompra = new OrdenesCompra();
				ordenCompra.setModal(true);
				ordenCompra.setLocationRelativeTo(null);
				ordenCompra.setVisible(true);
				
			}
		});
		mnInventario.add(mntmOrdenesDeCompras);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
	}
}

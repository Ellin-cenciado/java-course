package lm.zona_fit.gui;

import lm.zona_fit.modelo.Cliente;
import lm.zona_fit.servicio.ClienteServicio;
import lm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//@Component
public class ZonaFitForma extends JFrame{
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField membresiaField;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;
    private Integer idCliente;


    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForma();
        guardarButton.addActionListener(e -> guardarCliente());

        eliminarButton.addActionListener(e -> eliminarCliente());

        limpiarButton.addActionListener(e -> limpiarFormulario());

        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
    }

    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        //this.tablaModeloClientes = new DefaultTableModel(0,4);
        this.tablaModeloClientes = new DefaultTableModel(0,4){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] cabeceros = {"Id","Nombre","Apellido","Membresia"};
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(tablaModeloClientes);
        //Restringimos la seleccion de multiples entradas
        this.clientesTabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Cargar listado de clientes
        listarClientes();
    }

    private void listarClientes(){
        this.tablaModeloClientes.setRowCount(0);
        var clientes = this.clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            Object[] renglonCliente = {
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            this.tablaModeloClientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente(){
        if(nombreField.getText().equals("")){
            mostrarMensaje("Proporciona un nombre");
            nombreField.requestFocusInWindow();
            return;
        }
        if (membresiaField.getText().equals("")){
            mostrarMensaje("Proporciona una membresia");
            membresiaField.requestFocusInWindow();
            return;
        }

        //Recuperamos los valores del formulario
        var nombre = nombreField.getText();
        var apellido = apellidoField.getText();
        var membresia = Integer.parseInt(membresiaField.getText());
        var cliente = new Cliente(this.idCliente,nombre,apellido,membresia);
        this.clienteServicio.guardarCliente(cliente); //Inserta el cliente

        if (this.idCliente == null){
            mostrarMensaje("Se agrego un nuevo cliente");
        }else{
            mostrarMensaje("Se actualizo el cliente");
        }
        limpiarFormulario();
        listarClientes();

    }

    private void cargarClienteSeleccionado(){
        var renglon = clientesTabla.getSelectedRow();
        if (renglon != -1){ //-1 significa que no se selecciono ningun registro
            var id = clientesTabla.getModel().getValueAt(renglon,0).toString();
            var nombre = clientesTabla.getModel().getValueAt(renglon,1).toString();
            var apellido = clientesTabla.getModel().getValueAt(renglon,2).toString();
            var membresia = clientesTabla.getModel().getValueAt(renglon,3).toString();

            this.idCliente = Integer.parseInt(id);
            this.nombreField.setText(nombre);
            this.apellidoField.setText(apellido);
            this.membresiaField.setText(membresia);
        }
        else{
            mostrarMensaje("No se selecciono ningun registro");
        }
    }

    private void eliminarCliente(){

        var renglon = clientesTabla.getSelectedRow();
        if (renglon != -1){
            var id = clientesTabla.getModel().getValueAt(renglon,0).toString();
            this.idCliente = Integer.parseInt(id);

            Cliente dummy = new Cliente(this.idCliente, null, null, null);
            this.clienteServicio.eliminarCliente(dummy);
            mostrarMensaje("Cliente eliminado");
            limpiarFormulario();
            listarClientes();

        }else{
            mostrarMensaje("No se selecciono ninguna entrada");
        }

    }

    private void limpiarFormulario(){
        nombreField.setText("");
        apellidoField.setText("");
        membresiaField.setText("");
        this.idCliente = null;
        //Deseleccionamos el registro
        this.clientesTabla.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this,mensaje);
    }

}

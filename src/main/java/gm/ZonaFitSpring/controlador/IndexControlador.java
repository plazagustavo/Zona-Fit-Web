package gm.ZonaFitSpring.controlador;

import gm.ZonaFitSpring.Modelo.Cliente;
import gm.ZonaFitSpring.Servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import java.util.List;
import lombok.Data;
import org.primefaces.PrimeFaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@ViewScoped
public class IndexControlador {

    @Autowired
    IClienteServicio clienteServicio;

    private List<Cliente> clientes;
    private Cliente clienteSeleccionado;
    private static final Logger logger
            = LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct
    public void init() {
        cargarDatos();

    }

    public void cargarDatos() {
        this.clientes = this.clienteServicio.listarCliente();
        this.clientes.forEach(cliente -> logger.info(cliente.toString()));
    }

    public void agregarCliente() {
        this.clienteSeleccionado = new Cliente();

    }

    public void guardarCliente() {
        logger.info("cliente guardado: " + this.clienteSeleccionado);
        //Agregar
        if (this.clienteSeleccionado.getId() == null) {
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            this.clientes.add(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cliente Agregado"));

        } //editar
        else {
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cliente actualizado"));
        }
        //ocultar la ventana modal
        PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");

        //Actualizar tabla
        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                "forma-clientes:clientes-tabla");

        //Reset
        this.clienteSeleccionado = null;
    }

    public void eliminarCliente() {
        logger.info("Cliente eliminado: " + this.clienteSeleccionado);

        this.clienteServicio.eliminarCliente(this.clienteSeleccionado);

        // quitar de la lista que usa la tabla
        this.clientes.remove(this.clienteSeleccionado);

        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cliente eliminado"));

        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                "forma-clientes:clientes-tabla");

        this.clienteSeleccionado = null;
    }

}

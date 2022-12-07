/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import Modelo.EmpleadoDAO;
import Modelo.Proveedor;
import Modelo.ProveedorDAO;
import Modelo.Comprobante;
import Modelo.ComprobanteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nelynoe
 */
public class Controlador extends HttpServlet {

    Empleado em = new Empleado();
    EmpleadoDAO edao = new EmpleadoDAO();
    Proveedor pro = new Proveedor();
    ProveedorDAO pdao = new ProveedorDAO();
    Comprobante comp = new Comprobante();
    ComprobanteDAO cdao = new ComprobanteDAO();
    int ide;
    int idpr;
    int idc;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");
//        switch (accion) {
//            case "Principal":
//                request.getRequestDispatcher("principal.jsp").forward(request, response);
//                break;
//            case "Proveedor":
//                request.getRequestDispatcher("proveedores.jsp").forward(request, response);
//                break;
//            case "Empleado":
//                request.getRequestDispatcher("empleado.jsp").forward(request, response);
//                break;
//            case "Comprobante":
//                request.getRequestDispatcher("comprobante.jsp").forward(request, response);
//                break;
//            case "NuevoComprobante":
//                request.getRequestDispatcher("RegistrarComprob.jsp").forward(request, response);
//                break;
//                
//            default:
//                throw new AssertionError();
//        }
        if (menu.equals("Principal")) {
            request.getRequestDispatcher("principal.jsp").forward(request, response);
        }
        if (menu.equals("Proveedor")) {
            switch (accion) {
                case "Listar":
                    List lista = pdao.listar();
                    request.setAttribute("proveedores", lista);
                    break;
                case "Agregar":
                    String ruc = request.getParameter("txtRUC");
                    String nomp = request.getParameter("txtNomp");
                    String dirp = request.getParameter("txtDirp");
                    String email = request.getParameter("txtEmail");
                    String telp = request.getParameter("txtTelp");
                    String estp = request.getParameter("txtEstp");
                    pro.setRUC(ruc);
                    pro.setNomp(nomp);
                    pro.setDirp(dirp);
                    pro.setEmail(email);
                    pro.setTelp(telp);
                    pro.setEstp(estp);
                    pdao.agregar(pro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idpr = Integer.parseInt(request.getParameter("idp"));
                    Proveedor p = pdao.listarId(idpr);
                    request.setAttribute("proveedor", p);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String ruc1 = request.getParameter("txtRUC");
                    String nomp1 = request.getParameter("txtNomp");
                    String dirp1 = request.getParameter("txtDirp");
                    String email1 = request.getParameter("txtEmail");
                    String telp1 = request.getParameter("txtTelp");
                    String estp1 = request.getParameter("txtEstp");
                    pro.setRUC(ruc1);
                    pro.setNomp(nomp1);
                    pro.setDirp(dirp1);
                    pro.setEmail(email1);
                    pro.setTelp(telp1);
                    pro.setEstp(estp1);
                    pro.setIdp(idpr);
                    pdao.actualizar(pro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idpr = Integer.parseInt(request.getParameter("idp"));
                    pdao.delete(idpr);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("proveedores.jsp").forward(request, response);
        }
        if (menu.equals("Empleado")) {
            switch (accion) {
                case "Listar":
                    List lista = edao.listar();
                    request.setAttribute("empleados", lista);
                    break;
                case "Agregar":
                    String dni = request.getParameter("txtDni");
                    String nom = request.getParameter("txtNombres");
                    String tel = request.getParameter("txtTel");
                    String user = request.getParameter("txtUsuario");
                    String est = request.getParameter("txtestado");
                    em.setDni(dni);
                    em.setNom(nom);
                    em.setTel(tel);
                    em.setUser(user);
                    em.setEstado(est);
                    edao.agregar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    ide = Integer.parseInt(request.getParameter("id"));
                    Empleado e = edao.listarId(ide);
                    request.setAttribute("empleado", e);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String dni1 = request.getParameter("txtDni");
                    String nom1 = request.getParameter("txtNombres");
                    String tel1 = request.getParameter("txtTel");
                    String user1 = request.getParameter("txtUsuario");
                    String est1 = request.getParameter("txtestado");
                    em.setDni(dni1);
                    em.setNom(nom1);
                    em.setTel(tel1);
                    em.setUser(user1);
                    em.setEstado(est1);
                    em.setId(ide);
                    edao.actualizar(em);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    ide = Integer.parseInt(request.getParameter("id"));
                    edao.delete(ide);
                    request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("empleado.jsp").forward(request, response);
        }
        if (menu.equals("Comprobante")) {
            switch (accion) {
                case "Listar":
                    List lista = cdao.listar();
                    request.setAttribute("comprobantes", lista);
                    break;
                case "Agregar":
                    String nrocomp = request.getParameter("txtNroComp");
//                    Date fecemi = request.getParameter("txtFecEmi");
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fecemi = LocalDate.parse("txtFecEmi",formato);
                    String nroorden = request.getParameter("txtNroOrden");
                    String estc = request.getParameter("txtEstc");
                    comp.setNroComp(nrocomp);
                    comp.setFecemi(fecemi);
                    comp.setNroOrden(nroorden);
                    comp.setEstc(estc);
                    cdao.agregar(comp);
                    request.getRequestDispatcher("Controlador?menu=Comprobante&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idc = Integer.parseInt(request.getParameter("idc"));
                    Comprobante c = cdao.listarId(idc);
                    request.setAttribute("comprobante", c);
                    request.getRequestDispatcher("Controlador?menu=Comprobante&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String nrocomp1 = request.getParameter("txtNroComp");
                    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate fecemi1 = LocalDate.parse("txtFecEmi",formato);
                    String nroorden1 = request.getParameter("txtNroOrden");
                    String estc1 = request.getParameter("txtEstc");
                    comp.setNroComp(nrocomp1);
                    comp.setFecEmi(LocalDate fecemi1);
                    comp.setNroOrden(nroorden1);
                    comp.setEstc(estc1);
                    comp.setIdc(idc);
                    cdao.actualizar(comp);
                    request.getRequestDispatcher("Controlador?menu=Comprobante&accion=Listar").forward(request, response);
                    break;
                case "Delete":
                    idc = Integer.parseInt(request.getParameter("idc"));
                    cdao.delete(idc);
                    request.getRequestDispatcher("Controlador?menu=Comprobante&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("comprobante.jsp").forward(request, response);
        }
        if (menu.equals("NuevoComprobante")) {
            request.getRequestDispatcher("RegistrarComprob.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

package UI;

import Data.Registro;
import Data.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.JOptionPane;

public class UI {
    public static ArrayList<String> CargarDatos(){
        ArrayList<String> datosCargados = new ArrayList<>();
        File entrada;
        try {
            entrada = new File("Datos.csv");
            FileReader archivolector = new FileReader(entrada);
            BufferedReader lector = new BufferedReader(archivolector);
            String pass = lector.readLine();
            while(pass == null){
                pass = JOptionPane.showInputDialog("Asigne una contraseña de ingreso");
                String prueba = JOptionPane.showInputDialog("Repita la contraseña");
                if(!pass.equals(prueba)) pass = null;
            }
            datosCargados.add(pass);
            while((pass = lector.readLine()) != null){
                datosCargados.add(pass);
            }
            guardarDatos(datosCargados);
            return datosCargados;
        } catch (IOException e) {
            String pass = null;
            while(pass == null){
                pass = JOptionPane.showInputDialog("Asigne una contraseña de ingreso");
                String prueba = JOptionPane.showInputDialog("Repita la contraseña");
                if(!pass.equals(prueba)) pass = null;
                else{
                    datosCargados.add(pass);
                    guardarDatos(datosCargados);
                }
            }
            return datosCargados;
        }
    }
    
    public static Registro cargarRegistro(String dir){
        Registro carga;
        File entrada;
        try {
            entrada = new File(dir);
            FileReader archivolector = new FileReader(entrada);
            BufferedReader lector = new BufferedReader(archivolector);
            int tamaño = Integer.parseInt(lector.readLine());
            ArrayList<Cliente> clis = new ArrayList<>();
            for(int i = 0; i < tamaño; i++){
                String nombre = lector.readLine();
                int id = Integer.parseInt(lector.readLine());
                boolean estado =  Boolean.parseBoolean(lector.readLine());
                int valor = Integer.parseInt(lector.readLine());
                String fecha = lector.readLine();
                int cuotas = Integer.parseInt(lector.readLine());
                int numpago = Integer.parseInt(lector.readLine());
                ArrayList<AbstractMap.SimpleEntry<Integer, String>> historia = new ArrayList<>();
                String val;
                while(!"end".equals(val = lector.readLine())){
                    historia.add(new AbstractMap.SimpleEntry<>(Integer.parseInt(val), lector.readLine()));
                }
                clis.add(new Cliente(nombre, id, estado, valor, fecha, cuotas, numpago, historia));
            }
            int cartera = Integer.parseInt(lector.readLine());
            int prestamo = Integer.parseInt(lector.readLine());
            int recibido = Integer.parseInt(lector.readLine());
            ArrayList<AbstractMap.SimpleEntry<String, int[]>> regant = new ArrayList<>();
            String val;
            while(!"end".equals(val = lector.readLine())){
                int[] a = new int[3];
                String[] b = lector.readLine().split(" ");
                for(int i = 0; i < 3; i++) a[i] = Integer.parseInt(b[i]);
                regant.add(new AbstractMap.SimpleEntry<>(val, a));
            }
            carga = new Registro(clis, cartera, prestamo, recibido, regant);
            return carga;
        } catch (IOException | NumberFormatException e) {
            carga = new Registro(new ArrayList<>(), 0, 0, 0, new ArrayList<>());
            return carga;
        }
    }
    
    public static TreeMap<String, Cliente> mapaClientes(ArrayList<Cliente> contactos){
        try{
            TreeMap<String, Cliente> mapaDeContactos = new TreeMap<>();
            for(int i = 0; i < contactos.size(); i++){
                mapaDeContactos.put(contactos.get(i).getNombre(), contactos.get(i));
            }
            return mapaDeContactos;
        }
        catch(Exception ex){
            return null;
        }
    }
    
    public static String[] nombreClientes(TreeMap<String, Cliente> mapaDeContactos){
        String[] contactos;
        try{    
            Set<String> keys = mapaDeContactos.keySet();
            contactos = keys.toArray(new String[mapaDeContactos.size()]);
            if(contactos.length == 0){
                contactos = new String[1];
                contactos[0] = "No hay Clientes";
            }
            return contactos;
        }catch(Exception ex){
            contactos = new String[1];
            contactos[0] = "No hay Clientes";
            return contactos;
        }
    }
    
    public static String guardarRegistro(Registro agenda, String dir){
        FileWriter guardar;
        try {
            guardar = new FileWriter(dir);
            guardar.write(agenda.toString());
            guardar.close();
            String respuesta = "El registro se guardo correctamente";
            return respuesta;
        } catch (IOException e) {
            String respuesta = "Fallo al guargar el registro" ;
            return respuesta;
        }
    }
    
    public static String guardarDatos(ArrayList<String> dato){
        FileWriter guardar;
        try {
            guardar = new FileWriter("Datos.csv");
            for(String i: dato) guardar.write(i+'\n');
            guardar.close();
            String respuesta = "La contraseña se cambio satisfactoriamente";
            return respuesta;
        } catch (IOException e) {
            String respuesta = "Fallo al cambiar contraseña";
            return respuesta;
        }
    }
    
    public static int prestotal(Registro r){
        int total = 0;
        for(AbstractMap.SimpleEntry i : r.getRegant()){
            total += ((int[]) i.getValue())[1];
        }
        total += r.getPrestado();
        return total;
    }
}
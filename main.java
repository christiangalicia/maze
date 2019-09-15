/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividad;

/**
 *
 * @author christian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ejemplo e = new Ejemplo();
       
       e.metodoRecursivo(5);
       
        System.out.println(e.sumatoria(4));
        
        Maze maze = new Maze();
        System.out.println(maze);
        if(maze.traverse(0, 0)){
            System.out.println("Successfully");
        }else{
            System.out.println("there is no possible path");
        }
        System.out.println(maze);
    }
    
}

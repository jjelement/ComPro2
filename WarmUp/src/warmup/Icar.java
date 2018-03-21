/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup;

/**
 *
 * @author INT105
 */
public class Icar extends Car{

    public Icar(double time) {
        super(time);
    }

    @Override
    public boolean start() {
        return false;
    
    }

    @Override
    public double Speed() {
        return 0;
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseproject.layoutcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hthoma
 */
public class MainViewController implements Initializable {




@FXML private Menu moreselect;
@FXML private MenuItem helpselect;   


      @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }  
    
    @FXML
    private void handleMenuClick(ActionEvent event) throws InterruptedException{
        //WHY DOES THIS NOT WORK?
        MenuItem target  = (MenuItem) event.getSource();
        System.out.println("TEST " + target.getId());
    
    }
    
    
    
    
}
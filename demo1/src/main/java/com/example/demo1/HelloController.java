package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

import java.io.File;

public class HelloController {
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;
    @FXML
    private Label label1;

    @FXML
    protected void Button(){
        String text = textField.getText();
        if (text.isEmpty()){
            label1.setText("Введіть хоть щось");
        }
        else {
            //Якщо textField не пустий то закодовуешь виводиш в textArea і в якісь файл
            label1.setText("Зашифровано");
        }
        //Вывести в textArea зашифрованный текст шифром Цезаря
        textArea.setText(text);

    }

    //Друга вкладка
    @FXML
    private TextArea textArea2;
    @FXML
    private Label label;

    @FXML
    protected void FileChosser(){
        try {
            FileChooser fc = new FileChooser();
            fc.setTitle("Виберіть файл");
            File file = fc.showOpenDialog(null);

            String path = file.getAbsolutePath();
            label.setText(path);
        }catch (Exception e){
            label.setText("Виберіть файл !");
        }
    }

    @FXML
    protected void Button1(){
    }
}
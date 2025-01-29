import java.applet.Applet;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;

public class MyApplet extends Applet {
    @Override
    public void init() {
        
        setBackground(Color.LIGHT_GRAY);

        
        Button button = new Button("Click Me");
        button.setBounds(50, 50, 100, 30);
        add(button);

       
        Label label = new Label("This is a label");
        label.setBounds(50, 100, 200, 30);
        add(label);

        
        TextField textField = new TextField();
        textField.setBounds(50, 150, 200, 30);
        add(textField);

        
        TextArea textArea = new TextArea();
        textArea.setBounds(50, 200, 200, 100);
        add(textArea);

        
        Checkbox checkbox = new Checkbox("Check me out");
        checkbox.setBounds(50, 320, 200, 30);
        add(checkbox);

        
        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.setBounds(50, 400, 200, 30);
        add(choice);

        
        List list = new List();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.setBounds(50, 450, 200, 100);
        add(list);

        
        CheckboxGroup group = new CheckboxGroup();
        Checkbox radioButton1 = new Checkbox("Option 1", group, false);
        radioButton1.setBounds(50, 560, 100, 30);
        Checkbox radioButton2 = new Checkbox("Option 2", group, false);
        radioButton2.setBounds(50, 590, 100, 30);
        add(radioButton1);
        add(radioButton2);

        
        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.fillRect(10, 10, 100, 100);
            }
        };
        canvas.setBounds(300, 50, 150, 150);
        add(canvas);
    }

    @Override
    public void paint(Graphics g) {
        
        g.drawString("Hello, World!", 20, 20);
    }
}

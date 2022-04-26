package org.test.views;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

@SpringComponent
@Route("form")
public class FormUIView extends VerticalLayout implements View {

    public static final String PAGE_TAG = "form";
    public FormUIView() {

        setSizeFull();

        Button button = new Button("Go to Main View",
                (Button.ClickListener) event -> getUI().getNavigator().navigateTo(MainView.PAGE_TAG));


        addComponent(button);
        setComponentAlignment(button, Alignment.MIDDLE_CENTER);
    }
}

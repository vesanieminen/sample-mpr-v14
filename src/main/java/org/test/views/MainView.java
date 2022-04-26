package org.test.views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.mpr.LegacyWrapper;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;

@Route("")
@UIScope
public class MainView extends VerticalLayout {

    public static final String PAGE_TAG = "";

    public MainView() {

        Button button = new Button("Go to Second View");
        add(new LegacyWrapper(button));
        add(new com.vaadin.flow.component.button.Button("TEST"));

//        setComponentAlignment(button, Alignment.MIDDLE_CENTER);

    }
}

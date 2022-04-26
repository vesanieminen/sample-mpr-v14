//package org.test.views;
//
//import javax.servlet.annotation.WebServlet;
//
//import com.vaadin.annotations.Theme;
//import com.vaadin.annotations.VaadinServletConfiguration;
//import com.vaadin.flow.component.html.Div;
//import com.vaadin.flow.router.Route;
//import com.vaadin.mpr.MprNavigatorRoute;
//import com.vaadin.mpr.core.HasLegacyComponents;
//import com.vaadin.navigator.Navigator;
//import com.vaadin.server.VaadinRequest;
//import com.vaadin.server.VaadinServlet;
//import com.vaadin.ui.UI;
//
///**
// * This UI is the application entry point. A UI may either represent a browser window
// * (or tab) or some part of an HTML page where a Vaadin application is embedded.
// * <p>
// * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be
// * overridden to add component to the user interface and initialize non-component functionality.
// */
//@Theme("mytheme")
//@Route("")
//public class MyUI extends MprNavigatorRoute {
//    Navigator navigator;
//
//    @Override
//    public void configureNavigator(Navigator navigator) {
//        navigator.addView(MainView.PAGE_TAG, MainView.class);
//        navigator.addView(FormUIView.PAGE_TAG, FormUIView.class);
//    }
//
////    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
////    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
////    public static class MyUIServlet extends VaadinServlet {
////    }
//}

package mylife.com.views.dashboard;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import mylife.com.views.MainLayout;

@PageTitle("Dashboard")
@Route(value = "dashboard", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class DashboardView extends VerticalLayout {

    public DashboardView() {
        setSpacing(false);
        
        add(new H2("Welcome to My Homepage"));
        add(new Paragraph("This web page presents an overview of my live."
        		+ "I wanted to build a website and one about myself seem like a good start."
        		+ "The main purpose of the web site is to build familiarity with the Vaadin Flow framework."
        		+ "The goal was to build a basic page on the first attempt and then add more feautures overtime."
        		+ "I made it straightforward and easy to naviagte so that i can have a good base to build of."
        		+ "Thank you for your visit."));
        
        Image img = new Image("images/nature.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}

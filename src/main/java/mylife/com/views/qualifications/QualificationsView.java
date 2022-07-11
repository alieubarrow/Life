package mylife.com.views.qualifications;


import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.orderedlayout.FlexComponent.Alignment;
import com.vaadin.flow.component.orderedlayout.FlexComponent.JustifyContentMode;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import mylife.com.views.MainLayout;

@PageTitle("Qualifications")
@Route(value = "qualifications", layout = MainLayout.class)
public class QualificationsView extends VerticalLayout {

    public QualificationsView() {
        setSpacing(false);
        
        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);
        
        add(new H2("Under maintenance"));
        add(new Paragraph("In progress 🤗"));    
        
        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}

package mylife.com.views.about;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import mylife.com.views.MainLayout;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(false);

        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("About"));
        add(new Paragraph("To mention little about me, I was born in a small country called Gambia in West Africa. Around the age of 10, me and my siblings moved to Sweden where we lived "
        		+ " for the following decade. I completed my middle school and high school in there and about a year after i graduated high shcool, "
        		+ "i moved over to the US where i have been living since. Traveling and living in other places is one of the things i love to do the most and over the course of my life, "
        		+ "i have visited various places. There are still a lot more places i want to go to in the near future. Beneath are just some places i have visited or lived in."));
        

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}

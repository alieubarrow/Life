package mylife.com.views.about;

import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.map.Map;
import com.vaadin.flow.component.map.configuration.Coordinate;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import mylife.com.views.MainLayout;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
public class AboutView extends VerticalLayout {
	
	 private final Icon zoomInIcon = VaadinIcon.SEARCH_PLUS.create();
	 private final Icon zoomOutIcon = VaadinIcon.SEARCH_MINUS.create();

    public AboutView() {
        setSpacing(false);

        add(new H2("About"));
        add(new Paragraph("To mention little about me, I was born in a small country called Gambia in West Africa. Around the age of 10, me and my siblings moved to Sweden where we lived "
        		+ " for the following decade. I completed my middle school and high school in there and about a year after i graduated high school, "
        		+ "i moved over to the US where i have been living since. Traveling and living in other places is one of the things i love to do the most and over the course of my life, "
        		+ "i have visited various places. There are still a lot more places i want to go to in the near future. Beneath are just some places i have visited or lived in."));
        
        Map map = new Map();
        add(map);

        MenuBar menuBar = new MenuBar();
        SubMenu moveToSubMenu = menuBar.addItem("Move To...").getSubMenu();

        // Add menu items for moving the viewport to different cities
        moveToSubMenu.addItem("Berlin", e -> {
            Coordinate coordinate = Coordinate.fromLonLat(13.404954, 52.520008);
            map.getView().setCenter(coordinate);
            map.getView().setZoom(10);
        });

        moveToSubMenu.addItem("Hong Kong", e -> {
            Coordinate coordinate = Coordinate.fromLonLat(114.162813, 22.279328);
            map.getView().setCenter(coordinate);
            map.getView().setZoom(10);
        });

        moveToSubMenu.addItem("Moscow", e -> {
            Coordinate coordinate = Coordinate.fromLonLat(37.617298, 55.755825);
            map.getView().setCenter(coordinate);
            map.getView().setZoom(10);
        });

        moveToSubMenu.addItem("New York", e -> {
            Coordinate coordinate = Coordinate.fromLonLat(-74.005974, 40.712776);
            map.getView().setCenter(coordinate);
            map.getView().setZoom(10);
        });

        moveToSubMenu.addItem("Rio de Janeiro", e -> {
            Coordinate coordinate = Coordinate.fromLonLat(-43.2093727, -22.9110137);
            map.getView().setCenter(coordinate);
            map.getView().setZoom(10);
        });

        // Add menu items for zooming
        menuBar.addItem(zoomInIcon, e -> {
            float zoom = map.getView().getZoom();
            map.getView().setZoom(zoom + 1);
        });
        menuBar.addItem(zoomOutIcon, e -> {
            float zoom = map.getView().getZoom();
            map.getView().setZoom(zoom - 1);
        });
        add(menuBar);
        setPadding(false);
        
        //MapViewPort();
     // Create a new map, this will use the OpenStreetMap service by default
        //Map map = new Map();
        //add(map);
        
        /*MenuBar menuBar = new MenuBar();
        SubMenu moveToSubMenu = menuBar.addItem("Move To...").getSubMenu();

        // Add menu items for moving the viewport to different cities
        moveToSubMenu.addItem("Berlin", e -> {
            Coordinate coordinate = Coordinate.fromLonLat(13.404954, 52.520008);
            map.getView().setCenter(coordinate);
            map.getView().setZoom(10);
        });


        String zoomInIcon = "+";
		// Add menu items for zooming
        menuBar.addItem(zoomInIcon, e -> {
            float zoom = map.getView().getZoom();
            map.getView().setZoom(zoom + 1);
        });
        String zoomOutIcon = "-";
		menuBar.addItem(zoomOutIcon, e -> {
            float zoom = map.getView().getZoom();
            map.getView().setZoom(zoom - 1);
        });*/
        

        //setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
    }

}

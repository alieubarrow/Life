package mylife.com.views;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.RouterLink;
import mylife.com.views.about.AboutView;
import mylife.com.views.career.CareerView;
import mylife.com.views.chat.ChatView;
import mylife.com.views.dashboard.DashboardView;
import mylife.com.views.education.EducationView;
import mylife.com.views.helloworld.HelloWorldView;
import mylife.com.views.imagelist.ImageListView;
import mylife.com.views.lifestyle.LifestyleView;
import mylife.com.views.qualifications.QualificationsView;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    /**
     * A simple navigation item component, based on ListItem element.
     */
    public static class MenuItemInfo extends ListItem {

        private final Class<? extends Component> view;

        public MenuItemInfo(String menuTitle, String iconClass, Class<? extends Component> view) {
            this.view = view;
            RouterLink link = new RouterLink();
            // Use Lumo classnames for various styling
            link.addClassNames("flex", "h-m", "items-center", "px-s", "relative", "text-secondary");
            link.setRoute(view);

            Span text = new Span(menuTitle);
            // Use Lumo classnames for various styling
            text.addClassNames("font-medium", "text-s", "whitespace-nowrap");

            link.add(new LineAwesomeIcon(iconClass), text);
            add(link);
        }

        public Class<?> getView() {
            return view;
        }

        /**
         * Simple wrapper to create icons using LineAwesome iconset. See
         * https://icons8.com/line-awesome
         */
        @NpmPackage(value = "line-awesome", version = "1.3.0")
        public static class LineAwesomeIcon extends Span {
            public LineAwesomeIcon(String lineawesomeClassnames) {
                // Use Lumo classnames for suitable font size and margin
                addClassNames("me-s", "text-l");
                if (!lineawesomeClassnames.isEmpty()) {
                    addClassNames(lineawesomeClassnames);
                }
            }
        }

    }

    public MainLayout() {
        addToNavbar(createHeaderContent());
    }

    private Component createHeaderContent() {
        Header header = new Header();
        header.addClassNames("bg-base", "border-b", "border-contrast-10", "box-border", "flex", "flex-col", "w-full");

        Div layout = new Div();
        layout.addClassNames("flex", "h-xl", "items-center", "px-l");

        H1 appName = new H1("MyLife");
        appName.addClassNames("my-0", "me-auto", "text-l");
        layout.add(appName);

        Nav nav = new Nav();
        nav.addClassNames("flex", "gap-s", "overflow-auto", "px-m");

        // Wrap the links in a list; improves accessibility
        UnorderedList list = new UnorderedList();
        list.addClassNames("flex", "list-none", "m-0", "p-0");
        nav.add(list);

        for (MenuItemInfo menuItem : createMenuItems()) {
            list.add(menuItem);

        }

        header.add(layout, nav);
        return header;
    }

    private MenuItemInfo[] createMenuItems() {
        return new MenuItemInfo[]{ //
                new MenuItemInfo("Dashboard", "lab la-accusoft", DashboardView.class), //

                new MenuItemInfo("Hello World", "la la-globe", HelloWorldView.class), //

                new MenuItemInfo("About", "la la-fighter-jet", AboutView.class), //

                new MenuItemInfo("Qualifications", "la la-file-invoice", QualificationsView.class), //

                new MenuItemInfo("Education", "la la-graduation-cap", EducationView.class), //

                new MenuItemInfo("Career", "la la-terminal", CareerView.class), //

                new MenuItemInfo("Lifestyle", "la la-hands", LifestyleView.class), //

                new MenuItemInfo("Image List", "la la-image", ImageListView.class), //

                new MenuItemInfo("Chat", "la la-comments", ChatView.class), //

        };
    }

}

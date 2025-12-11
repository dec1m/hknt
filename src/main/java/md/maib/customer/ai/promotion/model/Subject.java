package md.maib.customer.ai.promotion.model;

public enum Subject {
    OPEN_DEPOSIT("Open deposit", "\uD83D\uDCB0"),
    CLOSE_DEPOSIT("Close deposit", "\uD83D\uDCB0"),
    OPEN_ACCOUNT("Open account", "\uD83D\uDCB5"),
    CLOSE_ACCOUNT("Close account", "\uD83D\uDCB5"),
    OPEN_CARD("Open card", "\uD83D\uDCB3"),
    CLOSE_CARD("Close card", "\uD83D\uDCB3"),
    OPEN_CREDIT("Open credit", "\uD83D\uDCB8"),
    CLOSE_CREDIT("Close credit", "\uD83D\uDCB8");

    private final String title;
    private final String icon;

    Subject(String title, String icon) {
        this.title = title;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public String getIcon() {
        return icon;
    }
}
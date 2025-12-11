package md.maib.customer.ai.promotion.model;

public record Action(
        String icon,
        String title,
        String action,
        String link
) {

    public static Action of(Subject subject) {
        return new Action(
                subject.getIcon(),
                subject.getTitle(),
                subject.toString(),
                "https://creatio.maib.local/action/%s"
                        .formatted(subject.toString())
        );
    }
    }
package mn.devfest.api.model;

/**
 * Feedback data POJO
 *
 * @author bherbst
 */
public class Feedback {
    private final String sessionId;
    private final String installId;
    private final int overall;
    private final int relevancy;
    private final int difficulty;
    private final int speakerQuality;


    public Feedback(String sessionId, String installId, int overall, int relevancy, int difficulty, int speakerQuality) {
        this.sessionId = sessionId;
        this.installId = installId;
        this.overall = overall;
        this.relevancy = relevancy;
        this.difficulty = difficulty;
        this.speakerQuality = speakerQuality;
    }
}

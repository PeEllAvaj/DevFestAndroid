package mn.devfest.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;

import java.util.ArrayList;

import mn.devfest.api.model.Session;

/**
 * Manages scheduling local notifications
 *
 * @author pfuentes
 */
public class LocalNotificationScheduler {

    public static final String SESSION_RATING_EXTRA = "mn.devfest.SessionForRating";

    Context mContext;

    //TODO move to dependency injection
    public LocalNotificationScheduler(@NonNull Context context) {
        mContext = context;
    }

    /**
     * Schedules local notifications that prompt the user to rate all of the sessions in the
     * conference, if they have notifications turned on at the time of attempted presentation.
     * This method will remove any existing notifications and replace them with notifications for
     * the list of sessions it is passed
     * @param sessions the full list of sessions in the conference
     */
    public void scheduleAllConferenceRatingNotifications(ArrayList<Session> sessions) {
        //TODO implement
    }

    /**
     * Schedules a local notification for rating a single notification. If notifications are turned
     * off at the time of attempted presentation, the notification won't be presented
     * @param session the session to ask the user to rate
     */
    public void scheduleRatingNotification(@NonNull Session session) {
        Intent intent = new Intent(mContext, LocalNotificationPresentationService.class);
        intent.putExtra(SESSION_RATING_EXTRA, session);
        //TODO replace '42' with a mapper from event IDs to notification tags
        PendingIntent pendingIntent = PendingIntent.getService(mContext, 42, intent, PendingIntent.FLAG_UPDATE_CURRENT);
    }

    /**
     * Removes a scheduled local notification for rating a session, provided that a notification has
     * been scheduled
     * @param sessionId id of the session to remove the existing notification for
     */
    public void removeScheduledRatingNotification(@NonNull String sessionId) {
        //TODO implement
    }
}

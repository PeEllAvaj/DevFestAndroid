package mn.devfest.notifications;

import android.support.annotation.NonNull;

import java.util.ArrayList;

import mn.devfest.api.model.Session;

/**
 * Manages scheduling local notifications
 *
 * @author pfuentes
 */
public class LocalNotificationScheduler {

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
        //TODO implement
    }

    /**
     * Removes a scheduled local notification for rating a session, provided that a notification has
     * been scheduled
     * @param sessionId
     */
    public void removeScheduledRatingNotification(@NonNull String sessionId) {
        //TODO implement
    }
}

package mn.devfest.notifications;

import android.app.IntentService;
import android.content.Intent;

/**
 * Awoken to present notifications
 *
 * @author pfuentes
 */
public class LocalNotificationPresentationService extends IntentService {
    private static final String TAG = LocalNotificationPresentationService.class.getSimpleName();

    public LocalNotificationPresentationService() {
        super(TAG);
    }

    public LocalNotificationPresentationService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //TODO handle intent
    }
}

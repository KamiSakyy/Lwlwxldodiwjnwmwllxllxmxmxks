package x0;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l {
    public static void a(PendingIntent pendingIntent) {
        try {
            pendingIntent.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
        } catch (PendingIntent.CanceledException e5) {
            Objects.toString(pendingIntent);
            e5.toString();
        }
    }
}

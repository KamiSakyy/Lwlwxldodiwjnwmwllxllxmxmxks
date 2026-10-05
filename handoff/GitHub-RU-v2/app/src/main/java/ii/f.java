package ii;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.github.developersettings.DeveloperSettingsActivity;
import n4.b0;
import n4.p;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static void a(Context context, boolean z) {
        b0 b0Var = new b0(context);
        NotificationManager notificationManager = b0Var.b;
        if (!z) {
            notificationManager.cancel(null, 1);
            return;
        }
        notificationManager.createNotificationChannel(new NotificationChannel("channel_developer_settings", "Channel for developer settings notification", 2));
        DeveloperSettingsActivity.Companion.getClass();
        PendingIntent activity = PendingIntent.getActivity(context, 999, new Intent(context, (Class<?>) DeveloperSettingsActivity.class), 335544320);
        p pVar = new p(context, "channel_developer_settings");
        pVar.v.icon = 2131231361;
        pVar.r = context.getColor(2131100998);
        pVar.j = 0;
        pVar.e = p.b("Developer settings");
        pVar.f = p.b("Tap to access developer settings");
        pVar.g = activity;
        Notification a = pVar.a();
        a.flags = 34;
        b0Var.a(1, a);
    }
}

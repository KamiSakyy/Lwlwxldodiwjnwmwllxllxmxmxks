package n4;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static String f29417d;

    /* renamed from: g, reason: collision with root package name */
    public static a0 f29420g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f29421a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f29422b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f29416c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f29418e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f29419f = new Object();

    public b0(Context context) {
        this.f29421a = context;
        this.f29422b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i, Notification notification) {
        NotificationManager notificationManager = this.f29422b;
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(null, i, notification);
            return;
        }
        x xVar = new x(this.f29421a.getPackageName(), i, notification);
        synchronized (f29419f) {
            try {
                if (f29420g == null) {
                    f29420g = new a0(this.f29421a.getApplicationContext());
                }
                f29420g.f29413s.obtainMessage(0, xVar).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
        notificationManager.cancel(null, i);
    }
    public Object b = null;
}

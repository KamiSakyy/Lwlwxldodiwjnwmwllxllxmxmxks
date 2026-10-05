package e9;

import android.content.Context;
import android.os.PowerManager;
import v8.x;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class o {
    static {
        k71.k.f(x.b("WakeLocks"), "tagWithPrefix(...)");
    }

    public static final PowerManager.WakeLock a(Context context) {
        k71.k.g(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("power");
        k71.k.e(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (p.f22157a) {
        }
        k71.k.d(newWakeLock);
        return newWakeLock;
    }
}

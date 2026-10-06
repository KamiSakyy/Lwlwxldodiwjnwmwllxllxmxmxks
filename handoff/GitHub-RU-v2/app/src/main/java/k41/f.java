package k41;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f extends BroadcastReceiver {
    public static final AtomicReference b = new AtomicReference();
    public Context a;

    public f(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.k) {
            try {
                Iterator it = g.l.values().iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.unregisterReceiver(this);
    }
    public Object a(Object p1) { return null; }
    public Object e(Object p1) { return null; }
    public static final Object a = null;
    public static final Object r = null;
    public static final Object t = null;
    public static final Object u = null;
    public static final Object v = null;
    public static final Object w = null;
    public static final Object x = null;
    public static final Object y = null;
    public static final Object z = null;
    public Object a(Object p1) { return null; }
    public Object e(Object p1) { return null; }
}

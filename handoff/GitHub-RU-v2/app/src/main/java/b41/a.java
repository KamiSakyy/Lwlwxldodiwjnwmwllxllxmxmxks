package b41;

import android.app.PendingIntent;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final PendingIntent e;
    public final PendingIntent f;
    public boolean g = false;

    public a(int i, int i2, int i3, int i4, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = pendingIntent;
        this.f = pendingIntent2;
    }

    public final PendingIntent a(n nVar) {
        PendingIntent pendingIntent;
        int i = nVar.a;
        if (i == 0) {
            PendingIntent pendingIntent2 = this.f;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            return null;
        }
        if (i != 1 || (pendingIntent = this.e) == null) {
            return null;
        }
        return pendingIntent;
    }
    public Object g(Object p1, Object p2) { return null; }
    public Object i0(Object p1) { return null; }
    public static final Object r = null;
}

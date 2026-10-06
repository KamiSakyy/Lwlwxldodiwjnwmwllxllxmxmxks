package v8;

import android.app.Notification;

/* loaded from: /home/user/work/p/classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f32827a;

    /* renamed from: b, reason: collision with root package name */
    public int f32828b;

    /* renamed from: c, reason: collision with root package name */
    public Notification f32829c;

    public o(int i, Notification notification, int i10) {
        this.f32827a = i;
        this.f32829c = notification;
        this.f32828b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f32827a == oVar.f32827a && this.f32828b == oVar.f32828b) {
            return this.f32829c.equals(oVar.f32829c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32829c.hashCode() + (((this.f32827a * 31) + this.f32828b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f32827a + ", mForegroundServiceType=" + this.f32828b + ", mNotification=" + this.f32829c + '}';
    }
}

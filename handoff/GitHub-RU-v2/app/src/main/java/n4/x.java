package n4;

import a0.s0;
import android.app.Notification;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f29482a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29483b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f29484c;

    public x(String str, int i, Notification notification) {
        this.f29482a = str;
        this.f29483b = i;
        this.f29484c = notification;
    }

    public final void a(c.c cVar) {
        String str = this.f29482a;
        int i = this.f29483b;
        c.a aVar = (c.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(c.c.f3942c);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(null);
            Notification notification = this.f29484c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f3940f.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f29482a);
        sb2.append(", id:");
        return s0.l(sb2, this.f29483b, ", tag:null]");
    }
}

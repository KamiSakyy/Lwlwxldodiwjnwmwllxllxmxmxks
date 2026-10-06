package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 extends x implements r0 {
    public q0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 0);
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final int b() {
        Parcel f = f(g(), 2);
        int readInt = f.readInt();
        f.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void m(long j, Bundle bundle, String str, String str2) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        z.b(g, bundle);
        g.writeLong(j);
        L(g, 1);
    }

    public q0(Object... a) {
    }
    public Object get(Object p1) { return null; }
    public Object put(Object p1, Object p2) { return null; }
}

package c21;

import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r extends com.google.android.gms.internal.measurement.x implements t {
    public final boolean P() {
        Parcel e = e(g(), 7);
        int i = o21.g.a;
        boolean z = e.readInt() != 0;
        e.recycle();
        return z;
    }
}

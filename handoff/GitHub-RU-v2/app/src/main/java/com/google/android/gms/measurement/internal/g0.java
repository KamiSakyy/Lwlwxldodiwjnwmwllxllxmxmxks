package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 extends com.google.android.gms.internal.measurement.x implements h0 {
    @Override // com.google.android.gms.measurement.internal.h0
    public final void E(List list) {
        Parcel g = g();
        g.writeTypedList(list);
        M(g);
    }
}

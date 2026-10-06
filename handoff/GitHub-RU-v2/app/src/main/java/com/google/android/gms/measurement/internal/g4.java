package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g4 extends d21.a {
    public static final Parcelable.Creator<g4> CREATOR = new c21.c0(9);
    public List r;

    public g4(ArrayList arrayList) {
        this.r = arrayList;
    }

    public static g4 j(a3... a3VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(a3VarArr[0].r));
        return new g4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int Z = m7.y.Z(parcel, 20293);
        List list = this.r;
        if (list != null) {
            int Z2 = m7.y.Z(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            m7.y.a0(parcel, Z2);
        }
        m7.y.a0(parcel, Z);
    }
}

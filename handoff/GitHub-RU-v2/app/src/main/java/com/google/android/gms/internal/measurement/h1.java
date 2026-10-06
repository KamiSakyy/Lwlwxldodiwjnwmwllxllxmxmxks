package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h1 extends y implements r0 {
    public final n41.b f;

    public h1(n41.b bVar) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f = bVar;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final int b() {
        return System.identityHashCode(this.f);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.f);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        z.d(parcel);
        m(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r0
    public final void m(long j, Bundle bundle, String str, String str2) {
        this.f.a(j, bundle, str, str2);
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r {
        public r() {
        }
    }
}

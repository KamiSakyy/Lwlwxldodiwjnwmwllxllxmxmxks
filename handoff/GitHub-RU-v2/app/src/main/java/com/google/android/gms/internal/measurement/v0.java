package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int b0 = k41.b.b0(parcel);
                Bundle bundle = null;
                String str = null;
                boolean z = false;
                long j = 0;
                long j2 = 0;
                while (parcel.dataPosition() < b0) {
                    int readInt = parcel.readInt();
                    char c = (char) readInt;
                    if (c == 1) {
                        j = k41.b.G(parcel, readInt);
                    } else if (c == 2) {
                        j2 = k41.b.G(parcel, readInt);
                    } else if (c == 3) {
                        z = k41.b.D(parcel, readInt);
                    } else if (c == 7) {
                        bundle = k41.b.m(parcel, readInt);
                    } else if (c != '\b') {
                        k41.b.N(parcel, readInt);
                    } else {
                        str = k41.b.o(parcel, readInt);
                    }
                }
                k41.b.s(parcel, b0);
                return new u0(j, j2, z, bundle, str);
            default:
                int b02 = k41.b.b0(parcel);
                String str2 = null;
                int i = 0;
                Intent intent = null;
                while (parcel.dataPosition() < b02) {
                    int readInt2 = parcel.readInt();
                    char c2 = (char) readInt2;
                    if (c2 == 1) {
                        i = k41.b.F(parcel, readInt2);
                    } else if (c2 == 2) {
                        str2 = k41.b.o(parcel, readInt2);
                    } else if (c2 != 3) {
                        k41.b.N(parcel, readInt2);
                    } else {
                        intent = (Intent) k41.b.n(parcel, readInt2, Intent.CREATOR);
                    }
                }
                k41.b.s(parcel, b02);
                return new w0(i, intent, str2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new u0[i];
            default:
                return new w0[i];
        }
    }
}

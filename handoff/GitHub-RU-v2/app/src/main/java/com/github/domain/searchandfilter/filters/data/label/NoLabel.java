package com.github.domain.searchandfilter.filters.data.label;

import android.os.Parcel;
import android.os.Parcelable;
import c21.c0;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import yz0.k2;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class NoLabel implements k2 {
    public final String r;
    public final String s;
    public final String t;
    public final int u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<NoLabel> CREATOR = new c0(26);
    public static final NoLabel v = new NoLabel();

    public static final class Companion {
        public final KSerializer serializer() {
            return NoLabel$$serializer.INSTANCE;
        }
    }

    public NoLabel() {
        this.r = "";
        this.s = "";
        this.t = "";
    }

    public final String J() {
        return this.t;
    }

    public final int describeContents() {
        return 0;
    }

    public final int f() {
        return this.u;
    }

    public final String getId() {
        return this.s;
    }

    public final String getName() {
        return this.r;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }

    public /* synthetic */ NoLabel(int i, int i2, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.r = "";
        } else {
            this.r = str;
        }
        if ((i & 2) == 0) {
            this.s = "";
        } else {
            this.s = str2;
        }
        if ((i & 4) == 0) {
            this.t = "";
        } else {
            this.t = str3;
        }
        if ((i & 8) == 0) {
            this.u = 0;
        } else {
            this.u = i2;
        }
    }
}

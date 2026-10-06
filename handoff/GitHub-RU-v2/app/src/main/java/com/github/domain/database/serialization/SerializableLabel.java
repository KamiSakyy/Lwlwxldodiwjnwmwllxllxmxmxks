package com.github.domain.database.serialization;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import yz0.k2;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SerializableLabel implements k2 {
    public String r;
    public String s;
    public String t;
    public int u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SerializableLabel> CREATOR = new f8.a(15);

    public static final class Companion {
        public final KSerializer serializer() {
            return SerializableLabel$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SerializableLabel(int i, int i2, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            c1.l(i, 15, SerializableLabel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i2;
    }

    public final String J() {
        return this.t;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SerializableLabel)) {
            return false;
        }
        SerializableLabel serializableLabel = (SerializableLabel) obj;
        return k.b(this.r, serializableLabel.r) && k.b(this.s, serializableLabel.s) && k.b(this.t, serializableLabel.t) && this.u == serializableLabel.u;
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

    public final int hashCode() {
        return Integer.hashCode(this.u) + h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SerializableLabel(name=", this.r, ", id=", this.s, ", colorString=");
        o.append(this.t);
        o.append(", color=");
        o.append(this.u);
        o.append(")");
        return o.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
    }

    public SerializableLabel(int i, String str, String str2, String str3) {
        k.g(str, "name");
        k.g(str2, "id");
        k.g(str3, "colorString");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = i;
    }
}

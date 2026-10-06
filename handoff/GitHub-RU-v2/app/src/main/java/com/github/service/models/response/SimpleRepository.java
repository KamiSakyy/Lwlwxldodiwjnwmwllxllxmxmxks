package com.github.service.models.response;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import yz0.h;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class SimpleRepository implements Parcelable {
    public final String r;
    public final String s;
    public final String t;
    public final Avatar u;
    public final String v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SimpleRepository> CREATOR = new h(28);

    public static final class Companion {
        public final KSerializer serializer() {
            return SimpleRepository$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SimpleRepository(int i, String str, String str2, String str3, Avatar avatar, String str4) {
        if (31 != (i & 31)) {
            c1.l(i, 31, SimpleRepository$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = avatar;
        this.v = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleRepository)) {
            return false;
        }
        SimpleRepository simpleRepository = (SimpleRepository) obj;
        return k.b(this.r, simpleRepository.r) && k.b(this.s, simpleRepository.s) && k.b(this.t, simpleRepository.t) && k.b(this.u, simpleRepository.u) && k.b(this.v, simpleRepository.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + h1.j(this.u, h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("SimpleRepository(name=", this.r, ", id=", this.s, ", owner=");
        o.append(this.t);
        o.append(", avatar=");
        o.append(this.u);
        o.append(", url=");
        return h1.p(o, this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        this.u.writeToParcel(parcel, i);
        parcel.writeString(this.v);
    }

    public SimpleRepository(Avatar avatar, String str, String str2, String str3, String str4) {
        k.g(str, "name");
        k.g(str2, "id");
        k.g(str3, "owner");
        k.g(avatar, "avatar");
        k.g(str4, "url");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = avatar;
        this.v = str4;
    }
}

package com.github.service.models.response;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;
import yz0.h;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class SpokenLanguage implements Parcelable {
    public String r;
    public String s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SpokenLanguage> CREATOR = new h(29);

    public static final class Companion {
        public final KSerializer serializer() {
            return SpokenLanguage$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpokenLanguage(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, SpokenLanguage$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpokenLanguage)) {
            return false;
        }
        SpokenLanguage spokenLanguage = (SpokenLanguage) obj;
        return k.b(this.r, spokenLanguage.r) && k.b(this.s, spokenLanguage.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("SpokenLanguage(name=", this.r, ", code=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    public SpokenLanguage(String str, String str2) {
        k.g(str, "name");
        k.g(str2, "code");
        this.r = str;
        this.s = str2;
    }
}

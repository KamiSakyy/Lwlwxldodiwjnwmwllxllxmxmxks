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
public final class Language implements Parcelable {
    public String r;
    public String s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Language> CREATOR = new h(20);

    public static final class Companion {
        public final KSerializer serializer() {
            return Language$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Language(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, Language$$serializer.INSTANCE.getDescriptor());
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
        if (!(obj instanceof Language)) {
            return false;
        }
        Language language = (Language) obj;
        return k.b(this.r, language.r) && k.b(this.s, language.s);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return i.g("Language(name=", this.r, ", colorHex=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    public Language(String str, String str2) {
        k.g(str, "name");
        this.r = str;
        this.s = str2;
    }
}

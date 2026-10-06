package com.github.service.license;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import l7.c0;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class LicenseTemplate implements Parcelable {
    public final String r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LicenseTemplate> CREATOR = new c0(11);

    public static final class Companion {
        public final KSerializer serializer() {
            return LicenseTemplate$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LicenseTemplate(int i, String str, String str2, String str3, String str4, String str5) {
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
            this.u = "";
        } else {
            this.u = str4;
        }
        if ((i & 16) == 0) {
            this.v = "";
        } else {
            this.v = str5;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LicenseTemplate)) {
            return false;
        }
        LicenseTemplate licenseTemplate = (LicenseTemplate) obj;
        return k.b(this.r, licenseTemplate.r) && k.b(this.s, licenseTemplate.s) && k.b(this.t, licenseTemplate.t) && k.b(this.u, licenseTemplate.u) && k.b(this.v, licenseTemplate.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + h1.i(h1.i(h1.i(this.r.hashCode() * 31, this.s, 31), this.t, 31), this.u, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("LicenseTemplate(key=", this.r, ", name=", this.s, ", spdxId=");
        f1.e.x(o, this.t, ", url=", this.u, ", nodeId=");
        return h1.p(o, this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
    }

    public LicenseTemplate(String str, String str2, String str3, String str4, String str5) {
        k.g(str, "key");
        k.g(str2, "name");
        k.g(str3, "spdxId");
        k.g(str4, "url");
        k.g(str5, "nodeId");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = str5;
    }

    public /* synthetic */ LicenseTemplate(int i, String str, String str2, String str3) {
        this(str, str2, (i & 4) != 0 ? "" : str3, "", "");
    }

    public <T0> T0 e(Object... a) {
        return null;
    }
}

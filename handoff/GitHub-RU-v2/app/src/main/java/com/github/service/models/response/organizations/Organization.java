package com.github.service.models.response.organizations;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;
import g81.e;
import gn.m;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import q01.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class Organization implements i, Parcelable {
    public String r;
    public String s;
    public String t;
    public String u;
    public Avatar v;
    public boolean w;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<Organization> CREATOR = new m(25);

    public static final class Companion {
        public final KSerializer serializer() {
            return Organization$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Organization(int i, String str, String str2, String str3, String str4, Avatar avatar, boolean z) {
        if (63 != (i & 63)) {
            c1.l(i, 63, Organization$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = avatar;
        this.w = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Organization)) {
            return false;
        }
        Organization organization = (Organization) obj;
        return k.b(this.r, organization.r) && k.b(this.s, organization.s) && k.b(this.t, organization.t) && k.b(this.u, organization.u) && k.b(this.v, organization.v) && this.w == organization.w;
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        int i = h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.t, 31);
        String str2 = this.u;
        return Boolean.hashCode(this.w) + h1.j(this.v, (i + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Organization(id=", this.r, ", name=", this.s, ", login=");
        f1.e.x(o, this.t, ", descriptionHtml=", this.u, ", avatar=");
        o.append(this.v);
        o.append(", viewerIsFollowing=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        this.v.writeToParcel(parcel, i);
        parcel.writeInt(this.w ? 1 : 0);
    }

    public Organization(String str, String str2, String str3, String str4, Avatar avatar, boolean z) {
        k.g(str, "id");
        k.g(str3, "login");
        k.g(avatar, "avatar");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
        this.v = avatar;
        this.w = z;
    }
}

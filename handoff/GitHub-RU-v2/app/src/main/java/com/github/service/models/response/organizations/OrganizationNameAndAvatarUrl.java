package com.github.service.models.response.organizations;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import gn.m;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class OrganizationNameAndAvatarUrl implements Parcelable {
    public final String r;
    public final String s;
    public final String t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<OrganizationNameAndAvatarUrl> CREATOR = new m(26);

    public static final class Companion {
        public final KSerializer serializer() {
            return OrganizationNameAndAvatarUrl$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrganizationNameAndAvatarUrl(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1.l(i, 7, OrganizationNameAndAvatarUrl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrganizationNameAndAvatarUrl)) {
            return false;
        }
        OrganizationNameAndAvatarUrl organizationNameAndAvatarUrl = (OrganizationNameAndAvatarUrl) obj;
        return k.b(this.r, organizationNameAndAvatarUrl.r) && k.b(this.s, organizationNameAndAvatarUrl.s) && k.b(this.t, organizationNameAndAvatarUrl.t);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(s0.o("OrganizationNameAndAvatarUrl(login=", this.r, ", name=", this.s, ", avatarUrl="), this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public OrganizationNameAndAvatarUrl(String str, String str2, String str3) {
        k.g(str, "login");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }
}

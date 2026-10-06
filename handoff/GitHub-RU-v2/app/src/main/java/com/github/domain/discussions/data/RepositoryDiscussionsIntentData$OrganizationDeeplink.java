package com.github.domain.discussions.data;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import gn.m;
import jk.j;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryDiscussionsIntentData$OrganizationDeeplink implements j {
    public String r;
    public String s;
    public String t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryDiscussionsIntentData$OrganizationDeeplink> CREATOR = new m(23);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryDiscussionsIntentData$OrganizationDeeplink$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryDiscussionsIntentData$OrganizationDeeplink(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1.l(i, 7, RepositoryDiscussionsIntentData$OrganizationDeeplink$$serializer.INSTANCE.getDescriptor());
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
        if (!(obj instanceof RepositoryDiscussionsIntentData$OrganizationDeeplink)) {
            return false;
        }
        RepositoryDiscussionsIntentData$OrganizationDeeplink repositoryDiscussionsIntentData$OrganizationDeeplink = (RepositoryDiscussionsIntentData$OrganizationDeeplink) obj;
        return k.b(this.r, repositoryDiscussionsIntentData$OrganizationDeeplink.r) && k.b(this.s, repositoryDiscussionsIntentData$OrganizationDeeplink.s) && k.b(this.t, repositoryDiscussionsIntentData$OrganizationDeeplink.t);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return h1.p(s0.o("OrganizationDeeplink(repositoryOwner=", this.r, ", categorySlug=", this.s, ", filtersQuery="), this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public RepositoryDiscussionsIntentData$OrganizationDeeplink(String str, String str2, String str3) {
        k.g(str, "repositoryOwner");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }
}

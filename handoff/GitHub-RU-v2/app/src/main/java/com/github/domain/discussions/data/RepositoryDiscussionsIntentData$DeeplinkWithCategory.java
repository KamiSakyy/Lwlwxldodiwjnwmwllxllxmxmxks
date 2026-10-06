package com.github.domain.discussions.data;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import gn.m;
import jk.j;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryDiscussionsIntentData$DeeplinkWithCategory implements j {
    public String r;
    public String s;
    public String t;
    public String u;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryDiscussionsIntentData$DeeplinkWithCategory> CREATOR = new m(22);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryDiscussionsIntentData$DeeplinkWithCategory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryDiscussionsIntentData$DeeplinkWithCategory(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            c1.l(i, 15, RepositoryDiscussionsIntentData$DeeplinkWithCategory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoryDiscussionsIntentData$DeeplinkWithCategory)) {
            return false;
        }
        RepositoryDiscussionsIntentData$DeeplinkWithCategory repositoryDiscussionsIntentData$DeeplinkWithCategory = (RepositoryDiscussionsIntentData$DeeplinkWithCategory) obj;
        return k.b(this.r, repositoryDiscussionsIntentData$DeeplinkWithCategory.r) && k.b(this.s, repositoryDiscussionsIntentData$DeeplinkWithCategory.s) && k.b(this.t, repositoryDiscussionsIntentData$DeeplinkWithCategory.t) && k.b(this.u, repositoryDiscussionsIntentData$DeeplinkWithCategory.u);
    }

    public final int hashCode() {
        int hashCode = this.r.hashCode() * 31;
        String str = this.s;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.t;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.u;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return i.k(s0.o("DeeplinkWithCategory(repositoryOwner=", this.r, ", repositoryName=", this.s, ", categorySlug="), this.t, ", filtersQuery=", this.u, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    public RepositoryDiscussionsIntentData$DeeplinkWithCategory(String str, String str2, String str3, String str4) {
        k.g(str, "repositoryOwner");
        this.r = str;
        this.s = str2;
        this.t = str3;
        this.u = str4;
    }
}

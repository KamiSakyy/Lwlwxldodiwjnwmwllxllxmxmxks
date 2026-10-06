package com.github.domain.discussions.data;

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
public final class RepositoryDiscussionsIntentData$Basic implements j {
    public final String r;
    public final String s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryDiscussionsIntentData$Basic> CREATOR = new m(20);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryDiscussionsIntentData$Basic$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryDiscussionsIntentData$Basic(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, RepositoryDiscussionsIntentData$Basic$$serializer.INSTANCE.getDescriptor());
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
        if (!(obj instanceof RepositoryDiscussionsIntentData$Basic)) {
            return false;
        }
        RepositoryDiscussionsIntentData$Basic repositoryDiscussionsIntentData$Basic = (RepositoryDiscussionsIntentData$Basic) obj;
        return k.b(this.r, repositoryDiscussionsIntentData$Basic.r) && k.b(this.s, repositoryDiscussionsIntentData$Basic.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("Basic(repositoryOwner=", this.r, ", repositoryName=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    public RepositoryDiscussionsIntentData$Basic(String str, String str2) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        this.r = str;
        this.s = str2;
    }
}

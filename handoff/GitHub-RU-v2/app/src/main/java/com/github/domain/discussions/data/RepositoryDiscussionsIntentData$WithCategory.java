package com.github.domain.discussions.data;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import gn.m;
import jk.j;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryDiscussionsIntentData$WithCategory implements j {
    public String r;
    public String s;
    public DiscussionCategoryData t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryDiscussionsIntentData$WithCategory> CREATOR = new m(24);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryDiscussionsIntentData$WithCategory$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RepositoryDiscussionsIntentData$WithCategory(int i, String str, String str2, DiscussionCategoryData discussionCategoryData) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, RepositoryDiscussionsIntentData$WithCategory$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = discussionCategoryData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoryDiscussionsIntentData$WithCategory)) {
            return false;
        }
        RepositoryDiscussionsIntentData$WithCategory repositoryDiscussionsIntentData$WithCategory = (RepositoryDiscussionsIntentData$WithCategory) obj;
        return k.b(this.r, repositoryDiscussionsIntentData$WithCategory.r) && k.b(this.s, repositoryDiscussionsIntentData$WithCategory.s) && k.b(this.t, repositoryDiscussionsIntentData$WithCategory.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("WithCategory(repositoryOwner=", this.r, ", repositoryName=", this.s, ", categoryData=");
        o.append(this.t);
        o.append(")");
        return o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        this.t.writeToParcel(parcel, i);
    }

    public RepositoryDiscussionsIntentData$WithCategory(String str, String str2, DiscussionCategoryData discussionCategoryData) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        k.g(discussionCategoryData, "categoryData");
        this.r = str;
        this.s = str2;
        this.t = discussionCategoryData;
    }
}

package com.github.rudroid.mergequeue.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class MergeQueueEntriesRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f17096r;

    /* renamed from: s, reason: collision with root package name */
    public String f17097s;

    /* renamed from: t, reason: collision with root package name */
    public String f17098t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<MergeQueueEntriesRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return MergeQueueEntriesRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<MergeQueueEntriesRoute> {
        @Override // android.os.Parcelable.Creator
        public final MergeQueueEntriesRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new MergeQueueEntriesRoute(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MergeQueueEntriesRoute[] newArray(int i) {
            return new MergeQueueEntriesRoute[i];
        }
    }

    public /* synthetic */ MergeQueueEntriesRoute(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1Shadow.l(i, 7, MergeQueueEntriesRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17096r = str;
        this.f17097s = str2;
        this.f17098t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeQueueEntriesRoute)) {
            return false;
        }
        MergeQueueEntriesRoute mergeQueueEntriesRoute = (MergeQueueEntriesRoute) obj;
        return k.b(this.f17096r, mergeQueueEntriesRoute.f17096r) && k.b(this.f17097s, mergeQueueEntriesRoute.f17097s) && k.b(this.f17098t, mergeQueueEntriesRoute.f17098t);
    }

    public final int hashCode() {
        return this.f17098t.hashCode() + h1.i(this.f17096r.hashCode() * 31, this.f17097s, 31);
    }

    public final String toString() {
        return h1.p(s0.o("MergeQueueEntriesRoute(repositoryOwner=", this.f17096r, ", repositoryName=", this.f17097s, ", branchName="), this.f17098t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f17096r);
        parcel.writeString(this.f17097s);
        parcel.writeString(this.f17098t);
    }

    public MergeQueueEntriesRoute(String str, String str2, String str3) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        k.g(str3, "branchName");
        this.f17096r = str;
        this.f17097s = str2;
        this.f17098t = str3;
    }
}

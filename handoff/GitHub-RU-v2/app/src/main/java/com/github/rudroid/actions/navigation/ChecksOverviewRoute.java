package com.github.rudroid.actions.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sa.d;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ChecksOverviewRoute implements Parcelable, d {

    /* renamed from: r, reason: collision with root package name */
    public final String f5115r;

    /* renamed from: s, reason: collision with root package name */
    public final String f5116s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ChecksOverviewRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return ChecksOverviewRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<ChecksOverviewRoute> {
        @Override // android.os.Parcelable.Creator
        public final ChecksOverviewRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new ChecksOverviewRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChecksOverviewRoute[] newArray(int i) {
            return new ChecksOverviewRoute[i];
        }
    }

    public /* synthetic */ ChecksOverviewRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, ChecksOverviewRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f5115r = str;
        this.f5116s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChecksOverviewRoute)) {
            return false;
        }
        ChecksOverviewRoute checksOverviewRoute = (ChecksOverviewRoute) obj;
        return k.b(this.f5115r, checksOverviewRoute.f5115r) && k.b(this.f5116s, checksOverviewRoute.f5116s);
    }

    public final int hashCode() {
        return this.f5116s.hashCode() + (this.f5115r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("ChecksOverviewRoute(commitId=", this.f5115r, ", pullRequestId=", this.f5116s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f5115r);
        parcel.writeString(this.f5116s);
    }

    public ChecksOverviewRoute(String str, String str2) {
        k.g(str, "commitId");
        k.g(str2, "pullRequestId");
        this.f5115r = str;
        this.f5116s = str2;
    }
}

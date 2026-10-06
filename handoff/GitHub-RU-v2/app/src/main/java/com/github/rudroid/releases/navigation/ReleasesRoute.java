package com.github.rudroid.releases.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ReleasesRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f18933r;

    /* renamed from: s, reason: collision with root package name */
    public String f18934s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ReleasesRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return ReleasesRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<ReleasesRoute> {
        @Override // android.os.Parcelable.Creator
        public final ReleasesRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new ReleasesRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReleasesRoute[] newArray(int i) {
            return new ReleasesRoute[i];
        }
    }

    public /* synthetic */ ReleasesRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, ReleasesRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18933r = str;
        this.f18934s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReleasesRoute)) {
            return false;
        }
        ReleasesRoute releasesRoute = (ReleasesRoute) obj;
        return k.b(this.f18933r, releasesRoute.f18933r) && k.b(this.f18934s, releasesRoute.f18934s);
    }

    public final int hashCode() {
        return this.f18934s.hashCode() + (this.f18933r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("ReleasesRoute(repositoryOwner=", this.f18933r, ", repositoryName=", this.f18934s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f18933r);
        parcel.writeString(this.f18934s);
    }

    public ReleasesRoute(String str, String str2) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        this.f18933r = str;
        this.f18934s = str2;
    }
}

package com.github.rudroid.releases.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import gf.c;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class ReleaseRoute implements Parcelable, c {

    /* renamed from: r, reason: collision with root package name */
    public final String f18930r;

    /* renamed from: s, reason: collision with root package name */
    public final String f18931s;

    /* renamed from: t, reason: collision with root package name */
    public final String f18932t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ReleaseRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return ReleaseRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<ReleaseRoute> {
        @Override // android.os.Parcelable.Creator
        public final ReleaseRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new ReleaseRoute(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReleaseRoute[] newArray(int i) {
            return new ReleaseRoute[i];
        }
    }

    public /* synthetic */ ReleaseRoute(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1.l(i, 7, ReleaseRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f18930r = str;
        this.f18931s = str2;
        this.f18932t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReleaseRoute)) {
            return false;
        }
        ReleaseRoute releaseRoute = (ReleaseRoute) obj;
        return k.b(this.f18930r, releaseRoute.f18930r) && k.b(this.f18931s, releaseRoute.f18931s) && k.b(this.f18932t, releaseRoute.f18932t);
    }

    public final int hashCode() {
        return this.f18932t.hashCode() + h1.i(this.f18930r.hashCode() * 31, this.f18931s, 31);
    }

    public final String toString() {
        return h1.p(s0.o("ReleaseRoute(repositoryOwner=", this.f18930r, ", repositoryName=", this.f18931s, ", tagName="), this.f18932t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f18930r);
        parcel.writeString(this.f18931s);
        parcel.writeString(this.f18932t);
    }

    public ReleaseRoute(String str, String str2, String str3) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        k.g(str3, "tagName");
        this.f18930r = str;
        this.f18931s = str2;
        this.f18932t = str3;
    }
}

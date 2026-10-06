package com.github.rudroid.repository.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class LicenseContentsRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public String f20014r;

    /* renamed from: s, reason: collision with root package name */
    public String f20015s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<LicenseContentsRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return LicenseContentsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<LicenseContentsRoute> {
        @Override // android.os.Parcelable.Creator
        public final LicenseContentsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new LicenseContentsRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LicenseContentsRoute[] newArray(int i) {
            return new LicenseContentsRoute[i];
        }
    }

    public /* synthetic */ LicenseContentsRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, LicenseContentsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f20014r = str;
        this.f20015s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LicenseContentsRoute)) {
            return false;
        }
        LicenseContentsRoute licenseContentsRoute = (LicenseContentsRoute) obj;
        return k.b(this.f20014r, licenseContentsRoute.f20014r) && k.b(this.f20015s, licenseContentsRoute.f20015s);
    }

    public final int hashCode() {
        return this.f20015s.hashCode() + (this.f20014r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("LicenseContentsRoute(repositoryOwner=", this.f20014r, ", repositoryName=", this.f20015s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f20014r);
        parcel.writeString(this.f20015s);
    }

    public LicenseContentsRoute(String str, String str2) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        this.f20014r = str;
        this.f20015s = str2;
    }
}

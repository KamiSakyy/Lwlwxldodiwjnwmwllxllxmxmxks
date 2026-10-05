package com.github.rudroid.issueorpullrequest.navigation;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import g81.e;
import jo.f4;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class FilesChangedRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final String f15769r;

    /* renamed from: s, reason: collision with root package name */
    public final String f15770s;

    /* renamed from: t, reason: collision with root package name */
    public final int f15771t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15772u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15773v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FilesChangedRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return FilesChangedRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<FilesChangedRoute> {
        @Override // android.os.Parcelable.Creator
        public final FilesChangedRoute createFromParcel(Parcel parcel) {
            boolean z10;
            k.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new FilesChangedRoute(readInt, readString, readString2, z11, parcel.readInt() == 0 ? z10 : true);
        }

        @Override // android.os.Parcelable.Creator
        public final FilesChangedRoute[] newArray(int i) {
            return new FilesChangedRoute[i];
        }
    }

    public /* synthetic */ FilesChangedRoute(int i, String str, String str2, int i10, boolean z10, boolean z11) {
        if (7 != (i & 7)) {
            c1.l(i, 7, FilesChangedRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f15769r = str;
        this.f15770s = str2;
        this.f15771t = i10;
        if ((i & 8) == 0) {
            this.f15772u = false;
        } else {
            this.f15772u = z10;
        }
        if ((i & 16) == 0) {
            this.f15773v = false;
        } else {
            this.f15773v = z11;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilesChangedRoute)) {
            return false;
        }
        FilesChangedRoute filesChangedRoute = (FilesChangedRoute) obj;
        return k.b(this.f15769r, filesChangedRoute.f15769r) && k.b(this.f15770s, filesChangedRoute.f15770s) && this.f15771t == filesChangedRoute.f15771t && this.f15772u == filesChangedRoute.f15772u && this.f15773v == filesChangedRoute.f15773v;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15773v) + i.e(s0.b(this.f15771t, h1.i(this.f15769r.hashCode() * 31, this.f15770s, 31), 31), 31, this.f15772u);
    }

    public final String toString() {
        StringBuilder o5 = s0.o("FilesChangedRoute(repositoryOwner=", this.f15769r, ", repositoryName=", this.f15770s, ", number=");
        m0.w(o5, this.f15771t, ", isAuthor=", this.f15772u, ", hasPendingReview=");
        return f4.s(o5, this.f15773v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f15769r);
        parcel.writeString(this.f15770s);
        parcel.writeInt(this.f15771t);
        parcel.writeInt(this.f15772u ? 1 : 0);
        parcel.writeInt(this.f15773v ? 1 : 0);
    }

    public FilesChangedRoute(int i, String str, String str2, boolean z10, boolean z11) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        this.f15769r = str;
        this.f15770s = str2;
        this.f15771t = i;
        this.f15772u = z10;
        this.f15773v = z11;
    }
}

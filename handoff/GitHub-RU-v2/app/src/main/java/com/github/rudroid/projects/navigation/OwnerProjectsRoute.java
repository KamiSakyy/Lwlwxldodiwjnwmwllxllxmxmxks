package com.github.rudroid.projects.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class OwnerProjectsRoute implements Parcelable, bf.a {

    /* renamed from: r, reason: collision with root package name */
    public String f17754r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<OwnerProjectsRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return OwnerProjectsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<OwnerProjectsRoute> {
        @Override // android.os.Parcelable.Creator
        public final OwnerProjectsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new OwnerProjectsRoute(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnerProjectsRoute[] newArray(int i) {
            return new OwnerProjectsRoute[i];
        }
    }

    public OwnerProjectsRoute(String str) {
        k.g(str, "userOrOrgLogin");
        this.f17754r = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OwnerProjectsRoute) && k.b(this.f17754r, ((OwnerProjectsRoute) obj).f17754r);
    }

    public final int hashCode() {
        return this.f17754r.hashCode();
    }

    public final String toString() {
        return f1.e.z("OwnerProjectsRoute(userOrOrgLogin=", this.f17754r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f17754r);
    }

    public /* synthetic */ OwnerProjectsRoute(String str, int i) {
        if (1 == (i & 1)) {
            this.f17754r = str;
        } else {
            c1Shadow.l(i, 1, OwnerProjectsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}

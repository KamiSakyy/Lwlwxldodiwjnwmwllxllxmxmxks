package com.github.rudroid.projects.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bf.f;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class RepositoryProjectsRoute implements Parcelable, f {

    /* renamed from: r, reason: collision with root package name */
    public final String f17769r;

    /* renamed from: s, reason: collision with root package name */
    public final String f17770s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryProjectsRoute> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryProjectsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<RepositoryProjectsRoute> {
        @Override // android.os.Parcelable.Creator
        public final RepositoryProjectsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new RepositoryProjectsRoute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RepositoryProjectsRoute[] newArray(int i) {
            return new RepositoryProjectsRoute[i];
        }
    }

    public /* synthetic */ RepositoryProjectsRoute(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1.l(i, 3, RepositoryProjectsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f17769r = str;
        this.f17770s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoryProjectsRoute)) {
            return false;
        }
        RepositoryProjectsRoute repositoryProjectsRoute = (RepositoryProjectsRoute) obj;
        return k.b(this.f17769r, repositoryProjectsRoute.f17769r) && k.b(this.f17770s, repositoryProjectsRoute.f17770s);
    }

    public final int hashCode() {
        return this.f17770s.hashCode() + (this.f17769r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("RepositoryProjectsRoute(repositoryName=", this.f17769r, ", repositoryOwner=", this.f17770s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f17769r);
        parcel.writeString(this.f17770s);
    }

    public RepositoryProjectsRoute(String str, String str2) {
        k.g(str, "repositoryName");
        k.g(str2, "repositoryOwner");
        this.f17769r = str;
        this.f17770s = str2;
    }
}

package com.github.rudroid.discussions.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import jk.j;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class RepositoryDiscussionsRoute implements Parcelable, oc.e {

    /* renamed from: r, reason: collision with root package name */
    public j f11582r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryDiscussionsRoute> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f11581s = {w.s(i.r, new kh.a(26))};

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryDiscussionsRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<RepositoryDiscussionsRoute> {
        @Override // android.os.Parcelable.Creator
        public final RepositoryDiscussionsRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new RepositoryDiscussionsRoute(parcel.readParcelable(RepositoryDiscussionsRoute.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RepositoryDiscussionsRoute[] newArray(int i) {
            return new RepositoryDiscussionsRoute[i];
        }
    }

    public /* synthetic */ RepositoryDiscussionsRoute(int i, j jVar) {
        if (1 == (i & 1)) {
            this.f11582r = jVar;
        } else {
            c1Shadow.l(i, 1, RepositoryDiscussionsRoute$$serializer.INSTANCE.getDescriptor());
            throw null;
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
        return (obj instanceof RepositoryDiscussionsRoute) && k.b(this.f11582r, ((RepositoryDiscussionsRoute) obj).f11582r);
    }

    public final int hashCode() {
        return this.f11582r.hashCode();
    }

    public final String toString() {
        return "RepositoryDiscussionsRoute(intentData=" + this.f11582r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.f11582r, i);
    }

    public RepositoryDiscussionsRoute(j jVar) {
        k.g(jVar, "intentData");
        this.f11582r = jVar;
    }
}

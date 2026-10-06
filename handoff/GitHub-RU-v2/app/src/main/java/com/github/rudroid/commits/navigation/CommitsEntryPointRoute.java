package com.github.rudroid.commits.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.commits.CommitsType;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import ob.c;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class CommitsEntryPointRoute implements Parcelable, c {

    /* renamed from: r, reason: collision with root package name */
    public CommitsType f9212r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CommitsEntryPointRoute> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f9211s = {w.s(i.r, new kh.a(22))};

    public static final class Companion {
        public final KSerializer serializer() {
            return CommitsEntryPointRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<CommitsEntryPointRoute> {
        @Override // android.os.Parcelable.Creator
        public final CommitsEntryPointRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new CommitsEntryPointRoute((CommitsType) parcel.readParcelable(CommitsEntryPointRoute.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommitsEntryPointRoute[] newArray(int i) {
            return new CommitsEntryPointRoute[i];
        }
    }

    public /* synthetic */ CommitsEntryPointRoute(int i, CommitsType commitsType) {
        if (1 == (i & 1)) {
            this.f9212r = commitsType;
        } else {
            c1.l(i, 1, CommitsEntryPointRoute$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof CommitsEntryPointRoute) && k.b(this.f9212r, ((CommitsEntryPointRoute) obj).f9212r);
    }

    public final int hashCode() {
        return this.f9212r.hashCode();
    }

    public final String toString() {
        return "CommitsEntryPointRoute(type=" + this.f9212r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.f9212r, i);
    }

    public CommitsEntryPointRoute(CommitsType commitsType) {
        k.g(commitsType, "type");
        this.f9212r = commitsType;
    }
}

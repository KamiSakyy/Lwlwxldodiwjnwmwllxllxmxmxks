package com.github.rudroid.commit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.commit.CommitDataContainer;
import g81.e;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.h;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class CommitRoute implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public CommitDataContainer f9122r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CommitRoute> CREATOR = new a();

    /* renamed from: s, reason: collision with root package name */
    public static final h[] f9121s = {w.s(i.r, new kh.a(19))};

    public static final class Companion {
        public final KSerializer serializer() {
            return CommitRoute$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<CommitRoute> {
        @Override // android.os.Parcelable.Creator
        public final CommitRoute createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new CommitRoute((CommitDataContainer) parcel.readParcelable(CommitRoute.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CommitRoute[] newArray(int i) {
            return new CommitRoute[i];
        }
    }

    public /* synthetic */ CommitRoute(int i, CommitDataContainer commitDataContainer) {
        if (1 == (i & 1)) {
            this.f9122r = commitDataContainer;
        } else {
            c1.l(i, 1, CommitRoute$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof CommitRoute) && k.b(this.f9122r, ((CommitRoute) obj).f9122r);
    }

    public final int hashCode() {
        return this.f9122r.hashCode();
    }

    public final String toString() {
        return "CommitRoute(commitDataContainer=" + this.f9122r + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.f9122r, i);
    }

    public CommitRoute(CommitDataContainer commitDataContainer) {
        k.g(commitDataContainer, "commitDataContainer");
        this.f9122r = commitDataContainer;
    }
}

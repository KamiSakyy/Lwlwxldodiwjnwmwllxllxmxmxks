package com.github.rudroid.repository.model;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import jo.f4;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes.dex */
public final class PendingRepositoryInfo implements Parcelable {

    /* renamed from: r, reason: collision with root package name */
    public final String f19994r;

    /* renamed from: s, reason: collision with root package name */
    public final String f19995s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f19996t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<PendingRepositoryInfo> CREATOR = new a();

    public static final class Companion {
        public final KSerializer serializer() {
            return PendingRepositoryInfo$$serializer.INSTANCE;
        }
    }

    public static final class a implements Parcelable.Creator<PendingRepositoryInfo> {
        @Override // android.os.Parcelable.Creator
        public final PendingRepositoryInfo createFromParcel(Parcel parcel) {
            k.g(parcel, "parcel");
            return new PendingRepositoryInfo(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PendingRepositoryInfo[] newArray(int i) {
            return new PendingRepositoryInfo[i];
        }
    }

    public /* synthetic */ PendingRepositoryInfo(int i, String str, String str2, boolean z10) {
        if (3 != (i & 3)) {
            c1.l(i, 3, PendingRepositoryInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f19994r = str;
        this.f19995s = str2;
        if ((i & 4) == 0) {
            this.f19996t = false;
        } else {
            this.f19996t = z10;
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
        if (!(obj instanceof PendingRepositoryInfo)) {
            return false;
        }
        PendingRepositoryInfo pendingRepositoryInfo = (PendingRepositoryInfo) obj;
        return k.b(this.f19994r, pendingRepositoryInfo.f19994r) && k.b(this.f19995s, pendingRepositoryInfo.f19995s) && this.f19996t == pendingRepositoryInfo.f19996t;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f19996t) + h1.i(this.f19994r.hashCode() * 31, this.f19995s, 31);
    }

    public final String toString() {
        return f4.s(s0.o("PendingRepositoryInfo(sourceRepositoryOwnerLogin=", this.f19994r, ", sourceRepositoryName=", this.f19995s, ", isTemplateClone="), this.f19996t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.f19994r);
        parcel.writeString(this.f19995s);
        parcel.writeInt(this.f19996t ? 1 : 0);
    }

    public PendingRepositoryInfo(String str, String str2, boolean z10) {
        k.g(str, "sourceRepositoryOwnerLogin");
        k.g(str2, "sourceRepositoryName");
        this.f19994r = str;
        this.f19995s = str2;
        this.f19996t = z10;
    }
}

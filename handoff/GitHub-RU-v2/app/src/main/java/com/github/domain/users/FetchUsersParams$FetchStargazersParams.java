package com.github.domain.users;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import gn.m;
import gn.n;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class FetchUsersParams$FetchStargazersParams implements n {
    public final String r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FetchUsersParams$FetchStargazersParams> CREATOR = new m(4);

    public static final class Companion {
        public final KSerializer serializer() {
            return FetchUsersParams$FetchStargazersParams$$serializer.INSTANCE;
        }
    }

    public FetchUsersParams$FetchStargazersParams(String str) {
        k.g(str, "repoId");
        this.r = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FetchUsersParams$FetchStargazersParams) && k.b(this.r, ((FetchUsersParams$FetchStargazersParams) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return f1.e.z("FetchStargazersParams(repoId=", this.r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
    }

    public /* synthetic */ FetchUsersParams$FetchStargazersParams(String str, int i) {
        if (1 == (i & 1)) {
            this.r = str;
        } else {
            c1.l(i, 1, FetchUsersParams$FetchStargazersParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}

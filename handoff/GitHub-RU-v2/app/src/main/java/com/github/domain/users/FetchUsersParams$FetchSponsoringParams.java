package com.github.domain.users;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import gn.m;
import gn.n;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class FetchUsersParams$FetchSponsoringParams implements n {
    public String r;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FetchUsersParams$FetchSponsoringParams> CREATOR = new m(3);

    public static final class Companion {
        public final KSerializer serializer() {
            return FetchUsersParams$FetchSponsoringParams$$serializer.INSTANCE;
        }
    }

    public FetchUsersParams$FetchSponsoringParams(String str) {
        k.g(str, "userId");
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
        return (obj instanceof FetchUsersParams$FetchSponsoringParams) && k.b(this.r, ((FetchUsersParams$FetchSponsoringParams) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return f1.e.z("FetchSponsoringParams(userId=", this.r, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
    }

    public /* synthetic */ FetchUsersParams$FetchSponsoringParams(String str, int i) {
        if (1 == (i & 1)) {
            this.r = str;
        } else {
            c1Shadow.l(i, 1, FetchUsersParams$FetchSponsoringParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}

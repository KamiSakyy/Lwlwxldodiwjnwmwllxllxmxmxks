package com.github.domain.users;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import gn.m;
import gn.n;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import x.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class FetchUsersParams$FetchReacteesParams implements n {
    public String r;
    public String s;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FetchUsersParams$FetchReacteesParams> CREATOR = new m(1);

    public static final class Companion {
        public final KSerializer serializer() {
            return FetchUsersParams$FetchReacteesParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FetchUsersParams$FetchReacteesParams(String str, int i, String str2) {
        if (3 != (i & 3)) {
            c1Shadow.l(i, 3, FetchUsersParams$FetchReacteesParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchUsersParams$FetchReacteesParams)) {
            return false;
        }
        FetchUsersParams$FetchReacteesParams fetchUsersParams$FetchReacteesParams = (FetchUsersParams$FetchReacteesParams) obj;
        return k.b(this.r, fetchUsersParams$FetchReacteesParams.r) && k.b(this.s, fetchUsersParams$FetchReacteesParams.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return i.g("FetchReacteesParams(subject=", this.r, ", contentType=", this.s, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
    }

    public FetchUsersParams$FetchReacteesParams(String str, String str2) {
        k.g(str, "subject");
        k.g(str2, "contentType");
        this.r = str;
        this.s = str2;
    }
}

package com.github.domain.users;

import a0.s0;
import android.os.Parcel;
import android.os.Parcelable;
import com.github.rudroid.copilot.h1;
import g81.e;
import gn.m;
import gn.n;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class FetchUsersParams$FetchReleaseMentionsParams implements n {
    public final String r;
    public final String s;
    public final String t;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FetchUsersParams$FetchReleaseMentionsParams> CREATOR = new m(2);

    public static final class Companion {
        public final KSerializer serializer() {
            return FetchUsersParams$FetchReleaseMentionsParams$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FetchUsersParams$FetchReleaseMentionsParams(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            c1.l(i, 7, FetchUsersParams$FetchReleaseMentionsParams$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FetchUsersParams$FetchReleaseMentionsParams)) {
            return false;
        }
        FetchUsersParams$FetchReleaseMentionsParams fetchUsersParams$FetchReleaseMentionsParams = (FetchUsersParams$FetchReleaseMentionsParams) obj;
        return k.b(this.r, fetchUsersParams$FetchReleaseMentionsParams.r) && k.b(this.s, fetchUsersParams$FetchReleaseMentionsParams.s) && k.b(this.t, fetchUsersParams$FetchReleaseMentionsParams.t);
    }

    public final int hashCode() {
        return this.t.hashCode() + h1.i(this.r.hashCode() * 31, this.s, 31);
    }

    public final String toString() {
        return h1.p(s0.o("FetchReleaseMentionsParams(repositoryOwner=", this.r, ", repositoryName=", this.s, ", tagName="), this.t, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
    }

    public FetchUsersParams$FetchReleaseMentionsParams(String str, String str2, String str3) {
        k.g(str, "repositoryOwner");
        k.g(str2, "repositoryName");
        k.g(str3, "tagName");
        this.r = str;
        this.s = str2;
        this.t = str3;
    }
}

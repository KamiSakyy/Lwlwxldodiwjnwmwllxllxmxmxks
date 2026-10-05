package com.github.domain.users;

import android.os.Parcel;
import android.os.Parcelable;
import f1.u5;
import g81.e;
import gn.m;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class UserViewType$Stargazers extends a {
    public static final UserViewType$Stargazers INSTANCE = new UserViewType$Stargazers(2131954943);
    public static final Parcelable.Creator<UserViewType$Stargazers> CREATOR = new m(12);
    public static final /* synthetic */ Object t = w.s(i.r, new u5(27));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UserViewType$Stargazers);
    }

    public final int hashCode() {
        return -1914086390;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) t.getValue();
    }

    public final String toString() {
        return "Stargazers";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}

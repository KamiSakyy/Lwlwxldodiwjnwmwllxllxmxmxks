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
public final class UserViewType$Reactees extends a {
    public static final UserViewType$Reactees INSTANCE = new UserViewType$Reactees(2131954941);
    public static final Parcelable.Creator<UserViewType$Reactees> CREATOR = new m(9);
    public static final /* synthetic */ Object t = w.s(i.r, new u5(24));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UserViewType$Reactees);
    }

    public final int hashCode() {
        return -1944577242;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) t.getValue();
    }

    public final String toString() {
        return "Reactees";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}

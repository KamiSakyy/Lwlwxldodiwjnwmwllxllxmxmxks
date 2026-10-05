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
public final class UserViewType$Sponsoring extends a {
    public static final UserViewType$Sponsoring INSTANCE = new UserViewType$Sponsoring(2131954942);
    public static final Parcelable.Creator<UserViewType$Sponsoring> CREATOR = new m(11);
    public static final /* synthetic */ Object t = w.s(i.r, new u5(26));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UserViewType$Sponsoring);
    }

    public final int hashCode() {
        return 751502138;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) t.getValue();
    }

    public final String toString() {
        return "Sponsoring";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}

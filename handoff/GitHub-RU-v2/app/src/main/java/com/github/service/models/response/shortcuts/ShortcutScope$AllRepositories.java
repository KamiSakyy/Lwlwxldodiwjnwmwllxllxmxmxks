package com.github.service.models.response.shortcuts;

import android.os.Parcel;
import android.os.Parcelable;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import l7.c0;
import q01.p;
import sy.w;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes4.dex */
public final class ShortcutScope$AllRepositories extends a {
    public static final ShortcutScope$AllRepositories INSTANCE = new ShortcutScope$AllRepositories();
    public static final Parcelable.Creator<ShortcutScope$AllRepositories> CREATOR = new c0(8);
    public static final /* synthetic */ Object s = w.s(i.r, new p(0));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) s.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}

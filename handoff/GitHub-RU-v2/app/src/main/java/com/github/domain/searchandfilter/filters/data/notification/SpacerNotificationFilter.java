package com.github.domain.searchandfilter.filters.data.notification;

import android.os.Parcel;
import android.os.Parcelable;
import f1.u5;
import g81.e;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;
import w61.i;

@e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SpacerNotificationFilter extends a {
    public static final SpacerNotificationFilter INSTANCE = new SpacerNotificationFilter();
    public static final Parcelable.Creator<SpacerNotificationFilter> CREATOR = new f8.a(26);
    public static final /* synthetic */ Object s = w.s(i.r, new u5(18));

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String c() {
        return "";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.github.domain.searchandfilter.filters.data.notification.a
    public final String getId() {
        return "";
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

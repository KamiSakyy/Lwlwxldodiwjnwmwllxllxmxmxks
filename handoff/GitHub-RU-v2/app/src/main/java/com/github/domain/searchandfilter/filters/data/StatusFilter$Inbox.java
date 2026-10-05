package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.o;
import bm.p;
import java.util.List;
import k71.k;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class StatusFilter$Inbox extends i {
    public static final StatusFilter$Inbox INSTANCE = new StatusFilter$Inbox("inbox");
    public static final Parcelable.Creator<StatusFilter$Inbox> CREATOR = new o(23);
    public static final /* synthetic */ Object z = w.s(w61.i.r, new p(26));

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StatusFilter$Inbox);
    }

    public final int hashCode() {
        return -1996367744;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) z.getValue();
    }

    public final String toString() {
        return "Inbox";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}

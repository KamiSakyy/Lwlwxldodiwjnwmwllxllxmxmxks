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
public final class StatusFilter$Saved extends i {
    public static final StatusFilter$Saved INSTANCE = new StatusFilter$Saved("saved");
    public static final Parcelable.Creator<StatusFilter$Saved> CREATOR = new o(24);
    public static final /* synthetic */ Object z = w.s(w61.i.r, new p(27));

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof StatusFilter$Saved);
    }

    public final int hashCode() {
        return -1987500927;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "is:saved";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w61.h] */
    public final KSerializer serializer() {
        return (KSerializer) z.getValue();
    }

    public final String toString() {
        return "Saved";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeInt(1);
    }
}

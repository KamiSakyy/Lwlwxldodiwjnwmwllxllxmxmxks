package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import t71.p;
import w80.n3;
import x61.m;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class CustomFilter extends d {
    public String v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<CustomFilter> CREATOR = new a21.g(16);
    public static final w61.h[] w = {w.s(w61.i.r, new c2(21)), null, null};
    public static final n3 x = new n3(1);

    public static final class Companion {
        public final KSerializer serializer() {
            return CustomFilter$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CustomFilter(int i, l lVar, String str, String str2) {
        super(i, lVar, str);
        if (5 != (i & 5)) {
            c1.l(i, 5, CustomFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.v = str2;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return !p.T(this.v);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CustomFilter) && k.b(this.v, ((CustomFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        if (m.n0(arrayList, new ac.c(12, this))) {
            return new CustomFilter(this.v);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        return this.v;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return this.v;
    }

    public final String toString() {
        return f1.e.z("CustomFilter(text=", this.v, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFilter(String str) {
        super(l.T, str);
        k.g(str, "text");
        this.v = str;
    }
}

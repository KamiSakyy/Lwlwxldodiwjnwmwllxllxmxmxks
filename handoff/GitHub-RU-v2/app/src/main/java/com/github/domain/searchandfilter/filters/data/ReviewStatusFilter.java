package com.github.domain.searchandfilter.filters.data;

import a5.g1;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.k0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.n;
import x61.x;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ReviewStatusFilter extends d {
    public static final w61.h[] w;
    public static final k0 x;
    public static final w50.c y;
    public k0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ReviewStatusFilter> CREATOR = new o(18);

    public static final class Companion {
        public final KSerializer serializer() {
            return ReviewStatusFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(17)), null, w.s(iVar, new p(18))};
        x = k0.s;
        y = new w50.c(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReviewStatusFilter(int i, l lVar, String str, k0 k0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, ReviewStatusFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = k0Var;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v != x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReviewStatusFilter) && this.v == ((ReviewStatusFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        d71.b bVar = k0.u;
        int s = x.s(n.F(bVar, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        g1 g1Var = new g1(8, bVar);
        while (g1Var.hasNext()) {
            Object next = g1Var.next();
            linkedHashMap.put(((k0) next).r, next);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 11));
        k0 k0Var = (k0) wVar.r;
        if (k0Var != null) {
            return new ReviewStatusFilter(k0Var);
        }
        if (z) {
            return null;
        }
        return new ReviewStatusFilter(k0.s);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.ReviewStatus", k0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return this.v.r;
    }

    public final String toString() {
        return "ReviewStatusFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewStatusFilter(k0 k0Var) {
        super(l.K, "FILTER_REVIEW_STATUS");
        k.g(k0Var, "filter");
        this.v = k0Var;
    }

}

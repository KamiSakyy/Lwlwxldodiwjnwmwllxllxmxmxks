package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.m0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import sy.w;
import w80.t;
import x61.m;
import x61.x;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class SortFilter extends d {
    public static final w61.h[] w;
    public static final m0 x;
    public static final t y;
    public final m0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<SortFilter> CREATOR = new o(20);

    public static final class Companion {
        public final KSerializer serializer() {
            return SortFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(20)), null, w.s(iVar, new p(21))};
        x = m0.r;
        y = new t(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SortFilter(int i, l lVar, String str, m0 m0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, SortFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = m0Var;
        }
    }

    public static String z(m0 m0Var) {
        switch (m0Var.ordinal()) {
            case 0:
                return "sort:created-desc";
            case 1:
                return "sort:created-asc";
            case 2:
                return "sort:comments-desc";
            case 3:
                return "sort:comments-asc";
            case 4:
                return "sort:updated-desc";
            case 5:
                return "sort:updated-asc";
            case 6:
                return "sort:reactions-+1-desc";
            case 7:
                return "sort:reactions--1-desc";
            case 8:
                return "sort:reactions-smile-desc";
            case 9:
                return "sort:reactions-tada-desc";
            case 10:
                return "sort:reactions-thinking_face-desc";
            case 11:
                return "sort:reactions-heart-desc";
            case 12:
                return "sort:reactions-rocket-desc";
            case 13:
                return "sort:reactions-eyes-desc";
            default:
                throw new NoWhenBranchMatchedException();
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
        return (obj instanceof SortFilter) && this.v == ((SortFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        m0[] values = m0.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (m0 m0Var : values) {
            linkedHashMap.put(z(m0Var), m0Var);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 12));
        m0 m0Var2 = (m0) wVar.r;
        if (m0Var2 != null) {
            return new SortFilter(m0Var2);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.SearchFilterSort", m0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return z(this.v);
    }

    public final String toString() {
        return "SortFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ SortFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SortFilter(m0 m0Var) {
        super(l.s, "FILTER_SORT");
        k.g(m0Var, "filter");
        this.v = m0Var;
    }
}

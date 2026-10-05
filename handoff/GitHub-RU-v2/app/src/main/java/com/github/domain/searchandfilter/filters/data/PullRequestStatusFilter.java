package com.github.domain.searchandfilter.filters.data;

import a5.g1;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.n;
import x61.r;
import x61.x;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PullRequestStatusFilter extends d {
    public static final w61.h[] w;
    public static final g0 x;
    public static final k60.f y;
    public final g0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<PullRequestStatusFilter> CREATOR = new o(10);

    public static final class Companion {
        public final KSerializer serializer() {
            return PullRequestStatusFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(1)), null, w.s(iVar, new p(2))};
        x = g0.r;
        y = new k60.f(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PullRequestStatusFilter(int i, l lVar, String str, g0 g0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, PullRequestStatusFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = g0Var;
        }
    }

    public static String z(g0 g0Var, List list) {
        String str;
        int ordinal = g0Var.ordinal();
        if (ordinal == 0) {
            str = "is:open";
        } else if (ordinal == 1) {
            str = "is:merged";
        } else if (ordinal == 2) {
            str = "is:closed";
        } else if (ordinal == 3) {
            str = "is:queued";
        } else {
            if (ordinal != 4) {
                throw new NoWhenBranchMatchedException();
            }
            str = "";
        }
        if (str.length() <= 0) {
            return str;
        }
        if (list != null && list.isEmpty()) {
            return str;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if ((dVar instanceof IsDraftFilter) && !((IsDraftFilter) dVar).v) {
                return str.concat(" -is:draft");
            }
        }
        return str;
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
        return (obj instanceof PullRequestStatusFilter) && this.v == ((PullRequestStatusFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        d71.b bVar = g0.u;
        int s = x.s(n.F(bVar, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        g1 g1Var = new g1(8, bVar);
        while (g1Var.hasNext()) {
            Object next = g1Var.next();
            linkedHashMap.put(z((g0) next, r.r), next);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 7));
        g0 g0Var = (g0) wVar.r;
        if (g0Var != null) {
            return new PullRequestStatusFilter(g0Var);
        }
        if (z) {
            return null;
        }
        return new PullRequestStatusFilter(g0.s);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.PullRequestStatus", g0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return z(this.v, list);
    }

    public final String toString() {
        return "PullRequestStatusFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ PullRequestStatusFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRequestStatusFilter(g0 g0Var) {
        super(l.t, "FILTER_PR_STATUS");
        k.g(g0Var, "filter");
        this.v = g0Var;
    }
}

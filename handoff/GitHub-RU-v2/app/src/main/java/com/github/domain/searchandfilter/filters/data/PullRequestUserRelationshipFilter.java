package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.h0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.x;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class PullRequestUserRelationshipFilter extends d {
    public static final w61.h[] w;
    public static final h0 x;
    public static final la0.d y;
    public final h0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<PullRequestUserRelationshipFilter> CREATOR = new o(11);

    public static final class Companion {
        public final KSerializer serializer() {
            return PullRequestUserRelationshipFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(3)), null, w.s(iVar, new p(4))};
        x = h0.r;
        y = new la0.d(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PullRequestUserRelationshipFilter(int i, l lVar, String str, h0 h0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, PullRequestUserRelationshipFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = h0Var;
        }
    }

    public static String z(h0 h0Var) {
        int ordinal = h0Var.ordinal();
        if (ordinal == 0) {
            return "author:@me";
        }
        if (ordinal == 1) {
            return "assignee:@me";
        }
        if (ordinal == 2) {
            return "mentions:@me";
        }
        if (ordinal == 3) {
            return "review-requested:@me";
        }
        if (ordinal == 4) {
            return "involves:@me";
        }
        throw new NoWhenBranchMatchedException();
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
        return (obj instanceof PullRequestUserRelationshipFilter) && this.v == ((PullRequestUserRelationshipFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        h0[] values = h0.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (h0 h0Var : values) {
            linkedHashMap.put(z(h0Var), h0Var);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 8));
        h0 h0Var2 = (h0) wVar.r;
        if (h0Var2 != null) {
            return new PullRequestUserRelationshipFilter(h0Var2);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.PullRequestUserRelationship", h0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return z(this.v);
    }

    public final String toString() {
        return "PullRequestUserRelationshipFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRequestUserRelationshipFilter(h0 h0Var) {
        super(l.C, "FILTER_PULL_REQUEST_USER_RELATIONSHIP");
        k.g(h0Var, "filter");
        this.v = h0Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h0<T1,T2,T3,T4> {
        public h0() {
        }
    }
}

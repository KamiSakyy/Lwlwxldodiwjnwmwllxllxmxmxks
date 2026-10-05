package com.github.domain.searchandfilter.filters.data;

import a0.c2;
import a5.g1;
import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import x61.m;
import x61.n;
import x61.x;
import z70.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class DiscussionStatusFilter extends d {
    public static final w61.h[] w;
    public static final com.github.rudroid.common.h x;
    public static final w y;
    public final com.github.rudroid.common.h v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DiscussionStatusFilter> CREATOR = new a21.g(19);

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionStatusFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{sy.w.s(iVar, new c2(25)), null, sy.w.s(iVar, new c2(26))};
        x = com.github.rudroid.common.h.r;
        y = new w(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscussionStatusFilter(int i, l lVar, String str, com.github.rudroid.common.h hVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, DiscussionStatusFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = hVar;
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
        return (obj instanceof DiscussionStatusFilter) && this.v == ((DiscussionStatusFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        String str;
        d71.b bVar = com.github.rudroid.common.h.u;
        int s = x.s(n.F(bVar, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        g1 g1Var = new g1(8, bVar);
        while (g1Var.hasNext()) {
            Object next = g1Var.next();
            int ordinal = ((com.github.rudroid.common.h) next).ordinal();
            if (ordinal == 0) {
                str = "is:open";
            } else if (ordinal == 1) {
                str = "is:closed";
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "";
            }
            linkedHashMap.put(str, next);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 0));
        com.github.rudroid.common.h hVar = (com.github.rudroid.common.h) wVar.r;
        if (hVar != null) {
            return new DiscussionStatusFilter(hVar);
        }
        if (z) {
            return null;
        }
        return new DiscussionStatusFilter(com.github.rudroid.common.h.s);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.DiscussionStatus", com.github.rudroid.common.h.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            return "is:open";
        }
        if (ordinal == 1) {
            return "is:closed";
        }
        if (ordinal == 2) {
            return "";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "DiscussionStatusFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ DiscussionStatusFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscussionStatusFilter(com.github.rudroid.common.h hVar) {
        super(l.Z, "FILTER_DISCUSSION_STATUS");
        k.g(hVar, "filter");
        this.v = hVar;
    }
}

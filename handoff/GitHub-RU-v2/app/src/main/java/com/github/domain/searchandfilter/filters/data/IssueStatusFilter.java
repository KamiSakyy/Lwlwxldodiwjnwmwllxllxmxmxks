package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.rudroid.common.w;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import k81.z;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import x61.m;
import x61.x;
import z70.a3;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class IssueStatusFilter extends d {
    public static final w61.h[] w;
    public static final w x;
    public static final a3 y;
    public w v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IssueStatusFilter> CREATOR = new a21.g(24);

    public static final class Companion {
        public final KSerializer serializer() {
            return IssueStatusFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{sy.w.s(iVar, new bm.i(5)), null, sy.w.s(iVar, new bm.i(6))};
        x = w.r;
        y = new a3(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IssueStatusFilter(int i, l lVar, String str, w wVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, IssueStatusFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = wVar;
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
        return (obj instanceof IssueStatusFilter) && this.v == ((IssueStatusFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        String str;
        Enum[] values = w.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Enum r4 : values) {
            int ordinal = r4.ordinal();
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
            linkedHashMap.put(str, r4);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 3));
        w wVar2 = (w) wVar.r;
        if (wVar2 != null) {
            return new IssueStatusFilter(wVar2);
        }
        if (z) {
            return null;
        }
        return new IssueStatusFilter(w.s);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.IssueStatus", w.values()), this.v);
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
        return "IssueStatusFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ IssueStatusFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueStatusFilter(w wVar) {
        super(l.A, "FILTER_ISSUE_STATUS");
        k.g(wVar, "filter");
        this.v = wVar;
    }

}

package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import com.github.rudroid.common.x;
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
import z70.m3;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class IssueUserRelationshipFilter extends d {
    public static final w61.h[] w;
    public static final x x;
    public static final m3 y;
    public final x v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<IssueUserRelationshipFilter> CREATOR = new a21.g(26);

    public static final class Companion {
        public final KSerializer serializer() {
            return IssueUserRelationshipFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(8)), null, w.s(iVar, new bm.i(9))};
        x = x.r;
        y = new m3(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IssueUserRelationshipFilter(int i, l lVar, String str, x xVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, IssueUserRelationshipFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = xVar;
        }
    }

    public static String z(x xVar) {
        int ordinal = xVar.ordinal();
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
        return (obj instanceof IssueUserRelationshipFilter) && this.v == ((IssueUserRelationshipFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        x[] values = x.values();
        int s = x61.x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (x xVar : values) {
            linkedHashMap.put(z(xVar), xVar);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 4));
        x xVar2 = (x) wVar.r;
        if (xVar2 != null) {
            return new IssueUserRelationshipFilter(xVar2);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.IssueUserRelationship", x.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return z(this.v);
    }

    public final String toString() {
        return "IssueUserRelationshipFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueUserRelationshipFilter(x xVar) {
        super(l.E, "FILTER_ISSUE_USER_RELATIONSHIP");
        k.g(xVar, "filter");
        this.v = xVar;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class x<T1,T2,T3,T4> {
        public x() {
        }
    }
}

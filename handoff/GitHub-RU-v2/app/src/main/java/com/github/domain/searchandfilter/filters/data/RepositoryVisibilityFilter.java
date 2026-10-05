package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.j0;
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
public final class RepositoryVisibilityFilter extends d {
    public static final w61.h[] w;
    public static final j0 x;
    public static final rb0.b y;
    public final j0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryVisibilityFilter> CREATOR = new o(16);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryVisibilityFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(14)), null, w.s(iVar, new p(15))};
        x = j0.r;
        y = new rb0.b(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepositoryVisibilityFilter(int i, l lVar, String str, j0 j0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, RepositoryVisibilityFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = j0Var;
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
        return (obj instanceof RepositoryVisibilityFilter) && this.v == ((RepositoryVisibilityFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        String str;
        Enum[] values = j0.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Enum r4 : values) {
            int ordinal = r4.ordinal();
            if (ordinal == 0) {
                str = "";
            } else if (ordinal == 1) {
                str = "is:private";
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "is:public";
            }
            linkedHashMap.put(str, r4);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 10));
        j0 j0Var = (j0) wVar.r;
        if (j0Var != null) {
            return new RepositoryVisibilityFilter(j0Var);
        }
        if (z) {
            return null;
        }
        return new RepositoryVisibilityFilter(j0.r);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.RepositoryVisibility", j0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            return "";
        }
        if (ordinal == 1) {
            return "is:private";
        }
        if (ordinal == 2) {
            return "is:public";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "RepositoryVisibilityFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ RepositoryVisibilityFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryVisibilityFilter(j0 j0Var) {
        super(l.H, "FILTER_REPOSITORY_VISIBILITY");
        k.g(j0Var, "filter");
        this.v = j0Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j0<T1,T2,T3,T4> {
        public j0() {
        }
    }
}

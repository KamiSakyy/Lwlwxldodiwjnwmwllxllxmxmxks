package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import com.github.rudroid.common.e0;
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
public final class ProjectScopeFilter extends d {
    public static final w61.h[] w;
    public static final e0 x;
    public static final i50.c y;
    public final e0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectScopeFilter> CREATOR = new o(7);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectScopeFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(27)), null, w.s(iVar, new bm.i(28))};
        x = e0.r;
        y = new i50.c(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProjectScopeFilter(int i, l lVar, String str, e0 e0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, ProjectScopeFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = e0Var;
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
        return (obj instanceof ProjectScopeFilter) && this.v == ((ProjectScopeFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        String str;
        Enum[] values = e0.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Enum r4 : values) {
            int ordinal = r4.ordinal();
            if (ordinal == 0) {
                str = "";
            } else {
                if (ordinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "creator:@me";
            }
            linkedHashMap.put(str, r4);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 5));
        e0 e0Var = (e0) wVar.r;
        if (e0Var != null) {
            return new ProjectScopeFilter(e0Var);
        }
        if (z) {
            return null;
        }
        return new ProjectScopeFilter(e0.r);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.ProjectScope", e0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        int ordinal = this.v.ordinal();
        if (ordinal == 0) {
            return "";
        }
        if (ordinal == 1) {
            return "creator:@me";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "ProjectScopeFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectScopeFilter(e0 e0Var) {
        super(l.a0, "FILTER_PROJECT_SCOPE");
        k.g(e0Var, "filter");
        this.v = e0Var;
    }

}

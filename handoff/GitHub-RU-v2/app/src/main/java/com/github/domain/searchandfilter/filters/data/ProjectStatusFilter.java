package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.f0;
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
public final class ProjectStatusFilter extends d {
    public static final w61.h[] w;
    public static final f0 x;
    public static final i80.d y;
    public f0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectStatusFilter> CREATOR = new o(8);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectStatusFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(29)), null, w.s(iVar, new p(0))};
        x = f0.r;
        y = new i80.d(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProjectStatusFilter(int i, l lVar, String str, f0 f0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, ProjectStatusFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = f0Var;
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
        return (obj instanceof ProjectStatusFilter) && this.v == ((ProjectStatusFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        String str;
        Enum[] values = f0.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Enum r3 : values) {
            int ordinal = r3.ordinal();
            if (ordinal == 0) {
                str = "is:open";
            } else if (ordinal == 1) {
                str = "is:closed";
            } else {
                if (ordinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "is:template";
            }
            linkedHashMap.put(str, r3);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 6));
        f0 f0Var = (f0) wVar.r;
        if (f0Var != null) {
            return new ProjectStatusFilter(f0Var);
        }
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.ProjectStatus", f0.values()), this.v);
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
            return "is:template";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String toString() {
        return "ProjectStatusFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectStatusFilter(f0 f0Var) {
        super(l.b0, "FILTER_PROJECT_STATUS");
        k.g(f0Var, "filter");
        this.v = f0Var;
    }

}

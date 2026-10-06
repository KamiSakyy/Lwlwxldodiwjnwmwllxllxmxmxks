package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import com.github.rudroid.common.d0;
import e50.z0;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import k81.z;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ProjectOrderFilter extends d {
    public static final w61.h[] w;
    public static final d0 x;
    public static final z0 y;
    public d0 v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectOrderFilter> CREATOR = new o(6);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectOrderFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(25)), null, w.s(iVar, new bm.i(26))};
        x = d0.r;
        y = new z0(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProjectOrderFilter(int i, l lVar, String str, d0 d0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, ProjectOrderFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = d0Var;
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
        return (obj instanceof ProjectOrderFilter) && this.v == ((ProjectOrderFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        return null;
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.rudroid.common.ProjectOrder", d0.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "ProjectOrderFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectOrderFilter(d0 d0Var) {
        super(l.c0, "FILTER_PROJECT_ORDER");
        k.g(d0Var, "filter");
        this.v = d0Var;
    }

}

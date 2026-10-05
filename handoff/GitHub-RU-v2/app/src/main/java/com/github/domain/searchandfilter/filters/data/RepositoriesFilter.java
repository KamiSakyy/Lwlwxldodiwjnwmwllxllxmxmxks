package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.common.i0;
import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.c1;
import k81.u0;
import k81.z;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.r;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoriesFilter extends d {
    public static final w61.h[] x;
    public static final m90.c y;
    public final List v;
    public final i0 w;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoriesFilter> CREATOR = new o(12);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoriesFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        x = new w61.h[]{w.s(iVar, new p(5)), null, w.s(iVar, new p(6)), w.s(iVar, new p(7))};
        y = new m90.c(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepositoriesFilter(int i, l lVar, String str, List list, i0 i0Var) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, RepositoriesFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = r.r;
        } else {
            this.v = list;
        }
        if ((i & 8) == 0) {
            this.w = i0.r;
        } else {
            this.w = i0Var;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return !this.v.isEmpty();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepositoriesFilter)) {
            return false;
        }
        RepositoriesFilter repositoriesFilter = (RepositoriesFilter) obj;
        return k.b(this.v, repositoriesFilter.v) && this.w == repositoriesFilter.w;
    }

    public final int hashCode() {
        return this.w.hashCode() + (this.v.hashCode() * 31);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        m.n0(arrayList, new bm.f(4, arrayList2));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new RepositoriesFilter(arrayList2, this.w);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        w61.k kVar = new w61.k(this.v, this.w);
        bVar.getClass();
        return bVar.b(new u0(new k81.d(SimpleRepository.Companion.serializer(), 0), new z("com.github.rudroid.common.RepositoryFilter", i0.values()), 1), kVar);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(17), 30);
    }

    public final String toString() {
        return "RepositoriesFilter(repositories=" + this.v + ", repositoryFilter=" + this.w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
        parcel.writeString(this.w.name());
    }

    public /* synthetic */ RepositoriesFilter(int i) {
        this(r.r, (i & 2) != 0 ? i0.r : i0.s);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoriesFilter(List list, i0 i0Var) {
        super(l.F, "FILTER_REPOSITORY");
        k.g(list, "repositories");
        k.g(i0Var, "repositoryFilter");
        this.v = list;
        this.w = i0Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class i0<T1,T2,T3,T4> {
        public i0() {
        }
    }
}

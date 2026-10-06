package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.rudroid.m0;
import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.r;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositoryOwnerRepositoriesFilter extends d {
    public static final w61.h[] w;
    public static final n51.e x;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryOwnerRepositoriesFilter> CREATOR = new o(13);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryOwnerRepositoriesFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(8)), null, w.s(iVar, new p(9))};
        x = new n51.e(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepositoryOwnerRepositoriesFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, RepositoryOwnerRepositoriesFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = r.r;
        } else {
            this.v = list;
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
        return (obj instanceof RepositoryOwnerRepositoriesFilter) && k.b(this.v, ((RepositoryOwnerRepositoriesFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        m.n0(arrayList, new bm.f(5, arrayList2));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new RepositoryOwnerRepositoriesFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new k81.d(SimpleRepository.Companion.serializer(), 0), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(18), 30);
    }

    public final String toString() {
        return m0.h("RepositoryOwnerRepositoriesFilter(repositories=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryOwnerRepositoriesFilter(List list) {
        super(l.G, "FILTER_REPOSITORY_OWNER_REPOSITORY");
        k.g(list, "repositories");
        this.v = list;
    }
}

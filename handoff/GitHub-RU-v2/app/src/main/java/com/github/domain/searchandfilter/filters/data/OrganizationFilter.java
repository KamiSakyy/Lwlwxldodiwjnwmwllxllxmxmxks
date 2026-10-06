package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import com.github.rudroid.m0;
import com.github.service.models.response.organizations.Organization;
import e50.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.rShadow;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class OrganizationFilter extends d {
    public static final w61.h[] w;
    public static final k x;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<OrganizationFilter> CREATOR = new o(4);

    public static final class Companion {
        public final KSerializer serializer() {
            return OrganizationFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(21)), null, w.s(iVar, new bm.i(22))};
        x = new k(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrganizationFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, OrganizationFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = rShadow.r;
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
        return (obj instanceof OrganizationFilter) && k71.k.b(this.v, ((OrganizationFilter) obj).v);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        m.n0(arrayList, new bm.f(1, arrayList2));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new OrganizationFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new k81.d(Organization.Companion.serializer(), 0), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k71.k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(14), 30);
    }

    public final String toString() {
        return m0.h("OrganizationFilter(organizations=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k71.k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    public /* synthetic */ OrganizationFilter() {
        this(rShadow.r);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationFilter(List list) {
        super(l.J, "FILTER_ORGANIZATION");
        k71.k.g(list, "organizations");
        this.v = list;
    }
}

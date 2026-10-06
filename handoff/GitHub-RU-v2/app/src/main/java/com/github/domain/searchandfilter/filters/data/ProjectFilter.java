package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import com.github.rudroid.m0;
import com.github.service.models.response.LegacyProjectWithNumber;
import e50.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k71.k;
import k81.c1;
import kotlinx.serialization.KSerializer;
import sy.w;
import x61.m;
import x61.r;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class ProjectFilter extends d {
    public static final w61.h[] w;
    public static final y x;
    public List v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ProjectFilter> CREATOR = new o(5);

    public static final class Companion {
        public final KSerializer serializer() {
            return ProjectFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(23)), null, w.s(iVar, new bm.i(24))};
        x = new y(2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProjectFilter(int i, l lVar, String str, List list) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, ProjectFilter$$serializer.INSTANCE.getDescriptor());
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
        return (obj instanceof ProjectFilter) && k.b(this.v, ((ProjectFilter) obj).v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean h(Set set) {
        k.g(set, "capabilities");
        return set.contains(com.github.rudroid.common.a.P);
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = new ArrayList();
        m.n0(arrayList, new bm.f(2, arrayList2));
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new ProjectFilter(arrayList2);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new k81.d(LegacyProjectWithNumber.Companion.serializer(), 0), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return m.c0(this.v, " ", (String) null, (String) null, 0, new bf.c(15), 30);
    }

    public final String toString() {
        return m0.h("ProjectFilter(projects=", ")", this.v);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        Iterator q = f1.e.q(this.v, parcel);
        while (q.hasNext()) {
            parcel.writeParcelable((Parcelable) q.next(), i);
        }
    }

    public /* synthetic */ ProjectFilter() {
        this(r.r);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProjectFilter(List list) {
        super(l.v, "FILTER_PROJECT");
        k.g(list, "projects");
        this.v = list;
    }
}

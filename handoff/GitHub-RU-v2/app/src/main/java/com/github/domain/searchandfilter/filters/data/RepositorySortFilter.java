package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import java.util.List;
import k71.k;
import k81.c1;
import k81.z;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class RepositorySortFilter extends d {
    public static final w61.h[] w;
    public static final v01.c x;
    public static final f y;
    public v01.c v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositorySortFilter> CREATOR = new o(14);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositorySortFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(10)), null, w.s(iVar, new p(11))};
        x = v01.c.t;
        y = new f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepositorySortFilter(int i, l lVar, String str, v01.c cVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, RepositorySortFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = cVar;
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
        return (obj instanceof RepositorySortFilter) && this.v == ((RepositorySortFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.service.repository.filter.RepositorySortOrder", v01.c.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "RepositorySortFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ RepositorySortFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositorySortFilter(v01.c cVar) {
        super(l.X, "FILTER_REPOSITORY_SORT");
        k.g(cVar, "filter");
        this.v = cVar;
    }
}

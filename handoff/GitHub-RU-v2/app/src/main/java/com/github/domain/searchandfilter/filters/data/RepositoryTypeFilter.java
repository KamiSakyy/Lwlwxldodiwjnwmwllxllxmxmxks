package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
public final class RepositoryTypeFilter extends d {
    public static final w61.h[] w;
    public static final v01.d x;
    public static final g y;
    public v01.d v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<RepositoryTypeFilter> CREATOR = new o(15);

    public static final class Companion {
        public final KSerializer serializer() {
            return RepositoryTypeFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(12)), null, w.s(iVar, new p(13))};
        x = v01.d.r;
        y = new g();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RepositoryTypeFilter(int i, l lVar, String str, v01.d dVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, RepositoryTypeFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = dVar;
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
        return (obj instanceof RepositoryTypeFilter) && this.v == ((RepositoryTypeFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z) {
        Enum[] values = v01.d.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Enum r4 : values) {
            String str = "";
            switch (r4.ordinal()) {
                case 0:
                case 6:
                case 7:
                    break;
                case 1:
                    str = "archived:true";
                    break;
                case 2:
                    str = "fork:only";
                    break;
                case 3:
                    str = "mirror:true";
                    break;
                case 4:
                    str = "is:private";
                    break;
                case 5:
                    str = "is:public";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            linkedHashMap.put(str, r4);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getKey()).length() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap2, wVar, 9));
        v01.d dVar = (v01.d) wVar.r;
        if (dVar != null) {
            return new RepositoryTypeFilter(dVar);
        }
        if (z) {
            return null;
        }
        return new RepositoryTypeFilter(v01.d.r);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.service.repository.filter.RepositoryType", v01.d.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "RepositoryTypeFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ RepositoryTypeFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepositoryTypeFilter(v01.d dVar) {
        super(l.Y, "FILTER_REPOSITORY_TYPE");
        k.g(dVar, "filter");
        this.v = dVar;
    }
}

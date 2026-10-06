package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
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
public final class DiscussionsTopFilter extends d {
    public static final w61.h[] w;
    public static final bm.j x;
    public static final c y;
    public static final DateTimeFormatter z;
    public bm.j v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<DiscussionsTopFilter> CREATOR = new a21.g(22);

    public static final class Companion {
        public final KSerializer serializer() {
            return DiscussionsTopFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new bm.i(0)), null, w.s(iVar, new bm.i(1))};
        x = bm.j.r;
        y = new c();
        z = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DiscussionsTopFilter(int i, l lVar, String str, bm.j jVar) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1.l(i, 1, DiscussionsTopFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = jVar;
        }
    }

    public static String z(bm.j jVar) {
        int ordinal = jVar.ordinal();
        if (ordinal == 0) {
            return "";
        }
        if (ordinal == 1) {
            return "sort:top";
        }
        DateTimeFormatter dateTimeFormatter = z;
        if (ordinal == 2) {
            String format = ZonedDateTime.now(ZoneOffset.UTC).minusDays(1L).format(dateTimeFormatter);
            k.f(format, "format(...)");
            return "sort:top created:>=".concat(format);
        }
        if (ordinal == 3) {
            String format2 = ZonedDateTime.now(ZoneOffset.UTC).minusDays(7L).format(dateTimeFormatter);
            k.f(format2, "format(...)");
            return "sort:top created:>=".concat(format2);
        }
        if (ordinal == 4) {
            String format3 = ZonedDateTime.now(ZoneOffset.UTC).minusDays(30L).format(dateTimeFormatter);
            k.f(format3, "format(...)");
            return "sort:top created:>=".concat(format3);
        }
        if (ordinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        String format4 = ZonedDateTime.now(ZoneOffset.UTC).minusYears(1L).format(dateTimeFormatter);
        k.f(format4, "format(...)");
        return "sort:top created:>=".concat(format4);
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
        return (obj instanceof DiscussionsTopFilter) && this.v == ((DiscussionsTopFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final d j(ArrayList arrayList, boolean z2) {
        bm.j[] values = bm.j.values();
        int s = x.s(values.length);
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (bm.j jVar : values) {
            linkedHashMap.put(z(jVar), jVar);
        }
        k71.w wVar = new k71.w();
        m.n0(arrayList, new bm.g(linkedHashMap, wVar, 2));
        bm.j jVar2 = (bm.j) wVar.r;
        if (jVar2 != null) {
            return new DiscussionsTopFilter(jVar2);
        }
        if (z2) {
            return null;
        }
        return new DiscussionsTopFilter(bm.j.r);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(new z("com.github.domain.searchandfilter.filters.data.DiscussionsTopFilter.Value", bm.j.values()), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return z(this.v);
    }

    public final String toString() {
        return "DiscussionsTopFilter(filter=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeString(this.v.name());
    }

    public /* synthetic */ DiscussionsTopFilter() {
        this(x);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscussionsTopFilter(bm.j jVar) {
        super(l.N, "FILTER_DISCUSSION_TOP");
        k.g(jVar, "filter");
        this.v = jVar;
    }
}

package com.github.domain.searchandfilter.filters.data;

import android.os.Parcel;
import android.os.Parcelable;
import bm.l;
import bm.o;
import bm.p;
import com.github.service.models.response.TrendingPeriod;
import java.util.List;
import k71.k;
import k81.c1Shadow;
import kotlinx.serialization.KSerializer;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class TrendingPeriodFilter extends d {
    public static final w61.h[] w;
    public static final TrendingPeriod x;
    public static final j y;
    public TrendingPeriod v;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<TrendingPeriodFilter> CREATOR = new o(25);

    public static final class Companion {
        public final KSerializer serializer() {
            return TrendingPeriodFilter$$serializer.INSTANCE;
        }
    }

    static {
        w61.i iVar = w61.i.r;
        w = new w61.h[]{w.s(iVar, new p(28)), null, w.s(iVar, new p(29))};
        x = TrendingPeriod.DAILY;
        y = new j();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingPeriodFilter(int i, l lVar, String str, TrendingPeriod trendingPeriod) {
        super(i, lVar, str);
        if (1 != (i & 1)) {
            c1Shadow.l(i, 1, TrendingPeriodFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 4) == 0) {
            this.v = x;
        } else {
            this.v = trendingPeriod;
        }
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final boolean c() {
        return this.v != TrendingPeriod.DAILY;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TrendingPeriodFilter) && this.v == ((TrendingPeriodFilter) obj).v;
    }

    public final int hashCode() {
        return this.v.hashCode();
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String o() {
        l81.b bVar = l81.c.d;
        bVar.getClass();
        return bVar.b(TrendingPeriod.Companion.serializer(), this.v);
    }

    @Override // com.github.domain.searchandfilter.filters.data.d
    public final String r(List list) {
        k.g(list, "otherFilters");
        return "";
    }

    public final String toString() {
        return "TrendingPeriodFilter(trendingPeriod=" + this.v + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.g(parcel, "dest");
        parcel.writeParcelable(this.v, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrendingPeriodFilter(TrendingPeriod trendingPeriod) {
        super(l.W, "FILTER_TRENDING_PERIOD");
        k.g(trendingPeriod, "trendingPeriod");
        this.v = trendingPeriod;
    }
}

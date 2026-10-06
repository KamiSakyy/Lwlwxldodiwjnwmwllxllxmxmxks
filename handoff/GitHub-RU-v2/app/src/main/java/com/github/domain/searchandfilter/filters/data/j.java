package com.github.domain.searchandfilter.filters.data;

import bm.k;
import com.github.service.models.response.TrendingPeriod;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j implements k {
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0015, code lost:
    
        if (r3 == null) goto L5;
     */
    @Override // bm.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final d l(String str) {
        TrendingPeriod trendingPeriod;
        if (str != null) {
            l81.b bVar = l81.c.d;
            bVar.getClass();
            trendingPeriod = (TrendingPeriod) bVar.a(str, TrendingPeriod.Companion.serializer());
        }
        TrendingPeriodFilter.Companion.getClass();
        trendingPeriod = TrendingPeriodFilter.x;
        return new TrendingPeriodFilter(trendingPeriod);
    }
    public Object name() { return null; }
    public Object ordinal() { return null; }
    public Object s(Object p1) { return null; }
}

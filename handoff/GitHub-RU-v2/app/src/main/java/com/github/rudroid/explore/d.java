package com.github.rudroid.explore;

import com.github.service.models.response.TrendingPeriod;
import com.github.service.models.response.type.RepositoryRecommendationReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import le.e;

/* loaded from: /home/user/work/p/classes.dex */
public final class d {
    public static ArrayList a(List list, boolean z10, f fVar, TrendingPeriod trendingPeriod) {
        int i;
        RepositoryRecommendationReason repositoryRecommendationReason;
        k71.k.g(list, "items");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d01.d dVar = (d01.b) it.next();
            String id2 = dVar.getId();
            String name = dVar.getName();
            com.github.service.models.response.a a10 = dVar.a();
            int c10 = dVar.c();
            String b10 = dVar.b();
            String j10 = dVar.j();
            boolean f6 = dVar.f();
            int e5 = dVar.e();
            boolean z11 = dVar instanceof d01.d;
            if (z11) {
                i = dVar.m;
            } else {
                if (!(dVar instanceof d01.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 0;
            }
            String g7 = dVar.g();
            int h10 = dVar.h();
            Iterator it2 = it;
            if (dVar instanceof d01.c) {
                repositoryRecommendationReason = ((d01.c) dVar).m;
            } else {
                if (!z11) {
                    throw new NoWhenBranchMatchedException();
                }
                repositoryRecommendationReason = RepositoryRecommendationReason.UNKNOWN__;
            }
            arrayList.add(new e.c(id2, name, a10, c10, b10, j10, f6, e5, i, trendingPeriod, g7, h10, repositoryRecommendationReason, dVar.getUrl(), dVar.i()));
            it = it2;
        }
        return z10 ? x61.m.m0(arrayList, new e.b("ITEM_FOOTER_END_RECOMMENDATIONS", 4)) : arrayList;
    }
}

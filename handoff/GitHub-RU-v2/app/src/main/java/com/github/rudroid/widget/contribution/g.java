package com.github.rudroid.widget.contribution;

import com.github.rudroid.widget.contribution.k;
import com.github.service.models.response.ContributionLevel;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import sy.d0Shadow;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.f {
    public final /* synthetic */ int r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ List u;

    public /* synthetic */ g(List list, float f, float f2, int i) {
        this.r = i;
        this.u = list;
        this.s = f;
        this.t = f2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        h6.a aVar;
        switch (this.r) {
            case 0:
                ArrayList arrayList = (ArrayList) this.u;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.q) obj, "$this$Row");
                final ArrayList M = x61.m.M(arrayList, 10);
                int size = M.size();
                int i = 0;
                final int i2 = 0;
                while (i < size) {
                    Object obj4 = M.get(i);
                    i++;
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        d0Shadow.x();
                        throw null;
                    }
                    final List list = (List) obj4;
                    final float f = this.s;
                    final float f2 = this.t;
                    k21.f.a((z5.n) null, 0, 0, r1.i.d(1443605020, new j71.f() { // from class: com.github.rudroid.widget.contribution.h
                        public final Object f(Object obj5, Object obj6, Object obj7) {
                            boolean z;
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj6;
                            ((Integer) obj7).getClass();
                            k71.k.g((i6.q) obj5, "$this$Row");
                            List list2 = list;
                            int i4 = 0;
                            for (Object obj8 : list2) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    d0Shadow.x();
                                    throw null;
                                }
                                List list3 = (List) obj8;
                                if (i4 == d0Shadow.m(list2)) {
                                    if (i2 == d0Shadow.m(M)) {
                                        z = false;
                                        k.c(list3, f, f2, z, sVar2, 0);
                                        i4 = i5;
                                    }
                                }
                                z = true;
                                k.c(list3, f, f2, z, sVar2, 0);
                                i4 = i5;
                            }
                            return a0.a;
                        }
                    }, sVar), sVar, 3072, 7);
                    i2 = i3;
                }
                return a0.a;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                ((Integer) obj3).getClass();
                k71.k.g((i6.g) obj, "$this$Column");
                List list2 = this.u;
                int i4 = 0;
                for (Object obj5 : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        d0Shadow.x();
                        throw null;
                    }
                    switch (k.a.a[((ContributionLevel) obj5).ordinal()]) {
                        case 1:
                        case 2:
                            aVar = com.github.rudroid.widget.k.c;
                            break;
                        case 3:
                            aVar = com.github.rudroid.widget.k.d;
                            break;
                        case 4:
                            aVar = com.github.rudroid.widget.k.e;
                            break;
                        case 5:
                            aVar = com.github.rudroid.widget.k.f;
                            break;
                        case 6:
                            aVar = com.github.rudroid.widget.k.g;
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    k.a(aVar, this.s, this.t, i4 != d0Shadow.m(list2), sVar2, 0);
                    i4 = i5;
                }
                return a0.a;
        }
    }
}

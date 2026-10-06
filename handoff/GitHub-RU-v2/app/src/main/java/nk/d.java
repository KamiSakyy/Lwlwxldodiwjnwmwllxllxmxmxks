package nk;

import com.github.rudroid.explore.y;
import com.github.service.models.response.TrendingPeriod;
import in.r;
import k71.k;
import oa.g;
import oa.j;
import y71.i;
import z01.q;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public g a;

    public d(g gVar) {
        k.g(gVar, "exploreService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, TrendingPeriod trendingPeriod, y yVar, c71.c cVar) {
        c cVar2;
        int i;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i2 = cVar2.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar2.y = i2 - Integer.MIN_VALUE;
                Object obj = cVar2.w;
                b71.a aVar = b71.a.r;
                i = cVar2.y;
                if (i != 0) {
                    sy.y.j(obj);
                    q qVar = (q) this.a.a(jVar);
                    cVar2.u = jVar;
                    cVar2.v = yVar;
                    cVar2.y = 1;
                    obj = qVar.b(str, str2, trendingPeriod);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = cVar2.v;
                    jVar = cVar2.u;
                    sy.y.j(obj);
                }
                return r.l(b31.b.J((i) obj, jVar, yVar));
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.w;
        b71.a aVar2 = b71.a.r;
        i = cVar2.y;
        if (i != 0) {
        }
        return r.l(b31.b.J((i) obj2, jVar, yVar));
    }

}

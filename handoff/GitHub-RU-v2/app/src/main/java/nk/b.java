package nk;

import com.github.rudroid.explore.y;
import com.github.service.models.response.TrendingPeriod;
import k71.k;
import oa.g;
import oa.j;
import y71.i;
import z01.q;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final g a;

    public b(g gVar) {
        k.g(gVar, "exploreService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, TrendingPeriod trendingPeriod, y yVar, c71.c cVar) {
        a aVar;
        int i;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.y = i2 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i = aVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    q qVar = (q) this.a.a(jVar);
                    aVar.u = jVar;
                    aVar.v = yVar;
                    aVar.y = 1;
                    obj = qVar.d(str, str2, trendingPeriod);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = aVar.v;
                    jVar = aVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((i) obj, jVar, yVar);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, yVar);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class y<T1,T2,T3,T4> {
        public y() {
        }
    }
}

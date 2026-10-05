package hk;

import com.github.rudroid.deploymentreview.d1;
import java.util.List;
import k71.k;
import oa.g;
import oa.j;
import sy.y;
import y71.i;
import z01.m;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final g a;

    public b(g gVar) {
        k.g(gVar, "deploymentReviewService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, List list, String str2, d1 d1Var, c71.c cVar) {
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
                    y.j(obj);
                    m mVar = (m) this.a.a(jVar);
                    aVar.u = jVar;
                    aVar.v = d1Var;
                    aVar.y = 1;
                    obj = mVar.b(str, str2, list);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d1Var = aVar.v;
                    jVar = aVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, d1Var);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i = aVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, d1Var);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g<T1,T2,T3,T4> {
        public g() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }
}

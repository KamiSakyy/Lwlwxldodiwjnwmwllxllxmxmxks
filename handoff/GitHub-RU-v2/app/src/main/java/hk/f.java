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
public final class f {
    public final g a;

    public f(g gVar) {
        k.g(gVar, "deploymentReviewService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, List list, String str2, d1 d1Var, c71.c cVar) {
        e eVar;
        int i;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i2 = eVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.y = i2 - Integer.MIN_VALUE;
                Object obj = eVar.w;
                b71.a aVar = b71.a.r;
                i = eVar.y;
                if (i != 0) {
                    y.j(obj);
                    m mVar = (m) this.a.a(jVar);
                    eVar.u = jVar;
                    eVar.v = d1Var;
                    eVar.y = 1;
                    obj = mVar.a(str, str2, list);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d1Var = eVar.v;
                    jVar = eVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, d1Var);
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.w;
        b71.a aVar2 = b71.a.r;
        i = eVar.y;
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

package mm;

import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import sy.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public oa.g a;

    public c(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, a0 a0Var, c71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.y = i2 - Integer.MIN_VALUE;
                Object obj = bVar.w;
                b71.a aVar = b71.a.r;
                i = bVar.y;
                if (i != 0) {
                    y.j(obj);
                    r1 r1Var = (r1) this.a.a(jVar);
                    bVar.u = jVar;
                    bVar.v = a0Var;
                    bVar.y = 1;
                    obj = r1Var.t(bVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = bVar.v;
                    jVar = bVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, a0Var);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.w;
        b71.a aVar2 = b71.a.r;
        i = bVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, a0Var);
    }
}

package mm;

import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import sy.y;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public oa.g a;

    public f(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, a0 a0Var, c71.c cVar) {
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
                    r1 r1Var = (r1) this.a.a(jVar);
                    eVar.u = jVar;
                    eVar.v = a0Var;
                    eVar.y = 1;
                    obj = r1Var.p(eVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = eVar.v;
                    jVar = eVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, a0Var);
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.w;
        b71.a aVar2 = b71.a.r;
        i = eVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, a0Var);
    }
}

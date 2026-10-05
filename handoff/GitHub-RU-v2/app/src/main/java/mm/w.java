package mm;

import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import sy.y;
import z01.m1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w {
    public final oa.g a;

    public w(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, a0 a0Var, c71.c cVar) {
        v vVar;
        int i;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i2 = vVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vVar.y = i2 - Integer.MIN_VALUE;
                Object obj = vVar.w;
                b71.a aVar = b71.a.r;
                i = vVar.y;
                if (i != 0) {
                    y.j(obj);
                    m1 m1Var = (m1) this.a.a(jVar);
                    vVar.u = jVar;
                    vVar.v = a0Var;
                    vVar.y = 1;
                    obj = m1Var.a(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0Var = vVar.v;
                    jVar = vVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, a0Var);
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.w;
        b71.a aVar2 = b71.a.r;
        i = vVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, a0Var);
    }
}

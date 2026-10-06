package sm;

import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import k71.k;
import oa.j;
import sy.y;
import y71.i;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public qm.d a;

    public e(qm.d dVar) {
        k.g(dVar, "repository");
        this.a = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, a0 a0Var, c71.c cVar) {
        d dVar;
        int i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.y = i2 - Integer.MIN_VALUE;
                Object obj = dVar.w;
                b71.a aVar = b71.a.r;
                i = dVar.y;
                if (i != 0) {
                    y.j(obj);
                    dVar.u = jVar;
                    dVar.v = a0Var;
                    dVar.y = 1;
                    obj = this.a.a(jVar, dVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return obj;
                    }
                    a0Var = dVar.v;
                    jVar = dVar.u;
                    y.j(obj);
                }
                y71.y J = b31.b.J((i) obj, jVar, a0Var);
                dVar.u = null;
                dVar.v = null;
                dVar.y = 2;
                Object F = n1.F(J, dVar);
                return F != aVar ? aVar : F;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.w;
        b71.a aVar2 = b71.a.r;
        i = dVar.y;
        if (i != 0) {
        }
        y71.y J2 = b31.b.J((i) obj2, jVar, a0Var);
        dVar.u = null;
        dVar.v = null;
        dVar.y = 2;
        Object F2 = n1.F(J2, dVar);
        if (F2 != aVar2) {
        }
    }

}

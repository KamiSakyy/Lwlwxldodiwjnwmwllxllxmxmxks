package rm;

import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import k71.k;
import nm.i;
import oa.j;
import sy.y;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final i a;

    public c(i iVar) {
        k.g(iVar, "repository");
        this.a = iVar;
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
                    bVar.u = jVar;
                    bVar.v = a0Var;
                    bVar.y = 1;
                    obj = this.a.a(jVar, bVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return obj;
                    }
                    a0Var = bVar.v;
                    jVar = bVar.u;
                    y.j(obj);
                }
                y71.y J = b31.b.J((y71.i) obj, jVar, a0Var);
                bVar.u = null;
                bVar.v = null;
                bVar.y = 2;
                Object F = n1.F(J, bVar);
                return F != aVar ? aVar : F;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.w;
        b71.a aVar2 = b71.a.r;
        i = bVar.y;
        if (i != 0) {
        }
        y71.y J2 = b31.b.J((y71.i) obj2, jVar, a0Var);
        bVar.u = null;
        bVar.v = null;
        bVar.y = 2;
        Object F2 = n1.F(J2, bVar);
        if (F2 != aVar2) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class j<T1,T2,T3,T4> {
        public j() {
        }
    }
}

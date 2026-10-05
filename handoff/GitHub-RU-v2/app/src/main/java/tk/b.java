package tk;

import com.github.rudroid.fileschanged.q0;
import in.r;
import java.util.List;
import k71.k;
import oa.j;
import sy.y;
import z01.t;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final oa.g a;

    public b(oa.g gVar) {
        k.g(gVar, "service");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, int i, String str3, List list, q0 q0Var, c71.c cVar) {
        a aVar;
        int i2;
        q0 q0Var2;
        Object c;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i3 = aVar.y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.y = i3 - Integer.MIN_VALUE;
                Object obj = aVar.w;
                b71.a aVar2 = b71.a.r;
                i2 = aVar.y;
                if (i2 != 0) {
                    y.j(obj);
                    t tVar = (t) this.a.a(jVar);
                    aVar.u = jVar;
                    q0Var2 = q0Var;
                    aVar.v = q0Var2;
                    aVar.y = 1;
                    c = tVar.c(i, str, str2, str3, list);
                    if (c == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q0 q0Var3 = aVar.v;
                    j jVar2 = aVar.u;
                    y.j(obj);
                    q0Var2 = q0Var3;
                    jVar = jVar2;
                    c = obj;
                }
                return b31.b.J(r.l((y71.i) c), jVar, q0Var2);
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.w;
        b71.a aVar22 = b71.a.r;
        i2 = aVar.y;
        if (i2 != 0) {
        }
        return b31.b.J(r.l((y71.i) c), jVar, q0Var2);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q0<T1,T2,T3,T4> {
        public q0() {
        }
    }
}

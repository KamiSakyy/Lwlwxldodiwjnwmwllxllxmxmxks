package pw0;

import java.util.Iterator;
import java.util.List;
import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a0 implements aa.a {
    public static final a0 a = new a0();
    public static final List b = sy.d0.o(new String[]{"id", "state", "contexts", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        n30 n30Var = null;
        ow0.z zVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                n30.Companion.getClass();
                Iterator it = n30.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((n30) obj).r.equals(u)) {
                        break;
                    }
                }
                n30 n30Var2 = (n30) obj;
                n30Var = n30Var2 == null ? n30.t : n30Var2;
            } else if (r0 == 2) {
                zVar = (ow0.z) aa.c.c(q.a, false).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (n30Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (zVar == null) {
            k41.b.B(eVar, "contexts");
            throw null;
        }
        if (str2 != null) {
            return new ow0.j0(str, n30Var, zVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.j0 j0Var = (ow0.j0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(j0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, j0Var.a);
        fVar.z0("state");
        fVar.I(j0Var.b.r);
        fVar.z0("contexts");
        aa.c.c(q.a, false).b(fVar, wVar, j0Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, j0Var.d);
    }
}

package fd0;

import java.util.Iterator;
import java.util.List;
import kc0.q60;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ht implements aa.a {
    public static final ht a = new ht();
    public static final List b = sy.d0.o(new String[]{"id", "name", "state", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        gn0.dl dlVar = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                gn0.dl.Companion.getClass();
                Iterator it = gn0.dl.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.dl) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.dl dlVar2 = (gn0.dl) obj;
                dlVar = dlVar2 == null ? gn0.dl.t : dlVar2;
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (dlVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str3 != null) {
            return new q60(str, str2, dlVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        q60 q60Var = (q60) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q60Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q60Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, q60Var.b);
        fVar.z0("state");
        fVar.I(q60Var.c.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, q60Var.d);
    }
}

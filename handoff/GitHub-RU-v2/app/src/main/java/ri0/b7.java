package ri0;

import gn0.dl;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b7 implements aa.a {
    public static final b7 a = new b7();
    public static final List b = sy.d0.o(new String[]{"id", "name", "state", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        dl dlVar = null;
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
                dl.Companion.getClass();
                Iterator it = dl.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((dl) obj).r.equals(u)) {
                        break;
                    }
                }
                dl dlVar2 = (dl) obj;
                dlVar = dlVar2 == null ? dl.t : dlVar2;
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
            return new m5(str, str2, dlVar, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m5 m5Var = (m5) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m5Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, m5Var.b);
        fVar.z0("state");
        fVar.I(m5Var.c.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, m5Var.d);
    }
}

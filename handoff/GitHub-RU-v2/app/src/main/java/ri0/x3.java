package ri0;

import gn0.hn;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x3 implements aa.a {
    public static final x3 a = new x3();
    public static final List b = sy.d0.o(new String[]{"id", "state", "__typename"});

    public static u3 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        hn hnVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                String u = eVar.u();
                k71.k.d(u);
                hn.Companion.getClass();
                Iterator it = hn.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((hn) obj).r.equals(u)) {
                        break;
                    }
                }
                hn hnVar2 = (hn) obj;
                hnVar = hnVar2 == null ? hn.v : hnVar2;
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (hnVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str2 != null) {
            return new u3(str, hnVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, u3 u3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u3Var.a);
        fVar.z0("state");
        fVar.I(u3Var.b.r);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, u3Var.c);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (u3) obj);
    }
}

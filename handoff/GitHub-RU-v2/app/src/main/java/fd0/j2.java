package fd0;

import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aaShadow.a {
    public static final j2 a = new j2();
    public static final List b = sy.d0.o(new String[]{"id", "context", "state", "description", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        gn0.yv yvVar = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                String u = eVar.u();
                k71.k.d(u);
                gn0.yv.Companion.getClass();
                Iterator it = gn0.yv.v.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((gn0.yv) obj).r.equals(u)) {
                        break;
                    }
                }
                gn0.yv yvVar2 = (gn0.yv) obj;
                yvVar = yvVar2 == null ? gn0.yv.t : yvVar2;
            } else if (r0 == 3) {
                str3 = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str4 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "context");
            throw null;
        }
        if (yvVar == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str4 != null) {
            return new kc0.y3(str, str2, yvVar, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.y3 y3Var = (kc0.y3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(y3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, y3Var.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, y3Var.b);
        fVar.z0("state");
        fVar.I(y3Var.c.r);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, y3Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, y3Var.e);
    }
}

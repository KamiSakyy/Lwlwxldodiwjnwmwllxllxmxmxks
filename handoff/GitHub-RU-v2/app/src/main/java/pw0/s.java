package pw0;

import java.util.Iterator;
import java.util.List;
import pz0.n30;

/* loaded from: /home/user/work/p/classes4.dex */
public class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "context", "state", "description", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        n30 n30Var = null;
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
        if (n30Var == null) {
            k41.b.B(eVar, "state");
            throw null;
        }
        if (str4 != null) {
            return new ow0.b0(str, str2, n30Var, str3, str4);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.b0 b0Var = (ow0.b0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(b0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, b0Var.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, b0Var.b);
        fVar.z0("state");
        fVar.I(b0Var.c.r);
        fVar.z0("description");
        aa.c.i.b(fVar, wVar, b0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, b0Var.e);
    }
}

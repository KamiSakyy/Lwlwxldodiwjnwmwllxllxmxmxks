package iy0;

import java.util.Iterator;
import java.util.List;
import pz0.xl;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 implements aa.a {
    public static final a1 a = new a1();
    public static final List b = sy.d0Shadow.o(new String[]{"direction", "field"});

    public final Object a(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xl xlVar = null;
        o0 o0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                String u = eVar.u();
                k71.k.d(u);
                xl.Companion.getClass();
                Iterator it = xl.x.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((xl) obj).r.equals(u)) {
                        break;
                    }
                }
                xl xlVar2 = (xl) obj;
                xlVar = xlVar2 == null ? xl.v : xlVar2;
            } else {
                if (r0 != 1) {
                    break;
                }
                o0Var = (o0) aa.c.c(w0.a, true).a(eVar, wVar);
            }
        }
        if (xlVar == null) {
            k41.b.B(eVar, "direction");
            throw null;
        }
        if (o0Var != null) {
            return new s0(xlVar, o0Var);
        }
        k41.b.B(eVar, "field");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        s0 s0Var = (s0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s0Var, "value");
        fVar.z0("direction");
        fVar.I(s0Var.a.r);
        fVar.z0("field");
        aa.c.c(w0.a, true).b(fVar, wVar, s0Var.b);
    }
}

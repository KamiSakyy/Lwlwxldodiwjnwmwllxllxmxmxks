package eo0;

import java.util.List;
import jn0.qd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ly implements aaShadow.a {
    public static final ly a = new ly();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        cu0.c c = cu0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new qd0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        qd0 qd0Var = (qd0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qd0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qd0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, qd0Var.b);
        List list = cu0.f.a;
        cu0.f.d(fVar, wVar, qd0Var.c);
    }
}

package eo0;

import java.util.List;
import jn0.ig0;
import jn0.jg0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a00 implements aaShadow.a {
    public static final a00 a = new a00();
    public static final List b = sy.d0Shadow.o(new String[]{"viewer", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jg0 jg0Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                jg0Var = (jg0) aa.c.c(b00.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (jg0Var == null) {
            k41.b.B(eVar, "viewer");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new ig0(jg0Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ig0 ig0Var = (ig0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ig0Var, "value");
        fVar.z0("viewer");
        aa.c.c(b00.a, false).b(fVar, wVar, ig0Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ig0Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ig0Var.c);
    }
}

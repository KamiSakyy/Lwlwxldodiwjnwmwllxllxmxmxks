package ep;

import java.util.List;
import jo.i70;
import jo.m70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fu implements aa.a {
    public static final fu a = new fu();
    public static final List b = sy.d0.o("sponsorable", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        m70 m70Var = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                m70Var = (m70) aa.c.c(ju.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (m70Var == null) {
            k41.b.B(eVar, "sponsorable");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new i70(m70Var, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        i70 i70Var = (i70) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(i70Var, "value");
        fVar.z0("sponsorable");
        aa.c.c(ju.a, true).b(fVar, wVar, i70Var.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, i70Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, i70Var.c);
    }
}

package fd0;

import java.util.List;
import kc0.m50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ns implements aaShadow.a {
    public static final ns a = new ns();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        uf0.d0 d0Var = uf0.d0.a;
        uf0.a0 c = uf0.d0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new m50(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m50 m50Var = (m50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m50Var.b);
        uf0.d0 d0Var = uf0.d0.a;
        uf0.d0.d(fVar, wVar, m50Var.c);
    }
}

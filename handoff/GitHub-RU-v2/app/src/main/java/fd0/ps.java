package fd0;

import java.util.List;
import kc0.p50;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ps implements aa.a {
    public static final ps a = new ps();
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
        yf0.i c = yf0.l.c(eVar, wVar);
        eVar.s0();
        aj0.f fVar = aj0.f.a;
        aj0.c c2 = aj0.f.c(eVar, wVar);
        eVar.s0();
        yf0.o c3 = yf0.p.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new p50(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p50 p50Var = (p50) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p50Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p50Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p50Var.b);
        List list = yf0.l.a;
        yf0.l.d(fVar, wVar, p50Var.c);
        aj0.f fVar2 = aj0.f.a;
        aj0.f.d(fVar, wVar, p50Var.d);
        List list2 = yf0.p.a;
        yf0.p.d(fVar, wVar, p50Var.e);
    }
}

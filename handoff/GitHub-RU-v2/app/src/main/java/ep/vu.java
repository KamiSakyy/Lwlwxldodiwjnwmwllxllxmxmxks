package ep;

import java.util.List;
import jo.d80;
import jo.e80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vu implements aa.a {
    public static final vu a = new vu();
    public static final List b = sy.d0.o("__typename", "pullRequest", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        d80 d80Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                d80Var = (d80) aa.c.c(uu.a, true).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        lv.c c = lv.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (d80Var == null) {
            k41.b.B(eVar, "pullRequest");
            throw null;
        }
        if (str2 != null) {
            return new e80(str, d80Var, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        e80 e80Var = (e80) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(e80Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, e80Var.a);
        fVar.z0("pullRequest");
        aa.c.c(uu.a, true).b(fVar, wVar, e80Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, e80Var.c);
        List list = lv.f.a;
        lv.f.d(fVar, wVar, e80Var.d);
    }
}

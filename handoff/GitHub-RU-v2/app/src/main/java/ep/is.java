package ep;

import java.util.List;
import jo.q40;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class isShadow implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static q40 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        gv.n3 n3Var = gv.n3.a;
        gv.z2 c = gv.n3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new q40(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, q40 q40Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q40Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, q40Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, q40Var.b);
        gv.n3 n3Var = gv.n3.a;
        gv.n3.d(fVar, wVar, q40Var.c);
    }
}

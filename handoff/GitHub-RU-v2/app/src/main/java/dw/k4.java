package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static w3 c(ea.e eVar, aa.w wVar) {
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
        yw.f fVar = yw.f.a;
        yw.b c = yw.f.c(eVar, wVar);
        eVar.s0();
        gv.g6 c2 = gv.l7.c(eVar, wVar);
        eVar.s0();
        e1 c3 = h1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new w3(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, w3 w3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, w3Var.b);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, w3Var.c);
        List list = gv.l7.a;
        gv.l7.d(fVar, wVar, w3Var.d);
        List list2 = h1.a;
        h1.d(fVar, wVar, w3Var.e);
    }
}

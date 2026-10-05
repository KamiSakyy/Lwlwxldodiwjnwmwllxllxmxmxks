package dw;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j4 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static v3 c(ea.e eVar, aa.w wVar) {
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
        c5 c5Var = c5.a;
        t4 c2 = c5.c(eVar, wVar);
        eVar.s0();
        c c3 = d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new v3(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, v3 v3Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, v3Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, v3Var.b);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, v3Var.c);
        c5 c5Var = c5.a;
        c5.d(fVar, wVar, v3Var.d);
        List list = d.a;
        d.d(fVar, wVar, v3Var.e);
    }
}

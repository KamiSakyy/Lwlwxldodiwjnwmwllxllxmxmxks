package yf0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "replies"});

    public static d0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        c0 c0Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                c0Var = (c0) aa.c.c(h0.a, false).a(eVar, wVar);
            }
        }
        eVar.s0();
        i c = l.c(eVar, wVar);
        eVar.s0();
        aj0.f fVar = aj0.f.a;
        aj0.c c2 = aj0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (c0Var != null) {
            return new d0(str, str2, c0Var, c, c2);
        }
        k41.b.B(eVar, "replies");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d0 d0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(d0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, d0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, d0Var.b);
        fVar.z0("replies");
        aa.c.c(h0.a, false).b(fVar, wVar, d0Var.c);
        List list = l.a;
        l.d(fVar, wVar, d0Var.d);
        aj0.f fVar2 = aj0.f.a;
        aj0.f.d(fVar, wVar, d0Var.e);
    }
}

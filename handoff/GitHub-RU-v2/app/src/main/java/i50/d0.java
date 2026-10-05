package i50;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "replies"});

    public static c0 c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        b0 b0Var = null;
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
                b0Var = (b0) aa.c.c(g0.a, false).a(eVar, wVar);
            }
        }
        eVar.s0();
        h c = k.c(eVar, wVar);
        eVar.s0();
        i80.e eVar2 = i80.e.a;
        i80.c c2 = i80.e.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (b0Var != null) {
            return new c0(str, str2, b0Var, c, c2);
        }
        k41.b.B(eVar, "replies");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, c0 c0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(c0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, c0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, c0Var.b);
        fVar.z0("replies");
        aa.c.c(g0.a, false).b(fVar, wVar, c0Var.c);
        List list = k.a;
        k.d(fVar, wVar, c0Var.d);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, c0Var.e);
    }
}

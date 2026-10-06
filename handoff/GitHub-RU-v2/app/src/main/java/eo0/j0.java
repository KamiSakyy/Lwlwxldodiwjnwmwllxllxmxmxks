package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 implements aaShadow.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        jn0.z0 z0Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                z0Var = (jn0.z0) aa.c.c(i0.a, true).a(eVar, wVar);
            }
        }
        eVar.s0();
        cu0.c c = cu0.f.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (z0Var != null) {
            return new jn0.a1(str, str2, z0Var, c);
        }
        k41.b.B(eVar, "pullRequest");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.a1 a1Var = (jn0.a1) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a1Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a1Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, a1Var.b);
        fVar.z0("pullRequest");
        aa.c.c(i0.a, true).b(fVar, wVar, a1Var.c);
        List list = cu0.f.a;
        cu0.f.d(fVar, wVar, a1Var.d);
    }
}

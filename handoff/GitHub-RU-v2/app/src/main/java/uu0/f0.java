package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f0 implements aa.a {
    public static final f0 a = new f0();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id", "author"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        y yVar = null;
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
                yVar = (y) aa.c.b(aa.c.c(d0.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        gt0.a c = gt0.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new a0Shadow(str, str2, yVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a0Shadow a0Var = (a0Shadow) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, a0Var.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(d0.a, true)).b(fVar, wVar, a0Var.c);
        List list = gt0.b.a;
        gt0.b.d(fVar, wVar, a0Var.d);
    }
}

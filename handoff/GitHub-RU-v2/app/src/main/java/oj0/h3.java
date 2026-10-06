package oj0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 implements aa.a {
    public static final h3 a = new h3();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "login"});

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
        ud0.c c = ud0.d.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new a3(str, str2, c);
        }
        k41.b.B(eVar, "login");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        a3 a3Var = (a3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(a3Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, a3Var.a);
        fVar.z0("login");
        bVar.b(fVar, wVar, a3Var.b);
        List list = ud0.d.a;
        ud0.d.d(fVar, wVar, a3Var.c);
    }
}

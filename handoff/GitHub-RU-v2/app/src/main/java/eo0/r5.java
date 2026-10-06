package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 implements aaShadow.a {
    public static final r5 a = new r5();
    public static final List b = sy.d0.o(new String[]{"__typename", "comment"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.k8 k8Var = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                k8Var = (jn0.k8) aa.c.b(aa.c.c(o5.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jn0.o8(str, k8Var);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.o8 o8Var = (jn0.o8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, o8Var.a);
        fVar.z0("comment");
        aa.c.b(aa.c.c(o5.a, false)).b(fVar, wVar, o8Var.b);
    }
}

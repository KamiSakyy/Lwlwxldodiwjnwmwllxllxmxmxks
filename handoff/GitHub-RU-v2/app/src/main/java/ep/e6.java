package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e6 implements aaShadow.a {
    public static final e6 a = new e6();
    public static final List b = sy.d0.o("id", "replyTo", "discussion", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.o9 o9Var = null;
        jo.m9 m9Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                o9Var = (jo.o9) aa.c.b(aa.c.c(k6.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                m9Var = (jo.m9) aa.c.b(aa.c.c(i6.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new jo.h9(str, o9Var, m9Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.h9 h9Var = (jo.h9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, h9Var.a);
        fVar.z0("replyTo");
        aa.c.b(aa.c.c(k6.a, true)).b(fVar, wVar, h9Var.b);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(i6.a, false)).b(fVar, wVar, h9Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, h9Var.d);
    }
}

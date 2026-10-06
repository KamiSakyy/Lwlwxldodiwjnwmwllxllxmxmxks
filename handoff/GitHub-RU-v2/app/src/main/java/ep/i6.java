package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i6 implements aaShadow.a {
    public static final i6 a = new i6();
    public static final List b = sy.d0.o("id", "comments", "answer", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.i9 i9Var = null;
        jo.g9 g9Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                i9Var = (jo.i9) aa.c.c(f6.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                g9Var = (jo.g9) aa.c.b(aa.c.c(d6.a, false)).a(eVar, wVar);
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
        if (i9Var == null) {
            k41.b.B(eVar, "comments");
            throw null;
        }
        if (str2 != null) {
            return new jo.m9(str, i9Var, g9Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.m9 m9Var = (jo.m9) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m9Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m9Var.a);
        fVar.z0("comments");
        aa.c.c(f6.a, false).b(fVar, wVar, m9Var.b);
        fVar.z0("answer");
        aa.c.b(aa.c.c(d6.a, false)).b(fVar, wVar, m9Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, m9Var.d);
    }
}

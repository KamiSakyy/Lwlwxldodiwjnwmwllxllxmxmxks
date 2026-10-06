package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 implements aaShadow.a {
    public static final b2 a = new b2();
    public static final List b = sy.d0Shadow.o(new String[]{"id", "savedReplies", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.l3 l3Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                l3Var = (kc0.l3) aa.c.b(aa.c.c(a2.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
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
            return new kc0.m3(str, l3Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.m3 m3Var = (kc0.m3) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m3Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m3Var.a);
        fVar.z0("savedReplies");
        aa.c.b(aa.c.c(a2.a, false)).b(fVar, wVar, m3Var.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, m3Var.c);
    }
}

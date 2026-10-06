package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a9 implements aaShadow.a {
    public static final a9 a = new a9();
    public static final List b = sy.d0.o(new String[]{"id", "repoObject", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.kd kdVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                kdVar = (kc0.kd) aa.c.b(aa.c.c(z8.a, true)).a(eVar, wVar);
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
            return new kc0.ld(str, kdVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.ld ldVar = (kc0.ld) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ldVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ldVar.a);
        fVar.z0("repoObject");
        aa.c.b(aa.c.c(z8.a, true)).b(fVar, wVar, ldVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ldVar.c);
    }
}

package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ah implements aaShadow.a {
    public static final ah a = new ah();
    public static final List b = sy.d0.o(new String[]{"user", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.hp hpVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                hpVar = (kc0.hp) aa.c.b(aa.c.c(fh.a, true)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new kc0.cp(hpVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.cp cpVar = (kc0.cp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(cpVar, "value");
        fVar.z0("user");
        aa.c.b(aa.c.c(fh.a, true)).b(fVar, wVar, cpVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cpVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, cpVar.c);
    }
}

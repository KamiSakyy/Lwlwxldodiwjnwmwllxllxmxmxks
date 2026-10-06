package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k8 implements aaShadow.a {
    public static final k8 a = new k8();
    public static final List b = sy.d0Shadow.o(new String[]{"diff", "id", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.mc mcVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                mcVar = (kc0.mc) aa.c.b(aa.c.c(h8.a, false)).a(eVar, wVar);
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
            return new kc0.pc(mcVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.pc pcVar = (kc0.pc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pcVar, "value");
        fVar.z0("diff");
        aa.c.b(aa.c.c(h8.a, false)).b(fVar, wVar, pcVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pcVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, pcVar.c);
    }
}

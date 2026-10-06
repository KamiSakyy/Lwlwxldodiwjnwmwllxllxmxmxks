package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 implements aaShadow.a {
    public static final c8 a = new c8();
    public static final List b = sy.d0Shadow.o(new String[]{"actor", "pullRequest"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ac acVar = null;
        kc0.ec ecVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                acVar = (kc0.ac) aa.c.b(aa.c.c(a8.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new kc0.dc(acVar, ecVar);
                }
                ecVar = (kc0.ec) aa.c.b(aa.c.c(d8.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.dc dcVar = (kc0.dc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dcVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(a8.a, true)).b(fVar, wVar, dcVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(d8.a, true)).b(fVar, wVar, dcVar.b);
    }
}

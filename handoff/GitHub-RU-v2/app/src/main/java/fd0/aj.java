package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class aj implements aaShadow.a {
    public static final aj a = new aj();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        aj0.f fVar = aj0.f.a;
        aj0.c c = aj0.f.c(eVar, wVar);
        if (str != null) {
            return new kc0.or(c, str);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.or orVar = (kc0.or) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(orVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, orVar.a);
        aj0.f fVar2 = aj0.f.a;
        aj0.f.d(fVar, wVar, orVar.b);
    }
}

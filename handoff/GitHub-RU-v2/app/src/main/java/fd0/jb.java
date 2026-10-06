package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jb implements aaShadow.a {
    public static final jb a = new jb();
    public static final List b = sy.d0Shadow.n("repository");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.ug ugVar = null;
        while (eVar.r0(b) == 0) {
            ugVar = (kc0.ug) aa.c.b(aa.c.c(kb.a, true)).a(eVar, wVar);
        }
        return new kc0.tg(ugVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.tg tgVar = (kc0.tg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tgVar, "value");
        fVar.z0("repository");
        aa.c.b(aa.c.c(kb.a, true)).b(fVar, wVar, tgVar.a);
    }
}

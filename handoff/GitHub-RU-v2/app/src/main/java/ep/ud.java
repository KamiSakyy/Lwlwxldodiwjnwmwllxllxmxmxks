package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ud implements aaShadow.a {
    public static final ud a = new ud();
    public static final List b = sy.d0.n("markDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.hk hkVar = null;
        while (eVar.r0(b) == 0) {
            hkVar = (jo.hk) aa.c.b(aa.c.c(wd.a, false)).a(eVar, wVar);
        }
        return new jo.fk(hkVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fk fkVar = (jo.fk) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fkVar, "value");
        fVar.z0("markDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(wd.a, false)).b(fVar, wVar, fkVar.a);
    }
}

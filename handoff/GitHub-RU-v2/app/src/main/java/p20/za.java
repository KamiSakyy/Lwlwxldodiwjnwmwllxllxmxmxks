package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class za implements aaShadow.a {
    public static final za a = new za();
    public static final List b = sy.d0Shadow.n("markDiscussionCommentAsAnswer");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.jg jgVar = null;
        while (eVar.r0(b) == 0) {
            jgVar = (u10.jg) aa.c.b(aa.c.c(bb.a, false)).a(eVar, wVar);
        }
        return new u10.hg(jgVar);
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.hg hgVar = (u10.hg) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hgVar, "value");
        fVar.z0("markDiscussionCommentAsAnswer");
        aa.c.b(aa.c.c(bb.a, false)).b(fVar, wVar, hgVar.a);
    }
}

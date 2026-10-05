package nb0;

import java.util.List;
import mb0.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements aa.a {
    public static final y a = new y();
    public static final List b = sy.d0.n("getsDirectMentions");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new l0(bool.booleanValue());
        }
        k41.b.B(eVar, "getsDirectMentions");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        l0 l0Var = (l0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l0Var, "value");
        fVar.z0("getsDirectMentions");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(l0Var.a));
    }
}

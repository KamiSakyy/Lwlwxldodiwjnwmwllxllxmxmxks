package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class tf implements aaShadow.a {
    public static final tf a = new tf();
    public static final List b = sy.d0Shadow.n("getsDirectMentionMobilePush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new jn0.kn(bool.booleanValue());
        }
        k41.b.B(eVar, "getsDirectMentionMobilePush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.kn knVar = (jn0.kn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(knVar, "value");
        fVar.z0("getsDirectMentionMobilePush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(knVar.a));
    }
}

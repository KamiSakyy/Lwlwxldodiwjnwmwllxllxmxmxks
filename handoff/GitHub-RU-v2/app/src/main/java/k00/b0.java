package k00;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 implements aa.a {
    public static final b0 a = new b0();
    public static final List b = sy.d0Shadow.n("getsDirectMentions");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new j00.q0(bool.booleanValue());
        }
        k41.b.B(eVar, "getsDirectMentions");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j00.q0 q0Var = (j00.q0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(q0Var, "value");
        fVar.z0("getsDirectMentions");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(q0Var.a));
    }
}

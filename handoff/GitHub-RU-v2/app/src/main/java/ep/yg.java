package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yg implements aa.a {
    public static final yg a = new yg();
    public static final List b = sy.d0.n("getsDirectMentionMobilePush");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new jo.dp(bool.booleanValue());
        }
        k41.b.B(eVar, "getsDirectMentionMobilePush");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.dp dpVar = (jo.dp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dpVar, "value");
        fVar.z0("getsDirectMentionMobilePush");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(dpVar.a));
    }
}

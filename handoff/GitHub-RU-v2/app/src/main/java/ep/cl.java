package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cl implements aaShadow.a {
    public static final cl a = new cl();
    public static final List b = sy.d0Shadow.n("isValid");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool = null;
        while (eVar.r0(b) == 0) {
            bool = (Boolean) aa.c.f.a(eVar, wVar);
        }
        if (bool != null) {
            return new jo.ou(bool.booleanValue());
        }
        k41.b.B(eVar, "isValid");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ou ouVar = (jo.ou) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ouVar, "value");
        fVar.z0("isValid");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(ouVar.a));
    }
}

package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class co implements aaShadow.a {
    public static final List a = sy.d0Shadow.n("watchers");

    public static jo.ty c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.vy vyVar = null;
        while (eVar.r0(a) == 0) {
            vyVar = (jo.vy) aa.c.c(fo.a, false).a(eVar, wVar);
        }
        if (vyVar != null) {
            return new jo.ty(vyVar);
        }
        k41.b.B(eVar, "watchers");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.ty tyVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(tyVar, "value");
        fVar.z0("watchers");
        aa.c.c(fo.a, false).b(fVar, wVar, tyVar.a);
    }
}

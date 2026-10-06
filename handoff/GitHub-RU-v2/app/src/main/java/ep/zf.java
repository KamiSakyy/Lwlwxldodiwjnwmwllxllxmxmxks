package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zf implements aaShadow.a {
    public static final zf a = new zf();
    public static final List b = sy.d0Shadow.o("actor", "pullRequest");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.nn nnVar = null;
        jo.tn tnVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                nnVar = (jo.nn) aa.c.b(aa.c.c(wf.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.rn(nnVar, tnVar);
                }
                tnVar = (jo.tn) aa.c.b(aa.c.c(bg.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rn rnVar = (jo.rn) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rnVar, "value");
        fVar.z0("actor");
        aa.c.b(aa.c.c(wf.a, true)).b(fVar, wVar, rnVar.a);
        fVar.z0("pullRequest");
        aa.c.b(aa.c.c(bg.a, true)).b(fVar, wVar, rnVar.b);
    }
}

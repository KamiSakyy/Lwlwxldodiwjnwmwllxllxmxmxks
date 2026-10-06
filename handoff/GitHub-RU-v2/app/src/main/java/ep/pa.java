package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pa implements aaShadow.a {
    public static final pa a = new pa();
    public static final List b = sy.d0Shadow.o("extension", "fileType");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.vf vfVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new jo.uf(str, vfVar);
                }
                vfVar = (jo.vf) aa.c.b(aa.c.c(qa.a, true)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.uf ufVar = (jo.uf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ufVar, "value");
        fVar.z0("extension");
        aa.c.i.b(fVar, wVar, ufVar.a);
        fVar.z0("fileType");
        aa.c.b(aa.c.c(qa.a, true)).b(fVar, wVar, ufVar.b);
    }
}

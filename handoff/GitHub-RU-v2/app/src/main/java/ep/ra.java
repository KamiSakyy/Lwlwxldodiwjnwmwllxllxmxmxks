package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ra implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "file"});

    public static jo.wf c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jo.uf ufVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                ufVar = (jo.uf) aa.c.b(aa.c.c(pa.a, false)).a(eVar, wVar);
            }
        }
        if (str != null) {
            return new jo.wf(str, ufVar);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.wf wfVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wfVar, "value");
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, wfVar.a);
        fVar.z0("file");
        aa.c.b(aa.c.c(pa.a, false)).b(fVar, wVar, wfVar.b);
    }
}

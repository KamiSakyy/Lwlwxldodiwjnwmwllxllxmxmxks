package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class jo implements aa.a {
    public static final List a = x61.l.r(new String[]{"repositories", "id"});

    public static jo.bz c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fz fzVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                fzVar = (jo.fz) aa.c.c(no.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (fzVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str != null) {
            return new jo.bz(fzVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.bz bzVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bzVar, "value");
        fVar.z0("repositories");
        aa.c.c(no.a, false).b(fVar, wVar, bzVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, bzVar.b);
    }


























































































































































































































































}

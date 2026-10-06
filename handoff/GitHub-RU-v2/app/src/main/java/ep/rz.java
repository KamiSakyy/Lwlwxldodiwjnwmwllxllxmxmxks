package ep;

import java.util.List;
import jo.df0;
import jo.hf0;
import jo.if0;
import jo.kf0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rz implements aaShadow.a {
    public static final rz a = new rz();
    public static final List b = sy.d0Shadow.o("id", "repository", "reviewRequests", "latestReviews", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        if0 if0Var = null;
        kf0 kf0Var = null;
        df0 df0Var = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                if0Var = (if0) aa.c.c(sz.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                kf0Var = (kf0) aa.c.b(aa.c.c(uz.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                df0Var = (df0) aa.c.b(aa.c.c(nz.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (if0Var == null) {
            k41.b.B(eVar, "repository");
            throw null;
        }
        if (str2 != null) {
            return new hf0(str, if0Var, kf0Var, df0Var, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        hf0 hf0Var = (hf0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hf0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hf0Var.a);
        fVar.z0("repository");
        aa.c.c(sz.a, false).b(fVar, wVar, hf0Var.b);
        fVar.z0("reviewRequests");
        aa.c.b(aa.c.c(uz.a, false)).b(fVar, wVar, hf0Var.c);
        fVar.z0("latestReviews");
        aa.c.b(aa.c.c(nz.a, false)).b(fVar, wVar, hf0Var.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, hf0Var.e);
    }
}

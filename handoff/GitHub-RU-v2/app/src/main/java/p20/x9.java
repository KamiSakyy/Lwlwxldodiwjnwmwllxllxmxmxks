package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x9 implements aa.a {
    public static final x9 a = new x9();
    public static final List b = sy.d0.o("issues", "pullRequests", "repos", "users", "organizations");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.ve veVar = null;
        u10.hf hfVar = null;
        u10.jf jfVar = null;
        u10.kf kfVar = null;
        u10.gf gfVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                veVar = (u10.ve) aa.c.c(y9.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                hfVar = (u10.hf) aa.c.c(ka.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                jfVar = (u10.jf) aa.c.c(la.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                kfVar = (u10.kf) aa.c.c(ma.a, false).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                gfVar = (u10.gf) aa.c.c(ja.a, false).a(eVar, wVar);
            }
        }
        if (veVar == null) {
            k41.b.B(eVar, "issues");
            throw null;
        }
        if (hfVar == null) {
            k41.b.B(eVar, "pullRequests");
            throw null;
        }
        if (jfVar == null) {
            k41.b.B(eVar, "repos");
            throw null;
        }
        if (kfVar == null) {
            k41.b.B(eVar, "users");
            throw null;
        }
        if (gfVar != null) {
            return new u10.ue(veVar, hfVar, jfVar, kfVar, gfVar);
        }
        k41.b.B(eVar, "organizations");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.ue ueVar = (u10.ue) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ueVar, "value");
        fVar.z0("issues");
        aa.c.c(y9.a, false).b(fVar, wVar, ueVar.a);
        fVar.z0("pullRequests");
        aa.c.c(ka.a, false).b(fVar, wVar, ueVar.b);
        fVar.z0("repos");
        aa.c.c(la.a, false).b(fVar, wVar, ueVar.c);
        fVar.z0("users");
        aa.c.c(ma.a, false).b(fVar, wVar, ueVar.d);
        fVar.z0("organizations");
        aa.c.c(ja.a, false).b(fVar, wVar, ueVar.e);
    }
}

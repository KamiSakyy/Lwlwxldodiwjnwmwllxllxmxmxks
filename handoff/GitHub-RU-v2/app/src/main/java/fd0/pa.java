package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pa implements aa.a {
    public static final pa a = new pa();
    public static final List b = sy.d0.o(new String[]{"issues", "pullRequests", "repos", "users", "organizations", "code"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        kc0.wf wfVar = null;
        kc0.kg kgVar = null;
        kc0.lg lgVar = null;
        kc0.mg mgVar = null;
        kc0.ig igVar = null;
        kc0.tf tfVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                wfVar = (kc0.wf) aa.c.c(qa.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                kgVar = (kc0.kg) aa.c.c(eb.a, false).a(eVar, wVar);
            } else if (r0 == 2) {
                lgVar = (kc0.lg) aa.c.c(fb.a, false).a(eVar, wVar);
            } else if (r0 == 3) {
                mgVar = (kc0.mg) aa.c.c(gb.a, false).a(eVar, wVar);
            } else if (r0 == 4) {
                igVar = (kc0.ig) aa.c.c(cb.a, false).a(eVar, wVar);
            } else {
                if (r0 != 5) {
                    break;
                }
                tfVar = (kc0.tf) aa.c.b(aa.c.c(oa.a, false)).a(eVar, wVar);
            }
        }
        if (wfVar == null) {
            k41.b.B(eVar, "issues");
            throw null;
        }
        if (kgVar == null) {
            k41.b.B(eVar, "pullRequests");
            throw null;
        }
        if (lgVar == null) {
            k41.b.B(eVar, "repos");
            throw null;
        }
        if (mgVar == null) {
            k41.b.B(eVar, "users");
            throw null;
        }
        if (igVar != null) {
            return new kc0.vf(wfVar, kgVar, lgVar, mgVar, igVar, tfVar);
        }
        k41.b.B(eVar, "organizations");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.vf vfVar = (kc0.vf) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vfVar, "value");
        fVar.z0("issues");
        aa.c.c(qa.a, false).b(fVar, wVar, vfVar.a);
        fVar.z0("pullRequests");
        aa.c.c(eb.a, false).b(fVar, wVar, vfVar.b);
        fVar.z0("repos");
        aa.c.c(fb.a, false).b(fVar, wVar, vfVar.c);
        fVar.z0("users");
        aa.c.c(gb.a, false).b(fVar, wVar, vfVar.d);
        fVar.z0("organizations");
        aa.c.c(cb.a, false).b(fVar, wVar, vfVar.e);
        fVar.z0("code");
        aa.c.b(aa.c.c(oa.a, false)).b(fVar, wVar, vfVar.f);
    }
}

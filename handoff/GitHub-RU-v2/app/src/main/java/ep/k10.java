package ep;

import java.util.List;
import jo.ai0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k10 implements aaShadow.a {
    public static final k10 a = new k10();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        tu.j c = tu.m.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ai0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ai0 ai0Var = (ai0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ai0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ai0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ai0Var.b);
        List list = tu.m.a;
        tu.j jVar = ai0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, jVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, jVar.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, jVar.c);
        fVar.z0("descriptionHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, jVar.d);
        fVar.z0("organizationEmail");
        o0Var.b(fVar, wVar, jVar.e);
        fVar.z0("isVerified");
        aa.b bVar3 = aa.c.f;
        jo.f4Shadow.C(jVar.f, bVar3, fVar, wVar, "organizationItemShowcase");
        aa.c.c(tu.n.a, true).b(fVar, wVar, jVar.g);
        fVar.z0("location");
        o0Var.b(fVar, wVar, jVar.h);
        fVar.z0("login");
        bVar2.b(fVar, wVar, jVar.i);
        fVar.z0("name");
        o0Var.b(fVar, wVar, jVar.j);
        fVar.z0("viewerIsFollowing");
        jo.f4Shadow.C(jVar.k, bVar3, fVar, wVar, "organizationRepositories");
        aa.c.c(tu.o.a, false).b(fVar, wVar, jVar.l);
        fVar.z0("readme");
        aa.c.b(aa.c.c(tu.q.a, true)).b(fVar, wVar, jVar.m);
        fVar.z0("sponsorshipsAsSponsor");
        aa.c.c(tu.r.a, false).b(fVar, wVar, jVar.n);
        fVar.z0("websiteUrl");
        o0Var.b(fVar, wVar, jVar.o);
        fVar.z0("twitterUsername");
        o0Var.b(fVar, wVar, jVar.p);
        fVar.z0("projectsV2");
        aa.c.c(tu.p.a, false).b(fVar, wVar, jVar.q);
        fVar.z0("organizationDiscussionsRepository");
        aa.c.b(aa.c.c(tu.l.a, false)).b(fVar, wVar, jVar.r);
        List list2 = eq.h.a;
        eq.h.d(fVar, wVar, jVar.s);
    }
}

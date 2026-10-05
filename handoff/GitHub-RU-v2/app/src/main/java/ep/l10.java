package ep;

import java.util.List;
import jo.bi0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l10 implements aa.a {
    public static final l10 a = new l10();
    public static final List b = sy.d0.o("__typename", "id");

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
        qx.t1 c = qx.j2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new bi0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bi0 bi0Var = (bi0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bi0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bi0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, bi0Var.b);
        List list = qx.j2.a;
        qx.t1 t1Var = bi0Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t1Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, t1Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, t1Var.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, t1Var.c);
        fVar.z0("bioHTML");
        bVar2.b(fVar, wVar, t1Var.d);
        fVar.z0("companyHTML");
        bVar2.b(fVar, wVar, t1Var.e);
        fVar.z0("userEmail");
        bVar2.b(fVar, wVar, t1Var.f);
        fVar.z0("following");
        aa.c.c(qx.w1.a, false).b(fVar, wVar, t1Var.g);
        fVar.z0("isDeveloperProgramMember");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(t1Var.h, bVar3, fVar, wVar, "isEmployee");
        jo.f4.C(t1Var.i, bVar3, fVar, wVar, "isFollowingViewer");
        jo.f4.C(t1Var.j, bVar3, fVar, wVar, "isViewer");
        jo.f4.C(t1Var.k, bVar3, fVar, wVar, "isBountyHunter");
        jo.f4.C(t1Var.l, bVar3, fVar, wVar, "itemShowcase");
        aa.c.c(qx.x1.a, true).b(fVar, wVar, t1Var.m);
        fVar.z0("location");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, t1Var.n);
        fVar.z0("login");
        bVar2.b(fVar, wVar, t1Var.o);
        fVar.z0("name");
        o0Var.b(fVar, wVar, t1Var.p);
        fVar.z0("organizations");
        aa.c.c(qx.a2.a, false).b(fVar, wVar, t1Var.q);
        fVar.z0("pronouns");
        o0Var.b(fVar, wVar, t1Var.r);
        fVar.z0("repositories");
        aa.c.c(qx.d2.a, false).b(fVar, wVar, t1Var.s);
        fVar.z0("starredRepositories");
        aa.c.c(qx.g2.a, false).b(fVar, wVar, t1Var.t);
        fVar.z0("sponsorshipsAsSponsor");
        aa.c.c(qx.f2.a, false).b(fVar, wVar, t1Var.u);
        fVar.z0("status");
        aa.c.b(aa.c.c(qx.h2.a, true)).b(fVar, wVar, t1Var.v);
        fVar.z0("showProfileReadme");
        jo.f4.C(t1Var.w, bVar3, fVar, wVar, "profileReadme");
        aa.c.b(aa.c.c(qx.b2.a, true)).b(fVar, wVar, t1Var.x);
        fVar.z0("viewerCanFollow");
        jo.f4.C(t1Var.y, bVar3, fVar, wVar, "viewerIsFollowing");
        jo.f4.C(t1Var.z, bVar3, fVar, wVar, "websiteUrl");
        o0Var.b(fVar, wVar, t1Var.A);
        fVar.z0("viewerCanBlock");
        jo.f4.C(t1Var.B, bVar3, fVar, wVar, "viewerCanUnblock");
        jo.f4.C(t1Var.C, bVar3, fVar, wVar, "privateProfile");
        jo.f4.C(t1Var.D, bVar3, fVar, wVar, "projectsV2");
        aa.c.c(qx.c2.a, false).b(fVar, wVar, t1Var.E);
        fVar.z0("socialAccounts");
        aa.c.c(qx.e2.a, false).b(fVar, wVar, t1Var.F);
        fVar.z0("achievements");
        aa.c.c(qx.v1.a, false).b(fVar, wVar, t1Var.G);
        List list2 = eq.h.a;
        eq.h.d(fVar, wVar, t1Var.H);
        cq.d7 d7Var = cq.d7.a;
        cq.d7.d(fVar, wVar, t1Var.I);
    }
}

package p20;

import java.util.List;
import u10.n90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fv implements aaShadow.a {
    public static final fv a = new fv();
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
        ea0.s1 c = ea0.h2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new n90(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        n90 n90Var = (n90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(n90Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, n90Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, n90Var.b);
        List list = ea0.h2.a;
        ea0.s1 s1Var = n90Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s1Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, s1Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, s1Var.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, s1Var.c);
        fVar.z0("bioHTML");
        bVar2.b(fVar, wVar, s1Var.d);
        fVar.z0("companyHTML");
        bVar2.b(fVar, wVar, s1Var.e);
        fVar.z0("userEmail");
        bVar2.b(fVar, wVar, s1Var.f);
        fVar.z0("following");
        aa.c.c(ea0.v1.a, false).b(fVar, wVar, s1Var.g);
        fVar.z0("isDeveloperProgramMember");
        aa.b bVar3 = aa.c.f;
        jo.f4Shadow.C(s1Var.h, bVar3, fVar, wVar, "isEmployee");
        jo.f4Shadow.C(s1Var.i, bVar3, fVar, wVar, "isFollowingViewer");
        jo.f4Shadow.C(s1Var.j, bVar3, fVar, wVar, "isViewer");
        jo.f4Shadow.C(s1Var.k, bVar3, fVar, wVar, "isBountyHunter");
        jo.f4Shadow.C(s1Var.l, bVar3, fVar, wVar, "itemShowcase");
        aa.c.c(ea0.w1.a, true).b(fVar, wVar, s1Var.m);
        fVar.z0("location");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, s1Var.n);
        fVar.z0("login");
        bVar2.b(fVar, wVar, s1Var.o);
        fVar.z0("name");
        o0Var.b(fVar, wVar, s1Var.p);
        fVar.z0("organizations");
        aa.c.c(ea0.z1.a, false).b(fVar, wVar, s1Var.q);
        fVar.z0("pronouns");
        o0Var.b(fVar, wVar, s1Var.r);
        fVar.z0("repositories");
        aa.c.c(ea0.c2.a, false).b(fVar, wVar, s1Var.s);
        fVar.z0("starredRepositories");
        aa.c.c(ea0.e2.a, false).b(fVar, wVar, s1Var.t);
        fVar.z0("status");
        aa.c.b(aa.c.c(ea0.f2.a, true)).b(fVar, wVar, s1Var.u);
        fVar.z0("showProfileReadme");
        jo.f4Shadow.C(s1Var.v, bVar3, fVar, wVar, "profileReadme");
        aa.c.b(aa.c.c(ea0.a2.a, true)).b(fVar, wVar, s1Var.w);
        fVar.z0("viewerCanFollow");
        jo.f4Shadow.C(s1Var.x, bVar3, fVar, wVar, "viewerIsFollowing");
        jo.f4Shadow.C(s1Var.y, bVar3, fVar, wVar, "websiteUrl");
        o0Var.b(fVar, wVar, s1Var.z);
        fVar.z0("viewerCanBlock");
        jo.f4Shadow.C(s1Var.A, bVar3, fVar, wVar, "viewerCanUnblock");
        jo.f4Shadow.C(s1Var.B, bVar3, fVar, wVar, "privateProfile");
        jo.f4Shadow.C(s1Var.C, bVar3, fVar, wVar, "projectsV2");
        aa.c.c(ea0.b2.a, false).b(fVar, wVar, s1Var.D);
        fVar.z0("socialAccounts");
        aa.c.c(ea0.d2.a, false).b(fVar, wVar, s1Var.E);
        fVar.z0("achievements");
        aa.c.c(ea0.u1.a, false).b(fVar, wVar, s1Var.F);
        List list2 = e30.d.a;
        e30.d.d(fVar, wVar, s1Var.G);
        c30.u0 u0Var = c30.u0.a;
        c30.u0.d(fVar, wVar, s1Var.H);
    }
}

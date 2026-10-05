package fd0;

import java.util.List;
import kc0.nb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rw implements aa.a {
    public static final rw a = new rw();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        wk0.s1 c = wk0.h2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new nb0(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        nb0 nb0Var = (nb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(nb0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, nb0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, nb0Var.b);
        List list = wk0.h2.a;
        wk0.s1 s1Var = nb0Var.c;
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
        aa.c.c(wk0.v1.a, false).b(fVar, wVar, s1Var.g);
        fVar.z0("isDeveloperProgramMember");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(s1Var.h, bVar3, fVar, wVar, "isEmployee");
        jo.f4.C(s1Var.i, bVar3, fVar, wVar, "isFollowingViewer");
        jo.f4.C(s1Var.j, bVar3, fVar, wVar, "isViewer");
        jo.f4.C(s1Var.k, bVar3, fVar, wVar, "isBountyHunter");
        jo.f4.C(s1Var.l, bVar3, fVar, wVar, "itemShowcase");
        aa.c.c(wk0.w1.a, true).b(fVar, wVar, s1Var.m);
        fVar.z0("location");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, s1Var.n);
        fVar.z0("login");
        bVar2.b(fVar, wVar, s1Var.o);
        fVar.z0("name");
        o0Var.b(fVar, wVar, s1Var.p);
        fVar.z0("organizations");
        aa.c.c(wk0.z1.a, false).b(fVar, wVar, s1Var.q);
        fVar.z0("pronouns");
        o0Var.b(fVar, wVar, s1Var.r);
        fVar.z0("repositories");
        aa.c.c(wk0.c2.a, false).b(fVar, wVar, s1Var.s);
        fVar.z0("starredRepositories");
        aa.c.c(wk0.e2.a, false).b(fVar, wVar, s1Var.t);
        fVar.z0("status");
        aa.c.b(aa.c.c(wk0.f2.a, true)).b(fVar, wVar, s1Var.u);
        fVar.z0("showProfileReadme");
        jo.f4.C(s1Var.v, bVar3, fVar, wVar, "profileReadme");
        aa.c.b(aa.c.c(wk0.a2.a, true)).b(fVar, wVar, s1Var.w);
        fVar.z0("viewerCanFollow");
        jo.f4.C(s1Var.x, bVar3, fVar, wVar, "viewerIsFollowing");
        jo.f4.C(s1Var.y, bVar3, fVar, wVar, "websiteUrl");
        o0Var.b(fVar, wVar, s1Var.z);
        fVar.z0("viewerCanBlock");
        jo.f4.C(s1Var.A, bVar3, fVar, wVar, "viewerCanUnblock");
        jo.f4.C(s1Var.B, bVar3, fVar, wVar, "privateProfile");
        jo.f4.C(s1Var.C, bVar3, fVar, wVar, "projectsV2");
        aa.c.c(wk0.b2.a, false).b(fVar, wVar, s1Var.D);
        fVar.z0("socialAccounts");
        aa.c.c(wk0.d2.a, false).b(fVar, wVar, s1Var.E);
        fVar.z0("achievements");
        aa.c.c(wk0.u1.a, false).b(fVar, wVar, s1Var.F);
        List list2 = ud0.d.a;
        ud0.d.d(fVar, wVar, s1Var.G);
        sd0.f1 f1Var = sd0.f1.a;
        sd0.f1.d(fVar, wVar, s1Var.H);
    }
}

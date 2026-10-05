package ep;

import java.util.List;
import jo.p30;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pr implements aa.a {
    public static final pr a = new pr();
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
        dw.k2 c = dw.c3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new p30(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p30 p30Var = (p30) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p30Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p30Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p30Var.b);
        List list = dw.c3.a;
        dw.k2 k2Var = p30Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(k2Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, k2Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, k2Var.b);
        fVar.z0("databaseId");
        nn.a aVar = tp.a.a;
        aa.c.b(aVar).b(fVar, wVar, k2Var.c);
        fVar.z0("contributorsCount");
        f1.e.A(k2Var.d, aVar, fVar, wVar, "defaultBranchRef");
        aa.c.b(aa.c.c(dw.m2.a, true)).b(fVar, wVar, k2Var.e);
        fVar.z0("branchInfo");
        aa.c.b(aa.c.c(dw.l2.a, true)).b(fVar, wVar, k2Var.f);
        fVar.z0("forkCount");
        f1.e.A(k2Var.g, aVar, fVar, wVar, "hasIssuesEnabled");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(k2Var.h, bVar3, fVar, wVar, "showActions");
        jo.f4.C(k2Var.i, bVar3, fVar, wVar, "homepageUrl");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, k2Var.j);
        fVar.z0("isPrivate");
        jo.f4.C(k2Var.k, bVar3, fVar, wVar, "isArchived");
        jo.f4.C(k2Var.l, bVar3, fVar, wVar, "isTemplate");
        jo.f4.C(k2Var.m, bVar3, fVar, wVar, "isFork");
        jo.f4.C(k2Var.n, bVar3, fVar, wVar, "forkingAllowed");
        jo.f4.C(k2Var.o, bVar3, fVar, wVar, "isEmpty");
        jo.f4.C(k2Var.p, bVar3, fVar, wVar, "isInOrganization");
        jo.f4.C(k2Var.q, bVar3, fVar, wVar, "issues");
        aa.c.c(dw.o2.a, false).b(fVar, wVar, k2Var.r);
        fVar.z0("name");
        bVar2.b(fVar, wVar, k2Var.s);
        fVar.z0("owner");
        aa.c.c(dw.v2.a, true).b(fVar, wVar, k2Var.t);
        fVar.z0("pullRequests");
        aa.c.c(dw.y2.a, false).b(fVar, wVar, k2Var.u);
        fVar.z0("refs");
        aa.c.b(aa.c.c(dw.a3.a, false)).b(fVar, wVar, k2Var.v);
        fVar.z0("readme");
        aa.c.b(aa.c.c(dw.z2.a, false)).b(fVar, wVar, k2Var.w);
        fVar.z0("repositoryTopics");
        aa.c.c(dw.d3.a, false).b(fVar, wVar, k2Var.x);
        fVar.z0("url");
        bVar2.b(fVar, wVar, k2Var.y);
        fVar.z0("shortDescriptionHTML");
        bVar2.b(fVar, wVar, k2Var.z);
        fVar.z0("descriptionHTML");
        bVar2.b(fVar, wVar, k2Var.A);
        fVar.z0("description");
        o0Var.b(fVar, wVar, k2Var.B);
        fVar.z0("viewerCanAdminister");
        jo.f4.C(k2Var.C, bVar3, fVar, wVar, "viewerCanPush");
        jo.f4.C(k2Var.D, bVar3, fVar, wVar, "viewerCanSubscribe");
        jo.f4.C(k2Var.E, bVar3, fVar, wVar, "viewerPermission");
        aa.c.b(n10.b.A).b(fVar, wVar, k2Var.F);
        fVar.z0("watchers");
        aa.c.c(dw.f3.a, false).b(fVar, wVar, k2Var.G);
        fVar.z0("licenseInfo");
        aa.c.b(aa.c.c(dw.q2.a, true)).b(fVar, wVar, k2Var.H);
        fVar.z0("isDiscussionsEnabled");
        jo.f4.C(k2Var.I, bVar3, fVar, wVar, "discussionsCount");
        f1.e.A(k2Var.J, aVar, fVar, wVar, "parent");
        aa.c.b(aa.c.c(dw.w2.a, false)).b(fVar, wVar, k2Var.K);
        fVar.z0("releases");
        aa.c.c(dw.b3.a, false).b(fVar, wVar, k2Var.L);
        fVar.z0("latestRelease");
        aa.c.b(aa.c.c(dw.p2.a, false)).b(fVar, wVar, k2Var.M);
        fVar.z0("isViewersFavorite");
        jo.f4.C(k2Var.N, bVar3, fVar, wVar, "viewerHasBlockedContributors");
        jo.f4.C(k2Var.O, bVar3, fVar, wVar, "viewerBlockedByOwner");
        jo.f4.C(k2Var.P, bVar3, fVar, wVar, "mergeQueue");
        aa.c.b(aa.c.c(dw.r2.a, true)).b(fVar, wVar, k2Var.Q);
        fVar.z0("projectsV2");
        aa.c.c(dw.x2.a, false).b(fVar, wVar, k2Var.R);
        fVar.z0("forks");
        aa.c.c(dw.n2.a, false).b(fVar, wVar, k2Var.S);
        fVar.z0("isCopilotAgentEnabled");
        aa.c.k.b(fVar, wVar, k2Var.T);
        List list2 = dw.t.a;
        dw.t.d(fVar, wVar, k2Var.U);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, k2Var.V);
        List list3 = qx.x0.a;
        qx.u0 u0Var = k2Var.W;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u0Var, "value");
        fVar.z0("topContributors");
        aa.c.a(aa.c.c(qx.w0.a, true)).e(fVar, wVar, u0Var.a);
        fVar.z0("id");
        aa.b bVar4 = aa.c.a;
        bVar4.b(fVar, wVar, u0Var.b);
        fVar.z0("__typename");
        bVar4.b(fVar, wVar, u0Var.c);
        dw.p7 p7Var = dw.p7.a;
        dw.p7.d(fVar, wVar, k2Var.X);
        dw.r5 r5Var = dw.r5.a;
        dw.r5.d(fVar, wVar, k2Var.Y);
    }
}

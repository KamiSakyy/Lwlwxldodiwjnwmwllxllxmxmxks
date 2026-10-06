package el0;

import java.util.List;
import jo.f4Shadow;
import oj0.p2;
import oj0.s2;
import oj0.t2;
import oj0.u2;
import oj0.v2;
import oj0.w2;
import oj0.z2;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        p2 c = z2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new dl0.i(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        dl0.i iVar = (dl0.i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.b);
        List list = z2.a;
        p2 p2Var = iVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p2Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, p2Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, p2Var.b);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(w2.a, true)).b(fVar, wVar, p2Var.c);
        List list2 = v2.a;
        s2 s2Var = p2Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s2Var, "value");
        fVar.z0("__typename");
        aa.b bVar3 = aa.c.a;
        bVar3.b(fVar, wVar, s2Var.a);
        fVar.z0("name");
        bVar3.b(fVar, wVar, s2Var.b);
        fVar.z0("url");
        bVar3.b(fVar, wVar, s2Var.c);
        fVar.z0("isInOrganization");
        aa.b bVar4 = aa.c.f;
        f4Shadow.C(s2Var.d, bVar4, fVar, wVar, "owner");
        aa.c.c(u2.a, true).b(fVar, wVar, s2Var.e);
        fVar.z0("id");
        bVar3.b(fVar, wVar, s2Var.f);
        fVar.z0("viewerPermission");
        aa.c.b(hn0.b.h).b(fVar, wVar, s2Var.g);
        fVar.z0("squashMergeAllowed");
        f4Shadow.C(s2Var.h, bVar4, fVar, wVar, "rebaseMergeAllowed");
        f4Shadow.C(s2Var.i, bVar4, fVar, wVar, "mergeCommitAllowed");
        f4Shadow.C(s2Var.j, bVar4, fVar, wVar, "viewerDefaultCommitEmail");
        aa.c.i.b(fVar, wVar, s2Var.k);
        fVar.z0("viewerDefaultMergeMethod");
        fVar.I(s2Var.l.r);
        fVar.z0("viewerPossibleCommitEmails");
        aa.c.b(aa.c.a(bVar3)).b(fVar, wVar, s2Var.m);
        fVar.z0("planSupports");
        f4Shadow.C(s2Var.n, bVar4, fVar, wVar, "allowUpdateBranch");
        f4Shadow.C(s2Var.o, bVar4, fVar, wVar, "defaultBranchRef");
        aa.c.b(aa.c.c(t2.a, false)).b(fVar, wVar, s2Var.p);
        ek0.f fVar2 = ek0.f.a;
        ek0.f.d(fVar, wVar, p2Var.e);
    }
}

package ri0;

import gn0.hn;
import gn0.kw;
import gn0.pm;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d3 implements aa.a {
    public static final d3 a = new d3();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "isDraft", "title", "titleHTMLString", "number", "createdAt", "headRepository", "headRepositoryOwner", "isReadByViewer", "totalCommentsCount", "pullRequestState", "repository", "url", "viewerSubscription", "reviewDecision", "assignees", "commits", "closingIssuesReferences", "isInMergeQueue", "mergeQueueEntry", "mergeQueue"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0038. Please report as an issue. */
    public static p2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Integer valueOf;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
        Boolean bool4 = null;
        ZonedDateTime zonedDateTime = null;
        g2 g2Var = null;
        h2 h2Var = null;
        Boolean bool5 = null;
        Integer num2 = null;
        hn hnVar = null;
        n2 n2Var = null;
        String str5 = null;
        kw kwVar = null;
        pm pmVar = null;
        c2 c2Var = null;
        f2 f2Var = null;
        d2 d2Var = null;
        j2 j2Var = null;
        i2 i2Var = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 2:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                case 3:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                case 4:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                case 5:
                    Boolean bool6 = bool3;
                    bool2 = bool4;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool3 = bool6;
                    bool4 = bool2;
                case 6:
                    gn0.r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(gn0.r6.a).a(eVar, wVar);
                case 7:
                    bool = bool3;
                    g2Var = (g2) aa.c.b(aa.c.c(w2.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 8:
                    bool = bool3;
                    h2Var = (h2) aa.c.b(aa.c.c(x2.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 9:
                    bool5 = (Boolean) aa.c.k.a(eVar, wVar);
                case 10:
                    num2 = (Integer) aa.c.b(od0.b.a).a(eVar, wVar);
                case 11:
                    Boolean bool7 = bool3;
                    Integer num3 = num;
                    bool2 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
                    hn.Companion.getClass();
                    Iterator it = hn.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hn) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hn hnVar2 = (hn) obj;
                    hnVar = hnVar2 == null ? hn.v : hnVar2;
                    bool3 = bool7;
                    num = num3;
                    bool4 = bool2;
                case 12:
                    bool = bool3;
                    n2Var = (n2) aa.c.c(e3.a, false).a(eVar, wVar);
                    bool3 = bool;
                case 13:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                case 14:
                    kwVar = (kw) aa.c.b(hn0.b.o).a(eVar, wVar);
                case 15:
                    pmVar = (pm) aa.c.b(hn0.b.b).a(eVar, wVar);
                case 16:
                    bool = bool3;
                    c2Var = (c2) aa.c.c(s2.a, false).a(eVar, wVar);
                    bool3 = bool;
                case 17:
                    bool = bool3;
                    f2Var = (f2) aa.c.c(v2.a, false).a(eVar, wVar);
                    bool3 = bool;
                case 18:
                    bool = bool3;
                    d2Var = (d2) aa.c.b(aa.c.c(t2.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 19:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 20:
                    bool = bool3;
                    j2Var = (j2) aa.c.b(aa.c.c(z2.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 21:
                    bool = bool3;
                    i2Var = (i2) aa.c.b(aa.c.c(y2.a, true)).a(eVar, wVar);
                    bool3 = bool;
            }
            eVar.s0();
            sg0.j c = sg0.n.c(eVar, wVar);
            eVar.s0();
            h8 c2 = l8.c(eVar, wVar);
            Boolean bool8 = bool3;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (bool8 == null) {
                k41.b.B(eVar, "isDraft");
                throw null;
            }
            Integer num4 = num;
            boolean booleanValue = bool8.booleanValue();
            if (str3 == null) {
                k41.b.B(eVar, "title");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "titleHTMLString");
                throw null;
            }
            if (num4 == null) {
                k41.b.B(eVar, "number");
                throw null;
            }
            Boolean bool9 = bool4;
            int intValue = num4.intValue();
            if (zonedDateTime == null) {
                k41.b.B(eVar, "createdAt");
                throw null;
            }
            if (hnVar == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (n2Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str5 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (c2Var == null) {
                k41.b.B(eVar, "assignees");
                throw null;
            }
            if (f2Var == null) {
                k41.b.B(eVar, "commits");
                throw null;
            }
            if (bool9 != null) {
                return new p2(str, str2, booleanValue, str3, str4, intValue, zonedDateTime, g2Var, h2Var, bool5, num2, hnVar, n2Var, str5, kwVar, pmVar, c2Var, f2Var, d2Var, bool9.booleanValue(), j2Var, i2Var, c, c2);
            }
            k41.b.B(eVar, "isInMergeQueue");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, p2 p2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(p2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, p2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, p2Var.b);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(p2Var.c, bVar2, fVar, wVar, "title");
        bVar.b(fVar, wVar, p2Var.d);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, p2Var.e);
        fVar.z0("number");
        Integer valueOf = Integer.valueOf(p2Var.f);
        nn.a aVar = od0.b.a;
        aVar.b(fVar, wVar, valueOf);
        fVar.z0("createdAt");
        gn0.r6.Companion.getClass();
        wVar.e(gn0.r6.a).b(fVar, wVar, p2Var.g);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(w2.a, false)).b(fVar, wVar, p2Var.h);
        fVar.z0("headRepositoryOwner");
        aa.c.b(aa.c.c(x2.a, false)).b(fVar, wVar, p2Var.i);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, p2Var.j);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, p2Var.k);
        fVar.z0("pullRequestState");
        fVar.I(p2Var.l.r);
        fVar.z0("repository");
        aa.c.c(e3.a, false).b(fVar, wVar, p2Var.m);
        fVar.z0("url");
        bVar.b(fVar, wVar, p2Var.n);
        fVar.z0("viewerSubscription");
        aa.c.b(hn0.b.o).b(fVar, wVar, p2Var.o);
        fVar.z0("reviewDecision");
        aa.c.b(hn0.b.b).b(fVar, wVar, p2Var.p);
        fVar.z0("assignees");
        aa.c.c(s2.a, false).b(fVar, wVar, p2Var.q);
        fVar.z0("commits");
        aa.c.c(v2.a, false).b(fVar, wVar, p2Var.r);
        fVar.z0("closingIssuesReferences");
        aa.c.b(aa.c.c(t2.a, false)).b(fVar, wVar, p2Var.s);
        fVar.z0("isInMergeQueue");
        jo.f4.C(p2Var.t, bVar2, fVar, wVar, "mergeQueueEntry");
        aa.c.b(aa.c.c(z2.a, false)).b(fVar, wVar, p2Var.u);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(y2.a, true)).b(fVar, wVar, p2Var.v);
        List list = sg0.n.a;
        sg0.n.d(fVar, wVar, p2Var.w);
        List list2 = l8.a;
        l8.d(fVar, wVar, p2Var.x);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (p2) obj);
    }
}

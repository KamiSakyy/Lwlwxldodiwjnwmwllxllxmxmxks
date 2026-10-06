package gv;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import m10.b00;
import m10.jz;
import m10.sa;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements aa.a {
    public static final n3 a = new n3();
    public static final List b = sy.d0Shadow.o("__typename", "id", "isDraft", "title", "titleHTMLString", "number", "createdAt", "headRepository", "headRepositoryOwner", "isReadByViewer", "totalCommentsCount", "pullRequestState", "repository", "url", "viewerSubscription", "reviewDecision", "assignedActors", "commits", "closingIssuesReferences", "isInMergeQueue", "mergeQueueEntry", "mergeQueue");

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0038. Please report as an issue. */
    public static z2 c(ea.e eVar, aa.w wVar) {
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
        q2 q2Var = null;
        r2 r2Var = null;
        Boolean bool5 = null;
        Integer num2 = null;
        b00 b00Var = null;
        x2 x2Var = null;
        String str5 = null;
        ya0 ya0Var = null;
        jz jzVar = null;
        m2 m2Var = null;
        p2 p2Var = null;
        n2 n2Var = null;
        t2 t2Var = null;
        s2 s2Var = null;
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
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                        }
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool3 = bool6;
                    bool4 = bool2;
                case 6:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(sa.a).a(eVar, wVar);
                case 7:
                    bool = bool3;
                    q2Var = (q2) aa.c.b(aa.c.c(g3.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 8:
                    bool = bool3;
                    r2Var = (r2) aa.c.b(aa.c.c(h3.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 9:
                    bool5 = (Boolean) aa.c.k.a(eVar, wVar);
                case 10:
                    num2 = (Integer) aa.c.b(tp.a.a).a(eVar, wVar);
                case 11:
                    Boolean bool7 = bool3;
                    Integer num3 = num;
                    bool2 = bool4;
                    String u = eVar.u();
                    k71.k.d(u);
                    b00.Companion.getClass();
                    Iterator it = b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    b00 b00Var2 = (b00) obj;
                    b00Var = b00Var2 == null ? b00.v : b00Var2;
                    bool3 = bool7;
                    num = num3;
                    bool4 = bool2;
                case 12:
                    bool = bool3;
                    x2Var = (x2) aa.c.c(o3.a, false).a(eVar, wVar);
                    bool3 = bool;
                case 13:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                case 14:
                    ya0Var = (ya0) aa.c.b(n10.c.e).a(eVar, wVar);
                case 15:
                    jzVar = (jz) aa.c.b(n10.b.t).a(eVar, wVar);
                case 16:
                    bool = bool3;
                    m2Var = (m2) aa.c.c(c3.a, false).a(eVar, wVar);
                    bool3 = bool;
                case 17:
                    bool = bool3;
                    p2Var = (p2) aa.c.c(f3.a, false).a(eVar, wVar);
                    bool3 = bool;
                case 18:
                    bool = bool3;
                    n2Var = (n2) aa.c.b(aa.c.c(d3.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 19:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 20:
                    bool = bool3;
                    t2Var = (t2) aa.c.b(aa.c.c(j3.a, false)).a(eVar, wVar);
                    bool3 = bool;
                case 21:
                    bool = bool3;
                    s2Var = (s2) aa.c.b(aa.c.c(i3.a, true)).a(eVar, wVar);
                    bool3 = bool;
            }
            eVar.s0();
            lt.j c = lt.n.c(eVar, wVar);
            eVar.s0();
            l8 c2 = p8.c(eVar, wVar);
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
            if (b00Var == null) {
                k41.b.B(eVar, "pullRequestState");
                throw null;
            }
            if (x2Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str5 == null) {
                k41.b.B(eVar, "url");
                throw null;
            }
            if (m2Var == null) {
                k41.b.B(eVar, "assignedActors");
                throw null;
            }
            if (p2Var == null) {
                k41.b.B(eVar, "commits");
                throw null;
            }
            if (bool9 != null) {
                return new z2(str, str2, booleanValue, str3, str4, intValue, zonedDateTime, q2Var, r2Var, bool5, num2, b00Var, x2Var, str5, ya0Var, jzVar, m2Var, p2Var, n2Var, bool9.booleanValue(), t2Var, s2Var, c, c2);
            }
            k41.b.B(eVar, "isInMergeQueue");
            throw null;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, z2 z2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, z2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, z2Var.b);
        fVar.z0("isDraft");
        aa.b bVar2 = aa.c.f;
        jo.f4Shadow.C(z2Var.c, bVar2, fVar, wVar, "title");
        bVar.b(fVar, wVar, z2Var.d);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, z2Var.e);
        fVar.z0("number");
        int i = z2Var.f;
        nn.a aVar = tp.a.a;
        f1.e.A(i, aVar, fVar, wVar, "createdAt");
        sa.Companion.getClass();
        wVar.e(sa.a).b(fVar, wVar, z2Var.g);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(g3.a, false)).b(fVar, wVar, z2Var.h);
        fVar.z0("headRepositoryOwner");
        aa.c.b(aa.c.c(h3.a, false)).b(fVar, wVar, z2Var.i);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, z2Var.j);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, z2Var.k);
        fVar.z0("pullRequestState");
        fVar.I(z2Var.l.r);
        fVar.z0("repository");
        aa.c.c(o3.a, false).b(fVar, wVar, z2Var.m);
        fVar.z0("url");
        bVar.b(fVar, wVar, z2Var.n);
        fVar.z0("viewerSubscription");
        aa.c.b(n10.c.e).b(fVar, wVar, z2Var.o);
        fVar.z0("reviewDecision");
        aa.c.b(n10.b.t).b(fVar, wVar, z2Var.p);
        fVar.z0("assignedActors");
        aa.c.c(c3.a, false).b(fVar, wVar, z2Var.q);
        fVar.z0("commits");
        aa.c.c(f3.a, false).b(fVar, wVar, z2Var.r);
        fVar.z0("closingIssuesReferences");
        aa.c.b(aa.c.c(d3.a, false)).b(fVar, wVar, z2Var.s);
        fVar.z0("isInMergeQueue");
        jo.f4Shadow.C(z2Var.t, bVar2, fVar, wVar, "mergeQueueEntry");
        aa.c.b(aa.c.c(j3.a, false)).b(fVar, wVar, z2Var.u);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(i3.a, true)).b(fVar, wVar, z2Var.v);
        List list = lt.n.a;
        lt.n.d(fVar, wVar, z2Var.w);
        List list2 = p8.a;
        p8.d(fVar, wVar, z2Var.x);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (z2) obj);
    }
}

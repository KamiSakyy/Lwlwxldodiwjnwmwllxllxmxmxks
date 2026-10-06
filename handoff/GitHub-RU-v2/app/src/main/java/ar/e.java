package ar;

import aa.w;
import aa.x;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import k71.k;
import m10.p5;
import m10.sa;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements aa.a {
    public static final List a = l.r(new String[]{"__typename", "id", "author", "editor", "lastEditedAt", "includesCreatedEdit", "bodyHTML", "body", "createdAt", "viewerDidAuthor", "authorAssociation"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r5 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0066, code lost:
    
        if (r13 == null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        r17 = r9;
        r9 = r13.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006e, code lost:
    
        if (r10 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0070, code lost:
    
        if (r11 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0072, code lost:
    
        if (r12 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r17 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        r13 = r17.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007a, code lost:
    
        if (r14 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        return new ar.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        k41.b.B(r30, "authorAssociation");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        k41.b.B(r30, "viewerDidAuthor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        k41.b.B(r30, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
    
        k41.b.B(r30, "body");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        k41.b.B(r30, "bodyHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
    
        k41.b.B(r30, "includesCreatedEdit");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a3, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a4, code lost:
    
        k41.b.B(r30, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b1, code lost:
    
        throw new java.lang.IllegalStateException("__typename was not found");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
    
        if (r4 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0053, code lost:
    
        if (m71.a.v(m71.a.O(new java.lang.String[]{"CommitComment", "Discussion", "DiscussionComment", "GistComment", "Issue", "IssueComment", "Project", "ProjectV2", "PullRequest", "PullRequestReview", "PullRequestReviewComment", "RepositoryAdvisory", "RepositoryAdvisoryComment"}), r31.a, r4, r31.b) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0055, code lost:
    
        r30.s0();
        r15 = mx.b.c(r30, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005d, code lost:
    
        r13 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c c(ea.e eVar, w wVar) {
        Object obj;
        Boolean bool;
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        a aVar = null;
        b bVar = null;
        ZonedDateTime zonedDateTime = null;
        Boolean bool3 = null;
        String str3 = null;
        String str4 = null;
        ZonedDateTime zonedDateTime2 = null;
        p5 p5Var = null;
        while (true) {
            int r0 = eVar.r0(a);
            x xVar = sa.a;
            switch (r0) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 2:
                    bool = bool2;
                    aVar = (a) aa.c.b(aa.c.c(d.a, true)).a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    bVar = (b) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
                    break;
                case 4:
                    sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) aa.c.b(wVar.e(xVar)).a(eVar, wVar);
                    continue;
                case 5:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 6:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 8:
                    sa.Companion.getClass();
                    zonedDateTime2 = (ZonedDateTime) wVar.e(xVar).a(eVar, wVar);
                    continue;
                case 9:
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 10:
                    Boolean bool4 = bool2;
                    Boolean bool5 = bool3;
                    String u = eVar.u();
                    k.d(u);
                    p5.Companion.getClass();
                    Iterator it = p5.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((p5) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    p5 p5Var2 = (p5) obj;
                    p5Var = p5Var2 == null ? p5.t : p5Var2;
                    bool2 = bool4;
                    bool3 = bool5;
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, c cVar) {
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(cVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, cVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, cVar.b);
        fVar.z0("author");
        aa.c.b(aa.c.c(d.a, true)).b(fVar, wVar, cVar.c);
        fVar.z0("editor");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, cVar.d);
        fVar.z0("lastEditedAt");
        sa.Companion.getClass();
        x xVar = sa.a;
        aa.c.b(wVar.e(xVar)).b(fVar, wVar, cVar.e);
        fVar.z0("includesCreatedEdit");
        aa.b bVar2 = aa.c.f;
        f4Shadow.C(cVar.f, bVar2, fVar, wVar, "bodyHTML");
        bVar.b(fVar, wVar, cVar.g);
        fVar.z0("body");
        bVar.b(fVar, wVar, cVar.h);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, cVar.i);
        fVar.z0("viewerDidAuthor");
        f4Shadow.C(cVar.j, bVar2, fVar, wVar, "authorAssociation");
        fVar.I(cVar.k.r);
        mx.a aVar = cVar.l;
        if (aVar != null) {
            mx.b.d(fVar, wVar, aVar);
        }
    }

    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}

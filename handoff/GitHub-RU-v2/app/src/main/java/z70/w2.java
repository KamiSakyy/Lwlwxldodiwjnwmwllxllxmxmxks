package z70;

import hc0.ev;
import hc0.fm;
import hc0.nl;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w2 implements aa.a {
    public static final w2 a = new w2();
    public static final List b = sy.d0Shadow.o("__typename", "id", "isDraft", "title", "titleHTMLString", "number", "createdAt", "headRepository", "headRepositoryOwner", "isReadByViewer", "totalCommentsCount", "pullRequestState", "repository", "url", "viewerSubscription", "reviewDecision", "assignees", "commits", "closingIssuesReferences");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
    
        if (r7 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r26 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        r9 = r26.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r15 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r16 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        if (r17 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r20 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (r21 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        return new z70.l2(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006b, code lost:
    
        k41.b.B(r28, "commits");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        k41.b.B(r28, "assignees");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0076, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        k41.b.B(r28, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        k41.b.B(r28, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        k41.b.B(r28, "pullRequestState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        k41.b.B(r28, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008f, code lost:
    
        k41.b.B(r28, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
    
        k41.b.B(r28, "titleHTMLString");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009b, code lost:
    
        k41.b.B(r28, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a1, code lost:
    
        k41.b.B(r28, "isDraft");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a7, code lost:
    
        k41.b.B(r28, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ad, code lost:
    
        k41.b.B(r28, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        r28.s0();
        r23 = c60.n.c(r28, r29);
        r28.s0();
        r24 = z70.w7.c(r28, r29);
        r9 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r4 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r5 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (r9 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        r26 = r6;
        r6 = r9.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static l2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        String str;
        Integer valueOf;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        String str4 = null;
        String str5 = null;
        ZonedDateTime zonedDateTime = null;
        e2 e2Var = null;
        f2 f2Var = null;
        Boolean bool3 = null;
        Integer num2 = null;
        fm fmVar = null;
        j2 j2Var = null;
        String str6 = null;
        ev evVar = null;
        nl nlVar = null;
        a2 a2Var = null;
        d2 d2Var = null;
        b2 b2Var = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 2:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 4:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 5:
                    Boolean bool4 = bool2;
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = jo.f4Shadow.c(1, nextLong, "substring(...)");
                            str2 = str2;
                        }
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num = valueOf;
                    bool2 = bool4;
                    str2 = str;
                    continue;
                case 6:
                    hc0.h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(hc0.h6.a).a(eVar, wVar);
                    continue;
                case 7:
                    bool = bool2;
                    e2Var = (e2) aa.c.b(aa.c.c(r2.a, false)).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    f2Var = (f2) aa.c.b(aa.c.c(s2.a, false)).a(eVar, wVar);
                    break;
                case 9:
                    bool3 = (Boolean) aa.c.k.a(eVar, wVar);
                    continue;
                case 10:
                    num2 = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
                    continue;
                case 11:
                    Boolean bool5 = bool2;
                    Integer num3 = num;
                    String u = eVar.u();
                    k71.k.d(u);
                    fm.Companion.getClass();
                    Iterator it = fm.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((fm) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    fm fmVar2 = (fm) obj;
                    fmVar = fmVar2 == null ? fm.v : fmVar2;
                    bool2 = bool5;
                    num = num3;
                    continue;
                case 12:
                    bool = bool2;
                    j2Var = (j2) aa.c.c(x2.a, false).a(eVar, wVar);
                    break;
                case 13:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 14:
                    evVar = (ev) aa.c.b(ic0.b.o).a(eVar, wVar);
                    continue;
                case 15:
                    nlVar = (nl) aa.c.b(ic0.b.b).a(eVar, wVar);
                    continue;
                case 16:
                    bool = bool2;
                    a2Var = (a2) aa.c.c(n2.a, false).a(eVar, wVar);
                    break;
                case 17:
                    bool = bool2;
                    d2Var = (d2) aa.c.c(q2.a, false).a(eVar, wVar);
                    break;
                case 18:
                    bool = bool2;
                    b2Var = (b2) aa.c.b(aa.c.c(o2.a, false)).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, l2 l2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, l2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, l2Var.b);
        fVar.z0("isDraft");
        jo.f4Shadow.C(l2Var.c, aa.c.f, fVar, wVar, "title");
        bVar.b(fVar, wVar, l2Var.d);
        fVar.z0("titleHTMLString");
        bVar.b(fVar, wVar, l2Var.e);
        fVar.z0("number");
        Integer valueOf = Integer.valueOf(l2Var.f);
        nn.a aVar = y20.a.a;
        aVar.b(fVar, wVar, valueOf);
        fVar.z0("createdAt");
        hc0.h6.Companion.getClass();
        wVar.e(hc0.h6.a).b(fVar, wVar, l2Var.g);
        fVar.z0("headRepository");
        aa.c.b(aa.c.c(r2.a, false)).b(fVar, wVar, l2Var.h);
        fVar.z0("headRepositoryOwner");
        aa.c.b(aa.c.c(s2.a, false)).b(fVar, wVar, l2Var.i);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, l2Var.j);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, l2Var.k);
        fVar.z0("pullRequestState");
        fVar.I(l2Var.l.r);
        fVar.z0("repository");
        aa.c.c(x2.a, false).b(fVar, wVar, l2Var.m);
        fVar.z0("url");
        bVar.b(fVar, wVar, l2Var.n);
        fVar.z0("viewerSubscription");
        aa.c.b(ic0.b.o).b(fVar, wVar, l2Var.o);
        fVar.z0("reviewDecision");
        aa.c.b(ic0.b.b).b(fVar, wVar, l2Var.p);
        fVar.z0("assignees");
        aa.c.c(n2.a, false).b(fVar, wVar, l2Var.q);
        fVar.z0("commits");
        aa.c.c(q2.a, false).b(fVar, wVar, l2Var.r);
        fVar.z0("closingIssuesReferences");
        aa.c.b(aa.c.c(o2.a, false)).b(fVar, wVar, l2Var.s);
        List list = c60.n.a;
        c60.n.d(fVar, wVar, l2Var.t);
        List list2 = w7.a;
        w7.d(fVar, wVar, l2Var.u);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (l2) obj);
    }
}

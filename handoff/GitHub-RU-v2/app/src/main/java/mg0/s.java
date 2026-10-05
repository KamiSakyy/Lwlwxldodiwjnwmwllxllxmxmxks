package mg0;

import gn0.kw;
import gn0.r6;
import gn0.xc;
import gn0.zc;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "title", "titleHTML", "number", "createdAt", "isReadByViewer", "comments", "issueState", "repository", "viewerSubscription", "url", "assignees", "closedByPullRequestsReferences", "stateReason"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
    
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r11 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r13 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r15 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r16 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return new mg0.m(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        k41.b.B(r23, "assignees");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        k41.b.B(r23, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        k41.b.B(r23, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
    
        k41.b.B(r23, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        k41.b.B(r23, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0071, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        k41.b.B(r23, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        k41.b.B(r23, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        k41.b.B(r23, "titleHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0083, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        k41.b.B(r23, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        k41.b.B(r23, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0090, code lost:
    
        k41.b.B(r23, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
    
        r23.s0();
        r19 = sg0.n.c(r23, r24);
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r7 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m c(ea.e eVar, aa.w wVar) {
        String str;
        Integer valueOf;
        Integer num;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Integer num2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ZonedDateTime zonedDateTime = null;
        Boolean bool = null;
        i iVar = null;
        xc xcVar = null;
        l lVar = null;
        kw kwVar = null;
        String str6 = null;
        g gVar = null;
        h hVar = null;
        zc zcVar = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 1:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 2:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 3:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 4:
                    long nextLong = eVar.nextLong();
                    if (nextLong > 2147483647L) {
                        while (nextLong > 2147483647L) {
                            nextLong = f4.c(1, nextLong, "substring(...)");
                            str2 = str2;
                        }
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    } else {
                        str = str2;
                        valueOf = Integer.valueOf((int) nextLong);
                    }
                    num2 = valueOf;
                    str2 = str;
                    continue;
                case 5:
                    r6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(r6.a).a(eVar, wVar);
                    continue;
                case 6:
                    bool = (Boolean) aa.c.k.a(eVar, wVar);
                    continue;
                case 7:
                    num = num2;
                    iVar = (i) aa.c.c(r.a, false).a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    xc.Companion.getClass();
                    Iterator it = xc.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Iterator it2 = it;
                            if (!((xc) obj).r.equals(u)) {
                                it = it2;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    xcVar = (xc) obj;
                    if (xcVar == null) {
                        xcVar = xc.v;
                        break;
                    }
                    break;
                case 9:
                    num = num2;
                    lVar = (l) aa.c.c(v.a, false).a(eVar, wVar);
                    break;
                case 10:
                    kwVar = (kw) aa.c.b(hn0.b.o).a(eVar, wVar);
                    continue;
                case 11:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 12:
                    num = num2;
                    gVar = (g) aa.c.c(p.a, false).a(eVar, wVar);
                    break;
                case 13:
                    num = num2;
                    hVar = (h) aa.c.b(aa.c.c(q.a, false)).a(eVar, wVar);
                    break;
                case 14:
                    zcVar = (zc) aa.c.b(hn0.a.t).a(eVar, wVar);
                    continue;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, m mVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, mVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, mVar.c);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, mVar.d);
        fVar.z0("number");
        fVar.z(mVar.e);
        fVar.z0("createdAt");
        r6.Companion.getClass();
        wVar.e(r6.a).b(fVar, wVar, mVar.f);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, mVar.g);
        fVar.z0("comments");
        aa.c.c(r.a, false).b(fVar, wVar, mVar.h);
        fVar.z0("issueState");
        fVar.I(mVar.i.r);
        fVar.z0("repository");
        aa.c.c(v.a, false).b(fVar, wVar, mVar.j);
        fVar.z0("viewerSubscription");
        aa.c.b(hn0.b.o).b(fVar, wVar, mVar.k);
        fVar.z0("url");
        bVar.b(fVar, wVar, mVar.l);
        fVar.z0("assignees");
        aa.c.c(p.a, false).b(fVar, wVar, mVar.m);
        fVar.z0("closedByPullRequestsReferences");
        aa.c.b(aa.c.c(q.a, false)).b(fVar, wVar, mVar.n);
        fVar.z0("stateReason");
        aa.c.b(hn0.a.t).b(fVar, wVar, mVar.o);
        List list = sg0.n.a;
        sg0.n.d(fVar, wVar, mVar.p);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (m) obj);
    }
}

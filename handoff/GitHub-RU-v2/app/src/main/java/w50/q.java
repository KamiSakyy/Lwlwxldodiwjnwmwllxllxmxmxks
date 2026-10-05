package w50;

import hc0.ev;
import hc0.h6;
import hc0.jc;
import hc0.lc;
import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.a {
    public static final q a = new q();
    public static final List b = sy.d0.o("__typename", "id", "title", "titleHTML", "number", "createdAt", "isReadByViewer", "comments", "issueState", "repository", "viewerSubscription", "url", "assignees", "closedByPullRequestsReferences", "stateReason");

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
    
        return new w50.l(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19);
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
        r19 = c60.n.c(r23, r24);
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
    public static l c(ea.e eVar, aa.w wVar) {
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
        h hVar = null;
        jc jcVar = null;
        k kVar = null;
        ev evVar = null;
        String str6 = null;
        f fVar = null;
        g gVar = null;
        lc lcVar = null;
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
                    h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(h6.a).a(eVar, wVar);
                    continue;
                case 6:
                    bool = (Boolean) aa.c.k.a(eVar, wVar);
                    continue;
                case 7:
                    num = num2;
                    hVar = (h) aa.c.c(p.a, false).a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    jc.Companion.getClass();
                    Iterator it = jc.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Iterator it2 = it;
                            if (!((jc) obj).r.equals(u)) {
                                it = it2;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    jcVar = (jc) obj;
                    if (jcVar == null) {
                        jcVar = jc.v;
                        break;
                    }
                    break;
                case 9:
                    num = num2;
                    kVar = (k) aa.c.c(t.a, false).a(eVar, wVar);
                    break;
                case 10:
                    evVar = (ev) aa.c.b(ic0.b.o).a(eVar, wVar);
                    continue;
                case 11:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 12:
                    num = num2;
                    fVar = (f) aa.c.c(n.a, false).a(eVar, wVar);
                    break;
                case 13:
                    num = num2;
                    gVar = (g) aa.c.b(aa.c.c(o.a, false)).a(eVar, wVar);
                    break;
                case 14:
                    lcVar = (lc) aa.c.b(ic0.a.t).a(eVar, wVar);
                    continue;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, l lVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, lVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, lVar.c);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, lVar.d);
        fVar.z0("number");
        fVar.z(lVar.e);
        fVar.z0("createdAt");
        h6.Companion.getClass();
        wVar.e(h6.a).b(fVar, wVar, lVar.f);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, lVar.g);
        fVar.z0("comments");
        aa.c.c(p.a, false).b(fVar, wVar, lVar.h);
        fVar.z0("issueState");
        fVar.I(lVar.i.r);
        fVar.z0("repository");
        aa.c.c(t.a, false).b(fVar, wVar, lVar.j);
        fVar.z0("viewerSubscription");
        aa.c.b(ic0.b.o).b(fVar, wVar, lVar.k);
        fVar.z0("url");
        bVar.b(fVar, wVar, lVar.l);
        fVar.z0("assignees");
        aa.c.c(n.a, false).b(fVar, wVar, lVar.m);
        fVar.z0("closedByPullRequestsReferences");
        aa.c.b(aa.c.c(o.a, false)).b(fVar, wVar, lVar.n);
        fVar.z0("stateReason");
        aa.c.b(ic0.a.t).b(fVar, wVar, lVar.o);
        List list = c60.n.a;
        c60.n.d(fVar, wVar, lVar.p);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (l) obj);
    }
}

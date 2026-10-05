package ur0;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;
import jo.f4;
import pz0.bf;
import pz0.df;
import pz0.f40;
import pz0.o7;
import uu0.g6;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.a {
    public static final u a = new u();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "title", "titleHTML", "number", "createdAt", "isReadByViewer", "comments", "issueState", "repository", "viewerSubscription", "url", "assignees", "closedByPullRequestsReferences", "stateReason", "issueType", "parent"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
    
        if (r8 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        r8 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0051, code lost:
    
        if (r9 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r11 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
    
        if (r13 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
    
        if (r15 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (r16 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
    
        return new ur0.o(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        k41.b.B(r26, "assignees");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        k41.b.B(r26, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        k41.b.B(r26, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        k41.b.B(r26, "issueState");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        k41.b.B(r26, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        k41.b.B(r26, "createdAt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        k41.b.B(r26, "number");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008b, code lost:
    
        k41.b.B(r26, "titleHTML");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
    
        k41.b.B(r26, "title");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        k41.b.B(r26, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009d, code lost:
    
        k41.b.B(r26, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        r26.s0();
        r21 = cs0.n.c(r26, r27);
        r26.s0();
        r2 = uu0.g6.a;
        r22 = uu0.g6.c(r26, r27);
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r4 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        if (r5 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0049, code lost:
    
        if (r7 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o c(ea.e eVar, aa.w wVar) {
        Integer num;
        Object obj;
        String str;
        Integer valueOf;
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
        bf bfVar = null;
        n nVar = null;
        f40 f40Var = null;
        String str6 = null;
        g gVar = null;
        h hVar = null;
        df dfVar = null;
        j jVar = null;
        m mVar = null;
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
                    o7.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) wVar.e(o7.a).a(eVar, wVar);
                    continue;
                case 6:
                    bool = (Boolean) aa.c.k.a(eVar, wVar);
                    continue;
                case 7:
                    num = num2;
                    iVar = (i) aa.c.c(t.a, false).a(eVar, wVar);
                    break;
                case 8:
                    num = num2;
                    String u = eVar.u();
                    k71.k.d(u);
                    bf.Companion.getClass();
                    Iterator it = bf.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            Iterator it2 = it;
                            if (!((bf) obj).r.equals(u)) {
                                it = it2;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    bfVar = (bf) obj;
                    if (bfVar == null) {
                        bfVar = bf.v;
                        break;
                    }
                    break;
                case 9:
                    num = num2;
                    nVar = (n) aa.c.c(z.a, false).a(eVar, wVar);
                    break;
                case 10:
                    f40Var = (f40) aa.c.b(qz0.b.v).a(eVar, wVar);
                    continue;
                case 11:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    continue;
                case 12:
                    num = num2;
                    gVar = (g) aa.c.c(r.a, false).a(eVar, wVar);
                    break;
                case 13:
                    num = num2;
                    hVar = (h) aa.c.b(aa.c.c(s.a, false)).a(eVar, wVar);
                    break;
                case 14:
                    dfVar = (df) aa.c.b(qz0.a.x).a(eVar, wVar);
                    continue;
                case 15:
                    num = num2;
                    jVar = (j) aa.c.b(aa.c.c(v.a, true)).a(eVar, wVar);
                    break;
                case 16:
                    num = num2;
                    mVar = (m) aa.c.b(aa.c.c(y.a, false)).a(eVar, wVar);
                    break;
            }
            num2 = num;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, oVar.b);
        fVar.z0("title");
        bVar.b(fVar, wVar, oVar.c);
        fVar.z0("titleHTML");
        bVar.b(fVar, wVar, oVar.d);
        fVar.z0("number");
        fVar.z(oVar.e);
        fVar.z0("createdAt");
        o7.Companion.getClass();
        wVar.e(o7.a).b(fVar, wVar, oVar.f);
        fVar.z0("isReadByViewer");
        aa.c.k.b(fVar, wVar, oVar.g);
        fVar.z0("comments");
        aa.c.c(t.a, false).b(fVar, wVar, oVar.h);
        fVar.z0("issueState");
        fVar.I(oVar.i.r);
        fVar.z0("repository");
        aa.c.c(z.a, false).b(fVar, wVar, oVar.j);
        fVar.z0("viewerSubscription");
        aa.c.b(qz0.b.v).b(fVar, wVar, oVar.k);
        fVar.z0("url");
        bVar.b(fVar, wVar, oVar.l);
        fVar.z0("assignees");
        aa.c.c(r.a, false).b(fVar, wVar, oVar.m);
        fVar.z0("closedByPullRequestsReferences");
        aa.c.b(aa.c.c(s.a, false)).b(fVar, wVar, oVar.n);
        fVar.z0("stateReason");
        aa.c.b(qz0.a.x).b(fVar, wVar, oVar.o);
        fVar.z0("issueType");
        aa.c.b(aa.c.c(v.a, true)).b(fVar, wVar, oVar.p);
        fVar.z0("parent");
        aa.c.b(aa.c.c(y.a, false)).b(fVar, wVar, oVar.q);
        List list = cs0.n.a;
        cs0.n.d(fVar, wVar, oVar.r);
        g6 g6Var = g6.a;
        g6.d(fVar, wVar, oVar.s);
    }

    public final /* bridge */ /* synthetic */ Object a(ea.e eVar, aa.w wVar) {
        return c(eVar, wVar);
    }

    public final /* bridge */ /* synthetic */ void b(ea.f fVar, aa.w wVar, Object obj) {
        d(fVar, wVar, (o) obj);
    }
}

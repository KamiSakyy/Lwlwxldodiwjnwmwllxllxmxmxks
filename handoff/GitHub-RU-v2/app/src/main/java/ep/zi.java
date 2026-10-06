package ep;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class zi implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "state", "url", "authorCanPushToRepository", "submittedAt", "pullRequest", "author", "repository", "threadsAndReplies"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        r8 = r8.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r10 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (r12 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        return new jo.yr(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        k41.b.B(r18, "repository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
    
        k41.b.B(r18, "pullRequest");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        k41.b.B(r18, "authorCanPushToRepository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        k41.b.B(r18, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        k41.b.B(r18, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        k41.b.B(r18, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
    
        k41.b.B(r18, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0024, code lost:
    
        r18.s0();
        r14 = ar.e.c(r18, r19);
        r18.s0();
        r8 = pv.f.a;
        r15 = pv.f.c(r18, r19);
        r18.s0();
        r16 = mx.d.c(r18, r19);
        r18.s0();
        r17 = puShadow.b.c(r18, r19);
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0047, code lost:
    
        if (r5 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0049, code lost:
    
        if (r6 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004b, code lost:
    
        if (r7 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jo.yr c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        m10.rz rzVar = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        jo.bs bsVar = null;
        jo.pr prVar = null;
        jo.cs csVar = null;
        jo.gs gsVar = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    m10.rz.Companion.getClass();
                    Iterator it = m10.rz.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m10.rz) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    m10.rz rzVar2 = (m10.rz) obj;
                    if (rzVar2 != null) {
                        rzVar = rzVar2;
                        break;
                    } else {
                        rzVar = m10.rz.t;
                        break;
                    }
                case 3:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool2;
                    m10.sa.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) noShadow.a.h(wVar, m10.sa.a, eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    bsVar = (jo.bs) aa.c.c(cj.a, false).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    prVar = (jo.pr) aa.c.b(aa.c.c(ri.a, true)).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    csVar = (jo.cs) aa.c.c(dj.a, true).a(eVar, wVar);
                    break;
                case 9:
                    bool = bool2;
                    gsVar = (jo.gs) aa.c.b(aa.c.c(hj.a, false)).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jo.yr yrVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yrVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yrVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, yrVar.b);
        fVar.z0("state");
        fVar.I(yrVar.c.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, yrVar.d);
        fVar.z0("authorCanPushToRepository");
        jo.f4Shadow.C(yrVar.e, aa.c.f, fVar, wVar, "submittedAt");
        m10.sa.Companion.getClass();
        aa.c.b(wVar.e(m10.sa.a)).b(fVar, wVar, yrVar.f);
        fVar.z0("pullRequest");
        aa.c.c(cj.a, false).b(fVar, wVar, yrVar.g);
        fVar.z0("author");
        aa.c.b(aa.c.c(ri.a, true)).b(fVar, wVar, yrVar.h);
        fVar.z0("repository");
        aa.c.c(dj.a, true).b(fVar, wVar, yrVar.i);
        fVar.z0("threadsAndReplies");
        aa.c.b(aa.c.c(hj.a, false)).b(fVar, wVar, yrVar.j);
        List list = ar.e.a;
        ar.e.d(fVar, wVar, yrVar.k);
        pv.f fVar2 = pv.f.a;
        pv.f.d(fVar, wVar, yrVar.l);
        List list2 = mx.d.a;
        mx.d.d(fVar, wVar, yrVar.m);
        List list3 = puShadow.b.a;
        puShadow.b.d(fVar, wVar, yrVar.n);
    }
}

package p20;

import java.time.ZonedDateTime;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class qf implements aa.a {
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
    
        return new u10.fn(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
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
        r14 = c40.e.c(r18, r19);
        r18.s0();
        r8 = i80.e.a;
        r15 = i80.e.c(r18, r19);
        r18.s0();
        r16 = aa0.d.c(r18, r19);
        r18.s0();
        r17 = g70.b.c(r18, r19);
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
    public static u10.fn c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        hc0.vl vlVar = null;
        String str3 = null;
        ZonedDateTime zonedDateTime = null;
        u10.in inVar = null;
        u10.wm wmVar = null;
        u10.jn jnVar = null;
        u10.nn nnVar = null;
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
                    hc0.vl.Companion.getClass();
                    Iterator it = hc0.vl.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((hc0.vl) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    hc0.vl vlVar2 = (hc0.vl) obj;
                    if (vlVar2 != null) {
                        vlVar = vlVar2;
                        break;
                    } else {
                        vlVar = hc0.vl.t;
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
                    hc0.h6.Companion.getClass();
                    zonedDateTime = (ZonedDateTime) no.a.h(wVar, hc0.h6.a, eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    inVar = (u10.in) aa.c.c(tf.a, false).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    wmVar = (u10.wm) aa.c.b(aa.c.c(hf.a, true)).a(eVar, wVar);
                    break;
                case 8:
                    bool = bool2;
                    jnVar = (u10.jn) aa.c.c(uf.a, true).a(eVar, wVar);
                    break;
                case 9:
                    bool = bool2;
                    nnVar = (u10.nn) aa.c.b(aa.c.c(yf.a, false)).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u10.fn fnVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fnVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fnVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fnVar.b);
        fVar.z0("state");
        fVar.I(fnVar.c.r);
        fVar.z0("url");
        bVar.b(fVar, wVar, fnVar.d);
        fVar.z0("authorCanPushToRepository");
        jo.f4.C(fnVar.e, aa.c.f, fVar, wVar, "submittedAt");
        hc0.h6.Companion.getClass();
        aa.c.b(wVar.e(hc0.h6.a)).b(fVar, wVar, fnVar.f);
        fVar.z0("pullRequest");
        aa.c.c(tf.a, false).b(fVar, wVar, fnVar.g);
        fVar.z0("author");
        aa.c.b(aa.c.c(hf.a, true)).b(fVar, wVar, fnVar.h);
        fVar.z0("repository");
        aa.c.c(uf.a, true).b(fVar, wVar, fnVar.i);
        fVar.z0("threadsAndReplies");
        aa.c.b(aa.c.c(yf.a, false)).b(fVar, wVar, fnVar.j);
        List list = c40.e.a;
        c40.e.d(fVar, wVar, fnVar.k);
        i80.e eVar = i80.e.a;
        i80.e.d(fVar, wVar, fnVar.l);
        List list2 = aa0.d.a;
        aa0.d.d(fVar, wVar, fnVar.m);
        List list3 = g70.b.a;
        g70.b.d(fVar, wVar, fnVar.n);
    }
}

package lv;

import aa.w;
import java.util.Iterator;
import java.util.List;
import jo.f4Shadow;
import m10.rz;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "authorCanPushToRepository", "author", "state", "onBehalfOf", "body", "comments"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r7 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r8 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r9 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return new lv.m(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        k41.b.B(r12, "comments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        k41.b.B(r12, "body");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        k41.b.B(r12, "onBehalfOf");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        k41.b.B(r12, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        k41.b.B(r12, "authorCanPushToRepository");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r4 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r4 = r4.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m c(ea.e eVar, w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        g gVar = null;
        rz rzVar = null;
        j jVar = null;
        String str3 = null;
        h hVar = null;
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
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 3:
                    bool = bool2;
                    gVar = (g) aa.c.b(aa.c.c(n.a, true)).a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    rz.Companion.getClass();
                    Iterator it = rz.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((rz) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    rz rzVar2 = (rz) obj;
                    if (rzVar2 != null) {
                        rzVar = rzVar2;
                        break;
                    } else {
                        rzVar = rz.t;
                        break;
                    }
                case 5:
                    bool = bool2;
                    jVar = (j) aa.c.c(q.a, false).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    hVar = (h) aa.c.c(o.a, false).a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, w wVar, m mVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, mVar.b);
        fVar.z0("authorCanPushToRepository");
        f4Shadow.C(mVar.c, aa.c.f, fVar, wVar, "author");
        aa.c.b(aa.c.c(n.a, true)).b(fVar, wVar, mVar.d);
        fVar.z0("state");
        fVar.I(mVar.e.r);
        fVar.z0("onBehalfOf");
        aa.c.c(q.a, false).b(fVar, wVar, mVar.f);
        fVar.z0("body");
        bVar.b(fVar, wVar, mVar.g);
        fVar.z0("comments");
        aa.c.c(o.a, false).b(fVar, wVar, mVar.h);
    }
}

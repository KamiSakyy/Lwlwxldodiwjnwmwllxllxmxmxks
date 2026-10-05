package k90;

import hc0.es;
import hc0.ks;
import hc0.lt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"color", "icon", "id", "name", "query", "scopingRepository", "searchType", "queryTerms", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (r8 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r9 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r10 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return new k90.v(r2, r3, r4, r5, r6, r7, r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        k41.b.B(r13, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        k41.b.B(r13, "queryTerms");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        k41.b.B(r13, "searchType");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        k41.b.B(r13, "query");
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        k41.b.B(r13, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        k41.b.B(r13, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        k41.b.B(r13, "icon");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        k41.b.B(r13, "color");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v c(ea.e eVar, aa.w wVar) {
        Object obj;
        Object obj2;
        Object obj3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        es esVar = null;
        ks ksVar = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        u uVar = null;
        lt ltVar = null;
        ArrayList arrayList = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    String u = eVar.u();
                    k71.k.d(u);
                    es.Companion.getClass();
                    Iterator it = es.C.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((es) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    es esVar2 = (es) obj;
                    if (esVar2 != null) {
                        esVar = esVar2;
                        break;
                    } else {
                        esVar = es.A;
                        break;
                    }
                case 1:
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    ks.Companion.getClass();
                    Iterator it2 = ks.a0.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((ks) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ks ksVar2 = (ks) obj2;
                    if (ksVar2 != null) {
                        ksVar = ksVar2;
                        break;
                    } else {
                        ksVar = ks.Y;
                        break;
                    }
                case 2:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    uVar = (u) aa.c.b(aa.c.c(q0.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    String u3 = eVar.u();
                    k71.k.d(u3);
                    lt.Companion.getClass();
                    Iterator it3 = lt.y.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj3 = it3.next();
                            if (((lt) obj3).r.equals(u3)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    lt ltVar2 = (lt) obj3;
                    if (ltVar2 != null) {
                        ltVar = ltVar2;
                        break;
                    } else {
                        ltVar = lt.w;
                        break;
                    }
                case 7:
                    arrayList = aa.c.a(aa.c.c(o0.a, true)).c(eVar, wVar);
                    break;
                case 8:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, v vVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("color");
        fVar.I(vVar.a.r);
        fVar.z0("icon");
        fVar.I(vVar.b.r);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.c);
        fVar.z0("name");
        bVar.b(fVar, wVar, vVar.d);
        fVar.z0("query");
        bVar.b(fVar, wVar, vVar.e);
        fVar.z0("scopingRepository");
        aa.c.b(aa.c.c(q0.a, false)).b(fVar, wVar, vVar.f);
        fVar.z0("searchType");
        fVar.I(vVar.g.r);
        fVar.z0("queryTerms");
        aa.c.a(aa.c.c(o0.a, true)).e(fVar, wVar, vVar.h);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vVar.i);
    }
}

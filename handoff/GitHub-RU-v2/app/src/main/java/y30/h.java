package y30;

import aa.w;
import hc0.j2;
import hc0.p2;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h implements aa.a {
    public static final List a = x61.l.r(new String[]{"name", "status", "id", "conclusion", "permalink", "deployment", "steps", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r9 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        return new y30.f(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        k41.b.B(r12, "permalink");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        k41.b.B(r12, "status");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        k41.b.B(r12, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r6 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f c(ea.e eVar, w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        p2 p2Var = null;
        String str2 = null;
        j2 j2Var = null;
        String str3 = null;
        a aVar = null;
        e eVar2 = null;
        String str4 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    String u = eVar.u();
                    k71.k.d(u);
                    p2.Companion.getClass();
                    Iterator it = p2.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((p2) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    p2 p2Var2 = (p2) obj;
                    if (p2Var2 != null) {
                        p2Var = p2Var2;
                        break;
                    } else {
                        p2Var = p2.t;
                        break;
                    }
                case 2:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    j2Var = (j2) aa.c.b(ic0.a.b).a(eVar, wVar);
                    break;
                case 4:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    aVar = (a) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    eVar2 = (e) aa.c.b(aa.c.c(l.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }
}

package g20;

import hc0.uu;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class r1 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "context", "avatarUrl", "targetUrl", "commit", "description", "creator", "state", "isRequired", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        return new g20.m1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        k41.b.B(r14, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        k41.b.B(r14, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        k41.b.B(r14, "context");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003e, code lost:
    
        k41.b.B(r14, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r9 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r11 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m1 c(ea.e eVar, aa.w wVar) {
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        i1 i1Var = null;
        String str5 = null;
        j1 j1Var = null;
        uu uuVar = null;
        Boolean bool = null;
        String str6 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 3:
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    i1Var = (i1) aa.c.b(aa.c.c(n1.a, false)).a(eVar, wVar);
                    break;
                case 5:
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 6:
                    j1Var = (j1) aa.c.b(aa.c.c(o1.a, true)).a(eVar, wVar);
                    break;
                case 7:
                    String u = eVar.u();
                    k71.k.d(u);
                    uu.Companion.getClass();
                    Iterator it = uu.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((uu) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    uu uuVar2 = (uu) obj;
                    if (uuVar2 != null) {
                        uuVar = uuVar2;
                        break;
                    } else {
                        uuVar = uu.t;
                        break;
                    }
                case 8:
                    bool = (Boolean) aa.c.k.a(eVar, wVar);
                    break;
                case 9:
                    str6 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
        }
    }

    public static void d(ea.f fVar, aa.w wVar, m1 m1Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m1Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m1Var.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, m1Var.b);
        fVar.z0("avatarUrl");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, m1Var.c);
        fVar.z0("targetUrl");
        o0Var.b(fVar, wVar, m1Var.d);
        fVar.z0("commit");
        aa.c.b(aa.c.c(n1.a, false)).b(fVar, wVar, m1Var.e);
        fVar.z0("description");
        o0Var.b(fVar, wVar, m1Var.f);
        fVar.z0("creator");
        aa.c.b(aa.c.c(o1.a, true)).b(fVar, wVar, m1Var.g);
        fVar.z0("state");
        fVar.I(m1Var.h.r);
        fVar.z0("isRequired");
        aa.c.k.b(fVar, wVar, m1Var.i);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, m1Var.j);
    }
}

package ct;

import java.util.Iterator;
import java.util.List;
import jo.f4;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "state", "stateReason", "viewerCanReopen", "parent", "duplicateOf", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return new ct.w0(r2, r3, r4, r5, r6, r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        k41.b.B(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        k41.b.B(r11, "viewerCanReopen");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        k41.b.B(r11, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r5 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r5 = r5.booleanValue();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w0 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        wi wiVar = null;
        yi yiVar = null;
        v0 v0Var = null;
        u0 u0Var = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    String u = eVar.u();
                    k71.k.d(u);
                    wi.Companion.getClass();
                    Iterator it = wi.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((wi) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    wi wiVar2 = (wi) obj;
                    if (wiVar2 != null) {
                        wiVar = wiVar2;
                        break;
                    } else {
                        wiVar = wi.v;
                        break;
                    }
                case 2:
                    bool = bool2;
                    yiVar = (yi) aa.c.b(n10.b.f).a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    v0Var = (v0) aa.c.b(aa.c.c(y0.a, true)).a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    u0Var = (u0) aa.c.b(aa.c.c(x0.a, true)).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, w0 w0Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(w0Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, w0Var.a);
        fVar.z0("state");
        fVar.I(w0Var.b.r);
        fVar.z0("stateReason");
        aa.c.b(n10.b.f).b(fVar, wVar, w0Var.c);
        fVar.z0("viewerCanReopen");
        f4.C(w0Var.d, aa.c.f, fVar, wVar, "parent");
        aa.c.b(aa.c.c(y0.a, true)).b(fVar, wVar, w0Var.e);
        fVar.z0("duplicateOf");
        aa.c.b(aa.c.c(x0.a, true)).b(fVar, wVar, w0Var.f);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, w0Var.g);
    }
}

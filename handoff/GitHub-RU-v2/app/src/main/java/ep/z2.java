package ep;

import java.util.Iterator;
import java.util.List;
import m10.da0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z2 implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"id", "context", "state", "avatarUrl", "description", "targetUrl", "isRequired"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return new jo.t4(r2, r3, r4, r5, r6, r7, r8.booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        k41.b.B(r11, "isRequired");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        k41.b.B(r11, "state");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        k41.b.B(r11, "context");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r4 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r8 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jo.t4 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Object obj;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        da0 da0Var = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
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
                    da0.Companion.getClass();
                    Iterator it = da0.v.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((da0) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    da0 da0Var2 = (da0) obj;
                    if (da0Var2 != null) {
                        da0Var = da0Var2;
                        break;
                    } else {
                        da0Var = da0.t;
                        break;
                    }
                case 3:
                    bool = bool2;
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    str5 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 6:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, jo.t4 t4Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t4Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t4Var.a);
        fVar.z0("context");
        bVar.b(fVar, wVar, t4Var.b);
        fVar.z0("state");
        fVar.I(t4Var.c.r);
        fVar.z0("avatarUrl");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, t4Var.d);
        fVar.z0("description");
        o0Var.b(fVar, wVar, t4Var.e);
        fVar.z0("targetUrl");
        o0Var.b(fVar, wVar, t4Var.f);
        fVar.z0("isRequired");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(t4Var.g));
    }
}

package ap0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class v2 implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "name", "login", "url", "description", "viewerIsFollowing"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r8 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        return new ap0.u2(r2, r3, r4, r5, r6, r7, r8.booleanValue(), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        k41.b.B(r10, "viewerIsFollowing");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        k41.b.B(r10, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        k41.b.B(r10, "login");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
    
        r10.s0();
        r9 = cp0.h.c(r10, r11);
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        if (r3 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r5 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (r6 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u2 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 4:
                    bool = bool2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    str6 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 6:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, u2 u2Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(u2Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, u2Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, u2Var.b);
        fVar.z0("name");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, u2Var.c);
        fVar.z0("login");
        bVar.b(fVar, wVar, u2Var.d);
        fVar.z0("url");
        bVar.b(fVar, wVar, u2Var.e);
        fVar.z0("description");
        o0Var.b(fVar, wVar, u2Var.f);
        fVar.z0("viewerIsFollowing");
        aa.c.f.b(fVar, wVar, Boolean.valueOf(u2Var.g));
        List list = cp0.h.a;
        cp0.h.d(fVar, wVar, u2Var.h);
    }
}

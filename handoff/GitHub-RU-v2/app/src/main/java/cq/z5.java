package cq;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class z5 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "name", "url", "owner", "usesCustomOpenGraphImage", "openGraphImageUrl", "lists", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r6 = r6.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r9 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        return new cq.t5(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
    
        k41.b.B(r10, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        k41.b.B(r10, "lists");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        k41.b.B(r10, "openGraphImageUrl");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        k41.b.B(r10, "usesCustomOpenGraphImage");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        k41.b.B(r10, "owner");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        k41.b.B(r10, "url");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        k41.b.B(r10, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        k41.b.B(r10, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r3 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r4 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r5 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static t5 c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        s5 s5Var = null;
        String str4 = null;
        o5 o5Var = null;
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
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 3:
                    bool = bool2;
                    s5Var = (s5) aa.c.c(y5.a, true).a(eVar, wVar);
                    break;
                case 4:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 5:
                    bool = bool2;
                    str4 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    o5Var = (o5) aa.c.c(u5.a, false).a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, t5 t5Var) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(t5Var, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, t5Var.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, t5Var.b);
        fVar.z0("url");
        bVar.b(fVar, wVar, t5Var.c);
        fVar.z0("owner");
        aa.c.c(y5.a, true).b(fVar, wVar, t5Var.d);
        fVar.z0("usesCustomOpenGraphImage");
        jo.f4.C(t5Var.e, aa.c.f, fVar, wVar, "openGraphImageUrl");
        bVar.b(fVar, wVar, t5Var.f);
        fVar.z0("lists");
        aa.c.c(u5.a, false).b(fVar, wVar, t5Var.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, t5Var.h);
    }
}

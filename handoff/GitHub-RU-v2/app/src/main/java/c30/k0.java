package c30;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "databaseId", "gitObject", "viewerCanPush", "ref", "owner", "isInOrganization", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r11 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r8 = r11.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r9 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        return new c30.y(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        k41.b.B(r12, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        k41.b.B(r12, "isInOrganization");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        k41.b.B(r12, "owner");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        k41.b.B(r12, "viewerCanPush");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        k41.b.B(r12, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r8 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        r11 = r5;
        r5 = r8.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (r7 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static y c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Integer num = null;
        n nVar = null;
        Boolean bool3 = null;
        v vVar = null;
        u uVar = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    num = (Integer) aa.c.b(y20.a.a).a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    nVar = (n) aa.c.b(aa.c.c(b0.a, true)).a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    vVar = (v) aa.c.b(aa.c.c(j0.a, false)).a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    uVar = (u) aa.c.c(i0.a, false).a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.f.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }
}

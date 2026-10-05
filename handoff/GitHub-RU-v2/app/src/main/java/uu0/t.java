package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class t implements aa.a {
    public static final List a = x61.l.r(new String[]{"issueTemplates", "contactLinks", "issueFormLinks", "isBlankIssuesEnabled", "isSecurityPolicyEnabled", "securityPolicyUrl", "id", "__typename"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        return new uu0.o(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        k41.b.B(r11, "__typename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        k41.b.B(r11, "id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        k41.b.B(r11, "isBlankIssuesEnabled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r5 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        r5 = r5.booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        if (r8 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r9 == null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        Boolean bool3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            switch (eVar.r0(a)) {
                case 0:
                    bool = bool2;
                    list = (List) aa.c.b(aa.c.a(aa.c.c(s.a, false))).a(eVar, wVar);
                    break;
                case 1:
                    bool = bool2;
                    list2 = (List) aa.c.b(aa.c.a(aa.c.c(q.a, false))).a(eVar, wVar);
                    break;
                case 2:
                    bool = bool2;
                    list3 = (List) aa.c.b(aa.c.a(aa.c.c(r.a, false))).a(eVar, wVar);
                    break;
                case 3:
                    bool2 = (Boolean) aa.c.f.a(eVar, wVar);
                    continue;
                case 4:
                    bool = bool2;
                    bool3 = (Boolean) aa.c.k.a(eVar, wVar);
                    break;
                case 5:
                    bool = bool2;
                    str = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 6:
                    bool = bool2;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 7:
                    bool = bool2;
                    str3 = (String) aa.c.a.a(eVar, wVar);
                    break;
            }
            bool2 = bool;
        }
    }

    public static void d(ea.f fVar, aa.w wVar, o oVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(oVar, "value");
        fVar.z0("issueTemplates");
        aa.c.b(aa.c.a(aa.c.c(s.a, false))).b(fVar, wVar, oVar.a);
        fVar.z0("contactLinks");
        aa.c.b(aa.c.a(aa.c.c(q.a, false))).b(fVar, wVar, oVar.b);
        fVar.z0("issueFormLinks");
        aa.c.b(aa.c.a(aa.c.c(r.a, false))).b(fVar, wVar, oVar.c);
        fVar.z0("isBlankIssuesEnabled");
        jo.f4.C(oVar.d, aa.c.f, fVar, wVar, "isSecurityPolicyEnabled");
        aa.c.k.b(fVar, wVar, oVar.e);
        fVar.z0("securityPolicyUrl");
        aa.c.i.b(fVar, wVar, oVar.f);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, oVar.g);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, oVar.h);
    }
}

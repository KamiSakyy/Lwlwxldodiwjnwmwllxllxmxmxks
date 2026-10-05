package uu0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s implements aa.a {
    public static final s a = new s();
    public static final List b = sy.d0.o(new String[]{"name", "about", "title", "body", "filename", "assignees", "labels", "type"});

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        k41.b.B(r12, "filename");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        k41.b.B(r12, "name");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
    
        if (r2 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r6 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        return new uu0.j(r2, r3, r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        g gVar = null;
        k kVar = null;
        n nVar = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 1:
                    str2 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 2:
                    str3 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 3:
                    str4 = (String) aa.c.i.a(eVar, wVar);
                    break;
                case 4:
                    str5 = (String) aa.c.a.a(eVar, wVar);
                    break;
                case 5:
                    gVar = (g) aa.c.b(aa.c.c(p.a, false)).a(eVar, wVar);
                    break;
                case 6:
                    kVar = (k) aa.c.b(aa.c.c(u.a, false)).a(eVar, wVar);
                    break;
                case 7:
                    nVar = (n) aa.c.b(aa.c.c(x.a, true)).a(eVar, wVar);
                    break;
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        j jVar = (j) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(jVar, "value");
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, jVar.a);
        fVar.z0("about");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, jVar.b);
        fVar.z0("title");
        o0Var.b(fVar, wVar, jVar.c);
        fVar.z0("body");
        o0Var.b(fVar, wVar, jVar.d);
        fVar.z0("filename");
        bVar.b(fVar, wVar, jVar.e);
        fVar.z0("assignees");
        aa.c.b(aa.c.c(p.a, false)).b(fVar, wVar, jVar.f);
        fVar.z0("labels");
        aa.c.b(aa.c.c(u.a, false)).b(fVar, wVar, jVar.g);
        fVar.z0("type");
        aa.c.b(aa.c.c(x.a, true)).b(fVar, wVar, jVar.h);
    }
}

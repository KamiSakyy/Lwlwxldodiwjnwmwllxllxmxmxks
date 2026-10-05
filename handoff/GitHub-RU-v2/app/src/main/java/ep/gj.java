package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gj implements aa.a {
    public static final gj a = new gj();
    public static final List b = sy.d0.o("__typename", "isResolved", "resolvedBy", "viewerCanResolve", "viewerCanUnresolve", "viewerCanReply", "diffLines", "id");

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001d. Please report as an issue. */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        String str = null;
        Boolean bool5 = null;
        jo.ds dsVar = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        List list = null;
        String str2 = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    bool = bool4;
                    str = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool;
                case 1:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 2:
                    bool2 = bool4;
                    bool3 = bool5;
                    dsVar = (jo.ds) aa.c.b(aa.c.c(ej.a, false)).a(eVar, wVar);
                    bool4 = bool2;
                    bool5 = bool3;
                case 3:
                    bool = bool4;
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool;
                case 4:
                    bool = bool4;
                    bool6 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool;
                case 5:
                    bool = bool4;
                    bool7 = (Boolean) aa.c.f.a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool2 = bool4;
                    bool3 = bool5;
                    list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ui.a, true)))).a(eVar, wVar);
                    bool4 = bool2;
                    bool5 = bool3;
                case 7:
                    bool = bool4;
                    str2 = (String) aa.c.a.a(eVar, wVar);
                    bool4 = bool;
            }
            eVar.s0();
            nv.a c = nv.b.c(eVar, wVar);
            Boolean bool8 = bool4;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (bool8 == null) {
                k41.b.B(eVar, "isResolved");
                throw null;
            }
            Boolean bool9 = bool5;
            boolean booleanValue = bool8.booleanValue();
            if (bool9 == null) {
                k41.b.B(eVar, "viewerCanResolve");
                throw null;
            }
            Boolean bool10 = bool6;
            boolean booleanValue2 = bool9.booleanValue();
            if (bool10 == null) {
                k41.b.B(eVar, "viewerCanUnresolve");
                throw null;
            }
            Boolean bool11 = bool7;
            boolean booleanValue3 = bool10.booleanValue();
            if (bool11 == null) {
                k41.b.B(eVar, "viewerCanReply");
                throw null;
            }
            boolean booleanValue4 = bool11.booleanValue();
            if (str2 != null) {
                return new jo.fs(str, booleanValue, dsVar, booleanValue2, booleanValue3, booleanValue4, list, str2, c);
            }
            k41.b.B(eVar, "id");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.fs fsVar = (jo.fs) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fsVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fsVar.a);
        fVar.z0("isResolved");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(fsVar.b, bVar2, fVar, wVar, "resolvedBy");
        aa.c.b(aa.c.c(ej.a, false)).b(fVar, wVar, fsVar.c);
        fVar.z0("viewerCanResolve");
        jo.f4.C(fsVar.d, bVar2, fVar, wVar, "viewerCanUnresolve");
        jo.f4.C(fsVar.e, bVar2, fVar, wVar, "viewerCanReply");
        jo.f4.C(fsVar.f, bVar2, fVar, wVar, "diffLines");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ui.a, true)))).b(fVar, wVar, fsVar.g);
        fVar.z0("id");
        bVar.b(fVar, wVar, fsVar.h);
        List list = nv.b.a;
        nv.b.d(fVar, wVar, fsVar.i);
    }
}

package ji;

import dn.d0;
import java.util.Iterator;
import k71.k;
import oa.j;
import oa.m;
import w61.a0;
import y71.i;
import y71.y;
import z01.p1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public m a;
    public oa.g b;

    public g(m mVar, oa.g gVar) {
        k.g(mVar, "userManager");
        k.g(gVar, "userAccountInfoService");
        this.a = mVar;
        this.b = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00a3 -> B:11:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c71.c cVar) {
        f fVar;
        int i;
        Iterator it;
        int i2;
        Iterator it2;
        j jVar;
        int i3;
        y yVar;
        d0 d0Var;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i4 = fVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fVar.A = i4 - Integer.MIN_VALUE;
                Object obj = fVar.y;
                b71.a aVar = b71.a.r;
                i = fVar.A;
                if (i != 0) {
                    sy.y.j(obj);
                    it = this.a.e().iterator();
                    i2 = 0;
                } else {
                    if (i == 1) {
                        int i5 = fVar.x;
                        int i6 = fVar.w;
                        jVar = fVar.v;
                        it2 = fVar.u;
                        sy.y.j(obj);
                        i3 = i5;
                        i2 = i6;
                        yVar = new y((i) obj, new b(jVar, null, 1));
                        d0Var = new d0(jVar, 3);
                        fVar.u = it2;
                        fVar.v = null;
                        fVar.w = i2;
                        fVar.x = i3;
                        fVar.A = 2;
                        if (yVar.b(d0Var, fVar) != aVar) {
                            it = it2;
                        }
                        return aVar;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = fVar.w;
                    Iterator it3 = fVar.u;
                    sy.y.j(obj);
                    it = it3;
                }
                if (it.hasNext()) {
                    return a0.a;
                }
                jVar = (j) it.next();
                p1 p1Var = (p1) this.b.a(jVar);
                fVar.u = it;
                fVar.v = jVar;
                fVar.w = i2;
                fVar.x = 0;
                fVar.A = 1;
                Object a = p1Var.a();
                if (a != aVar) {
                    it2 = it;
                    obj = a;
                    i3 = 0;
                    yVar = new y((i) obj, new b(jVar, null, 1));
                    d0Var = new d0(jVar, 3);
                    fVar.u = it2;
                    fVar.v = null;
                    fVar.w = i2;
                    fVar.x = i3;
                    fVar.A = 2;
                    if (yVar.b(d0Var, fVar) != aVar) {
                    }
                }
                return aVar;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.y;
        b71.a aVar2 = b71.a.r;
        i = fVar.A;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }
}

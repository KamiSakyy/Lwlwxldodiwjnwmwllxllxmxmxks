package ji;

import dn.d0;
import java.util.Iterator;
import k71.k;
import oa.j;
import oa.m;
import w61.a0;
import y71.i;
import y71.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final m a;
    public final oa.g b;

    public c(m mVar, oa.g gVar) {
        k.g(mVar, "userManager");
        k.g(gVar, "capabilityService");
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
        a aVar;
        int i;
        Iterator it;
        int i2;
        Iterator it2;
        j jVar;
        int i3;
        y yVar;
        d0 d0Var;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i4 = aVar.A;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.A = i4 - Integer.MIN_VALUE;
                Object obj = aVar.y;
                b71.a aVar2 = b71.a.r;
                i = aVar.A;
                if (i != 0) {
                    sy.y.j(obj);
                    it = this.a.e().iterator();
                    i2 = 0;
                } else {
                    if (i == 1) {
                        int i5 = aVar.x;
                        int i6 = aVar.w;
                        jVar = aVar.v;
                        it2 = aVar.u;
                        sy.y.j(obj);
                        i3 = i5;
                        i2 = i6;
                        yVar = new y((i) obj, new b(jVar, null, 0));
                        d0Var = new d0(jVar, 2);
                        aVar.u = it2;
                        aVar.v = null;
                        aVar.w = i2;
                        aVar.x = i3;
                        aVar.A = 2;
                        if (yVar.b(d0Var, aVar) != aVar2) {
                            it = it2;
                        }
                        return aVar2;
                    }
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = aVar.w;
                    Iterator it3 = aVar.u;
                    sy.y.j(obj);
                    it = it3;
                }
                if (it.hasNext()) {
                    return a0.a;
                }
                jVar = (j) it.next();
                z01.e eVar = (z01.e) this.b.a(jVar);
                aVar.u = it;
                aVar.v = jVar;
                aVar.w = i2;
                aVar.x = 0;
                aVar.A = 1;
                Object a = eVar.a();
                if (a != aVar2) {
                    it2 = it;
                    obj = a;
                    i3 = 0;
                    yVar = new y((i) obj, new b(jVar, null, 0));
                    d0Var = new d0(jVar, 2);
                    aVar.u = it2;
                    aVar.v = null;
                    aVar.w = i2;
                    aVar.x = i3;
                    aVar.A = 2;
                    if (yVar.b(d0Var, aVar) != aVar2) {
                    }
                }
                return aVar2;
            }
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.y;
        b71.a aVar22 = b71.a.r;
        i = aVar.A;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }
}

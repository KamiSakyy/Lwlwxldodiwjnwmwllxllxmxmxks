package tk;

import com.github.rudroid.favorites.viewmodels.y;
import k71.k;
import oa.j;
import z01.t;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public oa.g a;

    public i(oa.g gVar) {
        k.g(gVar, "filesChangedService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, String str2, y yVar, c71.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i2 = hVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.y = i2 - Integer.MIN_VALUE;
                Object obj = hVar.w;
                b71.a aVar = b71.a.r;
                i = hVar.y;
                if (i != 0) {
                    sy.y.j(obj);
                    t tVar = (t) this.a.a(jVar);
                    hVar.u = jVar;
                    hVar.v = yVar;
                    hVar.y = 1;
                    obj = tVar.b(str, str2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yVar = hVar.v;
                    jVar = hVar.u;
                    sy.y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, yVar);
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.w;
        b71.a aVar2 = b71.a.r;
        i = hVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, yVar);
    }

}

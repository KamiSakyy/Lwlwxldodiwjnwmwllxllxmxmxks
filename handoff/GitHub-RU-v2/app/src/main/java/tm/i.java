package tm;

import sy.y;
import um.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public r a;

    public i(r rVar) {
        k71.k.g(rVar, "repository");
        this.a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, String str, com.github.rudroid.favorites.viewmodels.d dVar, c71.c cVar) {
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
                    y.j(obj);
                    hVar.u = jVar;
                    hVar.v = dVar;
                    hVar.y = 1;
                    obj = this.a.e(jVar, str, hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = hVar.v;
                    jVar = hVar.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, dVar);
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.w;
        b71.a aVar2 = b71.a.r;
        i = hVar.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, dVar);
    }
}

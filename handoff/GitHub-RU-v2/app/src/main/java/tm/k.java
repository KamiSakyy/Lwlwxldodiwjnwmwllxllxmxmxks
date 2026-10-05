package tm;

import java.util.List;
import sy.y;
import um.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public final r a;

    public k(r rVar) {
        k71.k.g(rVar, "repository");
        this.a = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oa.j jVar, List list, com.github.rudroid.favorites.viewmodels.d dVar, c71.c cVar) {
        j jVar2;
        int i;
        if (cVar instanceof j) {
            jVar2 = (j) cVar;
            int i2 = jVar2.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar2.y = i2 - Integer.MIN_VALUE;
                Object obj = jVar2.w;
                b71.a aVar = b71.a.r;
                i = jVar2.y;
                if (i != 0) {
                    y.j(obj);
                    jVar2.u = jVar;
                    jVar2.v = dVar;
                    jVar2.y = 1;
                    obj = this.a.f(jVar, list, jVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dVar = jVar2.v;
                    jVar = jVar2.u;
                    y.j(obj);
                }
                return b31.b.J((y71.i) obj, jVar, dVar);
            }
        }
        jVar2 = new j(this, cVar);
        Object obj2 = jVar2.w;
        b71.a aVar2 = b71.a.r;
        i = jVar2.y;
        if (i != 0) {
        }
        return b31.b.J((y71.i) obj2, jVar, dVar);
    }
}

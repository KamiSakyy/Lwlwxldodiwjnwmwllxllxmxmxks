package vk;

import com.github.rudroid.fragments.onboarding.notifications.viewmodel.z;
import k71.k;
import oa.g;
import oa.j;
import sy.y;
import y71.i;
import z01.v;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final g a;

    public c(g gVar) {
        k.g(gVar, "firebaseService");
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j jVar, String str, z zVar, c71.c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.y = i2 - Integer.MIN_VALUE;
                Object obj = bVar.w;
                b71.a aVar = b71.a.r;
                i = bVar.y;
                if (i != 0) {
                    y.j(obj);
                    v vVar = (v) this.a.a(jVar);
                    bVar.u = jVar;
                    bVar.v = zVar;
                    bVar.y = 1;
                    obj = vVar.b(str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = bVar.v;
                    jVar = bVar.u;
                    y.j(obj);
                }
                return b31.b.J((i) obj, jVar, zVar);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.w;
        b71.a aVar2 = b71.a.r;
        i = bVar.y;
        if (i != 0) {
        }
        return b31.b.J((i) obj2, jVar, zVar);
    }
}

package in;

import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Set t;
    public final /* synthetic */ Set u;
    public final /* synthetic */ j71.c v;
    public final /* synthetic */ j71.e w;

    public e(y71.j jVar, boolean z, Set set, Set set2, j71.c cVar, j71.e eVar) {
        this.r = jVar;
        this.s = z;
        this.t = set;
        this.u = set2;
        this.v = cVar;
        this.w = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        d dVar;
        int i;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    p0 a = r.a((aa.f) obj, this.s, this.t, this.u, this.v, this.w);
                    if (a != null) {
                        dVar.v = 1;
                        if (this.r.c(a, dVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        dVar = new d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar2 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
    public Object k(Object p1) { return null; }
    public static final Object b = null;
    public Object k(Object p1) { return null; }
}

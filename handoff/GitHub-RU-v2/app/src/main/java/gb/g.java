package gb;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f24864r;

    public g(y71.j jVar) {
        this.f24864r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f24862v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f24862v = i10 - Integer.MIN_VALUE;
                Object obj2 = fVar.f24861u;
                b71.a aVar = b71.a.r;
                i = fVar.f24862v;
                if (i != 0) {
                    y.j(obj2);
                    Boolean valueOf = Boolean.valueOf(((gi.e) obj).n != null);
                    fVar.f24862v = 1;
                    if (this.f24864r.c(valueOf, fVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj22 = fVar.f24861u;
        b71.a aVar2 = b71.a.r;
        i = fVar.f24862v;
        if (i != 0) {
        }
        return a0.a;
    }
}

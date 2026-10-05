package wd;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class i<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f33507r;

    public i(y71.j jVar) {
        this.f33507r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h hVar;
        int i;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f33505v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f33505v = i10 - Integer.MIN_VALUE;
                Object obj2 = hVar.f33504u;
                b71.a aVar = b71.a.r;
                i = hVar.f33505v;
                if (i != 0) {
                    y.j(obj2);
                    Boolean valueOf = Boolean.valueOf(((gi.e) obj).j != null);
                    hVar.f33505v = 1;
                    if (this.f33507r.c(valueOf, hVar) == aVar) {
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
        hVar = new h(this, cVar);
        Object obj22 = hVar.f33504u;
        b71.a aVar2 = b71.a.r;
        i = hVar.f33505v;
        if (i != 0) {
        }
        return a0.a;
    }
}

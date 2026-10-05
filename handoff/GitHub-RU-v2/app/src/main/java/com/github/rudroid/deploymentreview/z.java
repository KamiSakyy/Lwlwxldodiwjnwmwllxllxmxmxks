package com.github.rudroid.deploymentreview;

/* loaded from: /home/user/work/p/classes.dex */
public final class z<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f10976r;

    public z(y71.j jVar) {
        this.f10976r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        y yVar;
        int i;
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i10 = yVar.f10974v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                yVar.f10974v = i10 - Integer.MIN_VALUE;
                Object obj2 = yVar.f10973u;
                b71.a aVar = b71.a.r;
                i = yVar.f10974v;
                if (i != 0) {
                    sy.y.j(obj2);
                    a01.f fVar = ((a01.d) obj).h;
                    yVar.f10974v = 1;
                    if (this.f10976r.c(fVar, yVar) == aVar) {
                        return aVar;
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
        yVar = new y(this, cVar);
        Object obj22 = yVar.f10973u;
        b71.a aVar2 = b71.a.r;
        i = yVar.f10974v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}

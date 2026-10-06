package com.github.rudroid.actions.checkssummary;

/* loaded from: /home/user/work/p/classes.dex */
public class e<T> implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f4997r;

    public e(y71.j jVar) {
        this.f4997r = jVar;
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
            int i10 = dVar.f4994v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f4994v = i10 - Integer.MIN_VALUE;
                Object obj2 = dVar.f4993u;
                b71.a aVar = b71.a.r;
                i = dVar.f4994v;
                if (i != 0) {
                    sy.y.j(obj2);
                    String str = ((qn.c) obj).b;
                    if (str != null) {
                        dVar.f4994v = 1;
                        if (this.f4997r.c(str, dVar) == aVar) {
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
        Object obj22 = dVar.f4993u;
        b71.a aVar2 = b71.a.r;
        i = dVar.f4994v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}

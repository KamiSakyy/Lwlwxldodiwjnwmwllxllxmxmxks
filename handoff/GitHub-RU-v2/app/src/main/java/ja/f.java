package ja;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y71.j f27345r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f27346s;

    public f(y71.j jVar, long j10) {
        this.f27345r = jVar;
        this.f27346s = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e eVar;
        int i;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f27343v;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f27343v = i10 - Integer.MIN_VALUE;
                Object obj2 = eVar.f27342u;
                b71.a aVar = b71.a.r;
                i = eVar.f27343v;
                if (i != 0) {
                    y.j(obj2);
                    aa.f fVar = (aa.f) obj;
                    aa.e a10 = fVar.a();
                    a10.c(new ga.e(0L, 0L, this.f27346s, System.currentTimeMillis(), false, fVar.f647e));
                    aa.f d10 = a10.d();
                    eVar.f27343v = 1;
                    if (this.f27345r.c(d10, eVar) == aVar) {
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
        eVar = new e(this, cVar);
        Object obj22 = eVar.f27342u;
        b71.a aVar2 = b71.a.r;
        i = eVar.f27343v;
        if (i != 0) {
        }
        return a0.a;
    }
}

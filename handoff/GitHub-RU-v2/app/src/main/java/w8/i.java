package w8;

/* loaded from: /home/user/work/p/classes.dex */
public final class i extends c71.j implements j71.g {

    /* renamed from: v, reason: collision with root package name */
    public int f33402v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ long f33403w;

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        i iVar = new i(4, (a71.c) obj4);
        iVar.f33403w = longValue;
        return iVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.f33402v;
        if (i == 0) {
            sy.y.j(obj);
            long j10 = this.f33403w;
            v8.x a10 = v8.x.a();
            int i10 = j.f33405b;
            a10.getClass();
            long min = Math.min(j10 * 30000, j.f33404a);
            this.f33402v = 1;
            if (v71.b0.l(min, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return Boolean.TRUE;
    }
}

package e2;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends k71.l implements j71.c {

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21898s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q f21899t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i) {
        super(1);
        this.f21898s = i;
        this.f21899t = qVar;
    }

    public final Object k(Object obj) {
        switch (this.f21898s) {
            case k5.f.J /* 0 */:
                double doubleValue = ((Number) obj).doubleValue();
                return Double.valueOf(this.f21899t.f21908n.c(aa1.b.t(doubleValue, r10.f21902e, r10.f21903f)));
            default:
                return Double.valueOf(aa1.b.t(this.f21899t.f21907k.c(((Number) obj).doubleValue()), r10.f21902e, r10.f21903f));
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q<T1,T2,T3,T4> {
        public q() {
        }
    }
}

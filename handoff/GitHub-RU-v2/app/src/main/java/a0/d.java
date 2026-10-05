package a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends c71.j implements j71.c {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f38v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f39w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, a71.c cVar, int i) {
        super(1, cVar);
        this.f38v = i;
        this.f39w = obj;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.f38v) {
            case k5.f.J /* 0 */:
                d dVar = new d((e) this.f39w, cVar, 0);
                w61.a0 a0Var = w61.a0.a;
                dVar.v(a0Var);
                return a0Var;
            default:
                return new d((String) this.f39w, cVar, 1).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        int i = this.f38v;
        Object obj2 = this.f39w;
        switch (i) {
            case k5.f.J /* 0 */:
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                e.b((e) obj2);
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                return (String) obj2;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e<T1,T2,T3,T4> {
        public e() {
        }
    }
}

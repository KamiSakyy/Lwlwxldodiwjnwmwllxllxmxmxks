package androidx.lifecycle;

/* loaded from: /home/user/work/p/classes.dex */
public final class v0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2935v;

    /* renamed from: w, reason: collision with root package name */
    public int f2936w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2937x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j71.e f2938y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i, a71.c cVar, j71.e eVar) {
        super(2, cVar);
        this.f2935v = i;
        this.f2938y = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f2935v) {
            case k5.f.J:
                v0 v0Var = new v0(0, cVar, this.f2938y);
                v0Var.f2937x = obj;
                return v0Var;
            default:
                v0 v0Var2 = new v0(1, cVar, this.f2938y);
                v0Var2.f2937x = obj;
                return v0Var2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f2935v) {
            case k5.f.J:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (s5.b) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.f2935v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f2936w;
                if (i == 0) {
                    sy.y.j(obj);
                    v71.z zVar = (v71.z) this.f2937x;
                    this.f2936w = 1;
                    if (this.f2938y.s(zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f2936w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    s5.b bVar = (s5.b) this.f2937x;
                    this.f2936w = 1;
                    obj = this.f2938y.s(bVar, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                s5.b bVar2 = (s5.b) obj;
                k71.k.e(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                bVar2.f31715b.f30361a.set(true);
                return bVar2;
        }
    }
}

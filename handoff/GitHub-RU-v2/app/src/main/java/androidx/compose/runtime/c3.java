package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class c3 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1584v;

    /* renamed from: w, reason: collision with root package name */
    public int f1585w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f1586x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j71.e f1587y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ f1 f1588z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(j71.e eVar, f1 f1Var, a71.c cVar, int i) {
        super(2, cVar);
        this.f1584v = i;
        this.f1587y = eVar;
        this.f1588z = f1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f1584v) {
            case k5.f.J:
                c3 c3Var = new c3(this.f1587y, this.f1588z, cVar, 0);
                c3Var.f1586x = obj;
                return c3Var;
            case 1:
                c3 c3Var2 = new c3(this.f1587y, this.f1588z, cVar, 1);
                c3Var2.f1586x = obj;
                return c3Var2;
            default:
                c3 c3Var3 = new c3(this.f1587y, this.f1588z, cVar, 2);
                c3Var3.f1586x = obj;
                return c3Var3;
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f1584v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f1584v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f1585w;
                if (i == 0) {
                    sy.y.j(obj);
                    x1 x1Var = new x1(this.f1588z, ((v71.z) this.f1586x).K());
                    this.f1585w = 1;
                    if (this.f1587y.s(x1Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f1585w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    x1 x1Var2 = new x1(this.f1588z, ((v71.z) this.f1586x).K());
                    this.f1585w = 1;
                    if (this.f1587y.s(x1Var2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i11 = this.f1585w;
                if (i11 == 0) {
                    sy.y.j(obj);
                    x1 x1Var3 = new x1(this.f1588z, ((v71.z) this.f1586x).K());
                    this.f1585w = 1;
                    if (this.f1587y.s(x1Var3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}

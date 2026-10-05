package androidx.compose.runtime;

/* loaded from: /home/user/work/p/classes.dex */
public final class e3 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f1614v;

    /* renamed from: w, reason: collision with root package name */
    public int f1615w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y71.i f1616x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x1 f1617y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(y71.i iVar, x1 x1Var, a71.c cVar, int i) {
        super(2, cVar);
        this.f1614v = i;
        this.f1616x = iVar;
        this.f1617y = x1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f1614v) {
            case k5.f.J:
                return new e3(this.f1616x, this.f1617y, cVar, 0);
            case 1:
                return new e3(this.f1616x, this.f1617y, cVar, 1);
            default:
                return new e3(this.f1616x, this.f1617y, cVar, 2);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f1614v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f1614v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f1615w;
                if (i == 0) {
                    sy.y.j(obj);
                    d3 d3Var = new d3(this.f1617y, 1);
                    this.f1615w = 1;
                    if (this.f1616x.b(d3Var, this) == aVar) {
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
                int i10 = this.f1615w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    d3 d3Var2 = new d3(this.f1617y, 3);
                    this.f1615w = 1;
                    if (this.f1616x.b(d3Var2, this) == aVar2) {
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
                int i11 = this.f1615w;
                if (i11 == 0) {
                    sy.y.j(obj);
                    a71.i iVar = a71.i.r;
                    boolean equals = iVar.equals(iVar);
                    x1 x1Var = this.f1617y;
                    y71.i iVar2 = this.f1616x;
                    if (equals) {
                        d3 d3Var3 = new d3(x1Var, 2);
                        this.f1615w = 1;
                        if (iVar2.b(d3Var3, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        e3 e3Var = new e3(iVar2, x1Var, null, 1);
                        this.f1615w = 2;
                        if (v71.b0.L(iVar, e3Var, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i11 != 1 && i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}

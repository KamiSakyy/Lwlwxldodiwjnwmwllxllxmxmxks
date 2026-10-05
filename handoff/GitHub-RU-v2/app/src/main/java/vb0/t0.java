package vb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t0 extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public y71.j w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ k1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i, a71.c cVar, String str, k1 k1Var) {
        super(2, cVar);
        this.v = i;
        this.z = k1Var;
        this.A = str;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                t0 t0Var = new t0(0, cVar, this.A, this.z);
                t0Var.y = obj;
                return t0Var;
            case 1:
                t0 t0Var2 = new t0(1, cVar, this.A, this.z);
                t0Var2.y = obj;
                return t0Var2;
            default:
                t0 t0Var3 = new t0(2, cVar, this.A, this.z);
                t0Var3.y = obj;
                return t0Var3;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((t0) r(cVar, jVar)).v(w61.a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                y71.j jVar = (y71.j) this.y;
                b71.a aVar = b71.a.r;
                int i = this.x;
                if (i == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar = this.z.s;
                    e50.k kVar = new e50.k(0);
                    this.y = null;
                    this.w = jVar;
                    this.x = 1;
                    obj = bVar.c(kVar, this.A);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    jVar = this.w;
                    sy.y.j(obj);
                }
                this.y = null;
                this.w = null;
                this.x = 2;
                if (jVar.c(obj, this) == aVar) {
                    return aVar;
                }
                return w61.a0.a;
            case 1:
                y71.j jVar2 = (y71.j) this.y;
                b71.a aVar2 = b71.a.r;
                int i2 = this.x;
                if (i2 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar2 = this.z.s;
                    e50.k kVar2 = new e50.k(0);
                    this.y = null;
                    this.w = jVar2;
                    this.x = 1;
                    obj = bVar2.c(kVar2, this.A);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    jVar2 = this.w;
                    sy.y.j(obj);
                }
                this.y = null;
                this.w = null;
                this.x = 2;
                if (jVar2.c(obj, this) == aVar2) {
                    return aVar2;
                }
                return w61.a0.a;
            default:
                y71.j jVar3 = (y71.j) this.y;
                b71.a aVar3 = b71.a.r;
                int i3 = this.x;
                if (i3 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar3 = this.z.s;
                    e50.y yVar = new e50.y(0);
                    this.y = null;
                    this.w = jVar3;
                    this.x = 1;
                    obj = bVar3.c(yVar, this.A);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    jVar3 = this.w;
                    sy.y.j(obj);
                }
                this.y = null;
                this.w = null;
                this.x = 2;
                if (jVar3.c(obj, this) == aVar3) {
                    return aVar3;
                }
                return w61.a0.a;
        }
    }
}

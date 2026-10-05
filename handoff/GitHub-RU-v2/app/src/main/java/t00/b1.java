package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public y71.j w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1(int i, a71.c cVar, String str, s1 s1Var) {
        super(2, cVar);
        this.v = i;
        this.z = s1Var;
        this.A = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                b1 b1Var = new b1(0, cVar, this.A, this.z);
                b1Var.y = obj;
                return b1Var;
            case 1:
                b1 b1Var2 = new b1(1, cVar, this.A, this.z);
                b1Var2.y = obj;
                return b1Var2;
            default:
                b1 b1Var3 = new b1(2, cVar, this.A, this.z);
                b1Var3.y = obj;
                return b1Var3;
        }
    }

    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, jVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                y71.j jVar = (y71.j) this.y;
                b71.a aVar = b71.a.r;
                int i = this.x;
                if (i == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar = this.z.s;
                    is.m mVar = new is.m();
                    this.y = null;
                    this.w = jVar;
                    this.x = 1;
                    obj = bVar.c(mVar, this.A);
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
                    is.m mVar2 = new is.m();
                    this.y = null;
                    this.w = jVar2;
                    this.x = 1;
                    obj = bVar2.c(mVar2, this.A);
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
                    is.c0 c0Var = new is.c0();
                    this.y = null;
                    this.w = jVar3;
                    this.x = 1;
                    obj = bVar3.c(c0Var, this.A);
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

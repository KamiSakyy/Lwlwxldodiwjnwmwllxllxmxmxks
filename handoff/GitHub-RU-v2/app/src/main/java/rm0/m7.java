package rm0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m7 extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7(Object obj, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = obj;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new m7((y8) this.x, cVar, 0);
            case 1:
                return new m7((b1.j) this.x, cVar, 1);
            case 2:
                return new m7((s0.p0) this.x, cVar, 2);
            case 3:
                return new m7((t00.c9) this.x, cVar, 3);
            case 4:
                return new m7((y8) this.x, cVar, 4);
            case 5:
                return new m7((t00.c9) this.x, cVar, 5);
            default:
                return new m7((y71.y) this.x, cVar, 6);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ((m7) r((a71.c) obj2, (kc0.t1) obj)).v(w61.a0.a);
            case 1:
                return ((m7) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 2:
                return ((m7) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
            case 3:
                return ((m7) r((a71.c) obj2, (jo.y1) obj)).v(w61.a0.a);
            case 4:
                return ((m7) r((a71.c) obj2, (u10.t1) obj)).v(w61.a0.a);
            case 5:
                return ((m7) r((a71.c) obj2, (jn0.t1) obj)).v(w61.a0.a);
            default:
                return ((m7) r((a71.c) obj2, (v71.z) obj)).v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.bShadow bVar = ((y8) this.x).t;
                    s sVar = new s(10);
                    this.w = 1;
                    if (b31.b.b(bVar, sVar, this) == aVar) {
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
                int i2 = this.w;
                w61.a0 a0Var = w61.a0.a;
                if (i2 == 0) {
                    sy.y.j(obj);
                    b1.j jVar = (b1.j) this.x;
                    this.w = 1;
                    jVar.getClass();
                    Object k = v71.b0.k(new androidx.lifecycle.n(jVar, (a71.c) null, 3), this);
                    if (k != aVar2) {
                        k = a0Var;
                    }
                    if (k == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                w61.a0 a0Var2 = w61.a0.a;
                if (i3 == 0) {
                    sy.y.j(obj);
                    s0.p0 p0Var = (s0.p0) this.x;
                    this.w = 1;
                    p0Var.getClass();
                    Object b = p0Var.a.a().b(new u7(1, new x.d0(), p0Var), this);
                    if (b != aVar3) {
                        b = a0Var2;
                    }
                    if (b == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var2;
            case 3:
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.bShadow bVar2 = ((t00.c9) this.x).t;
                    sw0.e eVar = new sw0.e(25);
                    this.w = 1;
                    if (sy.n.a(bVar2, eVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 4:
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.bShadow bVar3 = ((y8) this.x).t;
                    v00.n nVar = new v00.n(21);
                    this.w = 1;
                    if (sy.s.c(bVar3, nVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 5:
                b71.a aVar6 = b71.a.r;
                int i6 = this.w;
                if (i6 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.bShadow bVar4 = ((t00.c9) this.x).t;
                    wy0.p4 p4Var = new wy0.p4(7);
                    this.w = 1;
                    if (sy.y.b(bVar4, p4Var, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar7 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    sy.y.j(obj);
                    y71.y yVar = (y71.y) this.x;
                    this.w = 1;
                    if (y71.n1.j(yVar, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}

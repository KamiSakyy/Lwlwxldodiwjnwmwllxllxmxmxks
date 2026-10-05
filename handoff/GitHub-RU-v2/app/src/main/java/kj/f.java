package kj;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ k71.w x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k71.w wVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = wVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new f(this.x, cVar, 0);
            case 1:
                return new f(this.x, cVar, 1);
            case 2:
                return new f(this.x, cVar, 2);
            case 3:
                return new f(this.x, cVar, 3);
            case 4:
                return new f(this.x, cVar, 4);
            default:
                return new f(this.x, cVar, 5);
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
            case 1:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
            case 2:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
            case 3:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
            case 4:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (Throwable) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                w61.a0 a0Var = b71.a.r;
                int i = this.w;
                w61.a0 a0Var2 = w61.a0.a;
                if (i == 0) {
                    sy.y.j(obj);
                    cn.k kVar = (cn.k) this.x.r;
                    if (kVar != null) {
                        this.w = 1;
                        kVar.a();
                        if (a0Var2 == a0Var) {
                            return a0Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var2;
            case 1:
                w61.a0 a0Var3 = b71.a.r;
                int i2 = this.w;
                w61.a0 a0Var4 = w61.a0.a;
                if (i2 == 0) {
                    sy.y.j(obj);
                    cn.k kVar2 = (cn.k) this.x.r;
                    if (kVar2 != null) {
                        this.w = 1;
                        kVar2.a();
                        if (a0Var4 == a0Var3) {
                            return a0Var3;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var4;
            case 2:
                w61.a0 a0Var5 = b71.a.r;
                int i3 = this.w;
                w61.a0 a0Var6 = w61.a0.a;
                if (i3 == 0) {
                    sy.y.j(obj);
                    cn.k kVar3 = (cn.k) this.x.r;
                    if (kVar3 != null) {
                        this.w = 1;
                        kVar3.a();
                        if (a0Var6 == a0Var5) {
                            return a0Var5;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var6;
            case 3:
                w61.a0 a0Var7 = b71.a.r;
                int i4 = this.w;
                w61.a0 a0Var8 = w61.a0.a;
                if (i4 == 0) {
                    sy.y.j(obj);
                    cn.k kVar4 = (cn.k) this.x.r;
                    if (kVar4 != null) {
                        this.w = 1;
                        kVar4.a();
                        if (a0Var8 == a0Var7) {
                            return a0Var7;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var8;
            case 4:
                b71.a aVar = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    sy.y.j(obj);
                    Object obj2 = this.x.r;
                    k71.k.d(obj2);
                    this.w = 1;
                    if (ma.f.d((ma.f) obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                w61.a0 a0Var9 = b71.a.r;
                int i6 = this.w;
                w61.a0 a0Var10 = w61.a0.a;
                if (i6 == 0) {
                    sy.y.j(obj);
                    cn.k kVar5 = (cn.k) this.x.r;
                    if (kVar5 != null) {
                        this.w = 1;
                        kVar5.a();
                        if (a0Var10 == a0Var9) {
                            return a0Var9;
                        }
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0Var10;
        }
    }
}

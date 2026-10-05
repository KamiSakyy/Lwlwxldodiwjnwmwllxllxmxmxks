package wy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ rm0.o x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(rm0.o oVar, String str, String str2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = oVar;
        this.y = str;
        this.z = str2;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new h(this.x, this.y, this.z, cVar, 0);
            case 1:
                return new h(this.x, this.y, this.z, cVar, 1);
            default:
                return new h(this.x, this.y, this.z, cVar, 2);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        w61.a0 a0Var = (w61.a0) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((h) r(cVar, a0Var)).v(w61.a0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // c71.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                rm0.o oVar = this.x;
                if (i == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (rm0.o.k(oVar, this.y, this.z, false, this) == aVar) {
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
                    sy.y.j(obj);
                }
                this.w = 2;
                if (oVar.D(this.y, this.z, false, null, this) == aVar) {
                    return aVar;
                }
                return w61.a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                String str = this.z;
                String str2 = this.y;
                rm0.o oVar2 = this.x;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (rm0.o.o(oVar2, str2, str, false, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                            return w61.a0.a;
                        }
                        sy.y.j(obj);
                        this.w = 3;
                        if (oVar2.H(this.y, this.z, false, null, this) == aVar2) {
                            return aVar2;
                        }
                        return w61.a0.a;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                if (rm0.o.s(oVar2, str2, str, false, this) == aVar2) {
                    return aVar2;
                }
                this.w = 3;
                if (oVar2.H(this.y, this.z, false, null, this) == aVar2) {
                }
                return w61.a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (this.x.L(this.y, this.z, false, null, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}

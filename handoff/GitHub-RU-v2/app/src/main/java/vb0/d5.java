package vb0;

import hc0.zm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d5 extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ zm B;
    public final /* synthetic */ int v;
    public y71.j w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ rm0.y6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5(rm0.y6 y6Var, String str, zm zmVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.z = y6Var;
        this.A = str;
        this.B = zmVar;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                d5 d5Var = new d5(this.z, this.A, this.B, cVar, 0);
                d5Var.y = obj;
                return d5Var;
            default:
                d5 d5Var2 = new d5(this.z, this.A, this.B, cVar, 1);
                d5Var2.y = obj;
                return d5Var2;
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((d5) r(cVar, jVar)).v(w61.a0.a);
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
                    this.y = null;
                    this.w = jVar;
                    this.x = 1;
                    obj = rm0.y6.d(this.z, this.A, this.B, true, this);
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
            default:
                y71.j jVar2 = (y71.j) this.y;
                b71.a aVar2 = b71.a.r;
                int i2 = this.x;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.y = null;
                    this.w = jVar2;
                    this.x = 1;
                    obj = rm0.y6.d(this.z, this.A, this.B, false, this);
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
        }
    }
}

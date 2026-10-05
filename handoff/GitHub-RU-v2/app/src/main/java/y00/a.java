package y00;

import bz0.c0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public k71.w w;
    public int x;
    public final /* synthetic */ k71.w y;
    public final /* synthetic */ w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k71.w wVar, w wVar2, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = wVar;
        this.z = wVar2;
        this.A = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new a(this.y, this.z, this.A, cVar, 0);
            case 1:
                return new a(this.y, this.z, this.A, cVar, 1);
            case 2:
                return new a(this.y, this.z, this.A, cVar, 2);
            default:
                return new a(this.y, this.z, this.A, cVar, 3);
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
        k71.w wVar;
        k71.w wVar2;
        k71.w wVar3;
        k71.w wVar4;
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.x;
                if (i == 0) {
                    sy.y.j(obj);
                    c0 c0Var = this.z.v;
                    k71.w wVar5 = this.y;
                    this.w = wVar5;
                    this.x = 1;
                    obj = c0Var.f(this.A, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wVar = wVar5;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar = this.w;
                    sy.y.j(obj);
                }
                wVar.r = obj;
                return w61.a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.x;
                if (i2 == 0) {
                    sy.y.j(obj);
                    c0 c0Var2 = this.z.v;
                    k71.w wVar6 = this.y;
                    this.w = wVar6;
                    this.x = 1;
                    obj = c0Var2.j(this.A, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    wVar2 = wVar6;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar2 = this.w;
                    sy.y.j(obj);
                }
                wVar2.r = obj;
                return w61.a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.x;
                if (i3 == 0) {
                    sy.y.j(obj);
                    c0 c0Var3 = this.z.v;
                    k71.w wVar7 = this.y;
                    this.w = wVar7;
                    this.x = 1;
                    obj = c0Var3.n(this.A, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    wVar3 = wVar7;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar3 = this.w;
                    sy.y.j(obj);
                }
                wVar3.r = obj;
                return w61.a0.a;
            default:
                b71.a aVar4 = b71.a.r;
                int i4 = this.x;
                if (i4 == 0) {
                    sy.y.j(obj);
                    c0 c0Var4 = this.z.v;
                    k71.w wVar8 = this.y;
                    this.w = wVar8;
                    this.x = 1;
                    obj = c0Var4.r(this.A, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                    wVar4 = wVar8;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar4 = this.w;
                    sy.y.j(obj);
                }
                wVar4.r = obj;
                return w61.a0.a;
        }
    }
}

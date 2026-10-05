package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 extends c71.j implements j71.e {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public k71.w w;
    public int x;
    public final /* synthetic */ k71.w y;
    public final /* synthetic */ s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(k71.w wVar, s1 s1Var, String str, String str2, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = wVar;
        this.z = s1Var;
        this.A = str;
        this.B = str2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new d1(this.y, this.z, this.A, this.B, cVar, 0);
            case 1:
                return new d1(this.y, this.z, this.A, this.B, cVar, 1);
            default:
                return new d1(this.y, this.z, this.A, this.B, cVar, 2);
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
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.x;
                if (i == 0) {
                    sy.y.j(obj);
                    u00.q qVar = this.z.x;
                    k71.w wVar4 = this.y;
                    this.w = wVar4;
                    this.x = 1;
                    obj = qVar.b(this.A, this.B, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    wVar = wVar4;
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
                    u00.q qVar2 = this.z.x;
                    k71.w wVar5 = this.y;
                    this.w = wVar5;
                    this.x = 1;
                    obj = qVar2.g(this.A, this.B, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                    wVar2 = wVar5;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar2 = this.w;
                    sy.y.j(obj);
                }
                wVar2.r = obj;
                return w61.a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.x;
                if (i3 == 0) {
                    sy.y.j(obj);
                    u00.q qVar3 = this.z.x;
                    k71.w wVar6 = this.y;
                    this.w = wVar6;
                    this.x = 1;
                    obj = qVar3.h(this.A, this.B, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    wVar3 = wVar6;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    wVar3 = this.w;
                    sy.y.j(obj);
                }
                wVar3.r = obj;
                return w61.a0.a;
        }
    }
}

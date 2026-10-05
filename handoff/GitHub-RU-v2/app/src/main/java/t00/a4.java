package t00;

import m10.n40;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a4 extends c71.j implements j71.e {
    public final /* synthetic */ rm0.o4 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public Object w;
    public k71.w x;
    public int y;
    public final /* synthetic */ k71.w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a4(k71.w wVar, rm0.o4 o4Var, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.z = wVar;
        this.A = o4Var;
        this.B = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new a4(this.z, this.A, this.B, cVar, 0);
            default:
                return new a4(this.z, this.A, this.B, cVar, 1);
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
        tt.e eVar;
        tt.e eVar2;
        k71.w wVar2;
        n40 n40Var;
        k71.w wVar3;
        tt.e eVar3;
        tt.e eVar4;
        k71.w wVar4;
        switch (this.v) {
            case 0:
                com.github.service.wrapper.b bVar = this.A.s;
                b71.a aVar = b71.a.r;
                int i = this.y;
                String str = this.B;
                if (i == 0) {
                    sy.y.j(obj);
                    tt.g gVar = new tt.g();
                    wVar = this.z;
                    this.w = wVar;
                    this.y = 1;
                    obj = bVar.c(gVar, str);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wVar2 = this.x;
                        eVar2 = (tt.e) this.w;
                        sy.y.j(obj);
                        wVar = wVar2;
                        eVar = eVar2;
                        wVar.r = eVar;
                        return w61.a0.a;
                    }
                    wVar = (k71.w) this.w;
                    sy.y.j(obj);
                }
                tt.e eVar5 = (tt.e) obj;
                eVar = null;
                if (eVar5 != null) {
                    tt.a aVar2 = eVar5.e;
                    boolean z = (aVar2 == null || (n40Var = aVar2.a.b) == null || kz.a.a[n40Var.ordinal()] != 1) ? false : true;
                    tt.g gVar2 = new tt.g();
                    tt.c cVar = eVar5.c;
                    tt.c a = cVar != null ? tt.c.a(cVar, false) : null;
                    tt.b bVar2 = eVar5.d;
                    tt.e a2 = tt.e.a(eVar5, true, a, bVar2 != null ? tt.b.a(bVar2, false) : null, aVar2 != null ? tt.a.a(aVar2, z, z) : null);
                    this.w = eVar5;
                    this.x = wVar;
                    this.y = 2;
                    if (bVar.p(gVar2, a2, str, this) == aVar) {
                        return aVar;
                    }
                    eVar2 = eVar5;
                    wVar2 = wVar;
                    wVar = wVar2;
                    eVar = eVar2;
                }
                wVar.r = eVar;
                return w61.a0.a;
            default:
                com.github.service.wrapper.b bVar3 = this.A.s;
                b71.a aVar3 = b71.a.r;
                int i2 = this.y;
                String str2 = this.B;
                if (i2 == 0) {
                    sy.y.j(obj);
                    tt.g gVar3 = new tt.g();
                    wVar3 = this.z;
                    this.w = wVar3;
                    this.y = 1;
                    obj = bVar3.c(gVar3, str2);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        wVar4 = this.x;
                        eVar4 = (tt.e) this.w;
                        sy.y.j(obj);
                        wVar3 = wVar4;
                        eVar3 = eVar4;
                        wVar3.r = eVar3;
                        return w61.a0.a;
                    }
                    wVar3 = (k71.w) this.w;
                    sy.y.j(obj);
                }
                tt.e eVar6 = (tt.e) obj;
                eVar3 = null;
                if (eVar6 != null) {
                    tt.g gVar4 = new tt.g();
                    tt.c cVar2 = eVar6.c;
                    tt.c a3 = cVar2 != null ? tt.c.a(cVar2, true) : null;
                    tt.b bVar4 = eVar6.d;
                    tt.b a4 = bVar4 != null ? tt.b.a(bVar4, true) : null;
                    tt.a aVar4 = eVar6.e;
                    tt.e a5 = tt.e.a(eVar6, false, a3, a4, aVar4 != null ? tt.a.a(aVar4, true, true) : null);
                    this.w = eVar6;
                    this.x = wVar3;
                    this.y = 2;
                    if (bVar3.p(gVar4, a5, str2, this) == aVar3) {
                        return aVar3;
                    }
                    eVar4 = eVar6;
                    wVar4 = wVar3;
                    wVar3 = wVar4;
                    eVar3 = eVar4;
                }
                wVar3.r = eVar3;
                return w61.a0.a;
        }
    }
}

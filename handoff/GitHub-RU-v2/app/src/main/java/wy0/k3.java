package wy0;

import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 extends c71.j implements j71.e {
    public final /* synthetic */ rm0.o4 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public Object w;
    public k71.w x;
    public int y;
    public final /* synthetic */ k71.w z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(k71.w wVar, rm0.o4 o4Var, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.z = wVar;
        this.A = o4Var;
        this.B = str;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new k3(this.z, this.A, this.B, cVar, 0);
            default:
                return new k3(this.z, this.A, this.B, cVar, 1);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return ((k3) r(cVar, jVar)).v(w61.a0.a);
    }

    @Override // c71.a
    public final Object v(Object obj) {
        k71.w wVar;
        ks0.e eVar;
        ks0.e eVar2;
        k71.w wVar2;
        py pyVar;
        k71.w wVar3;
        ks0.e eVar3;
        ks0.e eVar4;
        k71.w wVar4;
        switch (this.v) {
            case 0:
                com.github.service.wrapper.b bVar = this.A.s;
                b71.a aVar = b71.a.r;
                int i = this.y;
                String str = this.B;
                if (i == 0) {
                    sy.y.j(obj);
                    ks0.g gVar = new ks0.g();
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
                        eVar2 = (ks0.e) this.w;
                        sy.y.j(obj);
                        wVar = wVar2;
                        eVar = eVar2;
                        wVar.r = eVar;
                        return w61.a0.a;
                    }
                    wVar = (k71.w) this.w;
                    sy.y.j(obj);
                }
                ks0.e eVar5 = (ks0.e) obj;
                eVar = null;
                if (eVar5 != null) {
                    ks0.a aVar2 = eVar5.e;
                    boolean z = (aVar2 == null || (pyVar = aVar2.a.b) == null || nx0.a.a[pyVar.ordinal()] != 1) ? false : true;
                    ks0.g gVar2 = new ks0.g();
                    ks0.c cVar = eVar5.c;
                    ks0.c a = cVar != null ? ks0.c.a(cVar, false) : null;
                    ks0.b bVar2 = eVar5.d;
                    ks0.e a2 = ks0.e.a(eVar5, true, a, bVar2 != null ? ks0.b.a(bVar2, false) : null, aVar2 != null ? ks0.a.a(aVar2, z, z) : null);
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
                    ks0.g gVar3 = new ks0.g();
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
                        eVar4 = (ks0.e) this.w;
                        sy.y.j(obj);
                        wVar3 = wVar4;
                        eVar3 = eVar4;
                        wVar3.r = eVar3;
                        return w61.a0.a;
                    }
                    wVar3 = (k71.w) this.w;
                    sy.y.j(obj);
                }
                ks0.e eVar6 = (ks0.e) obj;
                eVar3 = null;
                if (eVar6 != null) {
                    ks0.g gVar4 = new ks0.g();
                    ks0.c cVar2 = eVar6.c;
                    ks0.c a3 = cVar2 != null ? ks0.c.a(cVar2, true) : null;
                    ks0.b bVar4 = eVar6.d;
                    ks0.b a4 = bVar4 != null ? ks0.b.a(bVar4, true) : null;
                    ks0.a aVar4 = eVar6.e;
                    ks0.e a5 = ks0.e.a(eVar6, false, a3, a4, aVar4 != null ? ks0.a.a(aVar4, true, true) : null);
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

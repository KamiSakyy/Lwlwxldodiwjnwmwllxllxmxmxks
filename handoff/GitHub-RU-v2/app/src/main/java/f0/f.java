package f0;

/* loaded from: /home/user/work/p/classes.dex */
public final class f extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f22268v;

    /* renamed from: w, reason: collision with root package name */
    public int f22269w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f22270x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0.l f22271y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, j0.l lVar, a71.c cVar, int i) {
        super(2, cVar);
        this.f22268v = i;
        this.f22270x = hVar;
        this.f22271y = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f22268v) {
            case k5.f.J:
                return new f(this.f22270x, this.f22271y, cVar, 0);
            case 1:
                return new f(this.f22270x, this.f22271y, cVar, 1);
            case 2:
                return new f(this.f22270x, this.f22271y, cVar, 2);
            default:
                return new f(this.f22270x, this.f22271y, cVar, 3);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f22268v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f22268v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f22269w;
                if (i == 0) {
                    sy.y.j(obj);
                    j0.j jVar = this.f22270x.H;
                    if (jVar != null) {
                        j0.k kVar = new j0.k(this.f22271y);
                        this.f22269w = 1;
                        if (jVar.b(kVar, this) == aVar) {
                            return aVar;
                        }
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
                int i10 = this.f22269w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    j0.j jVar2 = this.f22270x.H;
                    if (jVar2 != null) {
                        j0.k kVar2 = new j0.k(this.f22271y);
                        this.f22269w = 1;
                        if (jVar2.b(kVar2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i11 = this.f22269w;
                if (i11 == 0) {
                    sy.y.j(obj);
                    j0.j jVar3 = this.f22270x.H;
                    if (jVar3 != null) {
                        this.f22269w = 1;
                        if (jVar3.b(this.f22271y, this) == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar4 = b71.a.r;
                int i12 = this.f22269w;
                if (i12 == 0) {
                    sy.y.j(obj);
                    j0.j jVar4 = this.f22270x.H;
                    if (jVar4 != null) {
                        j0.m mVar = new j0.m(this.f22271y);
                        this.f22269w = 1;
                        if (jVar4.b(mVar, this) == aVar4) {
                            return aVar4;
                        }
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }

}

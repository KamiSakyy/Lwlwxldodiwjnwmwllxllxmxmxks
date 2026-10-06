package b6;

/* loaded from: /home/user/work/p/classes.dex */
public final class xShadow extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3728v;

    /* renamed from: w, reason: collision with root package name */
    public int f3729w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3730x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c71.j f3731y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Object x(int i, a71.c cVar, j71.e eVar) {
        super(2, cVar);
        this.f3728v = i;
        switch (i) {
            case 1:
                this.f3731y = (c71.j) eVar;
                super(2, cVar);
                break;
            default:
                this.f3731y = (c71.j) eVar;
                break;
        }
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f3728v) {
            case k5.f.J:
                xShadow xVar = new xShadow(0, cVar, this.f3731y);
                xVar.f3730x = obj;
                return xVar;
            default:
                xShadow xVar2 = new xShadow(1, cVar, this.f3731y);
                xVar2.f3730x = obj;
                return xVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f3728v) {
            case k5.f.J:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (s5.b) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.f3728v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f3729w;
                if (i == 0) {
                    sy.y.j(obj);
                    v71.z zVar = (v71.z) this.f3730x;
                    this.f3729w = 1;
                    if (this.f3731y.s(zVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f3729w;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s5.b bVar = (s5.b) this.f3730x;
                    sy.y.j(obj);
                    return bVar;
                }
                sy.y.j(obj);
                s5.b h10 = ((s5.b) this.f3730x).h();
                this.f3730x = h10;
                this.f3729w = 1;
                return this.f3731y.s(h10, this) == aVar2 ? aVar2 : h10;
        }
    }
}

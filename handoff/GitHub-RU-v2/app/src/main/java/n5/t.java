package n5;

/* loaded from: /home/user/work/p/classes.dex */
public final class t extends c71.j implements j71.e {
    public Object A;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29597v;

    /* renamed from: w, reason: collision with root package name */
    public int f29598w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ boolean f29599x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ x f29600y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f29601z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(x xVar, int i, a71.c cVar, int i10) {
        super(2, cVar);
        this.f29597v = i10;
        this.f29600y = xVar;
        this.f29601z = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f29597v) {
            case k5.f.J:
                t tVar = new t(this.f29600y, this.f29601z, cVar, 0);
                tVar.f29599x = ((Boolean) obj).booleanValue();
                return tVar;
            default:
                t tVar2 = new t(this.f29600y, this.f29601z, cVar, 1);
                tVar2.f29599x = ((Boolean) obj).booleanValue();
                return tVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        int i = this.f29597v;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        a71.c cVar = (a71.c) obj2;
        switch (i) {
        }
        return ((t) r(cVar, bool)).v(w61.a0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        Throwable th;
        int i;
        boolean z10;
        p0 p0Var;
        boolean z11;
        boolean z12;
        Object obj2;
        int i10;
        switch (this.f29597v) {
            case k5.f.J:
                Integer num = b71.a.r;
                boolean z13 = this.f29598w;
                x xVar = this.f29600y;
                try {
                } catch (Throwable th2) {
                    if (z13 != 0) {
                        o0 h10 = xVar.h();
                        this.A = th2;
                        this.f29599x = z13;
                        this.f29598w = 2;
                        Integer a10 = h10.a();
                        if (a10 == num) {
                            return num;
                        }
                        z10 = z13;
                        th = th2;
                        obj = a10;
                    } else {
                        boolean z14 = z13;
                        th = th2;
                        i = this.f29601z;
                        z10 = z14;
                    }
                }
                if (z13 == 0) {
                    sy.y.j(obj);
                    boolean z15 = this.f29599x;
                    this.f29599x = z15;
                    this.f29598w = 1;
                    obj = x.g(xVar, z15, this);
                    z13 = z15;
                    if (obj == num) {
                        return num;
                    }
                } else {
                    if (z13 != 1) {
                        if (z13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = this.f29599x;
                        th = (Throwable) this.A;
                        sy.y.j(obj);
                        i = ((Number) obj).intValue();
                        i0 i0Var = new i0(th, i);
                        z11 = z10;
                        p0Var = i0Var;
                        return new w61.k(p0Var, Boolean.valueOf(z11));
                    }
                    boolean z16 = this.f29599x;
                    sy.y.j(obj);
                    z13 = z16;
                }
                p0Var = (p0) obj;
                z11 = z13;
                return new w61.k(p0Var, Boolean.valueOf(z11));
            default:
                Integer num2 = b71.a.r;
                int i11 = this.f29598w;
                x xVar2 = this.f29600y;
                if (i11 == 0) {
                    sy.y.j(obj);
                    z12 = this.f29599x;
                    this.f29599x = z12;
                    this.f29598w = 1;
                    obj = xVar2.i(this);
                    if (obj == num2) {
                        return num2;
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.A;
                        sy.y.j(obj);
                        i10 = ((Number) obj).intValue();
                        return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                    }
                    z12 = this.f29599x;
                    sy.y.j(obj);
                }
                if (!z12) {
                    obj2 = obj;
                    i10 = this.f29601z;
                    return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
                }
                o0 h11 = xVar2.h();
                this.A = obj;
                this.f29598w = 2;
                Integer a11 = h11.a();
                if (a11 == num2) {
                    return num2;
                }
                obj2 = obj;
                obj = a11;
                i10 = ((Number) obj).intValue();
                return new c(obj2, obj2 != null ? obj2.hashCode() : 0, i10);
        }
    }
}

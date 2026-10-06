package h0;

import java.util.concurrent.CancellationException;

/* loaded from: /home/user/work/p/classes.dex */
public final class y0 extends c71.j implements j71.e {
    public final /* synthetic */ z0 A;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25243v = 1;

    /* renamed from: w, reason: collision with root package name */
    public k71.w f25244w;

    /* renamed from: x, reason: collision with root package name */
    public k71.w f25245x;

    /* renamed from: y, reason: collision with root package name */
    public int f25246y;

    /* renamed from: z, reason: collision with root package name */
    public /* synthetic */ Object f25247z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(z0 z0Var, a71.c cVar) {
        super(2, cVar);
        this.A = z0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f25243v) {
            case k5.f.J:
                y0 y0Var = new y0(this.f25245x, this.A, cVar);
                y0Var.f25247z = obj;
                return y0Var;
            default:
                y0 y0Var2 = new y0(this.A, cVar);
                y0Var2.f25247z = obj;
                return y0Var2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f25243v) {
            case k5.f.J:
                return r((a71.c) obj2, (j71.c) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:43)|25|26|27|(2:33|(2:35|(1:37)))(2:29|(2:31|32))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:27:0x00b0, B:29:0x00b6, B:33:0x00c8, B:35:0x00cc), top: B:26:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0087 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c3 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d7 -> B:10:0x005b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00e5 -> B:9:0x002c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013b -> B:61:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0140 -> B:62:0x0141). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        j71.c cVar;
        Object obj2;
        v71.z zVar;
        k71.w wVar;
        k71.w wVar2;
        k71.w wVar3;
        v71.z zVar2;
        v71.z zVar3;
        Object obj3;
        y0 y0Var;
        l0 l0Var;
        Object obj4;
        switch (this.f25243v) {
            case k5.f.J:
                k71.w wVar4 = this.f25245x;
                b71.a aVar = b71.a.r;
                int i = this.f25246y;
                if (i == 0) {
                    sy.y.j(obj);
                    cVar = (j71.c) this.f25247z;
                    obj2 = wVar4.r;
                    if (obj2 instanceof k0) {
                    }
                    return w61.a0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k71.w wVar5 = this.f25244w;
                cVar = (j71.c) this.f25247z;
                sy.y.j(obj);
                l0 l0Var2 = (l0) obj;
                wVar5.r = l0Var2;
                obj2 = wVar4.r;
                if (!(obj2 instanceof k0) || (obj2 instanceof h0)) {
                    return w61.a0.a;
                }
                l0Var2 = null;
                i0 i0Var = obj2 instanceof i0 ? (i0) obj2 : null;
                if (i0Var != null) {
                    cVar.k(i0Var);
                }
                x71.hShadow hVar = this.A.L;
                if (hVar == null) {
                    wVar5 = wVar4;
                    wVar5.r = l0Var2;
                    obj2 = wVar4.r;
                    if (obj2 instanceof k0) {
                    }
                    return w61.a0.a;
                }
                this.f25247z = cVar;
                this.f25244w = wVar4;
                this.f25246y = 1;
                obj = hVar.k(this);
                if (obj == aVar) {
                    return aVar;
                }
                wVar5 = wVar4;
                l0 l0Var22 = (l0) obj;
                wVar5.r = l0Var22;
                obj2 = wVar4.r;
                if (obj2 instanceof k0) {
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f25246y;
                z0 z0Var = this.A;
                switch (i10) {
                    case k5.f.J:
                        sy.y.j(obj);
                        zVar = (v71.z) this.f25247z;
                        if (!v71.b0.w(zVar)) {
                            wVar = new k71.w();
                            x71.hShadow hVar2 = z0Var.L;
                            if (hVar2 != null) {
                                this.f25247z = zVar;
                                this.f25244w = wVar;
                                this.f25245x = wVar;
                                this.f25246y = 1;
                                obj = hVar2.k(this);
                                if (obj == aVar2) {
                                    return aVar2;
                                }
                                wVar2 = wVar;
                                l0Var = (l0) obj;
                                wVar.r = l0Var;
                                obj4 = wVar2.r;
                                if (obj4 instanceof j0) {
                                    this.f25247z = zVar;
                                    this.f25244w = wVar2;
                                    this.f25245x = null;
                                    this.f25246y = 2;
                                    if (z0.S0(z0Var, (j0) obj4, this) == aVar2) {
                                        return aVar2;
                                    }
                                    wVar3 = wVar2;
                                    zVar2 = zVar;
                                    y0Var = new y0(wVar3, z0Var, null);
                                    this.f25247z = zVar2;
                                    this.f25244w = wVar3;
                                    this.f25246y = 3;
                                    if (z0Var.V0(y0Var, this) == aVar2) {
                                        return aVar2;
                                    }
                                    zVar = zVar2;
                                    obj3 = wVar3.r;
                                    if (obj3 instanceof k0) {
                                        this.f25247z = zVar;
                                        this.f25244w = null;
                                        this.f25246y = 4;
                                        if (z0.T0(z0Var, (k0) obj3, this) == aVar2) {
                                            return aVar2;
                                        }
                                    } else if (obj3 instanceof h0) {
                                        this.f25247z = zVar;
                                        this.f25244w = null;
                                        this.f25246y = 5;
                                        if (z0.R0(z0Var, this) == aVar2) {
                                            return aVar2;
                                        }
                                    }
                                }
                                if (!v71.b0.w(zVar)) {
                                    return w61.a0.a;
                                }
                            } else {
                                wVar2 = wVar;
                                l0Var = null;
                                wVar.r = l0Var;
                                obj4 = wVar2.r;
                                if (obj4 instanceof j0) {
                                }
                                if (!v71.b0.w(zVar)) {
                                }
                            }
                        }
                    case 1:
                        wVar = this.f25245x;
                        wVar2 = this.f25244w;
                        zVar = (v71.z) this.f25247z;
                        sy.y.j(obj);
                        l0Var = (l0) obj;
                        wVar.r = l0Var;
                        obj4 = wVar2.r;
                        if (obj4 instanceof j0) {
                        }
                        if (!v71.b0.w(zVar)) {
                        }
                        break;
                    case 2:
                        wVar3 = this.f25244w;
                        zVar2 = (v71.z) this.f25247z;
                        sy.y.j(obj);
                        y0Var = new y0(wVar3, z0Var, null);
                        this.f25247z = zVar2;
                        this.f25244w = wVar3;
                        this.f25246y = 3;
                        if (z0Var.V0(y0Var, this) == aVar2) {
                        }
                        zVar = zVar2;
                        obj3 = wVar3.r;
                        if (obj3 instanceof k0) {
                        }
                        if (!v71.b0.w(zVar)) {
                        }
                        break;
                    case 3:
                        wVar3 = this.f25244w;
                        zVar2 = (v71.z) this.f25247z;
                        try {
                            sy.y.j(obj);
                        } catch (CancellationException unused) {
                            zVar3 = zVar2;
                            this.f25247z = zVar3;
                            this.f25244w = null;
                            this.f25246y = 6;
                            if (z0.R0(z0Var, this) == aVar2) {
                            }
                            zVar = zVar3;
                            if (!v71.b0.w(zVar)) {
                            }
                        }
                        zVar = zVar2;
                        obj3 = wVar3.r;
                        if (obj3 instanceof k0) {
                        }
                        if (!v71.b0.w(zVar)) {
                        }
                        break;
                    case 4:
                        zVar3 = (v71.z) this.f25247z;
                        try {
                            sy.y.j(obj);
                        } catch (CancellationException unused2) {
                            this.f25247z = zVar3;
                            this.f25244w = null;
                            this.f25246y = 6;
                            if (z0.R0(z0Var, this) == aVar2) {
                                return aVar2;
                            }
                            zVar = zVar3;
                            if (!v71.b0.w(zVar)) {
                            }
                        }
                        zVar = zVar3;
                        if (!v71.b0.w(zVar)) {
                        }
                        break;
                    case 5:
                        zVar3 = (v71.z) this.f25247z;
                        sy.y.j(obj);
                        zVar = zVar3;
                        if (!v71.b0.w(zVar)) {
                        }
                        break;
                    case 6:
                        zVar3 = (v71.z) this.f25247z;
                        sy.y.j(obj);
                        zVar = zVar3;
                        if (!v71.b0.w(zVar)) {
                        }
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(k71.w wVar, z0 z0Var, a71.c cVar) {
        super(2, cVar);
        this.f25245x = wVar;
        this.A = z0Var;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class z0 {
        public z0() {
        }
    }
}

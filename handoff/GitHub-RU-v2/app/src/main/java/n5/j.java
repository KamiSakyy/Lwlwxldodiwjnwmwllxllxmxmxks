package n5;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e81.a f29539a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k71.s f29540b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k71.w f29541c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f29542d;

    public j(e81.a aVar, k71.s sVar, k71.w wVar, x xVar) {
        this.f29539a = aVar;
        this.f29540b = sVar;
        this.f29541c = wVar;
        this.f29542d = xVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ac, B:30:0x00b4), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d5, B:46:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:45:0x00d5, B:46:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v3, types: [j71.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(a0.i iVar, c71.c cVar) {
        i iVar2;
        int i;
        e81.a aVar;
        x xVar;
        k71.s sVar;
        k71.w wVar;
        e81.a aVar2;
        e81.a aVar3;
        x xVar2;
        Object obj;
        k71.w wVar2;
        try {
            if (cVar instanceof i) {
                iVar2 = (i) cVar;
                int i10 = iVar2.B;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    iVar2.B = i10 - Integer.MIN_VALUE;
                    Object obj2 = iVar2.f29537z;
                    b71.a aVar4 = b71.a.r;
                    i = iVar2.B;
                    if (i != 0) {
                        sy.y.j(obj2);
                        iVar2.f29532u = iVar;
                        aVar = this.f29539a;
                        iVar2.f29533v = aVar;
                        k71.s sVar2 = this.f29540b;
                        iVar2.f29534w = sVar2;
                        k71.w wVar3 = this.f29541c;
                        iVar2.f29535x = wVar3;
                        xVar = this.f29542d;
                        iVar2.f29536y = xVar;
                        iVar2.B = 1;
                        if (aVar.m(iVar2) != aVar4) {
                            sVar = sVar2;
                            wVar = wVar3;
                        }
                        return aVar4;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar2.f29534w;
                            wVar2 = (k71.w) iVar2.f29533v;
                            aVar2 = (e81.a) iVar2.f29532u;
                            try {
                                sy.y.j(obj2);
                                wVar2.r = obj;
                                wVar = wVar2;
                                Object obj3 = wVar.r;
                                aVar2.f((Object) null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                aVar2.f((Object) null);
                                throw th;
                            }
                        }
                        xVar2 = (x) iVar2.f29534w;
                        wVar = (k71.w) iVar2.f29533v;
                        aVar3 = (e81.a) iVar2.f29532u;
                        try {
                            sy.y.j(obj2);
                            if (!k71.k.b(obj2, wVar.r)) {
                                aVar2 = aVar3;
                                Object obj32 = wVar.r;
                                aVar2.f((Object) null);
                                return obj32;
                            }
                            iVar2.f29532u = aVar3;
                            iVar2.f29533v = wVar;
                            iVar2.f29534w = obj2;
                            iVar2.B = 3;
                            if (xVar2.j(obj2, false, iVar2) != aVar4) {
                                obj = obj2;
                                wVar2 = wVar;
                                aVar2 = aVar3;
                                wVar2.r = obj;
                                wVar = wVar2;
                                Object obj322 = wVar.r;
                                aVar2.f((Object) null);
                                return obj322;
                            }
                            return aVar4;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2 = aVar3;
                            aVar2.f((Object) null);
                            throw th;
                        }
                    }
                    x xVar3 = iVar2.f29536y;
                    wVar = iVar2.f29535x;
                    sVar = (k71.s) iVar2.f29534w;
                    e81.a aVar5 = (e81.a) iVar2.f29533v;
                    Object r82 = (j71.e) iVar2.f29532u;
                    sy.y.j(obj2);
                    xVar = xVar3;
                    iVar = r82;
                    aVar = aVar5;
                    if (!sVar.r) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = wVar.r;
                    iVar2.f29532u = aVar;
                    iVar2.f29533v = wVar;
                    iVar2.f29534w = xVar;
                    iVar2.f29535x = null;
                    iVar2.f29536y = null;
                    iVar2.B = 2;
                    Object s2 = iVar.s(obj4, iVar2);
                    if (s2 != aVar4) {
                        aVar3 = aVar;
                        obj2 = s2;
                        xVar2 = xVar;
                        if (!k71.k.b(obj2, wVar.r)) {
                        }
                    }
                    return aVar4;
                }
            }
            if (!sVar.r) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.f((Object) null);
            throw th;
        }
        iVar2 = new i(this, cVar);
        Object obj22 = iVar2.f29537z;
        b71.a aVar42 = b71.a.r;
        i = iVar2.B;
        if (i != 0) {
        }
    }
}

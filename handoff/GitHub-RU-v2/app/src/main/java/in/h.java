package in;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h extends c71.j implements j71.g {
    public final /* synthetic */ int v = 0;
    public int w;
    public /* synthetic */ Throwable x;
    public /* synthetic */ long y;
    public final /* synthetic */ w61.e z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j71.c cVar, a71.c cVar2) {
        super(4, cVar2);
        this.z = cVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        Throwable th2 = (Throwable) obj2;
        Number number = (Number) obj3;
        switch (this.v) {
            case 0:
                long longValue = number.longValue();
                h hVar = new h(this.z, (a71.c) obj4);
                hVar.x = th2;
                hVar.y = longValue;
                return hVar.v(w61.a0.a);
            default:
                long longValue2 = number.longValue();
                h hVar2 = new h((j71.e) this.z, (a71.c) obj4);
                hVar2.x = th2;
                hVar2.y = longValue2;
                return hVar2.v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (((java.lang.Boolean) r9).booleanValue() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                Throwable th2 = this.x;
                long j = this.y;
                b71.a aVar = b71.a.r;
                int i = this.w;
                boolean z = true;
                if (i == 0) {
                    sy.y.j(obj);
                    if (!((Boolean) this.z.k(th2)).booleanValue() || j >= 3) {
                        z = false;
                    } else {
                        this.x = null;
                        this.y = j;
                        this.w = 1;
                        if (v71.b0.l(100 * j, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return Boolean.valueOf(z);
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                boolean z2 = true;
                if (i2 == 0) {
                    sy.y.j(obj);
                    Throwable th3 = this.x;
                    if (this.y < 1) {
                        c71.j jVar = this.z;
                        this.w = 1;
                        obj = jVar.s(th3, this);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    z2 = false;
                    return Boolean.valueOf(z2);
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j71.e eVar, a71.c cVar) {
        super(4, cVar);
        this.z = (c71.j) eVar;
    }
}

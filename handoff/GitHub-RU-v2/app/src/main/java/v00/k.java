package v00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ m x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = mVar;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new k(this.x, cVar, 0).v(w61.a0.a);
            default:
                return new k(this.x, cVar, 1).v(w61.a0.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
    
        if (r5 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        if (r5 == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    m mVar = this.x;
                    obj = mVar.t.a(mVar.s, mp.a.class, this);
                    break;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                Object a = ((mp.a) obj).a(this);
                if (a != aVar) {
                    return a;
                }
                return aVar;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    m mVar2 = this.x;
                    obj = mVar2.t.a(mVar2.s, mp.a.class, this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return obj;
                    }
                    sy.y.j(obj);
                }
                this.w = 2;
                Object c = ((mp.a) obj).c(this);
                if (c != aVar2) {
                    return c;
                }
                return aVar2;
        }
    }
}

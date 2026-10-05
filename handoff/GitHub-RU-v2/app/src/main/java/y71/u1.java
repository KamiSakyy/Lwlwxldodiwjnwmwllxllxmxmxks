package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u1 extends c71.j implements j71.f {
    public int v;
    public /* synthetic */ j w;
    public /* synthetic */ int x;
    public final /* synthetic */ v1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, a71.c cVar) {
        super(3, cVar);
        this.y = v1Var;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        u1 u1Var = new u1(this.y, (a71.c) obj3);
        u1Var.w = (j) obj;
        u1Var.x = intValue;
        return u1Var.v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007f, code lost:
    
        if (r1.c(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (v71.b0.l(Long.MAX_VALUE, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        if (r1.c(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        if (r1.c(r9, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (v71.b0.l(r6, r8) == r0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        j jVar;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            jVar = this.w;
            if (this.x > 0) {
                p1 p1Var = p1.r;
                this.v = 1;
            } else {
                long j = this.y.a;
                this.w = jVar;
                this.v = 2;
            }
            return aVar;
        }
        if (i != 1) {
            if (i == 2) {
                jVar = this.w;
                sy.y.j(obj);
                p1 p1Var2 = p1.s;
                this.w = jVar;
                this.v = 3;
            } else if (i == 3) {
                jVar = this.w;
                sy.y.j(obj);
                this.w = jVar;
                this.v = 4;
            } else if (i == 4) {
                jVar = this.w;
                sy.y.j(obj);
                p1 p1Var3 = p1.t;
                this.w = null;
                this.v = 5;
            } else if (i != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        sy.y.j(obj);
        return w61.a0.a;
    }
}

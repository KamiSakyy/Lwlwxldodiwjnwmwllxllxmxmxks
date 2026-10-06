package com.github.rudroid.twofactor;

@c71.e(c = "com.github.rudroid.twofactor.TwoFactorApproveDenyViewModel$rejectRequest$1", f = "TwoFactorApproveDenyViewModel.kt", l = {147, 155}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ h w;
    public final /* synthetic */ fn.a x;
    public final /* synthetic */ b y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h hVar, fn.a aVar, b bVar, a71.c cVar) {
        super(2, cVar);
        this.w = hVar;
        this.x = aVar;
        this.y = bVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r3.b(r10, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r10 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        b bVar = this.y;
        h hVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            dn.j0 j0Var = hVar.u;
            fn.a aVar2 = this.x;
            oa.j jVar = aVar2.a;
            int i2 = aVar2.b.r;
            i iVar = new i(hVar, bVar, 2);
            this.v = 1;
            obj = j0Var.a(jVar, i2, iVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        y71.y yVar = new y71.y(new q(hVar, bVar, null), (y71.i) obj);
        r rVar = new r(hVar, bVar);
        this.v = 2;
    }
    public Object A() { return null; }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object X() { return null; }
    public Object c0(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object r() { return null; }
    public Object t() { return null; }
    public Object S(int p1, boolean p2) { return null; }
    public Object c0(int p1) { return null; }
    public Object e0(int p1) { return null; }
    public Object q(boolean p1) { return null; }
}

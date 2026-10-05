package com.github.rudroid.searchandfilter.complexfilter;

import t00.f8;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.BaseLocalSearchViewModel$loadPages$$inlined$flatMapLatest$1", f = "BaseLocalSearchViewModel.kt", l = {191, 189}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends c71.j implements j71.f {
    public final /* synthetic */ j71.c A;
    public y71.j B;
    public w61.k C;
    public int v;
    public /* synthetic */ y71.j w;
    public /* synthetic */ Object x;
    public final /* synthetic */ b y;
    public final /* synthetic */ oa.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a71.c cVar, b bVar, oa.j jVar, j71.c cVar2) {
        super(3, cVar);
        this.y = bVar;
        this.z = jVar;
        this.A = cVar2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        e eVar = new e((a71.c) obj3, this.y, this.z, this.A);
        eVar.w = (y71.j) obj;
        eVar.x = obj2;
        return eVar.v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        if (y71.n1.q(r10, r5, r9) != r0) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        y71.j jVar;
        w61.k kVar;
        y71.i f8Var;
        y71.j jVar2;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            jVar = this.w;
            kVar = (w61.k) this.x;
            if (((x01.i) kVar.s).a()) {
                String str = ((x01.i) kVar.s).b;
                this.w = null;
                this.x = null;
                this.B = jVar;
                this.C = kVar;
                this.v = 1;
                Object P = b.P(this.y, this.z, str, this.A, this);
                if (P != aVar) {
                    jVar2 = jVar;
                    obj = P;
                }
                return aVar;
            }
            f8Var = new f8(21, kVar);
            this.w = null;
            this.x = null;
            this.B = null;
            this.C = null;
            this.v = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return w61.a0.a;
            }
            kVar = this.C;
            jVar2 = this.B;
            sy.y.j(obj);
        }
        f8Var = new i((y71.i) obj, kVar);
        jVar = jVar2;
        this.w = null;
        this.x = null;
        this.B = null;
        this.C = null;
        this.v = 2;
    }
}

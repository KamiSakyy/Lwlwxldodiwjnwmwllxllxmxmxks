package com.github.rudroid.viewmodels;

@c71.e(c = "com.github.rudroid.viewmodels.UsersViewModel$loadNextPage$1", f = "UsersViewModel.kt", l = {109, 113}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class eb extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ za w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(za zaVar, a71.c cVar) {
        super(2, cVar);
        this.w = zaVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new eb(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        if (r3.b(r8, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        if (r8 == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        za zaVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            gn.n nVar = zaVar.u;
            String str = zaVar.x.b;
            ya yaVar = new ya(zaVar, 3);
            this.v = 1;
            obj = zaVar.P(nVar, str, yaVar, this);
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
        y71.y yVar = new y71.y(new cb(zaVar, null), (y71.i) obj);
        db dbVar = new db(zaVar);
        this.v = 2;
    }
}

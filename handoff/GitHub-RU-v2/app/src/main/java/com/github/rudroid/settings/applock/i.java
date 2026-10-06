package com.github.rudroid.settings.applock;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockAuthenticationStore$onAppUnlock$2", f = "AppLockAuthenticationStore.kt", l = {75, 76}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ k w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, a71.c cVar) {
        super(2, cVar);
        this.w = kVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (r6.a(false, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r6.a(null, r5) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        k kVar = this.w;
        if (i == 0) {
            sy.y.j(obj);
            com.github.rudroid.settings.applock.usecases.m mVar = kVar.b;
            this.v = 1;
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
        com.github.rudroid.settings.applock.usecases.g gVar = kVar.c;
        this.v = 2;
    }
    public Object d(Object p1, Object p2, Object p3) { return null; }
    public Object H() { return null; }
    public Object K0() { return null; }
    public Object f0() { return null; }
    public Object g0() { return null; }
    public Object getMainLooper() { return null; }
    public Object onCreate(Object p1) { return null; }
    public Object onDestroy() { return null; }
}

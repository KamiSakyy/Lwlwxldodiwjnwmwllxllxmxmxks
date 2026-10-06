package com.github.rudroid.settings.codeoptions;

@c71.e(c = "com.github.rudroid.settings.codeoptions.CodeOptionsDataStorePreferences$updateOption$2", f = "CodeOptionsDataStorePreferences.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ s5.e w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a71.c cVar, Object obj, s5.e eVar) {
        super(2, cVar);
        this.w = eVar;
        this.x = obj;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        q qVar = new q(cVar, this.x, this.w);
        qVar.v = obj;
        return qVar;
    }

    public final Object s(Object obj, Object obj2) {
        q r = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        bVar.f(this.w, this.x);
        return w61.a0.a;
    }
    public static Object b(Object p1, Object p2, Object p3) { return null; }
    public Object a(Object p1, Object p2, Object p3, Object p4, int p5) { return null; }
}

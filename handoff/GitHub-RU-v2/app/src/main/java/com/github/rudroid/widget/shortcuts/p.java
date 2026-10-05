package com.github.rudroid.widget.shortcuts;

@c71.e(c = "com.github.rudroid.widget.shortcuts.ShortcutPreferences$setData$2", f = "ShortcutPreferences.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class p extends c71.j implements j71.e {
    public final /* synthetic */ float A;
    public /* synthetic */ Object v;
    public final /* synthetic */ g w;
    public final /* synthetic */ z5.k x;
    public final /* synthetic */ oa.j y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g gVar, z5.k kVar, oa.j jVar, String str, float f, a71.c cVar) {
        super(2, cVar);
        this.w = gVar;
        this.x = kVar;
        this.y = jVar;
        this.z = str;
        this.A = f;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        p pVar = new p(this.w, this.x, this.y, this.z, this.A, cVar);
        pVar.v = obj;
        return pVar;
    }

    public final Object s(Object obj, Object obj2) {
        p r = r((a71.c) obj2, (s5.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        z5.k kVar = this.x;
        s5.e Q = b91.g.Q(g.c(kVar));
        String str = this.y.a;
        bVar.getClass();
        bVar.g(Q, str);
        bVar.g(b91.g.Q(g.b(kVar)), this.z);
        bVar.g(b91.g.q("preference_key_selected_shortcut_opacity" + kVar), new Float(this.A));
        return w61.a0.a;
    }
}

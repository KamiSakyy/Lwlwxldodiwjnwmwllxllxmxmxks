package com.github.rudroid.repository;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class s implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f20244r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f20245s;

    public /* synthetic */ s(int i, Object obj) {
        this.f20244r = i;
        this.f20245s = obj;
    }

    public final Object k(Object obj) {
        switch (this.f20244r) {
            case k5.f.J:
                v vVar = (v) this.f20245s;
                y71.y1 y1Var = vVar.f20299w;
                fl.e eVar = fl.f.Companion;
                Object obj2 = ((fl.f) vVar.f20300x.r.getValue()).b;
                eVar.getClass();
                fl.f a10 = fl.e.a((fl.b) obj, obj2);
                y1Var.getClass();
                y1Var.k((Object) null, a10);
                break;
            default:
                j71.c cVar = (j71.c) this.f20245s;
                String str = (String) obj;
                k71.k.g(str, "textFieldValue");
                cVar.k(str);
                break;
        }
        return w61.a0.a;
    }
}

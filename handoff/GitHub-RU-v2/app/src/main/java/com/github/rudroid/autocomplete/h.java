package com.github.rudroid.autocomplete;

import w61.a0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class h implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8633r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f8634s;

    public /* synthetic */ h(c cVar, int i) {
        this.f8633r = i;
        this.f8634s = cVar;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f8633r) {
            case k5.f.J:
                c cVar = this.f8634s;
                y1 y1Var = cVar.f8625x;
                fl.e eVar = fl.f.Companion;
                Object obj2 = ((fl.f) cVar.f8626y.r.getValue()).b;
                eVar.getClass();
                fl.f a10 = fl.e.a(bVar, obj2);
                y1Var.getClass();
                y1Var.k((Object) null, a10);
                break;
            default:
                c cVar2 = this.f8634s;
                y1 y1Var2 = cVar2.f8625x;
                fl.e eVar2 = fl.f.Companion;
                Object obj3 = ((fl.f) cVar2.f8626y.r.getValue()).b;
                eVar2.getClass();
                fl.f a11 = fl.e.a(bVar, obj3);
                y1Var2.getClass();
                y1Var2.k((Object) null, a11);
                break;
        }
        return a0.a;
    }
}

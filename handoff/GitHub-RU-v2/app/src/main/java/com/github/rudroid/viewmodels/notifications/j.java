package com.github.rudroid.viewmodels.notifications;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class j implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ s s;
    public final /* synthetic */ String t;

    public /* synthetic */ j(s sVar, String str, int i) {
        this.r = i;
        this.s = sVar;
        this.t = str;
    }

    public final Object k(Object obj) {
        j71.c cVar = (j71.c) obj;
        switch (this.r) {
            case 0:
                k71.k.g(cVar, "onError");
                return this.s.f0(cVar, this.t);
            case 1:
                k71.k.g(cVar, "onError");
                return this.s.Y(cVar, this.t);
            case 2:
                k71.k.g(cVar, "onError");
                return this.s.c0(cVar, this.t);
            case 3:
                k71.k.g(cVar, "onError");
                return this.s.a0(cVar, this.t);
            case 4:
                k71.k.g(cVar, "onError");
                return this.s.d0(cVar, this.t);
            default:
                k71.k.g(cVar, "onError");
                return this.s.h0(cVar, this.t);
        }
    }
    public Object f(Object p1) { return null; }
    public Object f(Object p1, Object p2, Object p3) { return null; }
    public Object ordinal() { return null; }
    public Object f(Object, Object, Object) { return null; }
}

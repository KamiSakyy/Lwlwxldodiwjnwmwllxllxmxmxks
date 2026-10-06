package com.github.rudroid.feed;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class u implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12711r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f12712s;

    public /* synthetic */ u(r0 r0Var, int i) {
        this.f12711r = i;
        this.f12712s = r0Var;
    }

    public final Object k(Object obj) {
        fl.b bVar = (fl.b) obj;
        switch (this.f12711r) {
            case k5.f.J /* 0 */:
                k71.k.g(bVar, "failure");
                r0 r0Var_r7 = this.f12712s;
                com.github.rudroid.utilities.w0.m(r0Var_r7.B, bVar);
                r0Var_r7.f12690s.a(bVar);
                break;
            case 1:
                k71.k.g(bVar, "executionError");
                this.f12712s.f12690s.a(bVar);
                break;
            default:
                k71.k.g(bVar, "executionError");
                this.f12712s.f12690s.a(bVar);
                break;
        }
        return w61.a0.a;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r0 {
        public r0() {
        }
    }
}

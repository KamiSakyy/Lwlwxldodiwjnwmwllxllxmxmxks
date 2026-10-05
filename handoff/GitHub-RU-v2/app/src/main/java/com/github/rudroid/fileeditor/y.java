package com.github.rudroid.fileeditor;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.w0;
import y71.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class y implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12999r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b0 f13000s;

    public /* synthetic */ y(b0 b0Var, int i) {
        this.f12999r = i;
        this.f13000s = b0Var;
    }

    public final Object k(Object obj) {
        switch (this.f12999r) {
            case k5.f.J:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "it");
                w0.m(this.f13000s.K, bVar);
                return w61.a0.a;
            case 1:
                fl.b bVar2 = (fl.b) obj;
                k71.k.g(bVar2, "it");
                w0.m(this.f13000s.K, bVar2);
                return w61.a0.a;
            case 2:
                fl.b bVar3 = (fl.b) obj;
                k71.k.g(bVar3, "it");
                b0 b0Var = this.f13000s;
                y1 y1Var = b0Var.K;
                x xVar = (x) ((g1) y1Var.getValue()).getData();
                if (xVar == null) {
                    xVar = new x(null, 255, null);
                }
                w0.p(y1Var, xVar);
                b0Var.f12893s.a(bVar3);
                return w61.a0.a;
            case 3:
                fl.b bVar4 = (fl.b) obj;
                k71.k.g(bVar4, "it");
                b0 b0Var2 = this.f13000s;
                y1 y1Var2 = b0Var2.K;
                x xVar2 = (x) ((g1) y1Var2.getValue()).getData();
                if (xVar2 == null) {
                    xVar2 = new x(null, 255, null);
                }
                w0.p(y1Var2, xVar2);
                b0Var2.f12893s.a(bVar4);
                return w61.a0.a;
            case 4:
                fl.b bVar5 = (fl.b) obj;
                k71.k.g(bVar5, "it");
                w0.m(this.f13000s.K, bVar5);
                return w61.a0.a;
            case 5:
                g1 g1Var = (g1) obj;
                k71.k.g(g1Var, "model");
                return h1.h(g1Var, new y(this.f13000s, 7));
            case 6:
                fl.b bVar6 = (fl.b) obj;
                k71.k.g(bVar6, "it");
                w0.m(this.f13000s.K, bVar6);
                return w61.a0.a;
            default:
                x xVar3 = (x) obj;
                k71.k.g(xVar3, "it");
                return x.a(xVar3, null, !k71.k.b(xVar3.f12991a, this.f13000s.I), false, null, null, null, null, null, 253);
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b0<T1,T2,T3,T4> {
        public b0() {
        }
    }
}

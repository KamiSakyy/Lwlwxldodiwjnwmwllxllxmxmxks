package com.github.rudroid.projects;

import android.app.Application;
import com.github.rudroid.projects.l0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class t implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17814r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f17815s;

    public /* synthetic */ t(d0 d0Var, int i) {
        this.f17814r = i;
        this.f17815s = d0Var;
    }

    public final Object k(Object obj) {
        switch (this.f17814r) {
            case k5.f.J:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                k71.k.g(g1Var, "model");
                return com.github.rudroid.utilities.ui.h1.h(g1Var, new t(this.f17815s, 2));
            case 1:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "failure");
                fl.a aVar = fl.b.Companion;
                d0 d0Var = this.f17815s;
                String str = d0Var.f17676z;
                aVar.getClass();
                fl.b a10 = fl.a.a(bVar, str, (String) null, (String) null);
                com.github.rudroid.utilities.w0.m(d0Var.C, a10);
                d0Var.f17670t.a(a10);
                return w61.a0.a;
            default:
                l01.x0 x0Var = (l01.x0) obj;
                k71.k.g(x0Var, "it");
                d0 d0Var2 = this.f17815s;
                l0 l0Var = d0Var2.f17675y;
                Application P = d0Var2.P();
                ArrayList arrayList = x0Var.a;
                l0.a aVar2 = l0.a.f17736r;
                l0Var.getClass();
                return l0.a(P, arrayList, aVar2);
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d0<T1,T2,T3,T4> {
        public d0() {
        }
    }
}

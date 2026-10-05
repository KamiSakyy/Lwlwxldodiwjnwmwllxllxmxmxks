package com.github.rudroid.projects;

import android.app.Application;
import com.github.rudroid.projects.l0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b1 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17652r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c1 f17653s;

    public /* synthetic */ b1(c1 c1Var, int i) {
        this.f17652r = i;
        this.f17653s = c1Var;
    }

    public final Object k(Object obj) {
        switch (this.f17652r) {
            case k5.f.J:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                k71.k.g(g1Var, "model");
                return com.github.rudroid.utilities.ui.h1.h(g1Var, new b1(this.f17653s, 2));
            case 1:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "failure");
                c1 c1Var = this.f17653s;
                com.github.rudroid.utilities.w0.m(c1Var.D, bVar);
                c1Var.f17660t.a(bVar);
                return w61.a0.a;
            default:
                l01.x0 x0Var = (l01.x0) obj;
                k71.k.g(x0Var, "it");
                c1 c1Var2 = this.f17653s;
                l0 l0Var = c1Var2.f17665y;
                Application P = c1Var2.P();
                ArrayList arrayList = x0Var.a;
                l0.a aVar = l0.a.f17737s;
                l0Var.getClass();
                return l0.a(P, arrayList, aVar);
        }
    }
}

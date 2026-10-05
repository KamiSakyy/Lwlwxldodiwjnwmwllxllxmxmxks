package com.github.rudroid.projects;

import android.app.Application;
import com.github.rudroid.projects.l0;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class p2 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f17779r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q2 f17780s;

    public /* synthetic */ p2(q2 q2Var, int i) {
        this.f17779r = i;
        this.f17780s = q2Var;
    }

    public final Object k(Object obj) {
        switch (this.f17779r) {
            case k5.f.J:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                k71.k.g(g1Var, "model");
                return com.github.rudroid.utilities.ui.h1.h(g1Var, new p2(this.f17780s, 2));
            case 1:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "failure");
                q2 q2Var = this.f17780s;
                com.github.rudroid.utilities.w0.m(q2Var.f17792z, bVar);
                q2Var.f17786t.a(bVar);
                return w61.a0.a;
            default:
                l01.x0 x0Var = (l01.x0) obj;
                k71.k.g(x0Var, "it");
                q2 q2Var2 = this.f17780s;
                l0 l0Var = q2Var2.f17791y;
                Application P = q2Var2.P();
                ArrayList arrayList = x0Var.a;
                l0.a aVar = l0.a.f17738t;
                l0Var.getClass();
                return l0.a(P, arrayList, aVar);
        }
    }
}

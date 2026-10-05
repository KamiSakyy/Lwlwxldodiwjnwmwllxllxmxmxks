package com.github.rudroid.feed.awesometopics;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class u implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12551r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k0 f12552s;

    public /* synthetic */ u(k0 k0Var, int i) {
        this.f12551r = i;
        this.f12552s = k0Var;
    }

    public final Object k(Object obj) {
        switch (this.f12551r) {
            case k5.f.J:
                g1 g1Var = (g1) obj;
                k71.k.g(g1Var, "stateEvent");
                return h1.h(g1Var, new u(this.f12552s, 2));
            case 1:
                fl.b bVar = (fl.b) obj;
                k71.k.g(bVar, "failure");
                com.github.rudroid.utilities.w0.m(this.f12552s.A, bVar);
                return w61.a0.a;
            default:
                d01.a aVar = (d01.a) obj;
                k71.k.g(aVar, "it");
                com.github.rudroid.explore.d dVar = this.f12552s.f12510x;
                ArrayList arrayList = aVar.a;
                com.github.rudroid.explore.f fVar = com.github.rudroid.explore.f.f12201r;
                dVar.getClass();
                return com.github.rudroid.explore.d.a(arrayList, false, fVar, null);
        }
    }
}

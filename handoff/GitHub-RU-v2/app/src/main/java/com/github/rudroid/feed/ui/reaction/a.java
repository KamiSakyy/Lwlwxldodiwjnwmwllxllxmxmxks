package com.github.rudroid.feed.ui.reaction;

import com.github.rudroid.uitoolkit.s2;
import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class a implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f12805r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f12806s;

    public /* synthetic */ a(d dVar, int i) {
        this.f12805r = i;
        this.f12806s = dVar;
    }

    public final Object k(Object obj) {
        switch (this.f12805r) {
            case k5.f.J:
                fl.b bVar = (fl.b) obj;
                k.g(bVar, "executionError");
                this.f12806s.f12813s.a(bVar);
                break;
            case 1:
                fl.b bVar2 = (fl.b) obj;
                k.g(bVar2, "executionError");
                this.f12806s.f12813s.a(bVar2);
                break;
            default:
                s2 s2Var = (s2) obj;
                k.g(s2Var, "it");
                boolean z10 = s2Var.e;
                d dVar = this.f12806s;
                if (z10) {
                    dVar.Q(j.a(s2Var));
                } else {
                    dVar.P(j.a(s2Var));
                }
                return a0.a;
        }
        return a0.a;
    }
}

package com.github.rudroid.advancedsearch;

import com.github.rudroid.advancedsearch.n;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class m implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6288r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f6289s;

    public /* synthetic */ m(n nVar, int i) {
        this.f6288r = i;
        this.f6289s = nVar;
    }

    public final Object k(Object obj) {
        int i = this.f6288r;
        w61.a0 a0Var = w61.a0.a;
        n nVar = this.f6289s;
        switch (i) {
            case k5.f.J:
                g1 g1Var = (g1) obj;
                n.a aVar = n.Companion;
                k71.k.g(g1Var, "stateEvent");
                break;
            case 1:
                xz0.g gVar = (xz0.g) obj;
                n.a aVar2 = n.Companion;
                k71.k.g(gVar, "searchIssueOrPullRequestsPaged");
                e0 e0Var = nVar.f6294w;
                String Q = nVar.Q();
                e0Var.getClass();
                break;
            case 2:
                w0.m(nVar.f6297z, (fl.b) obj);
                break;
            case 3:
                w0.m(nVar.f6297z, (fl.b) obj);
                break;
            default:
                w0.m(nVar.f6297z, (fl.b) obj);
                break;
        }
        return a0Var;
    }

}

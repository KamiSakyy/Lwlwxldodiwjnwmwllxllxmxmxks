package com.github.rudroid.agents.viewmodel;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.w0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class a implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f8347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f8348s;

    public /* synthetic */ a(p pVar, int i) {
        this.f8347r = i;
        this.f8348s = pVar;
    }

    public final Object k(Object obj) {
        int i = this.f8347r;
        w61.a0 a0Var = w61.a0.a;
        p pVar = this.f8348s;
        switch (i) {
            case k5.f.J:
                g1 g1Var = (g1) obj;
                r71.e[] eVarArr = p.J;
                k71.k.g(g1Var, "stateEvent");
                break;
            case 1:
                xz0.g gVar = (xz0.g) obj;
                r71.e[] eVarArr2 = p.J;
                k71.k.g(gVar, "searchIssueOrPullRequestsPaged");
                com.github.rudroid.advancedsearch.e0 e0Var = pVar.f8395w;
                String Q = pVar.Q();
                e0Var.getClass();
                break;
            case 2:
                w0.m(pVar.F, (fl.b) obj);
                break;
            case 3:
                w0.m(pVar.F, (fl.b) obj);
                break;
            default:
                w0.m(pVar.F, (fl.b) obj);
                break;
        }
        return a0Var;
    }







}

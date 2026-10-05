package com.github.rudroid.starredreposandlists.listdetails;

import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ g(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                ListDetailFragment listDetailFragment = (ListDetailFragment) this.s;
                xz0.h hVar = (xz0.h) obj;
                k71.k.g(hVar, "newListData");
                listDetailFragment.E4(hVar);
                listDetailFragment.D4(hVar);
                return w61.a0.a;
            default:
                y1 y1Var = (y1) this.s;
                fl.f.Companion.getClass();
                w61.a0 a0Var = w61.a0.a;
                y1Var.k((Object) null, fl.e.a((fl.b) obj, a0Var));
                return a0Var;
        }
    }







}

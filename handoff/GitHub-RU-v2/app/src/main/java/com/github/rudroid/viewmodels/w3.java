package com.github.rudroid.viewmodels;

import com.github.rudroid.home.search.navigation.SearchResultsRoute;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w3 extends androidx.lifecycle.k1 implements x3 {
    public String s;
    public String t;

    public w3(androidx.lifecycle.a1 a1Var) {
        k71.k.g(a1Var, "savedStateHandle");
        SearchResultsRoute searchResultsRoute = (SearchResultsRoute) sy.y.m(a1Var, k71.xShadow.a(SearchResultsRoute.class), x61.s.r);
        this.s = searchResultsRoute.s;
        this.t = searchResultsRoute.t;
    }

    public abstract androidx.lifecycle.l0 P();

    public abstract void Q();

    @Override // com.github.rudroid.viewmodels.x3
    public final fl.g s() {
        fl.g gVar;
        fl.f fVar = (fl.f) P().d();
        return (fVar == null || (gVar = fVar.a) == null) ? fl.g.r : gVar;
    }

    public Object s;

    public Object t;
}

package com.github.rudroid.home.inappupdate;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static final hd.a a(int i) {
        if (i == 11) {
            return hd.a.f25589u;
        }
        switch (i) {
            case k5.f.J /* 0 */:
                return hd.a.f25586r;
            case 1:
                return hd.a.f25587s;
            case 2:
                return hd.a.f25588t;
            case 3:
                return hd.a.f25590v;
            case 4:
                return hd.a.f25591w;
            case 5:
                return hd.a.f25592x;
            case 6:
                return hd.a.f25593y;
            default:
                return hd.a.f25586r;
        }
    }

    public static final hd.a b(f41.j jVar) {
        k71.k.g(jVar, "<this>");
        if (jVar instanceof f41.f) {
            return hd.a.f25587s;
        }
        if (jVar instanceof f41.i) {
            return hd.a.f25586r;
        }
        if (jVar instanceof f41.h) {
            return a(((f41.h) jVar).a.a);
        }
        if (jVar instanceof f41.g) {
            return hd.a.f25589u;
        }
        throw new NoWhenBranchMatchedException();
    }
}

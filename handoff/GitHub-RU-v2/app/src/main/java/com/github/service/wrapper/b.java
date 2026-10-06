package com.github.service.wrapper;

import aa.h0;
import aa.i0;
import aa.m0;
import aa.n0;
import aa.r0;
import aa.s0;
import aa.w0;
import in.r;
import java.util.LinkedHashSet;
import java.util.Set;
import k71.k;
import t00.f8;

/* loaded from: /home/user/work/p/classes4.dex */
public interface b extends a {
    static y71.i a(b bVar, w0 w0Var, ga.h hVar, boolean z, LinkedHashSet linkedHashSet, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = r.a;
        }
        return bVar.m(w0Var, hVar, z2, set, r.b, new com.github.rudroid.utilities.ui.emojipicker.e(15));
    }

    static f8 n(b bVar, i0 i0Var, String str) {
        bVar.getClass();
        k.g(str, "id");
        return new f8(new an.b(bVar, i0Var, str, (a71.c) null));
    }

    static y71.i q(b bVar, w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, j71.e eVar, j71.c cVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            set = r.a;
        }
        Set set3 = set;
        if ((i & 16) != 0) {
            set2 = r.b;
        }
        Set set4 = set2;
        if ((i & 32) != 0) {
            eVar = new com.github.rudroid.widget.contribution.a(4);
        }
        return bVar.i(w0Var, hVar, z2, set3, set4, eVar, cVar);
    }

    Object c(i0 i0Var, String str);

    y71.i e(n0 n0Var, i0 i0Var, String str, j71.c cVar);

    Object f(s0 s0Var);

    Object h(String str, Set set, a71.c cVar);

    y71.i i(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, j71.e eVar, j71.c cVar);

    Object j(s0 s0Var, r0 r0Var, a71.c cVar);

    y71.i k(n0 n0Var, m0 m0Var);

    y71.i m(w0 w0Var, ga.h hVar, boolean z, Set set, Set set2, com.github.rudroid.utilities.ui.emojipicker.e eVar);

    Object p(i0 i0Var, h0 h0Var, String str, a71.c cVar);
    public Object b(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6, Object p7, Object p8, Object p9) { return null; }
    public Object t(Object p1, Object p2) { return null; }
    public Object b(Object p1, Object p2, Object p3, boolean p4, Object p5, Object p6, Object p7, Object p8, int p9) { return null; }
    public Object t(Object p1, Object p2) { return null; }
    public Object u(Object p1, Object p2, Object p3, Object p4) { return null; }
}

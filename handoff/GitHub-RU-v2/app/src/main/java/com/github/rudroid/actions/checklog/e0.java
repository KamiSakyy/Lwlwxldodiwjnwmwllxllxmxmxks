package com.github.rudroid.actions.checklog;

import com.github.rudroid.common.f;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@c71.e(c = "com.github.rudroid.actions.checklog.CheckLogViewModel$groupedLogLines$1", f = "CheckLogViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class e0 extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ fl.f f4804v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Set f4805w;

    public final Object f(Object obj, Object obj2, Object obj3) {
        e0 e0Var = new e0(3, (a71.c) obj3);
        e0Var.f4804v = (fl.f) obj;
        e0Var.f4805w = (Set) obj2;
        return e0Var.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        fl.f fVar = this.f4804v;
        final Set set = this.f4805w;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        final int i = 0;
        return i21.a.A(fVar, new j71.c() { // from class: com.github.rudroid.actions.checklog.d0
            public final Object k(Object obj2) {
                Iterable n10;
                switch (i) {
                    case k5.f.J /* 0 */:
                        ArrayList arrayList = new ArrayList();
                        for (q0 q0Var : (List) obj2) {
                            if (q0Var instanceof s0) {
                                s0 s0Var = (s0) q0Var;
                                List list = s0Var.f4873x;
                                if (set.contains(Integer.valueOf(s0Var.f4872w))) {
                                    String str = s0Var.f4867r;
                                    List list2 = s0Var.f4868s;
                                    pi.l lVar = s0Var.f4869t;
                                    ZonedDateTime zonedDateTime = s0Var.f4870u;
                                    int i10 = s0Var.f4871v;
                                    int i11 = s0Var.f4872w;
                                    k71.k.g(list2, "formatting");
                                    n10 = x61.m.l0(sy.d0.n(new s0(str, list2, lVar, zonedDateTime, i10, i11, list, true)), list);
                                    x61.m.J(arrayList, n10);
                                }
                            }
                            n10 = sy.d0.n(q0Var);
                            x61.m.J(arrayList, n10);
                        }
                        return arrayList;
                    default:
                        int intValue = ((Integer) obj2).intValue();
                        com.github.rudroid.common.f.Companion.getClass();
                        return Boolean.valueOf(set.contains(f.a.a(intValue)));
                }
            }
        });
    }
}

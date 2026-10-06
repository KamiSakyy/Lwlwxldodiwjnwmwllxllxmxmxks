package com.github.rudroid.widget.agenttasks.model;

import w61.a0;
import z01.h0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final b Companion = new b();
    public al.c a;
    public al.a b;
    public al.d c;
    public qj.a d;

    public interface a {
        c d();
    }

    public static final class b {
    }

    public c(al.c cVar, al.a aVar, al.d dVar, qj.a aVar2) {
        k71.k.g(cVar, "observerUseCase");
        k71.k.g(aVar, "fetchUseCase");
        k71.k.g(dVar, "refreshUseCase");
        k71.k.g(aVar2, "cachedForUserDatabase");
        this.a = cVar;
        this.b = aVar;
        this.c = dVar;
        this.d = aVar2;
    }

    public static String a(oa.j jVar) {
        return f1.e.z("author:@copilot assignee:", jVar.c, " archived:false");
    }

    public final Object b(oa.j jVar, c71.c cVar) {
        String str = jVar.b;
        a0 a0Var = a0.a;
        if (str == null) {
            String a2 = a(jVar);
            com.github.rudroid.utilities.ui.emojipicker.e eVar = new com.github.rudroid.utilities.ui.emojipicker.e(8);
            al.a aVar = this.b;
            aVar.getClass();
            k71.k.g(a2, "query");
            Object b2 = b31.b.J(((h0) aVar.a.a(jVar)).f(a2), jVar, eVar).b(new n(this, jVar), cVar);
            b71.a aVar2 = b71.a.r;
            if (b2 != aVar2) {
                b2 = a0Var;
            }
            if (b2 == aVar2) {
                return b2;
            }
        } else {
            Object b3 = this.c.a(jVar, a(jVar), new com.github.rudroid.utilities.ui.emojipicker.e(9)).b(m.r, cVar);
            b71.a aVar3 = b71.a.r;
            if (b3 != aVar3) {
                b3 = a0Var;
            }
            if (b3 == aVar3) {
                return b3;
            }
        }
        return a0Var;
    }
}

package w91;

import h0.q1;
import java.util.Iterator;
import java.util.List;
import k71.k;
import s91.f;
import sy.a0;
import sy.d0Shadow;
import t71.n;
import v91.h;
import v91.i;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e implements u91.c {
    public static final n a = new n("^ {0,3}(-+|=+) *$");

    @Override // u91.c
    public final boolean a(s91.c cVar, t91.d dVar) {
        k.g(cVar, "pos");
        k.g(dVar, "constraints");
        return false;
    }

    @Override // u91.c
    public final List b(s91.c cVar, q1 q1Var, f fVar) {
        CharSequence charSequence;
        Object obj;
        k.g(fVar, "stateInfo");
        Iterator it = fVar.c.iterator();
        while (true) {
            charSequence = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((u91.b) obj) instanceof h) {
                break;
            }
        }
        h hVar = (h) obj;
        rShadow rVar = rShadow.r;
        if (hVar == null) {
            t91.d dVar = fVar.a;
            if (k.b(fVar.b, dVar)) {
                k.g(dVar, "constraints");
                if (cVar.b == a0.l(dVar, cVar.d)) {
                    int i = cVar.a + 1;
                    List list = (List) cVar.e.t;
                    String str = i < list.size() ? (String) list.get(i) : null;
                    if (str != null) {
                        t91.c cVar2 = (t91.c) dVar;
                        t91.c b = cVar2.b(cVar.e());
                        if (a0.j(b, cVar2)) {
                            charSequence = a0.i(b, str);
                        }
                    }
                    if (charSequence != null && a.e(charSequence)) {
                        return d0Shadow.n(new i(dVar, q1Var));
                    }
                }
            }
        }
        return rVar;
    }
}

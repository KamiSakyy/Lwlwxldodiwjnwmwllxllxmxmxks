package an;

import a5.j0;
import java.util.List;
import t71.n;
import t71.o;
import t71.p;
import t71.w;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static final l Companion = new l();
    public static final n a = new n("^\\h*([-*+]|\\d+\\.)\\h(?<checkbox>\\[[\\hx]])\\h+\\S+.*$", x61.l.j0(new o[]{o.t, o.s}));

    public static String a(int i, String str, boolean z) {
        Object next;
        t71.j jVar;
        k71.k.g(str, "input");
        String str2 = z ? "[x]" : "[ ]";
        List l0 = s71.j.l0(s71.j.k0(n.b(a, str), i + 1));
        Object obj = null;
        t71.l lVar = l0.size() > i ? (t71.l) l0.get(i) : null;
        if (lVar != null) {
            j0 it = lVar.c.iterator();
            do {
                j0 j0Var = it;
                if (!j0Var.s.hasNext()) {
                    break;
                }
                next = j0Var.next();
                jVar = (t71.j) next;
                if (k71.k.b(jVar != null ? jVar.a : null, "[ ]")) {
                    break;
                }
            } while (!w.y(jVar != null ? jVar.a : null, "[x]", true));
            obj = next;
            t71.j jVar2 = (t71.j) obj;
            if (jVar2 != null) {
                q71.g gVar = jVar2.b;
                String obj2 = p.c0(str, ((q71.e) gVar).r, ((q71.e) gVar).s + 1, str2).toString();
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return str;
    }
}

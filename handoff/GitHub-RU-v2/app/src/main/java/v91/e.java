package v91;

import b21.v;
import c21.h0;
import h0.q1;
import java.util.List;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import sy.a0;
import sy.d0;
import t71.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends u91.b {
    public final q1 e;
    public final n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t91.d dVar, q1 q1Var, n nVar, s91.c cVar) {
        super(dVar, new v(q1Var));
        k.g(dVar, "myConstraints");
        this.e = q1Var;
        this.f = nVar;
        q1Var.a(d0.n(new x91.e(new q71.g(cVar.c, cVar.d(), 1), j91.a.H)));
    }

    @Override // u91.b
    public final boolean b() {
        return false;
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        return cVar.d();
    }

    @Override // u91.b
    public final u91.a d(s91.c cVar, t91.d dVar) {
        String str = cVar.d;
        k.g(dVar, "currentConstraints");
        int i = cVar.b;
        if (i != -1) {
            return u91.a.e;
        }
        int i2 = cVar.a;
        String str2 = i2 > 0 ? (String) ((List) cVar.e.t).get(i2 - 1) : null;
        if (str2 == null) {
            return u91.a.f;
        }
        t91.d dVar2 = this.a;
        if (!a0.j(((t91.c) dVar2).b(cVar), dVar2)) {
            return u91.a.f;
        }
        n nVar = this.f;
        if (nVar == null) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            a2.d dVar3 = new a2.d(13, dVar2);
            s91.c cVar2 = cVar;
            int i3 = 1;
            while (((Boolean) dVar3.k(cVar2)).booleanValue() && (cVar2 = cVar2.e()) != null && (i3 = i3 + 1) <= 4) {
            }
            if (i3 >= 2) {
                return u91.a.f;
            }
        }
        if (nVar != null && nVar.a(str2) != null) {
            return u91.a.f;
        }
        if (str.length() > 0) {
            this.e.a(d0.n(new x91.e(new q71.g(a0.l(dVar2, str) + cVar.c + 1, cVar.d(), 1), j91.a.H)));
        }
        return u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return j91.a.i;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return true;
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}

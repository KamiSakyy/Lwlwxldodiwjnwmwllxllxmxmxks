package v91;

import b21.v;
import c21.h0;
import h0.q1;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import sy.a0;
import sy.d0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends u91.b {
    public q1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q1 q1Var, s91.c cVar, t91.d dVar) {
        super(dVar, new v(q1Var));
        k.g(dVar, "myConstraints");
        this.e = q1Var;
        q1Var.a(d0.n(new x91.e(new q71.g(cVar.c, cVar.d(), 1), j91.a.F)));
        this.f = -1;
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
        int i;
        k.g(dVar, "currentConstraints");
        int i2 = cVar.c;
        if (i2 >= this.f && (i = cVar.b) == -1) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            t91.d dVar2 = this.a;
            k.g(dVar2, "constraints");
            s91.c cVar2 = cVar;
            loop0: do {
                t91.c a = a0.a(cVar2, dVar2);
                if (!a0.p(a, dVar2) || !a0.j(a, dVar2)) {
                    break;
                }
                CharSequence i3 = a0.i(a, cVar2.d);
                k.g(i3, "s");
                for (int i4 = 0; i4 < i3.length(); i4++) {
                    char charAt = i3.charAt(i4);
                    if (charAt != ' ' && charAt != '\t') {
                        break loop0;
                    }
                }
                cVar2 = cVar2.e();
            } while (cVar2 != null);
            cVar2 = null;
            if (cVar2 == null) {
                return u91.a.f;
            }
            t91.c a2 = a0.a(cVar2, dVar2);
            s91.c f = cVar2.f(a0.l(a2, cVar2.d) + 1);
            if (f != null) {
                Integer a3 = f.a();
                s91.c f2 = f.f(a3 != null ? a3.intValue() : 0);
                if (f2 != null) {
                    String str = f2.d;
                    int l = a0.l(a2, str);
                    int i5 = f2.b;
                    if (i5 < l + 4) {
                        if (l <= i5) {
                            while (str.charAt(l) != '\t') {
                                if (l != i5) {
                                    l++;
                                }
                            }
                        }
                        return u91.a.f;
                    }
                    int l2 = a0.l(a0.a(cVar, dVar2), cVar.d) + i2 + 1;
                    q71.g gVar = new q71.g(l2, cVar.d(), 1);
                    if (((q71.e) gVar).s - l2 > 0) {
                        this.e.a(d0.n(new x91.e(gVar, j91.a.F)));
                    }
                    this.f = cVar.d();
                    return u91.a.e;
                }
            }
            return u91.a.f;
        }
        return u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return j91.a.g;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return true;
    }
}

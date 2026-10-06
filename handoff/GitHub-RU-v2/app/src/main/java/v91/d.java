package v91;

import b21.v;
import c21.h0;
import h0.q1;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import sy.a0;
import sy.d0;
import t71.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends u91.b {
    public q1 e;
    public n f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(t91.d dVar, q1 q1Var, String str) {
        super(dVar, new v(q1Var));
        k.g(dVar, "myConstraints");
        this.e = q1Var;
        this.f = new n(f1.e.z("^ {0,3}", str, "+ *$"));
        this.g = -1;
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
        String str = cVar.d;
        k.g(dVar, "currentConstraints");
        int i2 = cVar.c;
        if (i2 >= this.g && (i = cVar.b) == -1) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            t91.d dVar2 = this.a;
            t91.c a = a0.a(cVar, dVar2);
            if (!a0.j(a, dVar2)) {
                return u91.a.f;
            }
            int d = cVar.d();
            this.g = d;
            boolean e = this.f.e(a0.i(a, str));
            q1 q1Var = this.e;
            if (e) {
                q1Var.a(d0.n(new x91.e(new q71.g(i2 + 1, cVar.d(), 1), j91.a.k0)));
                u91.a aVar = u91.a.f;
                k.g(aVar, "result");
                this.c = d;
                this.d = aVar;
            } else {
                int min = Math.min(a0.l(dVar2, str) + i2 + 1, d);
                q71.g gVar = new q71.g(min, d, 1);
                if (min < ((q71.e) gVar).s) {
                    q1Var.a(d0.n(new x91.e(gVar, j91.a.j0)));
                }
            }
            return u91.a.e;
        }
        return u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return j91.a.f;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return true;
    }
    public Object k(Object p1) { return null; }
    public Object k(Object) { return null; }
}

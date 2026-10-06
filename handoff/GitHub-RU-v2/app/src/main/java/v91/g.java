package v91;

import b21.v;
import c21.h0;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import t.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g extends u91.b {
    public char e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(t91.d dVar, v vVar, char c) {
        super(dVar, vVar);
        k.g(dVar, "myConstraints");
        this.e = c;
    }

    @Override // u91.b
    public final boolean b() {
        return true;
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        Integer c = cVar.c();
        if (c != null) {
            return c.intValue();
        }
        return -1;
    }

    @Override // u91.b
    public final u91.a d(s91.c cVar, t91.d dVar) {
        s91.c D;
        k.g(dVar, "currentConstraints");
        if (cVar.b != -1) {
            throw new MarkdownParsingException("");
        }
        t91.d dVar2 = this.a;
        int z = a0.z(cVar, dVar2);
        if (z < 3 && (D = a0.D(cVar, z)) != null) {
            t91.c a = sy.a0.a(D, dVar2);
            char[] cArr = ((t91.c) dVar2).b;
            if (cArr.length != 0) {
                return (!a.h(dVar2) || a.c(cArr.length + (-1))) ? u91.a.f : u91.a.d;
            }
            throw new IllegalArgumentException("List constraints should contain at least one item");
        }
        return u91.a.f;
    }

    @Override // u91.b
    public final h0 e() {
        char c = this.e;
        return (c == '-' || c == '*' || c == '+') ? j91.a.b : j91.a.c;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return cVar.b == -1;
    }
}

package v91;

import b21.v;
import c21.h0;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import sy.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b extends u91.b {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(t91.d dVar, v vVar, int i) {
        super(dVar, vVar);
        this.e = i;
    }

    @Override // u91.b
    public final boolean b() {
        switch (this.e) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        switch (this.e) {
            case 0:
                Integer c = cVar.c();
                if (c != null) {
                    return c.intValue();
                }
                return -1;
            case 1:
                return cVar.d();
            default:
                Integer c2 = cVar.c();
                if (c2 != null) {
                    return c2.intValue();
                }
                return -1;
        }
    }

    @Override // u91.b
    public final u91.a d(s91.c cVar, t91.d dVar) {
        s91.c D;
        switch (this.e) {
            case 0:
                k.g(dVar, "currentConstraints");
                if (cVar.b != -1) {
                    throw new MarkdownParsingException("");
                }
                t91.d dVar2 = this.a;
                return !a0.j(a0.a(cVar, dVar2), dVar2) ? u91.a.f : u91.a.d;
            case 1:
                k.g(dVar, "currentConstraints");
                return cVar.b != -1 ? u91.a.e : u91.a.f;
            default:
                k.g(dVar, "currentConstraints");
                if (cVar.b != -1) {
                    throw new MarkdownParsingException("");
                }
                t91.d dVar3 = this.a;
                int z = t.a0.z(cVar, dVar3);
                if (z < 3 && (D = t.a0.D(cVar, z)) != null && a0.j(a0.a(D, dVar3), dVar3)) {
                    return u91.a.e;
                }
                return u91.a.f;
        }
    }

    @Override // u91.b
    public final h0 e() {
        switch (this.e) {
            case 0:
                return j91.a.e;
            case 1:
                return j91.a.f0;
            default:
                return j91.a.d;
        }
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        switch (this.e) {
            case 0:
                if (cVar.b == -1) {
                }
                break;
            case 1:
                if (cVar.b == -1) {
                }
                break;
            default:
                if (cVar.b == -1) {
                }
                break;
        }
        return false;
    }
}

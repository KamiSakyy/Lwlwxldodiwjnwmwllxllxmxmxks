package v91;

import b21.v;
import c21.h0;
import k71.k;
import org.intellij.markdown.MarkdownParsingException;
import sy.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class h extends u91.b {
    public j71.e e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t91.d dVar, v vVar, j71.e eVar) {
        super(dVar, vVar);
        k.g(dVar, "constraints");
        k.g(eVar, "interruptsParagraph");
        this.e = eVar;
    }

    @Override // u91.b
    public final boolean b() {
        return false;
    }

    @Override // u91.b
    public final int c(s91.c cVar) {
        return cVar.d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r2 != null ? r2.a() : null) == null) goto L20;
     */
    @Override // u91.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final u91.a d(s91.c cVar, t91.d dVar) {
        boolean z;
        k.g(dVar, "currentConstraints");
        int i = cVar.b;
        if (i != -1) {
            return u91.a.e;
        }
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        t91.d dVar2 = this.a;
        k.g(dVar2, "constraints");
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        s91.c cVar2 = cVar;
        int i2 = 1;
        do {
            t91.c b = ((t91.c) dVar2).b(cVar2);
            String str = cVar2.d;
            int l = a0.l(b, str);
            if (a0.p(b, dVar2)) {
                if (l < str.length()) {
                    s91.c f = cVar2.f(l + 1);
                }
                z = true;
                if (z || (cVar2 = cVar2.e()) == null) {
                    break;
                    break;
                }
                i2++;
            }
            z = false;
            if (z) {
                break;
            }
            i2++;
        } while (i2 <= 4);
        if (i2 >= 2) {
            return u91.a.f;
        }
        t91.c a = a0.a(cVar, dVar2);
        if (!a0.p(a, dVar2)) {
            return u91.a.f;
        }
        s91.c f2 = cVar.f(a0.l(a, cVar.d) + 1);
        return (f2 == null || ((Boolean) this.e.s(f2, a)).booleanValue()) ? u91.a.f : u91.a.e;
    }

    @Override // u91.b
    public final h0 e() {
        return j91.a.j;
    }

    @Override // u91.b
    public final boolean f(s91.c cVar) {
        return true;
    }
}

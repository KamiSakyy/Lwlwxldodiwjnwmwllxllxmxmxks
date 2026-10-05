package ca1;

import da1.e0;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class n extends o {
    public Object u;

    public n(String str) {
        aa1.b.K(str);
        this.u = str;
    }

    public final n D(String str, String str2) {
        if (!(this.u instanceof b) && str.equals(s())) {
            this.u = str2;
            return this;
        }
        G();
        g x = x();
        e0 e0Var = x != null ? x.B.t : e0.c;
        e0Var.getClass();
        String trim = str.trim();
        if (!e0Var.b) {
            trim = ba1.a.c(trim);
        }
        b d = d();
        int j = d.j(trim);
        if (j == -1) {
            d.a(trim, str2);
            return this;
        }
        d.t[j] = str2;
        if (!d.s[j].equals(trim)) {
            d.s[j] = trim;
        }
        return this;
    }

    public final String F() {
        return b(s());
    }

    public final void G() {
        Object obj = this.u;
        if (obj instanceof b) {
            return;
        }
        b bVar = new b();
        this.u = bVar;
        bVar.l(s(), (String) obj);
    }

    @Override // ca1.o
    public final String a(String str) {
        G();
        return super.a(str);
    }

    @Override // ca1.o
    public final String b(String str) {
        return !(this.u instanceof b) ? s().equals(str) ? (String) this.u : "" : super.b(str);
    }

    @Override // ca1.o
    public final b d() {
        G();
        return (b) this.u;
    }

    @Override // ca1.o
    public final String e() {
        j jVar = this.r;
        return jVar != null ? jVar.e() : "";
    }

    @Override // ca1.o
    public final int g() {
        return 0;
    }

    @Override // ca1.o
    public final o j(o oVar) {
        n nVar = (n) super.j(oVar);
        Object obj = this.u;
        if (obj instanceof b) {
            nVar.u = ((b) obj).clone();
        }
        return nVar;
    }

    @Override // ca1.o
    public final List k() {
        return o.t;
    }

    @Override // ca1.o
    public final boolean o() {
        return this.u instanceof b;
    }

    @Override // ca1.o
    public final j z() {
        return this.r;
    }
}

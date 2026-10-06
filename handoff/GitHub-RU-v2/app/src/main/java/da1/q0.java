package da1;

import org.jsoup.helper.ValidationException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class q0 extends s0 {
    public b1.m d;
    public String e;
    public boolean f;
    public ca1.b g;
    public b1.m h;
    public b1.m i;
    public boolean j;

    public q0(int i, bShadow bVar) {
        super(i);
        this.d = new b1.m(28);
        this.f = false;
        this.h = new b1.m(28);
        this.i = new b1.m(28);
        this.j = false;
        bVar.getClass();
    }

    public final void g(char c, int i, int i2) {
        this.i.e(c);
    }

    public final void h(int i, int i2, int[] iArr) {
        for (int i3 : iArr) {
            b1.m mVar = this.i;
            StringBuilder sb = (StringBuilder) mVar.t;
            if (sb != null) {
                sb.appendCodePoint(i3);
            } else if (((String) mVar.s) != null) {
                StringBuilder a = ba1.h.a();
                mVar.t = a;
                a.append((String) mVar.s);
                mVar.s = null;
                ((StringBuilder) mVar.t).appendCodePoint(i3);
            } else {
                mVar.s = String.valueOf(Character.toChars(i3));
            }
        }
    }

    public final void i(String str) {
        String replace = str.replace((char) 0, (char) 65533);
        b1.m mVar = this.d;
        mVar.g(replace);
        this.e = ba1.a.d(mVar.G());
    }

    public final void j(String str) {
        b1.m mVar = this.d;
        mVar.D();
        mVar.s = str;
        this.e = ba1.a.d(mVar.G());
    }

    public final void k() {
        if (this.g == null) {
            this.g = new ca1.b();
        }
        b1.m mVar = this.h;
        boolean A = mVar.A();
        b1.m mVar2 = this.i;
        if (A && this.g.size() < 512) {
            String trim = mVar.G().trim();
            if (!trim.isEmpty()) {
                this.g.a(trim, mVar2.A() ? mVar2.G() : this.j ? "" : null);
            }
        }
        mVar.D();
        mVar2.D();
        this.j = false;
    }

    public final String l() {
        String str = this.e;
        if (str == null || str.isEmpty()) {
            throw new ValidationException("Must be false");
        }
        return this.e;
    }

    @Override // da1.s0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public q0 f() {
        this.b = -1;
        this.c = -1;
        this.d.D();
        this.e = null;
        this.f = false;
        this.g = null;
        this.h.D();
        this.i.D();
        this.j = false;
        return this;
    }

    public final String n() {
        String G = this.d.G();
        return G.isEmpty() ? "[unset]" : G;
    }

    public q0(Object... a) {
    }
}

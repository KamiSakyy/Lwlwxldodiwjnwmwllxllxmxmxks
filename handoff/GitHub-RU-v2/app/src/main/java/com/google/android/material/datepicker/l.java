package com.google.android.material.datepicker;

import a5.p2;
import a5.z;
import android.view.View;
import g3.g0;
import g3.p0;
import k1.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l implements z {
    public final /* synthetic */ int r = 0;
    public int s;
    public int t;
    public int u;
    public int v;
    public final Object w;

    public l(g3.g gVar, long j) {
        String str = gVar.s;
        i3.e eVar = new i3.e();
        eVar.d = str;
        eVar.b = -1;
        eVar.c = -1;
        this.w = eVar;
        this.s = p0.f(j);
        this.t = p0.e(j);
        this.u = -1;
        this.v = -1;
        int f = p0.f(j);
        int e = p0.e(j);
        if (f < 0 || f > str.length()) {
            StringBuilder o = x.i.o("start (", f, ") offset is outside of text region ");
            o.append(str.length());
            throw new IndexOutOfBoundsException(o.toString());
        }
        if (e < 0 || e > str.length()) {
            StringBuilder o2 = x.i.o("end (", e, ") offset is outside of text region ");
            o2.append(str.length());
            throw new IndexOutOfBoundsException(o2.toString());
        }
        if (f > e) {
            throw new IllegalArgumentException(no.a.j(f, e, "Do not set reversed range: ", " > "));
        }
    }

    public void a(int i, int i2) {
        long b = g0.b(i, i2);
        ((i3.e) this.w).k(i, "", i2);
        long E = a.a.E(g0.b(this.s, this.t), b);
        h(p0.f(E));
        g(p0.e(E));
        int i3 = this.u;
        if (i3 != -1) {
            long E2 = a.a.E(g0.b(i3, this.v), b);
            if (p0.c(E2)) {
                this.u = -1;
                this.v = -1;
            } else {
                this.u = p0.f(E2);
                this.v = p0.e(E2);
            }
        }
    }

    public char b(int i) {
        i3.e eVar = (i3.e) this.w;
        m0 m0Var = (m0) eVar.e;
        if (m0Var != null && i >= eVar.b) {
            int c = m0Var.b - m0Var.c();
            int i2 = eVar.b;
            if (i >= c + i2) {
                return ((String) eVar.d).charAt(i - ((c - eVar.c) + i2));
            }
            int i3 = i - i2;
            int i4 = m0Var.c;
            return i3 < i4 ? ((char[]) m0Var.e)[i3] : ((char[]) m0Var.e)[(i3 - i4) + m0Var.d];
        }
        return ((String) eVar.d).charAt(i);
    }

    public p0 c() {
        int i = this.u;
        if (i != -1) {
            return new p0(g0.b(i, this.v));
        }
        return null;
    }

    public void d(int i, String str, int i2) {
        i3.e eVar = (i3.e) this.w;
        if (i < 0 || i > eVar.b()) {
            StringBuilder o = x.i.o("start (", i, ") offset is outside of text region ");
            o.append(eVar.b());
            throw new IndexOutOfBoundsException(o.toString());
        }
        if (i2 < 0 || i2 > eVar.b()) {
            StringBuilder o2 = x.i.o("end (", i2, ") offset is outside of text region ");
            o2.append(eVar.b());
            throw new IndexOutOfBoundsException(o2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(no.a.j(i, i2, "Do not set reversed range: ", " > "));
        }
        eVar.k(i, str, i2);
        h(str.length() + i);
        g(str.length() + i);
        this.u = -1;
        this.v = -1;
    }

    public void e(int i, int i2) {
        i3.e eVar = (i3.e) this.w;
        if (i < 0 || i > eVar.b()) {
            StringBuilder o = x.i.o("start (", i, ") offset is outside of text region ");
            o.append(eVar.b());
            throw new IndexOutOfBoundsException(o.toString());
        }
        if (i2 < 0 || i2 > eVar.b()) {
            StringBuilder o2 = x.i.o("end (", i2, ") offset is outside of text region ");
            o2.append(eVar.b());
            throw new IndexOutOfBoundsException(o2.toString());
        }
        if (i >= i2) {
            throw new IllegalArgumentException(no.a.j(i, i2, "Do not set reversed or empty range: ", " > "));
        }
        this.u = i;
        this.v = i2;
    }

    public void f(int i, int i2) {
        i3.e eVar = (i3.e) this.w;
        if (i < 0 || i > eVar.b()) {
            StringBuilder o = x.i.o("start (", i, ") offset is outside of text region ");
            o.append(eVar.b());
            throw new IndexOutOfBoundsException(o.toString());
        }
        if (i2 < 0 || i2 > eVar.b()) {
            StringBuilder o2 = x.i.o("end (", i2, ") offset is outside of text region ");
            o2.append(eVar.b());
            throw new IndexOutOfBoundsException(o2.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(no.a.j(i, i2, "Do not set reversed range: ", " > "));
        }
        h(i);
        g(i2);
    }

    public void g(int i) {
        if (!(i >= 0)) {
            m3.a.a("Cannot set selectionEnd to a negative value: " + i);
        }
        this.t = i;
    }

    public void h(int i) {
        if (!(i >= 0)) {
            m3.a.a("Cannot set selectionStart to a negative value: " + i);
        }
        this.s = i;
    }

    public p2 l(View view, p2 p2Var) {
        View view2 = (View) this.w;
        r4.b g = p2Var.a.g(519);
        int i = this.s;
        if (i >= 0) {
            view2.getLayoutParams().height = i + g.b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(this.t + g.a, this.u + g.b, this.v + g.c, view2.getPaddingBottom());
        return p2Var;
    }

    public String toString() {
        switch (this.r) {
            case 1:
                return ((i3.e) this.w).toString();
            default:
                return super.toString();
        }
    }

    public l(View view, int i, int i2, int i3, int i4) {
        this.s = i;
        this.w = view;
        this.t = i2;
        this.u = i3;
        this.v = i4;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p2<T1,T2,T3,T4> {
        public p2() {
        }
    }
}

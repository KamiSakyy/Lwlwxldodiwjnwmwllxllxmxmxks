package da1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jsoup.helper.ValidationException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class bShadow {
    public f0 a;
    public a b;
    public u0 c;
    public ca1.g d;
    public ArrayList e;
    public String f;
    public s0 g;
    public e0 h;
    public i0 i;
    public p0 j;
    public b0Shadow l;
    public b0Shadow m;
    public boolean n;
    public ca1.j o;
    public ca1.m p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;
    public o0 t;
    public boolean u;
    public boolean v;
    public static final String[] x = {"applet", "caption", "html", "marquee", "object", "table", "td", "template", "th"};
    public static final String[] y = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] z = {"desc", "foreignObject", "title"};
    public static final String[] A = {"ol", "ul"};
    public static final String[] B = {"button"};
    public static final String[] C = {"html", "table"};
    public static final String[] D = {"optgroup", "option"};
    public static final String[] E = {"dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc"};
    public static final String[] F = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] G = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", "form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", "p", "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
    public static final String[] H = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] I = {"mi", "mn", "mo", "ms", "mtext"};
    public static final String[] J = {"desc", "foreignObject", "title"};
    public static final String[] K = {"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
    public final o0 k = new o0(3, this);
    public final String[] w = {null};

    public static boolean A(ca1.j jVar) {
        String str;
        g0 g0Var = jVar.u;
        String str2 = g0Var.r;
        str = g0Var.t;
        str2.getClass();
        switch (str2) {
            case "http://www.w3.org/1999/xhtml":
                return ba1.h.c(str, G);
            case "http://www.w3.org/2000/svg":
                return ba1.h.c(str, J);
            case "http://www.w3.org/1998/Math/MathML":
                return ba1.h.c(str, H);
            default:
                return false;
        }
    }

    public static boolean C(ArrayList arrayList, ca1.j jVar) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((ca1.j) arrayList.get(i)) == jVar) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final boolean B(String str) {
        return n(str) != null;
    }

    public final boolean D(String[] strArr) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            if (!ba1.h.c(((ca1.j) this.e.get(i)).u.t, strArr)) {
                return true;
            }
            i--;
        }
        return false;
    }

    public final ca1.j E() {
        return (ca1.j) this.e.remove(this.e.size() - 1);
    }

    public final void F(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ca1.j E2 = E();
            if (E2.u.t.equals(str) && E2.u.r.equals("http://www.w3.org/1999/xhtml")) {
                return;
            }
        }
    }

    public final void G() {
        if (this.r.size() > 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if ("malignmark".equals(r3.e) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r9.a == 5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
    
        if (r2.equals("application/xhtml+xml") == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (r9.a != 5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (ba1.h.b(r0.u.s, da1.bShadow.J) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean H(s0 s0Var) {
        boolean z2 = true;
        if (!this.e.isEmpty()) {
            ca1.j h = h();
            String str = h.u.r;
            if (!"http://www.w3.org/1999/xhtml".equals(str)) {
                if ("http://www.w3.org/1998/Math/MathML".equals(h.u.r) && ba1.h.c(h.u.t, I)) {
                    if (s0Var.e()) {
                        p0 p0Var = (p0) s0Var;
                        if (!"mglyph".equals(p0Var.e)) {
                        }
                    }
                }
                if (!"http://www.w3.org/1998/Math/MathML".equals(str) || !h.p("annotation-xml") || !s0Var.e() || !"svg".equals(((p0) s0Var).e)) {
                    if ("http://www.w3.org/1998/Math/MathML".equals(h.u.r) && h.p("annotation-xml")) {
                        String d = ba1.a.d(h.b("encoding"));
                        if (!d.equals("text/html")) {
                        }
                        if (!s0Var.e()) {
                        }
                    }
                    if ("http://www.w3.org/2000/svg".equals(h.u.r)) {
                    }
                    z2 = s0Var.c();
                }
            }
        }
        return (z2 ? this.l : b0.O).d(s0Var, this);
    }

    public final boolean I(String str) {
        s0 s0Var = this.g;
        o0 o0Var = this.k;
        if (s0Var == o0Var) {
            o0 o0Var2 = new o0(3, this);
            o0Var2.j(str);
            return H(o0Var2);
        }
        o0Var.f();
        o0Var.j(str);
        return H(o0Var);
    }

    public final void J(String str) {
        p0 p0Var = this.j;
        if (this.g == p0Var) {
            p0 p0Var2 = new p0(2, this);
            p0Var2.j(str);
            H(p0Var2);
        } else {
            p0Var.f();
            p0Var.j(str);
            H(p0Var);
        }
    }

    public final void K(b0Shadow b0Var) {
        this.r.add(b0Var);
    }

    public final void L() {
        if (this.e.size() > 256) {
            return;
        }
        boolean z2 = true;
        ca1.j jVar = this.q.size() > 0 ? (ca1.j) no.a.g(1, this.q) : null;
        if (jVar == null || C(this.e, jVar)) {
            return;
        }
        int size = this.q.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (i3 != i) {
            i3--;
            jVar = (ca1.j) this.q.get(i3);
            if (jVar == null || C(this.e, jVar)) {
                z2 = false;
                break;
            }
        }
        while (true) {
            if (!z2) {
                i3++;
                jVar = (ca1.j) this.q.get(i3);
            }
            aa1.b.K(jVar);
            ca1.j jVar2 = new ca1.j(this.i.d(jVar.s(), jVar.u.t, "http://www.w3.org/1999/xhtml", this.h.a), null, jVar.d().clone());
            j(jVar2);
            this.q.set(i3, jVar2);
            if (i3 == i2) {
                return;
            } else {
                z2 = false;
            }
        }
    }

    public final void M(ca1.j jVar) {
        for (int size = this.q.size() - 1; size >= 0; size--) {
            if (((ca1.j) this.q.get(size)) == jVar) {
                this.q.remove(size);
                return;
            }
        }
    }

    public final void N(ca1.j jVar) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            if (((ca1.j) this.e.get(size)) == jVar) {
                this.e.remove(size);
                return;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x004d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0146 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean O() {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        b0Shadow b0Var = this.l;
        if (this.e.size() == 0) {
            this.l = b0.x;
        }
        boolean z2 = false;
        while (true) {
            if (i >= i2) {
                ca1.j jVar = (ca1.j) this.e.get(i);
                if (i == i2) {
                    z2 = true;
                }
                String str = jVar != null ? jVar.u.t : "";
                if ("http://www.w3.org/1999/xhtml".equals(jVar.u.r)) {
                    str.getClass();
                    switch (str) {
                        case "frameset":
                            this.l = b0.K;
                            break;
                        case "template":
                            b0Shadow b0Var2 = this.r.size() > 0 ? (b0Shadow) no.a.g(1, this.r) : null;
                            if (b0Var2 == null) {
                                throw new ValidationException("Bug: no template insertion mode on stack!");
                            }
                            this.l = b0Var2;
                            break;
                        case "select":
                            this.l = b0.G;
                            break;
                        case "colgroup":
                            this.l = b0.C;
                            break;
                        case "td":
                        case "th":
                            if (!z2) {
                                this.l = b0.F;
                                break;
                            }
                            if (!z2) {
                                break;
                            } else {
                                this.l = b0.x;
                                break;
                            }
                        case "tr":
                            this.l = b0.E;
                            break;
                        case "body":
                            this.l = b0.x;
                            break;
                        case "head":
                            if (!z2) {
                                this.l = b0.u;
                                break;
                            }
                            if (!z2) {
                            }
                            break;
                        case "html":
                            this.l = this.o == null ? b0.t : b0.w;
                            break;
                        case "table":
                            this.l = b0.z;
                            break;
                        case "tbody":
                        case "tfoot":
                        case "thead":
                            this.l = b0.D;
                            break;
                        case "caption":
                            this.l = b0.B;
                            break;
                        default:
                            if (!z2) {
                            }
                            break;
                    }
                }
                i--;
            }
        }
        return this.l != b0Var;
    }

    public final g0 P(p0 p0Var) {
        return this.i.d(p0Var.d.G(), p0Var.e, "http://www.w3.org/1999/xhtml", this.h.a);
    }

    public final ca1.j a(ca1.j jVar) {
        if (!C(this.e, jVar)) {
            return null;
        }
        for (int size = this.e.size() - 1; size > 0; size--) {
            if (((ca1.j) this.e.get(size)) == jVar) {
                return (ca1.j) this.e.get(size - 1);
            }
        }
        return null;
    }

    public final void b(ca1.j jVar) {
        int size = this.q.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            ca1.j jVar2 = (ca1.j) this.q.get(i3);
            if (jVar2 == null) {
                return;
            }
            if (jVar.u.t.equals(jVar2.u.t) && jVar.d().equals(jVar2.d())) {
                i2++;
            }
            if (i2 == 3) {
                this.q.remove(i3);
                return;
            }
        }
    }

    public final void c() {
        while (!this.q.isEmpty()) {
            int size = this.q.size();
            if ((size > 0 ? (ca1.j) this.q.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    public final void d(String... strArr) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            ca1.j jVar = (ca1.j) this.e.get(size);
            if ("http://www.w3.org/1999/xhtml".equals(jVar.u.r) && (ba1.h.b(jVar.u.t, strArr) || jVar.p("html"))) {
                return;
            }
            E();
        }
    }

    public final void e() {
        d("table", "template");
    }

    public final void f() {
        d("tr", "template");
    }

    public final ca1.j g(p0 p0Var, String str, boolean z2) {
        ca1.b bVar = p0Var.g;
        if (bVar != null && bVar.size() != 0) {
            int i = 0;
            if (!z2 && !this.h.b) {
                for (int i2 = 0; i2 < bVar.r; i2++) {
                    String str2 = bVar.s[i2];
                    if (!ca1.b.k(str2)) {
                        bVar.s[i2] = ba1.a.c(str2);
                    }
                }
            }
            e0 e0Var = this.h;
            if (bVar.r != 0) {
                boolean z3 = e0Var.b;
                int i3 = 0;
                while (i < bVar.r) {
                    String str3 = bVar.s[i];
                    i++;
                    int i4 = i;
                    while (i4 < bVar.r) {
                        if ((z3 && str3.equals(bVar.s[i4])) || (!z3 && str3.equalsIgnoreCase(bVar.s[i4]))) {
                            i3++;
                            bVar.n(i4);
                            i4--;
                        }
                        i4++;
                    }
                }
                i = i3;
            }
            if (i > 0) {
                Object[] objArr = {p0Var.e};
                d0 d0Var = this.a.s;
                if (d0Var.a()) {
                    d0Var.add(new c0(this.b, "Dropped duplicate attribute(s) in tag [%s]", objArr));
                }
            }
        }
        g0 d = this.i.d(p0Var.d.G(), p0Var.e, str, (z2 ? e0.d : this.h).a);
        return d.t.equals("form") ? new ca1.m(d, bVar) : new ca1.j(d, null, bVar);
    }

    public final ca1.j h() {
        int size = this.e.size();
        return size > 0 ? (ca1.j) this.e.get(size - 1) : this.d;
    }

    public final boolean i(String str) {
        ca1.j h;
        return this.e.size() != 0 && (h = h()) != null && h.u.t.equals(str) && h.u.r.equals("http://www.w3.org/1999/xhtml");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(ca1.j jVar) {
        ca1.j jVar2;
        boolean z2;
        if (this.p != null && jVar.u.r.equals("http://www.w3.org/1999/xhtml") && ba1.h.c(jVar.u.t, K)) {
            this.p.A.add(jVar);
        }
        if (this.a.s.a() && jVar.n("xmlns") && !jVar.b("xmlns").equals(jVar.u.r)) {
            Object[] objArr = {jVar.b("xmlns"), jVar.u.s};
            d0 d0Var = this.a.s;
            if (d0Var.a()) {
                d0Var.add(new c0(this.b, "Invalid xmlns attribute [%s] on tag [%s]", objArr));
            }
        }
        if (this.v && ba1.h.c(h().u.t, a0.zShadow)) {
            ca1.j n = n("table");
            int i = 1;
            if (n != null) {
                jVar2 = n.r;
                if (jVar2 != null) {
                    z2 = true;
                    if (z2) {
                        jVar2.D(jVar);
                    } else {
                        aa1.b.K(n);
                        aa1.b.K(n.r);
                        ca1.j jVar3 = jVar.r;
                        if (jVar3 == n.r && jVar3 != null) {
                            jVar3.B(jVar);
                        }
                        ca1.j jVar4 = n.r;
                        int C2 = n.C();
                        ca1.o[] oVarArr = {jVar};
                        jVar4.getClass();
                        List k = jVar4.k();
                        ca1.j z3 = oVarArr[0].z();
                        if (z3 != null && z3.v.size() == 1) {
                            List k2 = z3.k();
                            int i2 = 1;
                            while (true) {
                                int i3 = i2 - 1;
                                if (i2 <= 0) {
                                    int size = z3.v.size();
                                    for (int i4 = 0; i4 < size; i4++) {
                                        ((ca1.o) z3.v.get(i4)).r = null;
                                    }
                                    z3.v.clear();
                                    ((ArrayList) k).addAll(C2, Arrays.asList(oVarArr));
                                    while (true) {
                                        int i5 = i - 1;
                                        if (i <= 0) {
                                            break;
                                        }
                                        oVarArr[i5].r = jVar4;
                                        i = i5;
                                    }
                                    jVar4.v.r = false;
                                } else if (oVarArr[i3] != ((ArrayList) k2).get(i3)) {
                                    break;
                                } else {
                                    i2 = i3;
                                }
                            }
                        }
                        ca1.o oVar = oVarArr[0];
                        if (oVar == null) {
                            throw new ValidationException("Array must not contain any null objects");
                        }
                        ca1.j jVar5 = oVar.r;
                        if (jVar5 != null) {
                            jVar5.B(oVar);
                        }
                        oVar.r = jVar4;
                        ((ArrayList) k).addAll(C2, Arrays.asList(oVarArr));
                        jVar4.v.r = false;
                    }
                } else {
                    jVar2 = a(n);
                }
            } else {
                jVar2 = (ca1.j) this.e.get(0);
            }
            z2 = false;
            if (z2) {
            }
        } else {
            h().D(jVar);
        }
        this.e.add(jVar);
    }

    public final void k(b0Shadow b0Var) {
        if (this.a.s.a()) {
            this.a.s.add(new c0(this.b, "Unexpected %s token [%s] when in state [%s]", new Object[]{this.g.getClass().getSimpleName(), this.g, b0Var}));
        }
    }

    public final void l(String str) {
        while (ba1.h.c(h().u.t, E)) {
            if (str != null && i(str)) {
                return;
            } else {
                E();
            }
        }
    }

    public final void m(boolean z2) {
        String[] strArr = z2 ? F : E;
        while ("http://www.w3.org/1999/xhtml".equals(h().u.r) && ba1.h.c(h().u.t, strArr)) {
            E();
        }
    }

    public final ca1.j n(String str) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            ca1.j jVar = (ca1.j) this.e.get(i);
            if (jVar.u.t.equals(str) && jVar.u.r.equals("http://www.w3.org/1999/xhtml")) {
                return jVar;
            }
            i--;
        }
        return null;
    }

    public final boolean o(String str) {
        String[] strArr = this.w;
        strArr[0] = str;
        return r(strArr, x, B);
    }

    public final boolean p(String str) {
        String[] strArr = this.w;
        strArr[0] = str;
        return r(strArr, x, null);
    }

    public final boolean q(String str) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            String str2 = ((ca1.j) this.e.get(size)).u.t;
            if (str2.equals(str)) {
                return true;
            }
            if (!ba1.h.c(str2, D)) {
                return false;
            }
        }
        return false;
    }

    public final boolean r(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.e.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            g0 g0Var = ((ca1.j) this.e.get(i)).u;
            String str = g0Var.t;
            String str2 = g0Var.r;
            if (!str2.equals("http://www.w3.org/1999/xhtml")) {
                if (strArr2 == x) {
                    if (str2.equals("http://www.w3.org/1998/Math/MathML")) {
                        if (ba1.h.c(str, y)) {
                            break;
                        }
                    }
                    if (str2.equals("http://www.w3.org/2000/svg") && ba1.h.c(str, z)) {
                        break;
                    }
                } else {
                    continue;
                }
                i--;
            } else if (!ba1.h.c(str, strArr)) {
                if (ba1.h.c(str, strArr2)) {
                    break;
                }
                if (strArr3 != null && ba1.h.c(str, strArr3)) {
                    break;
                }
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean s(String str) {
        String[] strArr = this.w;
        strArr[0] = str;
        return r(strArr, C, null);
    }

    public final void t(k0 k0Var) {
        u(k0Var, h());
    }

    public final String toString() {
        return "TreeBuilder{currentToken=" + this.g + ", state=" + this.l + ", currentElement=" + h() + '}';
    }

    public final void u(k0 k0Var, ca1.j jVar) {
        String G2 = k0Var.d.G();
        jVar.D(k0Var instanceof j0 ? new ca1.c(G2) : jVar.u.b(256) ? new ca1.e(G2) : new ca1.u(G2));
    }

    public final void v(l0 l0Var) {
        h().D(new ca1.d(l0Var.d.G()));
    }

    public final ca1.j w(p0 p0Var) {
        ca1.j g = g(p0Var, "http://www.w3.org/1999/xhtml", false);
        j(g);
        if (p0Var.f) {
            g0 g0Var = g.u;
            int i = g0Var.u | 32;
            g0Var.u = i;
            if ((i & 1) != 0 && ((i & 2) != 0 || g0Var.c())) {
                this.c.o(l3.r);
                u0 u0Var = this.c;
                o0 o0Var = this.t;
                o0Var.f();
                o0Var.j(g.u.s);
                u0Var.g(o0Var);
                return g;
            }
            u0 u0Var2 = this.c;
            Object[] objArr = {g0Var.t};
            d0 d0Var = u0Var2.b;
            if (d0Var.a()) {
                d0Var.add(new c0(u0Var2.a, "Tag [%s] cannot be self-closing; not a void tag", objArr));
            }
        }
        return g;
    }

    public final ca1.j x(p0 p0Var) {
        ca1.j g = g(p0Var, "http://www.w3.org/1999/xhtml", false);
        j(g);
        E();
        return g;
    }

    public final void y(p0 p0Var, String str) {
        ca1.j g = g(p0Var, str, true);
        j(g);
        if (p0Var.f) {
            g.u.u |= 32;
            E();
        }
    }

    public final void z(p0 p0Var, boolean z2, boolean z3) {
        ca1.m mVar = (ca1.m) g(p0Var, "http://www.w3.org/1999/xhtml", false);
        if (!z3) {
            this.p = mVar;
        } else if (!B("template")) {
            this.p = mVar;
        }
        j(mVar);
        if (z2) {
            return;
        }
        E();
    }

    public b(Object... a) {
    }
}

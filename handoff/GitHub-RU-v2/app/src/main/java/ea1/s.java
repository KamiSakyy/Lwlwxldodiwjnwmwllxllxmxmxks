package ea1;

import da1.t0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.ValidationException;
import org.jsoup.select.Selector$SelectorParseException;

/* loaded from: /home/user/work/p/classes5.dex */
public class s implements AutoCloseable {
    public static final char[] u = {'>', '+', '~'};
    public static final String[] v = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final char[] w = {',', ')'};
    public static final Pattern x = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern y = Pattern.compile("([+-])?(\\d+)");
    public t0 r;
    public String s;
    public boolean t;

    public s(String str) {
        aa1.b.H(str);
        String trim = str.trim();
        this.s = trim;
        this.r = new t0(trim);
    }

    public static n N(String str) {
        try {
            s sVar = new s(str);
            try {
                n W = sVar.W();
                t0 t0Var = sVar.r;
                t0Var.t();
                da1.a aVar = t0Var.r;
                if (!aVar.b0()) {
                    throw new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", sVar.s, aVar.O());
                }
                sVar.close();
                return W;
            } finally {
            }
        } catch (IllegalArgumentException e) {
            throw new Selector$SelectorParseException(e.getMessage());
        }
    }

    public static n f(n nVar, n nVar2) {
        if (nVar == null) {
            return nVar2;
        }
        if (!(nVar instanceof b)) {
            return new b(Arrays.asList(nVar, nVar2));
        }
        b bVar = (b) nVar;
        bVar.a.add(nVar2);
        bVar.c();
        return nVar;
    }

    public final n A(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String F = t0.F(r());
        aa1.b.I(F, str.concat("(text) query must not be empty"));
        return z ? new f(6, F, false) : new f(7, F, false);
    }

    public final l E(boolean z, boolean z2) {

        Object r2 = null;
        String d = ba1.a.d(r());
        int i = 2;
        if (!"odd".equals(d)) {
            if (!"even".equals(d)) {
                Matcher matcher = x.matcher(d);
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        i = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                    } else {
                        i = "-".equals(matcher.group(2)) ? -1 : 1;
                    }
                    if (matcher.group(4) != null) {
                        r2 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                    }
                } else {
                    Matcher matcher2 = y.matcher(d);
                    if (!matcher2.matches()) {
                        throw new Selector$SelectorParseException("Could not parse nth-index '%s': unexpected format", d);
                    }
                    r2 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                    i = 0;
                }
            }
            r2 = 0;
        }
        return z2 ? z ? new l(i, r2, 2) : new l(i, r2, 3) : z ? new l(i, r2, 1) : new l(i, r2, 0);
    }

    public final n F(t0 t0Var) {
        da1.a aVar = t0Var.r;
        StringBuilder a = ba1.h.a();
        loop0: while (!aVar.b0()) {
            for (int i = 0; i < 6; i++) {
                if (aVar.J0(v[i])) {
                    break loop0;
                }
            }
            a.append(aVar.t());
        }
        String k = ba1.h.k(a);
        aa1.b.H(k);
        t0Var.t();
        if (aVar.b0()) {
            return k.startsWith("^") ? new f(k.substring(1), 1) : k.equals("*") ? new f("", 1) : new f(0, k, false);
        }
        if (t0Var.E('=')) {
            return new g(0, k, aVar.O(), true);
        }
        if (aVar.o0("!=")) {
            return new g(3, k, aVar.O(), true);
        }
        if (aVar.o0("^=")) {
            return new g(4, k, aVar.O(), false);
        }
        if (aVar.o0("$=")) {
            return new g(2, k, aVar.O(), false);
        }
        if (aVar.o0("*=")) {
            return new g(1, k, aVar.O(), true);
        }
        if (aVar.o0("~=")) {
            return new h(k, Pattern.compile(aVar.O()));
        }
        throw new Selector$SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.s, aVar.O());
    }

    public final n K(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String r = r();
        aa1.b.I(r, str.concat("(regex) query must not be empty"));
        Pattern compile = Pattern.compile(r);
        return this.t ? new p(compile) : z ? new m(compile, 1) : new m(compile, 0);
    }

    public final n M(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String r = r();
        aa1.b.I(r, str.concat("(regex) query must not be empty"));
        return z ? new m(Pattern.compile(r), 2) : new m(Pattern.compile(r), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [ea1.n] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ea1.n] */
    /* JADX WARN: Type inference failed for: r3v4, types: [ea1.n] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [ea1.v, ea1.y] */
    /* JADX WARN: Type inference failed for: r3v8, types: [ea1.n] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final n O() {
        t0 t0Var = this.r;
        t0Var.t();
        da1.a aVar = t0Var.r;
        char[] cArr = u;
        Object eVar_r7 = aVar.x0(cArr) ? new e(8) : b0();
        while (true) {
            char c = t0Var.t() ? ' ' : (char) 0;
            if (!aVar.x0(cArr)) {
                if (aVar.x0(w)) {
                    break;
                }
            } else {
                c = aVar.t();
            }
            if (c == 0) {
                break;
            }
            n b0 = b0();
            if (c == ' ') {
                eVar_r7 = f(new t(eVar_r7, 0), b0);
            } else if (c == '+') {
                eVar_r7 = f(new w(eVar_r7), b0);
            } else if (c == '>') {
                eVar_r7 = eVar_r7 instanceof v ? (v) eVar_r7 : new v(eVar_r7);
                eVar_r7.c.add(b0);
                eVar_r7.d = b0.a() + eVar_r7.d;
                eVar_r7.b |= b0.b();
            } else {
                if (c != '~') {
                    throw new Selector$SelectorParseException("Unknown combinator '%s'", Character.valueOf(c));
                }
                eVar_r7 = f(new xShadow(eVar_r7), b0);
            }
        }
        return eVar_r7;
    }

    public final n W() {
        n O = O();
        while (this.r.E(',')) {
            n O2 = O();
            if (O instanceof c) {
                c cVar = (c) O;
                cVar.a.add(O2);
                cVar.c();
            } else {
                O = new c(O, O2);
            }
        }
        return O;
    }

    public final n b0() {
        n fVar;
        n nVar;
        t0 t0Var = this.r;
        t0Var.t();
        da1.a aVar = t0Var.r;
        boolean z = false;
        if (Character.isLetterOrDigit(aVar.W()) || aVar.J0("*|")) {
            StringBuilder a = ba1.h.a();
            while (!aVar.b0()) {
                char W = aVar.W();
                if (W != '\\') {
                    if (!Character.isLetterOrDigit(aVar.W()) && !aVar.x0(t0.s)) {
                        break;
                    }
                    a.append(W);
                    t0Var.f();
                } else {
                    t0Var.f();
                    if (aVar.b0()) {
                        break;
                    }
                    a.append(aVar.t());
                }
            }
            String d = ba1.a.d(ba1.h.k(a));
            aa1.b.H(d);
            int i = 9;
            if (d.startsWith("*|")) {
                String substring = d.substring(2);
                fVar = new c(new f(i, substring, z), new f(10, f1.e.g(":", substring), z));
            } else if (d.endsWith("|*")) {
                fVar = new f(11, d.substring(0, d.length() - 2) + ":", z);
            } else {
                if (d.contains("|")) {
                    d = d.replace("|", ":");
                }
                fVar = new f(i, d, z);
            }
            nVar = fVar;
        } else {
            nVar = t0Var.E('*') ? new e(0) : null;
        }
        while (true) {
            n e0 = e0();
            if (e0 == null) {
                break;
            }
            nVar = f(nVar, e0);
        }
        if (nVar != null) {
            return nVar;
        }
        throw new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.s, aVar.O());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x022b, code lost:
    
        if (r0.equals("contains") == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a3, code lost:
    
        if (r0.equals("text") == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    *
        Object r2 = null;/
    public final n e0() {
        n pVar;
        t0 t0Var = this.r;
        boolean E = t0Var.E('#');
        da1.a aVar = t0Var.r;
        int i = 8;
        int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (E) {
            String r = t0Var.r();
            aa1.b.H(r);
            return new f(i, r, objArr2 == true ? 1 : 0);
        }
        int i3 = 2;
        if (t0Var.E('.')) {
            String r2 = t0Var.r();
            aa1.b.H(r2);
            return new f(i3, r2.trim(), objArr == true ? 1 : 0);
        }
        if (aVar.w0('[')) {
            t0 t0Var2 = new t0(t0Var.m('[', ']'));
            try {
                n F = F(t0Var2);
                t0Var2.close();
                return F;
            } catch (Throwable th) {
                try {
                    t0Var2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        boolean o0 = aVar.o0("::");
        String str = this.s;
        if (!o0) {
            if (!t0Var.E(':')) {
                return null;
            }
            String r3 = t0Var.r();
            r3.getClass();
            switch (r3.hashCode()) {
                case -2141736343:
                    if (r3.equals("containsData")) {
                        i = 0;
                        break;
                    }
                    i = -1;
                    break;
                case -2136991809:
                    if (r3.equals("first-child")) {
                        i = 1;
                        break;
                    }
                    i = -1;
                    break;
                case -1939921007:
                    if (r3.equals("matchesWholeText")) {
                        i = 2;
                        break;
                    }
                    i = -1;
                    break;
                case -1754914063:
                    if (r3.equals("nth-child")) {
                        i = 3;
                        break;
                    }
                    i = -1;
                    break;
                case -1629748624:
                    if (r3.equals("nth-last-child")) {
                        i = 4;
                        break;
                    }
                    i = -1;
                    break;
                case -947996741:
                    if (r3.equals("only-child")) {
                        i = 5;
                        break;
                    }
                    i = -1;
                    break;
                case -897532411:
                    if (r3.equals("nth-of-type")) {
                        i = 6;
                        break;
                    }
                    i = -1;
                    break;
                case -872629820:
                    if (r3.equals("nth-last-of-type")) {
                        i = 7;
                        break;
                    }
                    i = -1;
                    break;
                case -567445985:
                    break;
                case -55413797:
                    if (r3.equals("containsWholeOwnText")) {
                        i = 9;
                        break;
                    }
                    i = -1;
                    break;
                case 3244:
                    if (r3.equals("eq")) {
                        i = 10;
                        break;
                    }
                    i = -1;
                    break;
                case 3309:
                    if (r3.equals("gt")) {
                        i = 11;
                        break;
                    }
                    i = -1;
                    break;
                case 3370:
                    if (r3.equals("is")) {
                        i = 12;
                        break;
                    }
                    i = -1;
                    break;
                case 3464:
                    if (r3.equals("lt")) {
                        i = 13;
                        break;
                    }
                    i = -1;
                    break;
                case 103066:
                    if (r3.equals("has")) {
                        i = 14;
                        break;
                    }
                    i = -1;
                    break;
                case 109267:
                    if (r3.equals("not")) {
                        i = 15;
                        break;
                    }
                    i = -1;
                    break;
                case 3506402:
                    if (r3.equals("root")) {
                        i = 16;
                        break;
                    }
                    i = -1;
                    break;
                case 93819220:
                    if (r3.equals("blank")) {
                        i = 17;
                        break;
                    }
                    i = -1;
                    break;
                case 96634189:
                    if (r3.equals("empty")) {
                        i = 18;
                        break;
                    }
                    i = -1;
                    break;
                case 208017639:
                    if (r3.equals("containsOwn")) {
                        i = 19;
                        break;
                    }
                    i = -1;
                    break;
                case 614017170:
                    if (r3.equals("matchText")) {
                        i = 20;
                        break;
                    }
                    i = -1;
                    break;
                case 835834661:
                    if (r3.equals("last-child")) {
                        i = 21;
                        break;
                    }
                    i = -1;
                    break;
                case 840862003:
                    if (r3.equals("matches")) {
                        i = 22;
                        break;
                    }
                    i = -1;
                    break;
                case 1255901423:
                    if (r3.equals("matchesWholeOwnText")) {
                        i = 23;
                        break;
                    }
                    i = -1;
                    break;
                case 1292941139:
                    if (r3.equals("first-of-type")) {
                        i = 24;
                        break;
                    }
                    i = -1;
                    break;
                case 1455900751:
                    if (r3.equals("only-of-type")) {
                        i = 25;
                        break;
                    }
                    i = -1;
                    break;
                case 1870740819:
                    if (r3.equals("matchesOwn")) {
                        i = 26;
                        break;
                    }
                    i = -1;
                    break;
                case 2014184485:
                    if (r3.equals("containsWholeText")) {
                        i = 27;
                        break;
                    }
                    i = -1;
                    break;
                case 2025926969:
                    if (r3.equals("last-of-type")) {
                        i = 28;
                        break;
                    }
                    i = -1;
                    break;
                default:
                    i = -1;
                    break;
            }
            switch (i) {
                case 0:
                    String F2 = t0.F(r());
                    aa1.b.I(F2, ":containsData(text) query must not be empty");
                    return new f(F2, 3);
                case 1:
                    return new e(2);
                case 2:
                    return M(false);
                case 3:
                    return E(false, false);
                case 4:
                    return E(true, false);
                case 5:
                    return new e(4);
                case 6:
                    return E(false, true);
                case 7:
                    return E(true, true);
                case 8:
                    return t(false);
                case 9:
                    return A(true);
                case 10:
                    return new i(m(), 0);
                case 11:
                    return new i(m(), 1);
                case 12:
                    if (!t0Var.E('(')) {
                        throw new ValidationException(":is() must have a selector");
                    }
                    n W = W();
                    if (t0Var.E(')')) {
                        return new t(W, 1);
                    }
                    throw new ValidationException(":is() must have a selector");
                case 13:
                    return new i(m(), 2);
                case 14:
                    if (!t0Var.E('(')) {
                        throw new ValidationException(":has() must have a selector");
                    }
                    n W2 = W();
                    if (!t0Var.E(')')) {
                        throw new ValidationException(":has() must have a selector");
                    }
                    u uVar = new u(W2);
                    if (W2 instanceof d) {
                        ArrayList arrayList = ((d) W2).a;
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            n nVar = (n) obj;
                            if (!(nVar instanceof xShadow) && !(nVar instanceof w)) {
                            }
                        }
                    }
                    return uVar;
                case 15:
                    String r4 = r();
                    aa1.b.I(r4, ":not(selector) subselect must not be empty");
                    return new t(N(r4), 2);
                case 16:
                    return new e(6);
                case 17:
                    return new o();
                case 18:
                    return new e(1);
                case 19:
                    return t(true);
                case 20:
                    e eVar_r7 = new e(7);
                    if (!e.b) {
                        e.b = true;
                        System.err.println("WARNING: :matchText selector is deprecated and will be removed in a future version. Use Element#selectNodes(String, Class) with selector ::textnode and class TextNode instead.");
                    }
                    return eVar_r7;
                case 21:
                    return new e(3);
                case 22:
                    return K(false);
                case 23:
                    return M(true);
                case 24:
                    return new j(0, 1, 3);
                case 25:
                    return new e(5);
                case 26:
                    return K(true);
                case 27:
                    return A(false);
                case 28:
                    return new k(0, 1, 2);
                default:
                    throw new Selector$SelectorParseException("Could not parse query '%s': unexpected token at '%s'", str, aVar.O());
            }
        }
        String r5 = t0Var.r();
        this.t = true;
        r5.getClass();
        switch (r5.hashCode()) {
            case 3076010:
                if (r5.equals("data")) {
                    i3 = 0;
                    break;
                }
                i3 = -1;
                break;
            case 3386882:
                if (r5.equals("node")) {
                    i3 = 1;
                    break;
                }
                i3 = -1;
                break;
            case 3556653:
                break;
            case 94504589:
                if (r5.equals("cdata")) {
                    i3 = 3;
                    break;
                }
                i3 = -1;
                break;
            case 950398559:
                if (r5.equals("comment")) {
                    i3 = 4;
                    break;
                }
                i3 = -1;
                break;
            case 1563127392:
                if (r5.equals("leafnode")) {
                    i3 = 5;
                    break;
                }
                i3 = -1;
                break;
            default:
                i3 = -1;
                break;
        }
        switch (i3) {
            case 0:
                pVar = new p(r5, 1);
                break;
            case 1:
                pVar = new p(r5, 1);
                break;
            case 2:
                pVar = new p(r5, 1);
                break;
            case 3:
                pVar = new p(r5, 1);
                break;
            case 4:
                pVar = new p(r5, 1);
                break;
            case 5:
                pVar = new p(r5, 1);
                break;
            default:
                throw new Selector$SelectorParseException("Could not parse query '%s': unknown node type '::%s'", str, r5);
        }
        while (true) {
            n e0 = e0();
            if (e0 == null) {
                this.t = false;
                return pVar;
            }
            pVar = f(pVar, e0);
        }
    }

    public final int m() {
        String trim = r().trim();
        boolean z = false;
        if (trim != null && trim.length() != 0) {
            int length = trim.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (!ba1.h.f(trim.charAt(i))) {
                    break;
                }
                i++;
            }
        }
        if (z) {
            return Integer.parseInt(trim);
        }
        throw new ValidationException("Index must be numeric");
    }

    public final String r() {
        return this.r.m('(', ')');
    }

    public final n t(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String F = t0.F(r());
        aa1.b.I(F, str.concat("(text) query must not be empty"));
        return this.t ? new p(F, 0) : z ? new f(F, 4) : new f(F, 5);
    }

    public final String toString() {
        return this.s;
    }
}

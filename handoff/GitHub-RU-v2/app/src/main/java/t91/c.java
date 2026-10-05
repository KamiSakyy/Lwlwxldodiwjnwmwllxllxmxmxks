package t91;

import b2.j0;
import d3.r;
import java.util.Collection;
import k71.k;
import k71.u;
import org.intellij.markdown.MarkdownParsingException;
import sy.n;
import w80.w3;
import x61.v;

/* loaded from: /home/user/work/p/classes5.dex */
public class c implements d {
    public static final c e = new c(new int[0], new char[0], new boolean[0], 0);
    public final int[] a;
    public final char[] b;
    public final boolean[] c;
    public final int d;

    public c(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        this.a = iArr;
        this.b = cArr;
        this.c = zArr;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c a(s91.c cVar) {
        c cVar2;
        c b;
        if (cVar != null) {
            String str = cVar.d;
            int i = cVar.b;
            if (i != -1 && !n.r(i, str)) {
                int i2 = 0;
                int g = (i <= 0 || str.charAt(i + (-1)) != '\t') ? 0 : (4 - (g() % 4)) % 4;
                int i3 = i;
                while (i3 < str.length() && str.charAt(i3) == ' ' && g < 3) {
                    g++;
                    i3++;
                }
                if (i3 != str.length()) {
                    s91.c f = cVar.f(i3 - i);
                    k.d(f);
                    a e2 = e(f);
                    if (e2 != null) {
                        char c = e2.b;
                        int i4 = e2.c;
                        int i5 = i3 + e2.a;
                        int i6 = 0;
                        int i7 = i5;
                        while (i7 < str.length()) {
                            char charAt = str.charAt(i7);
                            if (charAt != ' ') {
                                if (charAt != '\t') {
                                    break;
                                }
                                i6 = (4 - (i6 % 4)) + i6;
                            } else {
                                i6++;
                            }
                            i7++;
                        }
                        if (1 > i6 || i6 >= 5) {
                            cVar2 = null;
                        } else {
                            cVar2 = null;
                            if (i7 < str.length()) {
                                b = w3.b(this, g + i4 + i6, c, true, i7);
                                if (b != null) {
                                    return b;
                                }
                                int i8 = 0;
                                while (i < str.length() && str.charAt(i) == ' ' && i8 < 3) {
                                    i8++;
                                    i++;
                                }
                                if (i == str.length() || str.charAt(i) != '>') {
                                    return cVar2;
                                }
                                int i9 = i + 1;
                                if (i9 >= str.length() || str.charAt(i9) == ' ' || str.charAt(i9) == '\t') {
                                    if (i9 < str.length()) {
                                        i9 = i + 2;
                                    }
                                    i2 = 1;
                                }
                                return w3.b(this, i8 + 1 + i2, '>', true, i9);
                            }
                        }
                        b = ((i6 < 5 || i7 >= str.length()) && i7 != str.length()) ? cVar2 : w3.b(this, g + i4 + 1, c, true, Math.min(i7, i5 + 1));
                        if (b != null) {
                        }
                    }
                }
                b = null;
                cVar2 = null;
                if (b != null) {
                }
            }
        }
        return null;
    }

    public final c b(s91.c cVar) {
        if (cVar == null) {
            return f();
        }
        if (cVar.b != -1) {
            throw new MarkdownParsingException("given " + cVar);
        }
        String str = cVar.d;
        j0 j0Var = new j0(new u(), this.a.length, str, this, new r(str, 1));
        c f = f();
        while (true) {
            c cVar2 = (c) j0Var.k(f);
            if (cVar2.equals(f)) {
                return f;
            }
            f = cVar2;
        }
    }

    public final boolean c(int i) {
        Collection b0 = aa1.b.b0(0, i);
        if ((b0 instanceof Collection) && b0.isEmpty()) {
            return false;
        }
        v it = b0.iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            if (this.b[nextInt] != '>' && this.c[nextInt]) {
                return true;
            }
        }
        return false;
    }

    public c d(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        return new c(iArr, cArr, zArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r1 - r0) > 9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r1 >= r5.length()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r5.charAt(r1) == '.') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r5.charAt(r1) != ')') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r3 = (r1 + 1) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        return new t91.a(r5.charAt(r1), r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a e(s91.c cVar) {
        char charAt;
        int i = cVar.b;
        char charAt2 = ((CharSequence) cVar.e.s).charAt(cVar.c);
        if (charAt2 == '*' || charAt2 == '-' || charAt2 == '+') {
            return new a(charAt2, 1, 1);
        }
        String str = cVar.d;
        int i2 = i;
        while (i2 < str.length() && '0' <= (charAt = str.charAt(i2)) && charAt < ':') {
            i2++;
        }
        return null;
    }

    public c f() {
        return e;
    }

    public final int g() {
        int[] iArr = this.a;
        k.g(iArr, "<this>");
        Integer valueOf = iArr.length == 0 ? null : Integer.valueOf(iArr[iArr.length - 1]);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final boolean h(d dVar) {
        k.g(dVar, "other");
        if (!(dVar instanceof c)) {
            return false;
        }
        int length = this.a.length;
        int length2 = ((c) dVar).a.length;
        if (length < length2) {
            return false;
        }
        Collection b0 = aa1.b.b0(0, length2);
        if ((b0 instanceof Collection) && b0.isEmpty()) {
            return true;
        }
        v it = b0.iterator();
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            if (this.b[nextInt] != ((c) dVar).b[nextInt]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "MdConstraints: " + new String(this.b) + '(' + g() + ')';
    }
}

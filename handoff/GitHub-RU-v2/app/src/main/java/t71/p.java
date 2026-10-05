package t71;

import a0.s0;
import android.text.Editable;
import com.github.rudroid.uitoolkit.q2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import jo.f4;
import sy.d0;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class p extends w {
    public static boolean I(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        k71.k.g(charSequence, "<this>");
        k71.k.g(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (R(charSequence, (String) charSequence2, 0, z10, 2) >= 0) {
                return true;
            }
        } else if (P(charSequence, charSequence2, 0, charSequence.length(), z10, false) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean J(CharSequence charSequence, char c10) {
        k71.k.g(charSequence, "<this>");
        return Q(charSequence, c10, 0, 2) >= 0;
    }

    public static String K(String str, int i) {
        k71.k.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(i);
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static boolean L(CharSequence charSequence, String str) {
        return charSequence instanceof String ? w.x((String) charSequence, str, false) : Z(charSequence, charSequence.length() - str.length(), str, 0, str.length(), false);
    }

    public static boolean M(String str, char c10) {
        return str.length() > 0 && sy.r.p(str.charAt(N(str)), c10, false);
    }

    public static int N(CharSequence charSequence) {
        k71.k.g(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int O(CharSequence charSequence, String str, int i, boolean z10) {
        k71.k.g(charSequence, "<this>");
        k71.k.g(str, "string");
        return (z10 || !(charSequence instanceof String)) ? P(charSequence, str, i, charSequence.length(), z10, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final int P(CharSequence charSequence, CharSequence charSequence2, int i, int i10, boolean z10, boolean z11) {
        q71.e eVar;
        if (z11) {
            int N = N(charSequence);
            if (i > N) {
                i = N;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            eVar = new q71.e(i, i10, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i10 > length) {
                i10 = length;
            }
            eVar = new q71.g(i, i10, 1);
        }
        boolean z12 = charSequence instanceof String;
        int i11 = eVar.f30998t;
        int i12 = eVar.f30997s;
        int i13 = eVar.f30996r;
        if (!z12 || !(charSequence2 instanceof String)) {
            boolean z13 = z10;
            if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z14 = z13;
                    z13 = z14;
                    if (!Z(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                        if (i13 == i12) {
                            break;
                        }
                        i13 += i11;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i13;
                    }
                }
            }
        } else if ((i11 > 0 && i13 <= i12) || (i11 < 0 && i12 <= i13)) {
            int i14 = i13;
            while (true) {
                String str = (String) charSequence2;
                boolean z15 = z10;
                if (!w.A(0, i14, str.length(), str, (String) charSequence, z15)) {
                    if (i14 == i12) {
                        break;
                    }
                    i14 += i11;
                    z10 = z15;
                } else {
                    return i14;
                }
            }
        }
        return -1;
    }

    public static int Q(CharSequence charSequence, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        k71.k.g(charSequence, "<this>");
        return !(charSequence instanceof String) ? S(charSequence, new char[]{c10}, i, false) : ((String) charSequence).indexOf(c10, i);
    }

    public static /* synthetic */ int R(CharSequence charSequence, String str, int i, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return O(charSequence, str, i, z10);
    }

    public static final int S(CharSequence charSequence, char[] cArr, int i, boolean z10) {
        k71.k.g(charSequence, "<this>");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(x61.l.Y(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int N = N(charSequence);
        if (i > N) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c10 : cArr) {
                if (sy.r.p(c10, charAt, z10)) {
                    return i;
                }
            }
            if (i == N) {
                return -1;
            }
            i++;
        }
    }

    public static boolean T(CharSequence charSequence) {
        k71.k.g(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!sy.r.s(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static char U(CharSequence charSequence) {
        k71.k.g(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(N(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static int V(int i, CharSequence charSequence, String str) {
        int N = (i & 2) != 0 ? N(charSequence) : 0;
        k71.k.g(charSequence, "<this>");
        k71.k.g(str, "string");
        return !(charSequence instanceof String) ? P(charSequence, str, N, 0, false, true) : ((String) charSequence).lastIndexOf(str, N);
    }

    public static int W(CharSequence charSequence, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = N(charSequence);
        }
        k71.k.g(charSequence, "<this>");
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(c10, i);
        }
        char[] cArr = {c10};
        if (charSequence instanceof String) {
            return ((String) charSequence).lastIndexOf(x61.l.Y(cArr), i);
        }
        int N = N(charSequence);
        if (i > N) {
            i = N;
        }
        while (-1 < i) {
            if (sy.r.p(cArr[0], charSequence.charAt(i), false)) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public static List X(CharSequence charSequence) {
        k71.k.g(charSequence, "<this>");
        return s71.j.l0(new kotlin.io.k(3, charSequence));
    }

    public static String Y(String str, int i, char c10) {
        CharSequence charSequence;
        k71.k.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Desired length ", i, " is less than zero."));
        }
        if (i <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c10);
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequence = sb2;
        }
        return charSequence.toString();
    }

    public static final boolean Z(CharSequence charSequence, int i, CharSequence charSequence2, int i10, int i11, boolean z10) {
        k71.k.g(charSequence, "<this>");
        k71.k.g(charSequence2, "other");
        if (i10 < 0 || i < 0 || i > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!sy.r.p(charSequence.charAt(i + i12), charSequence2.charAt(i10 + i12), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String a0(String str, String str2) {
        k71.k.g(str, "<this>");
        if (!i0(str, str2)) {
            return str;
        }
        String substring = str.substring(str2.length());
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String b0(String str, String str2) {
        if (!L(str, str2)) {
            return str;
        }
        String substring = str.substring(0, str.length() - str2.length());
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static StringBuilder c0(CharSequence charSequence, int i, int i10, CharSequence charSequence2) {
        k71.k.g(charSequence, "<this>");
        k71.k.g(charSequence2, "replacement");
        if (i10 < i) {
            throw new IndexOutOfBoundsException(f4.h(i10, i, "End index (", ") is less than start index (", ")."));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence, 0, i);
        sb2.append(charSequence2);
        sb2.append(charSequence, i10, charSequence.length());
        return sb2;
    }

    public static final void d0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(no.a.k("Limit must be non-negative, but was ", i).toString());
        }
    }

    public static final List e0(int i, CharSequence charSequence, String str) {
        d0(i);
        int O = O(charSequence, str, 0, false);
        if (O == -1 || i == 1) {
            return d0.n(charSequence.toString());
        }
        boolean z10 = i > 0;
        int i10 = 10;
        if (z10 && i <= 10) {
            i10 = i;
        }
        ArrayList arrayList = new ArrayList(i10);
        int i11 = 0;
        do {
            arrayList.add(charSequence.subSequence(i11, O).toString());
            i11 = str.length() + O;
            if (z10 && arrayList.size() == i - 1) {
                break;
            }
            O = O(charSequence, str, i11, false);
        } while (O != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static List f0(CharSequence charSequence, char[] cArr, int i) {
        int i10 = (i & 4) != 0 ? 0 : 2;
        k71.k.g(charSequence, "<this>");
        if (cArr.length == 1) {
            return e0(i10, charSequence, String.valueOf(cArr[0]));
        }
        d0(i10);
        i81.h hVar = new i81.h(1, new c(charSequence, i10, new pc.j(11, cArr)));
        ArrayList arrayList = new ArrayList(x61.n.F(hVar, 10));
        Iterator it = hVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            q71.g gVar = (q71.g) bVar.next();
            k71.k.g(gVar, "range");
            arrayList.add(charSequence.subSequence(gVar.f30996r, gVar.f30997s + 1).toString());
        }
    }

    public static List g0(CharSequence charSequence, String[] strArr, int i) {
        int i10 = (i & 4) != 0 ? 0 : 2;
        k71.k.g(charSequence, "<this>");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return e0(i10, charSequence, str);
            }
        }
        d0(i10);
        i81.h hVar = new i81.h(1, new c(charSequence, i10, new q2(4, x61.l.r(strArr))));
        ArrayList arrayList = new ArrayList(x61.n.F(hVar, 10));
        Iterator it = hVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            q71.g gVar = (q71.g) bVar.next();
            k71.k.g(gVar, "range");
            arrayList.add(charSequence.subSequence(gVar.f30996r, gVar.f30997s + 1).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean h0(Editable editable, String str, int i) {
        return editable instanceof String ? w.E(i, (String) editable, str, false) : Z(editable, i, str, 0, str.length(), false);
    }

    public static boolean i0(CharSequence charSequence, String str) {
        k71.k.g(charSequence, "<this>");
        return charSequence instanceof String ? w.F((String) charSequence, str, false) : Z(charSequence, 0, str, 0, str.length(), false);
    }

    public static boolean j0(String str, char c10) {
        return str.length() > 0 && sy.r.p(str.charAt(0), c10, false);
    }

    public static String k0(char c10, String str, String str2) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "missingDelimiterValue");
        int Q = Q(str, c10, 0, 6);
        if (Q == -1) {
            return str2;
        }
        String substring = str.substring(Q + 1, str.length());
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String l0(String str, String str2, String str3) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "delimiter");
        k71.k.g(str3, "missingDelimiterValue");
        int R = R(str, str2, 0, false, 6);
        if (R == -1) {
            return str3;
        }
        String substring = str.substring(str2.length() + R, str.length());
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String m0(char c10, String str, String str2) {
        k71.k.g(str, "<this>");
        k71.k.g(str2, "missingDelimiterValue");
        int W = W(str, c10, 0, 6);
        if (W == -1) {
            return str2;
        }
        String substring = str.substring(W + 1, str.length());
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String n0(String str, String str2) {
        k71.k.g(str, "<this>");
        k71.k.g(str, "missingDelimiterValue");
        int V = V(6, str, str2);
        if (V == -1) {
            return str;
        }
        String substring = str.substring(str2.length() + V, str.length());
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String o0(String str, char c10) {
        int Q = Q(str, c10, 0, 6);
        if (Q == -1) {
            return str;
        }
        String substring = str.substring(0, Q);
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String p0(String str, String str2) {
        k71.k.g(str, "<this>");
        k71.k.g(str, "missingDelimiterValue");
        int R = R(str, str2, 0, false, 6);
        if (R == -1) {
            return str;
        }
        String substring = str.substring(0, R);
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String q0(String str, char c10) {
        k71.k.g(str, "<this>");
        k71.k.g(str, "missingDelimiterValue");
        int W = W(str, c10, 0, 6);
        if (W == -1) {
            return str;
        }
        String substring = str.substring(0, W);
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static String r0(String str, int i) {
        k71.k.g(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(s0.i("Requested character count ", i, " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String substring = str.substring(0, i);
        k71.k.f(substring, "substring(...)");
        return substring;
    }

    public static Boolean s0(String str) {
        k71.k.g(str, "<this>");
        if (str.equals("true")) {
            return Boolean.TRUE;
        }
        if (str.equals("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static CharSequence t0(CharSequence charSequence) {
        k71.k.g(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z10 = false;
        while (i <= length) {
            boolean s2 = sy.r.s(charSequence.charAt(!z10 ? i : length));
            if (z10) {
                if (!s2) {
                    break;
                }
                length--;
            } else if (s2) {
                i++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static String u0(String str, char... cArr) {
        k71.k.g(str, "<this>");
        int length = str.length() - 1;
        int i = 0;
        boolean z10 = false;
        while (i <= length) {
            char charAt = str.charAt(!z10 ? i : length);
            int length2 = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    i10 = -1;
                    break;
                }
                if (charAt == cArr[i10]) {
                    break;
                }
                i10++;
            }
            boolean z11 = i10 >= 0;
            if (z10) {
                if (!z11) {
                    break;
                }
                length--;
            } else if (z11) {
                i++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }
}

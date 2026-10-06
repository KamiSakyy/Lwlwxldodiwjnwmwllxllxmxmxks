package i3;

import android.content.res.TypedArray;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.i4;
import h3.h;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import k1.m0;
import k71.k;
import x.i;
import x61.l;

/* loaded from: /home/user/work/p/classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25774a;

    /* renamed from: b, reason: collision with root package name */
    public int f25775b;

    /* renamed from: c, reason: collision with root package name */
    public int f25776c;

    /* renamed from: d, reason: collision with root package name */
    public Object f25777d;

    /* renamed from: e, reason: collision with root package name */
    public Object f25778e;

    public void a(int i) {
        int i10 = this.f25775b;
        int i11 = this.f25776c;
        boolean z10 = false;
        if (i <= i11 && i10 <= i) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        StringBuilder m = i.m(i, i10, "Invalid offset: ", ". Valid range is [", " , ");
        m.append(i11);
        m.append(']');
        m3.a.a(m.toString());
    }

    public int b() {
        m0 m0Var = (m0) this.f25778e;
        if (m0Var == null) {
            return ((String) this.f25777d).length();
        }
        return (m0Var.f27615b - m0Var.c()) + (((String) this.f25777d).length() - (this.f25776c - this.f25775b));
    }

    public boolean c(int i) {
        CharSequence charSequence = (CharSequence) this.f25777d;
        int i10 = this.f25775b + 1;
        if (i > this.f25776c || i10 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i11 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i11))) {
                if (!u5.i.d()) {
                    return false;
                }
                u5.i a10 = u5.i.a();
                if (a10.c() != 1 || a10.b(i11, charSequence) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean d(int i) {
        int i10 = this.f25775b + 1;
        if (i > this.f25776c || i10 > i) {
            return false;
        }
        return i4.e0(Character.codePointBefore((CharSequence) this.f25777d, i));
    }

    public boolean e(int i) {
        a(i);
        if (!((BreakIterator) this.f25778e).isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f25777d).length() - 1 || !(f(i) || f(i + 1));
    }

    public boolean f(int i) {
        CharSequence charSequence = (CharSequence) this.f25777d;
        int i10 = i - 1;
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(charSequence.charAt(i10));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (k.b(of2, unicodeBlock) && k.b(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return k.b(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && k.b(Character.UnicodeBlock.of(charSequence.charAt(i10)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean g(int i) {
        CharSequence charSequence = (CharSequence) this.f25777d;
        int i10 = this.f25775b;
        if (i >= this.f25776c || i10 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!u5.i.d()) {
                return false;
            }
            u5.i a10 = u5.i.a();
            if (a10.c() != 1 || a10.b(i, charSequence) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i) {
        int i10 = this.f25775b;
        if (i >= this.f25776c || i10 > i) {
            return false;
        }
        return i4.e0(Character.codePointAt((CharSequence) this.f25777d, i));
    }

    public int i(int i) {
        a(i);
        int following = ((BreakIterator) this.f25778e).following(i);
        return (g(following + (-1)) && g(following) && !f(following)) ? i(following) : following;
    }

    public int j(int i) {
        a(i);
        int preceding = ((BreakIterator) this.f25778e).preceding(i);
        return (g(preceding) && c(preceding) && !f(preceding)) ? j(preceding) : preceding;
    }

    public void k(int i, String str, int i10) {
        if (i > i10) {
            m3.a.a("start index must be less than or equal to end index: " + i + " > " + i10);
        }
        if (i < 0) {
            m3.a.a("start must be non-negative, but was " + i);
        }
        m0 m0Var = (m0) this.f25778e;
        if (m0Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.f25777d).length() - i10, 64);
            String str2 = (String) this.f25777d;
            int i11 = i - min;
            k.e(str2, "null cannot be cast to non-null type java.lang.String");
            str2.getChars(i11, i, cArr, 0);
            String str3 = (String) this.f25777d;
            int i12 = max - min2;
            int i13 = min2 + i10;
            k.e(str3, "null cannot be cast to non-null type java.lang.String");
            str3.getChars(i10, i13, cArr, i12);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            m0 m0Var2 = new m0(1);
            m0Var2.f27615b = max;
            m0Var2.f27618e = cArr;
            m0Var2.f27616c = length;
            m0Var2.f27617d = i12;
            this.f25778e = m0Var2;
            this.f25775b = i11;
            this.f25776c = i13;
            return;
        }
        int i14 = this.f25775b;
        int i15 = i - i14;
        int i16 = i10 - i14;
        if (i15 < 0 || i16 > m0Var.f27615b - m0Var.c()) {
            this.f25777d = toString();
            this.f25778e = null;
            this.f25775b = -1;
            this.f25776c = -1;
            k(i, str, i10);
            return;
        }
        int length2 = str.length() - (i16 - i15);
        if (length2 > m0Var.c()) {
            int c10 = length2 - m0Var.c();
            int i17 = m0Var.f27615b;
            do {
                i17 *= 2;
            } while (i17 - m0Var.f27615b < c10);
            char[] cArr2 = new char[i17];
            l.y((char[]) m0Var.f27618e, cArr2, 0, 0, m0Var.f27616c);
            int i18 = m0Var.f27615b;
            int i19 = m0Var.f27617d;
            int i20 = i18 - i19;
            int i21 = i17 - i20;
            l.y((char[]) m0Var.f27618e, cArr2, i21, i19, i20 + i19);
            m0Var.f27618e = cArr2;
            m0Var.f27615b = i17;
            m0Var.f27617d = i21;
        }
        int i22 = m0Var.f27616c;
        if (i15 < i22 && i16 <= i22) {
            int i23 = i22 - i16;
            char[] cArr3 = (char[]) m0Var.f27618e;
            l.y(cArr3, cArr3, m0Var.f27617d - i23, i16, i22);
            m0Var.f27616c = i15;
            m0Var.f27617d -= i23;
        } else if (i15 >= i22 || i16 < i22) {
            int c11 = m0Var.c() + i15;
            int c12 = m0Var.c() + i16;
            int i24 = m0Var.f27617d;
            char[] cArr4 = (char[]) m0Var.f27618e;
            l.y(cArr4, cArr4, m0Var.f27616c, i24, c11);
            m0Var.f27616c += c11 - i24;
            m0Var.f27617d = c12;
        } else {
            m0Var.f27617d = m0Var.c() + i16;
            m0Var.f27616c = i15;
        }
        str.getChars(0, str.length(), (char[]) m0Var.f27618e, m0Var.f27616c);
        m0Var.f27616c = str.length() + m0Var.f27616c;
    }

    public String toString() {
        switch (this.f25774a) {
            case 1:
                m0 m0Var = (m0) this.f25778e;
                if (m0Var == null) {
                    return (String) this.f25777d;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.f25777d, 0, this.f25775b);
                sb2.append((char[]) m0Var.f27618e, 0, m0Var.f27616c);
                char[] cArr = (char[]) m0Var.f27618e;
                int i = m0Var.f27617d;
                sb2.append(cArr, i, m0Var.f27615b - i);
                String str = (String) this.f25777d;
                sb2.append((CharSequence) str, this.f25776c, str.length());
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e(CharSequence charSequence, int i, Locale locale) {
        this.f25774a = 0;
        this.f25777d = charSequence;
        if (charSequence.length() < 0) {
            m3.a.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            m3.a.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f25778e = wordInstance;
        this.f25775b = Math.max(0, -50);
        this.f25776c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new h(i, charSequence));
    }

    public e(y31.l lVar, l51.h hVar) {
        this.f25774a = 2;
        this.f25777d = new SparseArray();
        this.f25778e = lVar;
        TypedArray typedArray = (TypedArray) hVar.t;
        this.f25775b = typedArray.getResourceId(28, 0);
        this.f25776c = typedArray.getResourceId(53, 0);
    }
    public Object b = null;
    public Object c = null;
    public Object d = null;
}

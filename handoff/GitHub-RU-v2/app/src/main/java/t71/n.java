package t71;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes.dex */
public final class n implements Serializable {

    /* renamed from: r, reason: collision with root package name */
    public final Pattern f32141r;

    public n(String str, o oVar) {
        k71.k.g(str, "pattern");
        int i = oVar.f32146r;
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        k71.k.f(compile, "compile(...)");
        this.f32141r = compile;
    }

    public static kotlin.io.g b(n nVar, CharSequence charSequence) {
        nVar.getClass();
        k71.k.g(charSequence, "input");
        if (charSequence.length() >= 0) {
            return new kotlin.io.g(1, new nf.j(18, nVar, charSequence), m.f32140z);
        }
        StringBuilder o5 = x.i.o("Start index out of bounds: ", 0, ", input length: ");
        o5.append(charSequence.length());
        throw new IndexOutOfBoundsException(o5.toString());
    }

    public final l a(CharSequence charSequence) {
        k71.k.g(charSequence, "input");
        Matcher matcher = this.f32141r.matcher(charSequence);
        k71.k.f(matcher, "matcher(...)");
        return sy.t.a(matcher, 0, charSequence);
    }

    public final l c(String str, int i) {
        k71.k.g(str, "input");
        Matcher region = this.f32141r.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new l(region, str);
        }
        return null;
    }

    public final l d(String str) {
        k71.k.g(str, "input");
        Matcher matcher = this.f32141r.matcher(str);
        k71.k.f(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new l(matcher, str);
        }
        return null;
    }

    public final boolean e(CharSequence charSequence) {
        k71.k.g(charSequence, "input");
        return this.f32141r.matcher(charSequence).matches();
    }

    public final String f(CharSequence charSequence, j71.c cVar) {
        k71.k.g(charSequence, "input");
        l a10 = a(charSequence);
        if (a10 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i = 0;
        do {
            sb2.append(charSequence, i, a10.b().f30996r);
            sb2.append((CharSequence) cVar.k(a10));
            i = a10.b().f30997s + 1;
            a10 = a10.d();
            if (i >= length) {
                break;
            }
        } while (a10 != null);
        if (i < length) {
            sb2.append(charSequence, i, length);
        }
        String sb3 = sb2.toString();
        k71.k.f(sb3, "toString(...)");
        return sb3;
    }

    public final String g(String str, String str2) {
        k71.k.g(str, "input");
        String replaceAll = this.f32141r.matcher(str).replaceAll(str2);
        k71.k.f(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f32141r.toString();
        k71.k.f(pattern, "toString(...)");
        return pattern;
    }

    public n(String str) {
        k71.k.g(str, "pattern");
        Pattern compile = Pattern.compile(str);
        k71.k.f(compile, "compile(...)");
        this.f32141r = compile;
    }

    public n(String str, Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((o) ((d) it.next())).f32146r;
        }
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        k71.k.f(compile, "compile(...)");
        this.f32141r = compile;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class o<T1,T2,T3,T4> {
        public o() {
        }
    }
}

package f1;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final q71.g f23116a;

    /* renamed from: b, reason: collision with root package name */
    public final n2 f23117b;

    /* renamed from: c, reason: collision with root package name */
    public final h1.g0 f23118c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23119d;

    /* renamed from: e, reason: collision with root package name */
    public final String f23120e;

    public k2(q71.g gVar, n2 n2Var, h1.g0 g0Var, t2 t2Var, String str, String str2, String str3) {
        this.f23116a = gVar;
        this.f23117b = n2Var;
        this.f23118c = g0Var;
        this.f23119d = str;
        this.f23120e = str2;
    }

    public final String a(h1.y yVar, Locale locale) {
        if (yVar == null) {
            String upperCase = this.f23118c.f25326a.toUpperCase(Locale.ROOT);
            k71.k.f(upperCase, "toUpperCase(...)");
            Object[] copyOf = Arrays.copyOf(new Object[]{upperCase}, 1);
            return String.format(this.f23119d, Arrays.copyOf(copyOf, copyOf.length));
        }
        int i = yVar.f25446r;
        q71.g gVar = this.f23116a;
        if (gVar.a(i)) {
            this.f23117b.getClass();
            return "";
        }
        Object[] copyOf2 = Arrays.copyOf(new Object[]{w0.a(gVar.f30996r, locale), w0.a(gVar.f30997s, locale)}, 2);
        return String.format(this.f23120e, Arrays.copyOf(copyOf2, copyOf2.length));
    }
}

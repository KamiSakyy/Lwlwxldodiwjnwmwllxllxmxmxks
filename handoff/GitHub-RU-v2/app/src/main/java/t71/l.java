package t71;

import java.util.List;
import java.util.regex.Matcher;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public Matcher f32136a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f32137b;

    /* renamed from: c, reason: collision with root package name */
    public o1.l f32138c;

    /* renamed from: d, reason: collision with root package name */
    public k f32139d;

    public l(Matcher matcher, CharSequence charSequence) {
        k71.k.g(charSequence, "input");
        this.f32136a = matcher;
        this.f32137b = charSequence;
        this.f32138c = new o1.l(1, this);
    }

    public final List a() {
        if (this.f32139d == null) {
            this.f32139d = new k(this);
        }
        x61.e eVar = this.f32139d;
        k71.k.d(eVar);
        return eVar;
    }

    public final q71.g b() {
        Matcher matcher = this.f32136a;
        return aa1.b.b0(matcher.start(), matcher.end());
    }

    public final String c() {
        String group = this.f32136a.group();
        k71.k.f(group, "group(...)");
        return group;
    }

    public final l d() {
        Matcher matcher = this.f32136a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f32137b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        k71.k.f(matcher2, "matcher(...)");
        return sy.t.a(matcher2, end, charSequence);
    }

    public l(Object... a) {
    }
    public Object b(Object p1) { return null; }
    public Object c = null;
    public Object b(int p1) { return null; }
}

package h1;

/* loaded from: /home/user/work/p/classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public String f25326a;

    /* renamed from: b, reason: collision with root package name */
    public char f25327b;

    /* renamed from: c, reason: collision with root package name */
    public String f25328c;

    public g0(String str, char c10) {
        this.f25326a = str;
        this.f25327b = c10;
        this.f25328c = t71.w.C(str, String.valueOf(c10), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.f25326a, g0Var.f25326a) && this.f25327b == g0Var.f25327b;
    }

    public final int hashCode() {
        return Character.hashCode(this.f25327b) + (this.f25326a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.f25326a + ", delimiter=" + this.f25327b + ')';
    }
    public Object c = null;
}

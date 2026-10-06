package xn;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z3 {
    public final String a;

    public z3(String str) {
        k71.k.g(str, "slug");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3) && k71.k.b(this.a, ((z3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("SkillExecution(slug=", this.a, ")");
    }
}

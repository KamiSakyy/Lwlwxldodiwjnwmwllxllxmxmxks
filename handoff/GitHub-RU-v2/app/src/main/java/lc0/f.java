package lc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final b a;

    public f(b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnUser(achievements=" + this.a + ")";
    }
}

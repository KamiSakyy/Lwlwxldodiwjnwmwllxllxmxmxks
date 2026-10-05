package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class au {
    public final cu a;

    public au(cu cuVar) {
        this.a = cuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au) && k71.k.b(this.a, ((au) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(stargazers=" + this.a + ")";
    }
}

package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jt {
    public ft a;

    public jt(ft ftVar) {
        this.a = ftVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jt) && k71.k.b(this.a, ((jt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(forks=" + this.a + ")";
    }
}

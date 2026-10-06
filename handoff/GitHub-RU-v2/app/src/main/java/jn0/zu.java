package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zu {
    public final vu a;

    public zu(vu vuVar) {
        this.a = vuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zu) && k71.k.b(this.a, ((zu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(contributors=" + this.a + ")";
    }
}

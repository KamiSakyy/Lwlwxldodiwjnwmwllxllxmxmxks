package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class iu {
    public ku a;

    public iu(ku kuVar) {
        this.a = kuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu) && k71.k.b(this.a, ((iu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRepository(watchers=" + this.a + ")";
    }
}

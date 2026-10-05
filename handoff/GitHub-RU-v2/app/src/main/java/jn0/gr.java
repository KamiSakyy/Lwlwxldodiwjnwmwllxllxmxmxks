package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class gr {
    public final ir a;

    public gr(ir irVar) {
        this.a = irVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr) && k71.k.b(this.a, ((gr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnReactable(reactions=" + this.a + ")";
    }
}

package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ep {
    public gp a;

    public ep(gp gpVar) {
        this.a = gpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep) && k71.k.b(this.a, ((ep) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnReactable(reactions=" + this.a + ")";
    }
}

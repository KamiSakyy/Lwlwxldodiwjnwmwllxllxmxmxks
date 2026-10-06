package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zn {
    public bo a;

    public zn(bo boVar) {
        this.a = boVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zn) && k71.k.b(this.a, ((zn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnReactable(reactions=" + this.a + ")";
    }
}

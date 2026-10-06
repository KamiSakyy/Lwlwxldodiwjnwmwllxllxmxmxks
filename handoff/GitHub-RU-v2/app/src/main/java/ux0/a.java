package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public d a;

    public a(d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        d dVar = this.a;
        if (dVar == null) {
            return 0;
        }
        return dVar.hashCode();
    }

    public final String toString() {
        return "AddProjectV2ItemById(item=" + this.a + ")";
    }
}

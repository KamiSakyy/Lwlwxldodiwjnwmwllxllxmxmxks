package d00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public u a;

    public t(u uVar) {
        this.a = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && k71.k.b(this.a, ((t) obj).a);
    }

    public final int hashCode() {
        u uVar = this.a;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }

    public final String toString() {
        return "OnProjectV2Owner(projectV2=" + this.a + ")";
    }
}

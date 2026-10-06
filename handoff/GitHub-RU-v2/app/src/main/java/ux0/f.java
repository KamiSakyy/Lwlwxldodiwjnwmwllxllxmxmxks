package ux0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public i a;

    public f(i iVar) {
        this.a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        i iVar = this.a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }

    public final String toString() {
        return "ClearProjectV2ItemFieldValue(projectV2Item=" + this.a + ")";
    }
}

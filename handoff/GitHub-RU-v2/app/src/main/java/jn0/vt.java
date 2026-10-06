package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vt {
    public String a;

    public vt(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt) && k71.k.b(this.a, ((vt) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("RemoveDashboardSearchShortcut(clientMutationId=", this.a, ")");
    }
}

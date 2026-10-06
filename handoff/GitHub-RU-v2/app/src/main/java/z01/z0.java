package z01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 implements a1 {
    public String a;

    public z0(String str) {
        k71.k.g(str, "groupId");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && k71.k.b(this.a, ((z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("RefreshItemsNeeded(groupId=", this.a, ")");
    }
}

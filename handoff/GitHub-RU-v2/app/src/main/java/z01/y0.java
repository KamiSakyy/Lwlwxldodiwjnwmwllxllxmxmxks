package z01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 implements a1 {
    public final String a;

    public y0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y0) && k71.k.b(this.a, ((y0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("RefreshGroupsNeeded(newGroupName=", this.a, ")");
    }
}

package c10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public final String a;

    public j(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && k71.k.b(this.a, ((j) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnWorkflow(id=", this.a, ")");
    }
}

package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xi0 {
    public String a;

    public xi0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xi0) && k71.k.b(this.a, ((xi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("CopilotEndpoints(api=", this.a, ")");
    }
}

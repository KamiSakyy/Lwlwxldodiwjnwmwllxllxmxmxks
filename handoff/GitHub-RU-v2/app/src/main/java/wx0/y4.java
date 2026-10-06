package wx0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y4 {
    public String a;

    public y4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4) && k71.k.b(this.a, ((y4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("OnUser(login=", this.a, ")");
    }
}

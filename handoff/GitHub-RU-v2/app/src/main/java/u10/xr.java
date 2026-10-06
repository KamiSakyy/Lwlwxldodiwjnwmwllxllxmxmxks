package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xr {
    public String a;

    public xr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xr) && k71.k.b(this.a, ((xr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("Submodule(gitUrl=", this.a, ")");
    }
}

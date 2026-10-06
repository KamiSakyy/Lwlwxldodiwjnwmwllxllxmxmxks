package yo;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final Boolean a;

    public a(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k71.k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return m0.e(this.a, "CancelWorkflowRun(success=", ")");
    }
}

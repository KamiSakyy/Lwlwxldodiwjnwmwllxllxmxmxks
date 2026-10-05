package c11;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c implements f {
    public final String a;

    public c(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && k.b(this.a, ((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("ResolvedWorkflow(workflowId=", this.a, ")");
    }
}

package j20;

import aa.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g implements m0 {
    public f a;

    public g(f fVar) {
        this.a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && k71.k.b(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        f fVar = this.a;
        if (fVar == null) {
            return 0;
        }
        return fVar.hashCode();
    }

    public final String toString() {
        return "Data(createCompletedWorkflowLogsAccess=" + this.a + ")";
    }
}

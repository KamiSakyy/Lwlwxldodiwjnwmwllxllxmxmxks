package j20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;

    public f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && k71.k.b(this.a, ((f) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return f1.e.z("CreateCompletedWorkflowLogsAccess(downloadUrl=", this.a, ")");
    }
}

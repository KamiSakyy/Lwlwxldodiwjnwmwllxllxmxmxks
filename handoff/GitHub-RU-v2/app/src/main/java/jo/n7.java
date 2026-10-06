package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n7 {
    public String a;
    public String b;
    public String c;

    public n7(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7)) {
            return false;
        }
        n7 n7Var = (n7) obj;
        return k71.k.b(this.a, n7Var.a) && k71.k.b(this.b, n7Var.b) && k71.k.b(this.c, n7Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Task(taskId=", this.a, ", title=", this.b, ", __typename="), this.c, ")");
    }
}

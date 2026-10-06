package fp;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public String a;
    public String b;
    public hp.o c;

    public u(String str, String str2, hp.o oVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", taskId=", this.b, ", copilotAgentTaskFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}

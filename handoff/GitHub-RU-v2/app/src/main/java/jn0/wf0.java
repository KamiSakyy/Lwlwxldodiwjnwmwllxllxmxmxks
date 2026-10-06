package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class wf0 {
    public vf0 a;
    public String b;
    public String c;

    public wf0(vf0 vf0Var, String str, String str2) {
        this.a = vf0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wf0)) {
            return false;
        }
        wf0 wf0Var = (wf0) obj;
        return k71.k.b(this.a, wf0Var.a) && k71.k.b(this.b, wf0Var.b) && k71.k.b(this.c, wf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Viewer(notificationThreads=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}

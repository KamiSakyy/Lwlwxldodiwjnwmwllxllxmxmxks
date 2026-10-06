package l01;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public d0 e;

    public y0(String str, String str2, String str3, String str4, d0 d0Var) {
        k71.k.g(str, "projectId");
        k71.k.g(str2, "itemId");
        k71.k.g(str3, "fieldId");
        k71.k.g(str4, "fullDatabaseId");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c) && k71.k.b(this.d, y0Var.d) && k71.k.b(this.e, y0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UpdateProjectItemFieldInput(projectId=", this.a, ", itemId=", this.b, ", fieldId=");
        f1.e.x(o, this.c, ", fullDatabaseId=", this.d, ", value=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
}

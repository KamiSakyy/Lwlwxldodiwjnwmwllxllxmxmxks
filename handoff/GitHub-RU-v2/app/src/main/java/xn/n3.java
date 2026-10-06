package xn;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n3 implements y3 {
    public long a;
    public String b;
    public String c;
    public String d;
    public ArrayList e;

    public n3(long j, String str, String str2, String str3, ArrayList arrayList) {
        k71.k.g(str, "eventType");
        k71.k.g(str2, "eventContent");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    @Override // xn.y3
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3)) {
            return false;
        }
        n3 n3Var = (n3) obj;
        return this.a == n3Var.a && k71.k.b(this.b, n3Var.b) && k71.k.b(this.c, n3Var.c) && k71.k.b(this.d, n3Var.d) && this.e.equals(n3Var.e);
    }

    public final int hashCode() {
        int hashCode = (((this.c.hashCode() + com.github.rudroid.copilot.h1.i(Long.hashCode(this.a) * 31, this.b, 31)) * 31) - 388552525) * 31;
        String str = this.d;
        return this.e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeScanningAlert(userDatabaseId=");
        sb.append(this.a);
        sb.append(", eventType=");
        sb.append(this.b);
        f1.e.x(sb, ", eventContent=", this.c, ", label=code scanning alerts, url=", this.d);
        sb.append(", globalId=null, alertNumbers=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}

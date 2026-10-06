package xn;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public static final w0 Companion = new w0();
    public String a;
    public String b;
    public eShadow c;
    public String d;
    public String e;
    public String f;
    public long g;
    public long h;
    public long i;
    public int j;
    public ArrayList k;
    public ArrayList l;
    public List m;
    public Boolean n;

    public x0(String str, String str2, eShadow eVar, String str3, String str4, String str5, long j, long j2, long j3, int i, ArrayList arrayList, ArrayList arrayList2, List list, Boolean bool) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        k71.k.g(eVar, "state");
        k71.k.g(str3, "createdAt");
        k71.k.g(str4, "lastUpdatedAt");
        k71.k.g(list, "userCollaborators");
        this.a = str;
        this.b = str2;
        this.c = eVar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = i;
        this.k = arrayList;
        this.l = arrayList2;
        this.m = list;
        this.n = bool;
    }

    public final f a() {
        ArrayList arrayList = this.k;
        int i = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (k71.k.b(((c) obj).d, "copilot-developer-cli")) {
                    return f.r;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                if (k71.k.b(((c) obj2).d, "vscode-chat")) {
                    return f.t;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int size3 = arrayList.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList.get(i4);
                i4++;
                if (((c) obj3).a == 1693627) {
                    return f.r;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            int size4 = arrayList.size();
            while (i < size4) {
                Object obj4 = arrayList.get(i);
                i++;
                if (((c) obj4).a == 797352) {
                    return f.t;
                }
            }
        }
        return f.s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b) && this.c == x0Var.c && k71.k.b(this.d, x0Var.d) && k71.k.b(this.e, x0Var.e) && k71.k.b(this.f, x0Var.f) && this.g == x0Var.g && this.h == x0Var.h && this.i == x0Var.i && this.j == x0Var.j && this.k.equals(x0Var.k) && this.l.equals(x0Var.l) && k71.k.b(this.m, x0Var.m) && k71.k.b(this.n, x0Var.n);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31);
        String str = this.f;
        int c = f1.e.c(this.m, no.a.b(this.l, no.a.b(this.k, a0.s0.b(this.j, x.i.c(x.i.c(x.i.c((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31), 31), 31), 31);
        Boolean bool = this.n;
        return c + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("CopilotAgentTask(id=", this.a, ", name=", this.b, ", state=");
        o.append(this.c);
        o.append(", createdAt=");
        o.append(this.d);
        o.append(", lastUpdatedAt=");
        f1.e.x(o, this.e, ", archivedAt=", this.f, ", creatorId=");
        o.append(this.g);
        o.append(", ownerId=");
        o.append(this.h);
        o.append(", repoId=");
        o.append(this.i);
        o.append(", sessionCount=");
        o.append(this.j);
        o.append(", agentCollaborators=");
        o.append(this.k);
        o.append(", artifacts=");
        o.append(this.l);
        o.append(", userCollaborators=");
        o.append(this.m);
        o.append(", remoteSteerable=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}

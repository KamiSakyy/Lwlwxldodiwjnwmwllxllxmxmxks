package sj;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import f1.e;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final a Companion = new a();
    public String a;
    public String b;
    public String c;
    public boolean d;
    public boolean e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;

    public b(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        k.g(str, "agentTaskId");
        k.g(str2, "agentTaskTitle");
        k.g(str3, "agentTaskState");
        k.g(str4, "taskUri");
        k.g(str5, "agentTaskRepoOwner");
        k.g(str6, "agentTaskRepoName");
        k.g(str7, "rowLastUpdated");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && k.b(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && k.b(this.f, bVar.f) && k.b(this.g, bVar.g) && k.b(this.h, bVar.h) && this.i == bVar.i && k.b(this.j, bVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + s0.b(this.i, h1.i(h1.i(h1.i(i.e(i.e(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), 31, this.e), this.f, 31), this.g, 31), this.h, 31), 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentTaskEntry(agentTaskId=", this.a, ", agentTaskTitle=", this.b, ", agentTaskState=");
        m0.x(o, this.c, ", isDraft=", this.d, ", isQueued=");
        m0.z(o, this.e, ", taskUri=", this.f, ", agentTaskRepoOwner=");
        e.x(o, this.g, ", agentTaskRepoName=", this.h, ", agentTaskNumber=");
        return m0.c(this.i, ", rowLastUpdated=", this.j, ")", o);
    }
}

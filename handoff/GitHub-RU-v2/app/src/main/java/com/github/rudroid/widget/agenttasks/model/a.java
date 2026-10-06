package com.github.rudroid.widget.agenttasks.model;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;

    public a(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        k71.k.g(str, "name");
        k71.k.g(str2, "agentTaskId");
        k71.k.g(str3, "agentTaskTitle");
        k71.k.g(str4, "agentTaskState");
        k71.k.g(str5, "taskUri");
        k71.k.g(str6, "agentTaskRepoOwner");
        k71.k.g(str7, "agentTaskRepoName");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c) && k71.k.b(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && k71.k.b(this.g, aVar.g) && k71.k.b(this.h, aVar.h) && k71.k.b(this.i, aVar.i) && this.j == aVar.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + h1.i(h1.i(h1.i(x.i.e(x.i.e(h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("AgentTask(name=", this.a, ", agentTaskId=", this.b, ", agentTaskTitle=");
        f1.e.x(o, this.c, ", agentTaskState=", this.d, ", isDraft=");
        m0.A(o, this.e, ", isQueued=", this.f, ", taskUri=");
        f1.e.x(o, this.g, ", agentTaskRepoOwner=", this.h, ", agentTaskRepoName=");
        o.append(this.i);
        o.append(", agentTaskNumber=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
    public Object M(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1) { return null; }
}

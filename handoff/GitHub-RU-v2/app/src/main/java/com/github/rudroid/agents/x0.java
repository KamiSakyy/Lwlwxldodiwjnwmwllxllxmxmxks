package com.github.rudroid.agents;

import com.github.rudroid.utilities.ui.g1;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class x0 {
    public static final a Companion = new a();

    /* renamed from: n, reason: collision with root package name */
    public static final x0 f8449n;

    /* renamed from: a, reason: collision with root package name */
    public final com.github.rudroid.utilities.ui.g1 f8450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8452c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8453d;

    /* renamed from: e, reason: collision with root package name */
    public final com.github.rudroid.agents.a f8454e;

    /* renamed from: f, reason: collision with root package name */
    public final com.github.rudroid.utilities.ui.g1 f8455f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8456g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f8457h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final xn.v0 f8458j;

    /* renamed from: k, reason: collision with root package name */
    public final List f8459k;
    public final com.github.rudroid.utilities.ui.g1 l;
    public final boolean m;

    public static final class a {
    }

    static {
        g1.a aVar = com.github.rudroid.utilities.ui.g1.Companion;
        h5 h5Var = new h5(null, null, null);
        aVar.getClass();
        f8449n = new x0(new com.github.rudroid.utilities.ui.u0(h5Var), null, null, null, null, g1.a.a(), "", false, 0, null, x61.r.r, g1.a.a());
    }

    public x0(com.github.rudroid.utilities.ui.g1 g1Var, String str, String str2, String str3, com.github.rudroid.agents.a aVar, com.github.rudroid.utilities.ui.g1 g1Var2, String str4, boolean z10, int i, xn.v0 v0Var, List list, com.github.rudroid.utilities.ui.g1 g1Var3) {
        k71.k.g(list, "copilotAgentModels");
        this.f8450a = g1Var;
        this.f8451b = str;
        this.f8452c = str2;
        this.f8453d = str3;
        this.f8454e = aVar;
        this.f8455f = g1Var2;
        this.f8456g = str4;
        this.f8457h = z10;
        this.i = i;
        this.f8458j = v0Var;
        this.f8459k = list;
        this.l = g1Var3;
        this.m = n.a(aVar) && !list.isEmpty();
    }

    public static x0 a(x0 x0Var, com.github.rudroid.utilities.ui.g1 g1Var, String str, String str2, String str3, com.github.rudroid.agents.a aVar, com.github.rudroid.utilities.ui.g1 g1Var2, String str4, boolean z10, int i, xn.v0 v0Var, List list, com.github.rudroid.utilities.ui.g1 g1Var3, int i10) {
        if ((i10 & 1) != 0) {
            g1Var = x0Var.f8450a;
        }
        com.github.rudroid.utilities.ui.g1 g1Var4 = g1Var;
        if ((i10 & 2) != 0) {
            str = x0Var.f8451b;
        }
        String str5 = str;
        String str6 = (i10 & 4) != 0 ? x0Var.f8452c : str2;
        String str7 = (i10 & 8) != 0 ? x0Var.f8453d : str3;
        com.github.rudroid.agents.a aVar2 = (i10 & 16) != 0 ? x0Var.f8454e : aVar;
        com.github.rudroid.utilities.ui.g1 g1Var5 = (i10 & 32) != 0 ? x0Var.f8455f : g1Var2;
        String str8 = (i10 & 64) != 0 ? x0Var.f8456g : str4;
        boolean z11 = (i10 & 128) != 0 ? x0Var.f8457h : z10;
        int i11 = (i10 & 256) != 0 ? x0Var.i : i;
        xn.v0 v0Var2 = (i10 & 512) != 0 ? x0Var.f8458j : v0Var;
        List list2 = (i10 & 1024) != 0 ? x0Var.f8459k : list;
        com.github.rudroid.utilities.ui.g1 g1Var6 = (i10 & 2048) != 0 ? x0Var.l : g1Var3;
        x0Var.getClass();
        k71.k.g(str8, "problemDescription");
        k71.k.g(list2, "copilotAgentModels");
        return new x0(g1Var4, str5, str6, str7, aVar2, g1Var5, str8, z11, i11, v0Var2, list2, g1Var6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.f8450a, x0Var.f8450a) && k71.k.b(this.f8451b, x0Var.f8451b) && k71.k.b(this.f8452c, x0Var.f8452c) && k71.k.b(this.f8453d, x0Var.f8453d) && k71.k.b(this.f8454e, x0Var.f8454e) && k71.k.b(this.f8455f, x0Var.f8455f) && k71.k.b(this.f8456g, x0Var.f8456g) && this.f8457h == x0Var.f8457h && this.i == x0Var.i && k71.k.b(this.f8458j, x0Var.f8458j) && k71.k.b(this.f8459k, x0Var.f8459k) && k71.k.b(this.l, x0Var.l);
    }

    public final int hashCode() {
        int hashCode = this.f8450a.hashCode() * 31;
        String str = this.f8451b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8452c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8453d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.github.rudroid.agents.a aVar = this.f8454e;
        int b10 = a0.s0.b(this.i, x.i.e(com.github.rudroid.copilot.h1.i((this.f8455f.hashCode() + ((hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31, this.f8456g, 31), 31, this.f8457h), 31);
        xn.v0 v0Var = this.f8458j;
        return this.l.hashCode() + f1.e.c(this.f8459k, (b10 + (v0Var != null ? v0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AgentTaskUiModel(selectedRepo=");
        sb2.append(this.f8450a);
        sb2.append(", repositoryId=");
        sb2.append(this.f8451b);
        sb2.append(", branchName=");
        f1.e.x(sb2, this.f8452c, ", defaultBranchName=", this.f8453d, ", selectedAgent=");
        sb2.append(this.f8454e);
        sb2.append(", createTaskState=");
        sb2.append(this.f8455f);
        sb2.append(", problemDescription=");
        com.github.rudroid.m0.x(sb2, this.f8456g, ", createTaskEnabled=", this.f8457h, ", availableAgentsCount=");
        sb2.append(this.i);
        sb2.append(", selectedCopilotAgentModel=");
        sb2.append(this.f8458j);
        sb2.append(", copilotAgentModels=");
        sb2.append(this.f8459k);
        sb2.append(", assignState=");
        sb2.append(this.l);
        sb2.append(")");
        return sb2.toString();
    }
}

package xn;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow implements y {
    public String a;
    public String b;
    public String c;
    public ZonedDateTime d;
    public List e;
    public a0Shadow f;
    public List g;
    public List h;
    public List i;
    public wShadow j;
    public r0 k;
    public f0 l;
    public boolean m;
    public f3 n;
    public boolean o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ x(String str, String str2, String str3, ZonedDateTime zonedDateTime, ArrayList arrayList, a0Shadow a0Var, List list, List list2, ArrayList arrayList2, wShadow wVar, r0 r0Var, f0 f0Var, f3 f3Var, int i) {
        this(r4, r5, r6, r7, (List) (r1 != 0 ? r3 : arrayList), (i & 32) != 0 ? new a0Shadow() : a0Var, (i & 64) != 0 ? r3 : list, (i & 128) != 0 ? r3 : list2, (List) ((i & 256) != 0 ? r3 : arrayList2), (i & 512) != 0 ? w.s : wVar, (i & 1024) != 0 ? r0.r : r0Var, (i & 2048) != 0 ? new f0("") : f0Var, false, (i & 8192) != 0 ? null : f3Var);
        ZonedDateTime zonedDateTime2;
        String str4 = (i & 1) != 0 ? "" : str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            ZonedDateTime now = ZonedDateTime.now();
            k71.k.f(now, "now(...)");
            zonedDateTime2 = now;
        } else {
            zonedDateTime2 = zonedDateTime;
        }
        int i2 = i & 16;
        ArrayList arrayList3 = x61.rShadow.r;
    }

    public static x a(xShadow xVar, String str, String str2, ArrayList arrayList, ArrayList arrayList2, wShadow wVar, int i) {
        String str3 = xVar.a;
        String str4 = (i & 2) != 0 ? xVar.b : str;
        String str5 = (i & 4) != 0 ? xVar.c : str2;
        ZonedDateTime zonedDateTime = xVar.d;
        List list = xVar.e;
        a0Shadow a0Var = xVar.f;
        List list2 = (i & 64) != 0 ? xVar.g : arrayList;
        List list3 = (i & 128) != 0 ? xVar.h : arrayList2;
        List list4 = xVar.i;
        wShadow wVar2 = (i & 512) != 0 ? xVar.j : wVar;
        r0 r0Var = xVar.k;
        f0 f0Var = xVar.l;
        boolean z = (i & 4096) != 0 ? xVar.m : true;
        f3 f3Var = xVar.n;
        xVar.getClass();
        k71.k.g(str3, "id");
        k71.k.g(str4, "threadId");
        k71.k.g(str5, "content");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(list, "references");
        k71.k.g(a0Var, "annotations");
        k71.k.g(list2, "agentConfirmations");
        k71.k.g(list3, "functionCalls");
        k71.k.g(list4, "skillExecutions");
        k71.k.g(wVar2, "state");
        k71.k.g(r0Var, "errorType");
        k71.k.g(f0Var, "errorDescription");
        return new xShadow(str3, str4, str5, zonedDateTime, list, a0Var, list2, list3, list4, wVar2, r0Var, f0Var, z, f3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c) && k71.k.b(this.d, xVar.d) && k71.k.b(this.e, xVar.e) && k71.k.b(this.f, xVar.f) && k71.k.b(this.g, xVar.g) && k71.k.b(this.h, xVar.h) && k71.k.b(this.i, xVar.i) && this.j == xVar.j && this.k == xVar.k && k71.k.b(this.l, xVar.l) && this.m == xVar.m && k71.k.b(this.n, xVar.n);
    }

    @Override // xn.y
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i((this.k.hashCode() + ((this.j.hashCode() + f1.e.c(this.i, f1.e.c(this.h, f1.e.c(this.g, f1.e.c(this.f.a, f1.e.c(this.e, com.github.rudroid.m0.a(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31), 31), 31), 31), 31)) * 31)) * 31, this.l.a, 31), 31, this.m);
        f3 f3Var = this.n;
        return e + (f3Var == null ? 0 : f3Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ChatAssistantMessage(id=", this.a, ", threadId=", this.b, ", content=");
        com.github.rudroid.copilot.h1.A(this.c, ", createdAt=", ", references=", o, this.d);
        o.append(this.e);
        o.append(", annotations=");
        o.append(this.f);
        o.append(", agentConfirmations=");
        o.append(this.g);
        o.append(", functionCalls=");
        o.append(this.h);
        o.append(", skillExecutions=");
        o.append(this.i);
        o.append(", state=");
        o.append(this.j);
        o.append(", errorType=");
        o.append(this.k);
        o.append(", errorDescription=");
        o.append(this.l);
        o.append(", isFeedbackSubmitted=");
        o.append(this.m);
        o.append(", quotaSnapshot=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }

    public Object x(String str, String str2, String str3, ZonedDateTime zonedDateTime, List list, a0Shadow a0Var, List list2, List list3, List list4, wShadow wVar, r0 r0Var, f0 f0Var, boolean z, f3 f3Var) {
        k71.k.g(str, "id");
        k71.k.g(str2, "threadId");
        k71.k.g(str3, "content");
        k71.k.g(zonedDateTime, "createdAt");
        k71.k.g(list, "references");
        k71.k.g(a0Var, "annotations");
        k71.k.g(list2, "agentConfirmations");
        k71.k.g(list3, "functionCalls");
        k71.k.g(list4, "skillExecutions");
        k71.k.g(wVar, "state");
        k71.k.g(r0Var, "errorType");
        k71.k.g(f0Var, "errorDescription");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = list;
        this.f = a0Var;
        this.g = list2;
        this.h = list3;
        this.i = list4;
        this.j = wVar;
        this.k = r0Var;
        this.l = f0Var;
        this.m = z;
        this.n = f3Var;
        this.o = !z;
    }
    public static final Object a = null;
}

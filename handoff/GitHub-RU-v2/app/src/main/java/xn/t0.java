package xn;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 implements y {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final List e;
    public final a0 f;
    public final List g;

    public t0(String str, String str2, String str3, ZonedDateTime zonedDateTime, List list, a0 a0Var, List list2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "threadId");
        k71.k.g(str3, "content");
        k71.k.g(list2, "clientConfirmations");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = list;
        this.f = a0Var;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b) && k71.k.b(this.c, t0Var.c) && k71.k.b(this.d, t0Var.d) && k71.k.b(this.e, t0Var.e) && k71.k.b(this.f, t0Var.f) && k71.k.b(this.g, t0Var.g);
    }

    @Override // xn.y
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.g.hashCode() + f1.e.c(this.f.a, f1.e.c(this.e, com.github.rudroid.m0.a(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ChatUserMessage(id=", this.a, ", threadId=", this.b, ", content=");
        com.github.rudroid.copilot.h1.A(this.c, ", createdAt=", ", references=", o, this.d);
        o.append(this.e);
        o.append(", annotations=");
        o.append(this.f);
        o.append(", clientConfirmations=");
        return x.i.l(o, this.g, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ t0(int i, String str, List list) {
        this(r2, "", r4, r5, r6, r7, r10 != 0 ? r6 : list);
        String uuid = UUID.randomUUID().toString();
        k71.k.f(uuid, "toString(...)");
        String str2 = (i & 4) != 0 ? "" : str;
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        a0 a0Var = new a0();
        int i2 = i & 64;
        List list2 = x61.r.r;
    }
}

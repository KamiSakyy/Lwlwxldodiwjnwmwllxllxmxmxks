package yz0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c7 extends s7 {
    public com.github.service.models.response.a a;
    public String b;
    public String c;
    public boolean d;
    public String e;
    public String f;
    public String g;
    public boolean h;
    public ZonedDateTime i;

    public c7(com.github.service.models.response.a aVar, String str, String str2, boolean z, String str3, String str4, String str5, boolean z2, ZonedDateTime zonedDateTime) {
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z2;
        this.i = zonedDateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return false;
        }
        c7 c7Var = (c7) obj;
        return k71.k.b(this.a, c7Var.a) && k71.k.b(this.b, c7Var.b) && k71.k.b(this.c, c7Var.c) && this.d == c7Var.d && k71.k.b(this.e, c7Var.e) && k71.k.b(this.f, c7Var.f) && k71.k.b(this.g, c7Var.g) && this.h == c7Var.h && k71.k.b(this.i, c7Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31, this.d), this.e, 31), this.f, 31), this.g, 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineReferencedEvent(author=");
        sb.append(this.a);
        sb.append(", commitMessage=");
        sb.append(this.b);
        sb.append(", commitId=");
        com.github.rudroid.m0.x(sb, this.c, ", isCrossRepository=", this.d, ", repositoryOwner=");
        f1.e.x(sb, this.e, ", repositoryName=", this.f, ", repositoryId=");
        com.github.rudroid.m0.x(sb, this.g, ", isPrivate=", this.h, ", createdAt=");
        return com.github.rudroid.copilot.h1.q(sb, this.i, ")");
    }
}

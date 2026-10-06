package com.github.rudroid.viewmodels.tasklist;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import yz0.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public q0 b;
    public String c;
    public boolean d;

    public a(String str, String str2, q0 q0Var, boolean z) {
        k71.k.g(str, "id");
        k71.k.g(q0Var, "type");
        k71.k.g(str2, "bodyText");
        this.a = str;
        this.b = q0Var;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c) && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleComment(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", bodyText=");
        return m0.k(sb, this.c, ", canManage=", this.d, ")");
    }
}

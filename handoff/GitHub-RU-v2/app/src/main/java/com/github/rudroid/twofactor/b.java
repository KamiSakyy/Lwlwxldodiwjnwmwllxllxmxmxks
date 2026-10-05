package com.github.rudroid.twofactor;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final fn.a a;
    public final a b;
    public final String c;

    public b(fn.a aVar, a aVar2, String str) {
        k71.k.g(str, "currentValue");
        this.a = aVar;
        this.b = aVar2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        fn.a aVar = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthRequestState(authRequest=");
        sb.append(this.a);
        sb.append(", decisionState=");
        sb.append(this.b);
        sb.append(", currentValue=");
        return h1.p(sb, this.c, ")");
    }

    public b(Object... a) {
    }
}

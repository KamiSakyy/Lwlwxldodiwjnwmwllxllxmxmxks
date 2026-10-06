package ks0;

import com.github.rudroid.copilot.h1;
import pz0.py;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public String a;
    public py b;
    public String c;

    public d(String str, py pyVar, String str2) {
        this.a = str;
        this.b = pyVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        py pyVar = this.b;
        return this.c.hashCode() + ((hashCode + (pyVar == null ? 0 : pyVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", viewerPermission=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}

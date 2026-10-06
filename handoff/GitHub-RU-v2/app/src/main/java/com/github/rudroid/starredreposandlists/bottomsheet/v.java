package com.github.rudroid.starredreposandlists.bottomsheet;

import a0.s0;
import com.github.rudroid.copilot.h1;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v {
    public String a;
    public String b;
    public boolean c;

    public v(String str, String str2, boolean z) {
        k71.k.g(str, "id");
        k71.k.g(str2, "name");
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return k71.k.b(this.a, vVar.a) && k71.k.b(this.b, vVar.b) && this.c == vVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return f4.s(s0.o("ListSelectionData(id=", this.a, ", name=", this.b, ", isSelected="), this.c, ")");
    }
}

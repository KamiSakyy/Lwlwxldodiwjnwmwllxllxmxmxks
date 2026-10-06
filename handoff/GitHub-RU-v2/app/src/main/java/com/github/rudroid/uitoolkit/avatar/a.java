package com.github.rudroid.uitoolkit.avatar;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public boolean b;

    public a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return h1.n("AsyncAvatar(url=", this.a, ", requiresAuthentication=", ")", this.b);
    }
    public static Object c(Object p1, Object p2) { return null; }
    public Object ordinal() { return null; }
}

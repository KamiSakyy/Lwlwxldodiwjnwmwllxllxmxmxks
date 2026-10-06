package oo;

import f1.e;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;

    public b(String str) {
        k.g(str, "login");
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && k.b(this.a, ((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return e.z("UserAchievementsParameters(login=", this.a, ")");
    }
}

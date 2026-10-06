package cc;

import f1.e;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public b f4168a;

    /* renamed from: b, reason: collision with root package name */
    public List f4169b;

    public a(b bVar, List list) {
        k.g(list, "models");
        this.f4168a = bVar;
        this.f4169b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4168a == aVar.f4168a && k.b(this.f4169b, aVar.f4169b);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + e.c(this.f4169b, this.f4168a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AiModelGroup(groupType=" + this.f4168a + ", models=" + this.f4169b + ", expandAble=false)";
    }
}

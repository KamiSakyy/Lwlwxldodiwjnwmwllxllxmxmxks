package com.github.rudroid.agents.sessionevents;

import com.github.rudroid.agents.sessionevents.b0;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final String f8273a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.g f8274b;

    /* renamed from: c, reason: collision with root package name */
    public final b0.h f8275c;

    /* renamed from: d, reason: collision with root package name */
    public final List f8276d;

    public x(String str, b0.g gVar, b0.h hVar, List list) {
        k71.k.g(str, "id");
        k71.k.g(list, "events");
        this.f8273a = str;
        this.f8274b = gVar;
        this.f8275c = hVar;
        this.f8276d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.f8273a, xVar.f8273a) && k71.k.b(this.f8274b, xVar.f8274b) && k71.k.b(this.f8275c, xVar.f8275c) && k71.k.b(this.f8276d, xVar.f8276d);
    }

    public final int hashCode() {
        int hashCode = this.f8273a.hashCode() * 31;
        b0.g gVar = this.f8274b;
        return this.f8276d.hashCode() + ((this.f8275c.hashCode() + ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "SessionBucket(id=" + this.f8273a + ", sessionHeader=" + this.f8274b + ", header=" + this.f8275c + ", events=" + this.f8276d + ")";
    }
}

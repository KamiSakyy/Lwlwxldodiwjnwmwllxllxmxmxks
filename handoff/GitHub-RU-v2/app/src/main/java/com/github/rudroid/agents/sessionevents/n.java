package com.github.rudroid.agents.sessionevents;

/* loaded from: /home/user/work/p/classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f7731a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7732b;

    public n(String str, String str2) {
        this.f7731a = str;
        this.f7732b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.f7731a, nVar.f7731a) && k71.k.b(this.f7732b, nVar.f7732b);
    }

    public final int hashCode() {
        return this.f7732b.hashCode() + (this.f7731a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("LabeledOptionUiModel(value=", this.f7731a, ", title=", this.f7732b, ")");
    }
}
